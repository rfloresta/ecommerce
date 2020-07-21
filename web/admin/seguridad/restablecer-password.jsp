<%@include file="header.jsp" %>
<body class="login-page" style="min-height: 348.8px;">
    <div class="login-box">
        <div class="login-logo">
            <a href="../../index2.html"><b>W&V</b>S.A.C</a>
        </div>
        <!-- /.login-logo -->
        <div class="card">
            <div class="card-body login-card-body">
                <p class="login-box-msg">¿Olvidaste tu contraseña? Aquí puede recuperar fácilmente una nueva contraseña.</p>

                <s:form action="restablecerPasswordAdmin" theme="simple">
                    <div class="input-group mb-3">
                        <s:textfield theme="simple" type="email" name="admin.email" cssClass="form-control" placeholder="Ingrese Email"/>
                        <div class="input-group-append">
                            <div class="input-group-text">
                                <span class="fa fa-envelope"></span>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-12">
                            <s:submit cssClass="btn btn-primary btn-block" value="Enviar código"/>
                            <s:if test="hasActionErrors()">
                                <s:actionerror cssClass="errorMessage text-center text-danger mr-5" />
                            </s:if>
                        </div>
                        <!-- /.col -->
                    </div>
                </s:form>

                <p class="mt-2 mb-1">
                    <a href="login.jsp">Login</a>
                </p>
            </div>
            <!-- /.login-card-body -->
        </div>
    </div>
    <!-- /.login-box -->

    <%@include file="footer.jsp" %>