<!--1-->
<%@ taglib uri="/struts-tags" prefix="s"%>
<s:form id="form_pass" action="cambiarPasswordOutClie" theme="simple">
        <div class="input-group mb-3">
          <s:password name="cliente.password" id="password2" cssClass="form-control" placeholder="Nueva Contraseña"/>
          <div class="input-group-append">
            <button  class="btn btn-primary" type="button" onclick="mostrarPassword('password2')"> <span id="show_password2" class="fa fa-eye-slash icon"></span> </button>
              </div>
        </div>
        <div class="input-group mb-3">
            <input type="password" name="password3" id="password3" class="form-control" placeholder="Confirmar Contraseña">
          <div class="input-group-append">
              <button  class="btn btn-primary" type="button" onclick="mostrarPassword('password3')"> <span id="show_password3" class="fa fa-eye-slash icon"></span> </button>
              </div>
        </div>
        <div class="row">
          <div class="col-12 text-center">
              <s:submit id="cambiar" cssClass="btn btn-primary btn-block" value="Cambiar Contraseña"/>
              <div id="incorrecto">
              </div>
          </div>
          <!-- /.col -->
        </div>
           
      </s:form>
<pre style="display:none" id="errorPassword" class="text-danger font-weight-bold">
*La contraseña debe tener 8 caracteres como mínimo entre números, minúsculas y mayúsculas*
*No debe contener caracteres extraños ni espacios en blanco*
                                </pre>
<script src="js/funciones.js" type="text/javascript"></script>