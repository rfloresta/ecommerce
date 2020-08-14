<%@include file="../principal/sidebar.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header" id="sectionAjax">
        <div class="container-fluid">

            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1 class="font-weight-bold">Cambiar Contraseña</h1>
                </div>
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#">Inicio</a></li>
                        <li class="breadcrumb-item active">Cambiar Contraseña</li>
                    </ol>
                </div> 
            </div>
        </div>
    </section>

    <section class="content">
        <div class="container-fluid">

            <div class="row">

                <div class="col-md-12">
                    <div class="card card-text">
                        <div class="card-header">
                            <h3 class="card-title font-weight-bold">Cambiar</h3>
                        </div>
                        <s:form id="form_pass" action="cambiarPasswordInAdmin" theme="simple" >
                            <div class="card-body">
                                <div class="row ">
                                    <div class="col-md-12">
                                        <div class="form-group">

                                            <label>Contraseña Actual</label>
                                           <label><s:if test="hasActionErrors()">
                                <s:actionerror cssClass=" text-danger font-weight-bold mr-6" />
                                               </s:if></label>
                                            <div class="input-group">
                                                <s:password type="password"  name="passwordActual" id="password1" cssClass="form-control" required="required" />
                                                <div class="input-group-append">
                                                    <button class="btn btn-primary" type="button" onclick="mostrarPassword('password1')"> <span  id="show_password1" class="fa fa-eye-slash icon"></span> </button>
                                                </div>
                                            </div></div>
                                        <div class="form-group">
                                            <label>Nueva Contraseña</label>
                                            <div class="input-group">
                                                <s:password name="admin.password" id="password2" cssClass="form-control" pattern="^(?=\w*\d)(?=\w*[A-Z])(?=\w*[a-z])\S{8,16}$" required="required" />
                                                <div class="input-group-append">
                                                    <button  class="btn btn-primary" type="button" onclick="mostrarPassword('password2')"> <span id="show_password2" class="fa fa-eye-slash icon"></span> </button>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label>Confirmar Contraseña</label>
                                            <div class="input-group">
                                                <input type="password" name="passwordNuevo" id="password3" Class="form-control" required="required" />
                                                <div class="input-group-append">
                                                    <button  class="btn btn-primary" type="button" onclick="mostrarPassword('password3')"> <span id="show_password3" class="fa fa-eye-slash icon"></span> </button>
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>

                            </div>
                            <div class="card-footer text-center">
                                <pre style="display:none" id="errorPassword" class="text-danger font-weight-bold">
*La contraseña debe tener 8 caracteres como mínimo entre números, minúsculas y mayúsculas*
*No debe contener caracteres extraños ni espacios en blanco*
                                </pre>
                                <s:submit id="cambiar" value="Guardar" cssClass="btn btn-info"/>

                            </div>


                        </s:form>   
                    </div>
                </div>
            </div>
    </section>

</div>

<%@include file="../principal/footer.jsp" %>