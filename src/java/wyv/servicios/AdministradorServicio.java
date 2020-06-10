package wyv.servicios;

import java.util.List;

import wyv.persistencia.Administrador;
import wyv.persistencia.AdministradorDao;
import wyv.persistencia.IOperacionesBD;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class AdministradorServicio implements IOperacionesBD<Administrador> {

    AdministradorDao admDao;
    Administrador admin;

    public void setAdmDao(AdministradorDao admDao) {
        this.admDao = admDao;
    }

    @Override
    public String registrar(Administrador a) {
        admDao = new AdministradorDao();
        admin = new Administrador();
        admin.setDni(a.getDni());
        admin.setNombres(a.getNombres());
        admin.setApellidos(a.getApellidos());
        //Mandamos password encriptado
        String passEncryp = Encriptar(a.getPassword());
        admin.setPassword(passEncryp);
        // Fin de password encriptado
        admin.setPrivilegio(a.getPrivilegio());
        return admDao.registrar(admin);
    }

    @Override
    public String actualizar(Administrador a) {
        admDao = new AdministradorDao();

        return admDao.actualizar(a);

    }

    @Override
    public String eliminar(String id) {

        admDao = new AdministradorDao();
        return admDao.eliminar(id);

    }

    @Override
    public Administrador buscar(String id) {
        admDao = new AdministradorDao();
        return admDao.buscar(id);
    }

    @Override
    public List<Administrador> listar() {
        admDao = new AdministradorDao();
        return admDao.listar();
    }

    @Override
    public Administrador ingresar(Administrador entrada) {
        admDao = new AdministradorDao();
        admin = admDao.ingresar(entrada);
        try {
            if (admin != null) {
            //Se desincrepta el password para poder validarlo con la entrada.
            String passDesencriptado= Desencriptar(admin.getPassword());
                System.out.println(passDesencriptado);
            if (passDesencriptado.equals(entrada.getPassword())) {
                return admin;
            }
        }
        } catch (Exception e) {
             return null;
        }
       
        return null;
    }

    public void nuevoObj() {
        admin = new Administrador();
    }

    

    public static String Encriptar(String texto) {
        String secretKey = "llaveencriptacion"; //llave para encriptar datos

        String base64EncryptedString = "";

        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            byte[] plainTextBytes = texto.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            base64EncryptedString = new String(base64Bytes);

        } catch (Exception ex) {
        }
        return base64EncryptedString;
    }

    public static String Desencriptar(String textoEncriptado) throws Exception {
        String secretKey = "llaveencriptacion"; //llave para encriptar datos

        String base64EncryptedString = "";

        try {
            byte[] message = Base64.decodeBase64(textoEncriptado.getBytes("utf-8"));
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");

            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);

            byte[] plainText = decipher.doFinal(message);

            base64EncryptedString = new String(plainText, "UTF-8");

        } catch (Exception ex) {
        }
        return base64EncryptedString;
    }

}
