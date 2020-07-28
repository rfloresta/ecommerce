<%@include file="header.jsp" %>
<body class="login-page" style="min-height: 348.8px;">
    <div class="login-box">
        <div class="login-logo">
            <a href="../../index2.html"><b>W&V</b>S.A.C</a>
        </div>
        <!-- /.login-logo -->
        <div class="card">
            <div class="card-body login-card-body">
                <p class="login-box-msg">El código ha sido enviado a su Email</p>

                <s:form action="validarCodigoAdmin" theme="simple">
                    <div class="input-group mb-1">
                        <s:textfield name="codigo" cssClass="form-control" placeholder="Ingrese Código" />
                        <div class="input-group-append">
                            <div class="input-group-text">
                                <span class="fa fa-unlock"></span>
                            </div>
                        </div>

                    </div>
                    <div class="col-12">
                        <div class="input-group mb-2 mt-3">
                            <label>¿No le llegó el código? </label> <s:a href="restablecerPasswordAdmin" cssClass="ml-2" >Enviar</s:a>
                        </div>

                    </div>


                    <div class="row">
                        <div class="col-12">
                            <s:submit cssClass="btn btn-primary btn-block" value="Validar"/>
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
            <!-- /.login-card-body -->
        </div>
    </div>
    <!-- /.login-box -->

    <%@include file="footer.jsp" %>