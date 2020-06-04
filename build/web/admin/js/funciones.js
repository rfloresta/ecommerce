$(function () {
    $("#ingresar").click(function (event)

    {
       event.preventDefault();
        var dni = $("#dni");
        var password = $("#password");
        var form = $("#form_login");
        console.log(dni);
        if (dni.val() === "")
        {
            dni.focus();
            return;
        }else if(password.val() === ""){
             password.focus();
             return;
        } 
        else {
            form.action="/W_V_S.A.C/admin/seguridad/ingresoAdmin.action";
            form.submit();
        }
    }
    );
});
