    <%@include file="header.jsp" %>
<body class="login-page" style="min-height: 402.8px;">
<div class="login-box">
  <div class="login-logo">
    <a href="../../index2.html"><b>W&V</b>S.A.C</a>
  </div>
  <!-- /.login-logo -->
  <div class="card">
    <div class="card-body login-card-body">
      <p class="login-box-msg">Estás a solo un paso de tu nueva contraseña, recupera tu contraseña ahora.</p>

      <s:form id="form_pass" action="cambiarPasswordOutAdmin" theme="simple">
        <div class="input-group mb-3">
          <s:password name="admin.password" id="password2" cssClass="form-control" placeholder="Nueva Contraseña"/>
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
              <s:if test="hasActionErrors()">
                <s:actionerror cssClass="errorMessage text-center text-danger mr-5" />
              </s:if>
          </div>
          <!-- /.col -->
        </div>
           
      </s:form>

      <p class="mt-3 mb-1">
        <a href="login.jsp">Login</a>
      </p>
    </div>
      <div class="card-footer text-center">
                                <pre style="display:none" id="errorPassword" class="text-danger font-weight-bold">
*La contraseña debe tener 8 caracteres como mínimo entre números, minúsculas y mayúsculas*
*No debe contener caracteres extraños ni espacios en blanco*
                                </pre>
                                

                            </div>
    <!-- /.login-card-body -->
  </div>
</div>
    
<!-- /.login-box -->
    <%@include file="footer.jsp" %>