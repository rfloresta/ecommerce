<%@include file="sidebar.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header" id="sectionAjax">
        <div class="container-fluid">

            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1 class="font-weight-bold">Datos de la Empresa</h1>
                </div>
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#">Inicio</a></li>
                        <li class="breadcrumb-item active">Empresa</li>
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
                        <s:form enctype="multipart/form-data" id="form_mante" action="actualizarEmpresa" theme="simple" >
                            <s:hidden  name="empresa.idEmpresa" cssClass="form-control" placeholder="Ingrese Nombre" />
                            <div class="card-body">
                                <div class="row ">
                                    <div class="col-md-6">
                                <div class="form-group">
                                    <label for="inputRUC">RUC</label>
                                    <s:textfield  name="empresa.ruc"  cssClass="form-control " placeholder="Ingrese RUC" />
                                </div>
                                    </div>
                                <div class="col-md-6">
                                <div class="form-group">
                                    <label for="inputRazSocial">Razón Social</label>
                                    <s:textfield  name="empresa.razonSocial" cssClass="form-control" placeholder="Ingrese Razón Social" />
                                </div>
                                </div>
                                
                                <div class="col-md-6">
                                <div class="form-group">
                                     <label for="inputDireccion">Dirección</label>
                                     <s:textarea  name="empresa.direccion" cssClass="form-control" placeholder="Ingrese la Misión"/>
                                </div> 
                                </div>
                                <div class="col-md-6">
                                <div class="form-group">
                                   <label for="inputLogo">Logo</label>
                                    
                                     <img class="profile-user-img img-responsive" src="<%=request.getContextPath()%>/admin/imagenes/<s:property value="empresa.logo"/>" height="120" width="1000"/>
                                </div>
                                </div>
                                    <div class="col-md-12">
                                <div class="form-group">
                                     
                                     <label for="inputLogo">Cargar Nuevo Logo</label>
                                     <s:file  name="logo" cssClass="form-control" placeholder="Subir Logo"/>
                                   
                                </div>
                                </div>
                                   
                                </div>
                            </div>

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