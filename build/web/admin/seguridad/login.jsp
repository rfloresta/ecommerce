    <%@include file="header.jsp" %>
<body class="hold-transition login-page">
        <div class="login-box">
            <div class="login-logo">
                <a href="../../index2.html"><b>W&V</b>S.A.C</a>
            </div>
                
            <!-- /.login-logo -->
            <div class="card">
                <div class="card-body login-card-body">
                   <p class="login-box-msg">Inicie Sesión</p>
                    <s:form  action="ingresoAdmin" id="form_login"  styleId="acc" theme="simple">
                        <div class="input-group mb-3">
                            <s:textfield id="dni"   name="admin.dni" styleId="dni" cssClass="form-control" placeholder="Ingrese DNI"/>
                                <div class="input-group-append">
                                    <div class="input-group-text">
                                        <i class="fa fa-envelope"></i>
                                    </div>
                                </div>
                            </div>

                            <div class="input-group mb-3">

                                <s:password id="password" name="admin.password" styleId="pass" cssClass="form-control" placeholder="Ingrese contraseña"/>

                                <div class="input-group-append">
                                    <div class="input-group-text">
                                        <span class="fa fa-lock"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-12">
                                    <div class="icheck-primary">
                                        <input type="checkbox" id="remember">
                                        <label for="remember">
                                            Recordarme
                                        </label>
                                    </div>
                                </div>
                                <!-- /.col -->
                                <div class="col-12 my-4">
                                <s:submit id="ingresar" styleId="btnreg" cssClass="btn btn-primary btn-block toastrDefaultError" value="Iniciar Sesión" />
                                <s:if test="hasActionErrors()">
                                <s:actionerror cssClass="errorMessage text-center text-danger mr-5" />
                                </s:if>
                                <s:if test="hasActionMessages()">
                                    <s:actionmessage cssClass="errorMessage text-center text-success mr-5" />
                                </s:if>
                            </div>
                            <!-- /.col -->
                        </div>
                                
                        <p class="mb-1">
                            <a href="restablecer-password.jsp">Olvidé mi contraseña</a>
                        </p>
                    </s:form>  
                           
                       
          </div>
                </div>
                <!-- /.login-card-body -->
               
            </div>
      
        <!-- /.login-box -->

    <%@include file="footer.jsp" %>
