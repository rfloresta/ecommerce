<%@include file="sidebar.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header" id="sectionAjax">
        <div class="container-fluid">

            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1 class="font-weight-bold">Datos Personales</h1>
                </div>
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#">Inicio</a></li>
                        <li class="breadcrumb-item active">Datos Personales</li>
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
                            <h3 class="card-title font-weight-bold">Editar</h3>
                        </div>
                        <s:form  id="form_mante" action="actualizarDatosAdmin" theme="simple" >
                            <div class="card-body">
                                <div class="row ">
                                    <div class="col-md-6">
                                <div class="form-group">
                                    <label for="inputDNI">DNI</label>
                                    <s:textfield  name="admin.dni"  cssClass="form-control" readonly="" placeholder="Ingrese DNI" />
                                </div>
                                    </div>
                                <div class="col-md-6">
                                <div class="form-group">
                                    <label for="inputRazSocial">Nombres</label>
                                    <s:textfield  name="admin.nombres" cssClass="form-control" placeholder="Ingrese Nombres" />
                                </div>
                                </div>
                                
                                <div class="col-md-6">
                                <div class="form-group">
                                     <label for="inputDireccion">Apellidos</label>
                                    <s:textfield  name="admin.apellidos" cssClass="form-control" placeholder="Ingrese Apellidos" />
                                </div> 
                                </div>
                                <div class="col-md-6">
                                <div class="form-group">
                                   <label for="inputLogo">E-mail</label>
                                    <s:textfield  name="admin.email" cssClass="form-control" placeholder="Ingrese Email" />
                                </div>
                                </div>
                                </div>
                            </div>
                                    <s:hidden value="%{#session.pass}" name="admin.password" />
                                    <s:hidden value="%{#session.cod}" name="admin.codigoGenerado" />
                                    <s:hidden value="%{#session.privilegio}" name="admin.privilegio" />
                            <div class="card-footer text-center">
                                <s:submit id="grabar" value="Actualizar" cssClass="btn btn-success"/>

                                </div>
                        </s:form>   
                    </div>
                </div>
            </div>
        </div>
    </section>
</div>
<%@include file="footer.jsp" %>