<%@include file="sidebar.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header" id="sectionAjax">
        <div class="container-fluid">
        <div class="row mb-2">
            <div class="col-sm-6">
                <h1 class="text-uppercase font-weight-bold">Mantenimiento Marca</h1>
            </div>
            <div class="col-sm-6">
                <ol class="breadcrumb float-sm-right">
                    <li class="breadcrumb-item"><a href="#">Inicio</a></li>
                    <li class="breadcrumb-item active ">Marcas</li>
                </ol>
            </div>  
        </div>
        </div>
    </section>

    <section class="content">
        <div class="container-fluid">

            <div class="row">

                <div class="col-md-4">
                    <div class="card card-text">
                        <div class="card-header">
                            <h3 class="card-title text-uppercase font-weight-bold">Resgistro/Edición</h3>
                        </div>
                        <s:form id="form_mante" action="%{(edit==1)? 'actualizarMarca': 'registrarMarca'}" theme="simple" >

                            <div class="card-body">
                                 <s:if test="%{edit==1}">
                                <div class="form-group">
                                    
                                    <s:hidden  name="marca.idMarca" cssClass="form-control" placeholder="Ingrese Nombre" />
                                </div>
                                </s:if> 
                                <div class="form-group">
                                    <label for="inputNombre">Nombre</label>
                                    <s:textfield  name="marca.nombre" cssClass="form-control" placeholder="Ingrese Nombre" />
                                </div>

                            </div>

                            <div class="card-footer">
                                <s:submit id="grabar" value="%{(edit==1)? 'Editar' : 'Registrar'}" cssClass="%{(edit==1)? 'btn btn-warning' : 'btn btn-success'}"/>
                            </div>
                        </s:form>   
                    </div>
                </div>

                <div class="col-md-6">
                    <div class="card card-text">
                        <div class="card-header">
                            <h3 class="card-title text-uppercase font-weight-bold">Listado</h3>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive table-centered">
                                <table id="datos" class="table w-100">
                                    <thead>
                                        <tr class="">
                                            <th>Id</th>
                                            <th>Nombre</th>
                                            <th>Opciones</th>
                                        </tr> 
                                    </thead>     
                                    <tbody>
                                        <s:iterator value="lstMarca">
                                            <tr>
                                                <td><s:property value="idMarca"/> </td>
                                                <td><s:property value="nombre"/></td> 
                                                    
                                                <td>
                                                    <s:url id="lnkEditar" action="editarMarca">
                                                        <s:param value="idMarca" name="marca.idMarca" />
                                                    </s:url>
                                                    <s:a href="%{lnkEditar}" cssClass="btn btn-mini btn-primary"><i class="fa fa-edit"></i></s:a>
                                               
                                                    <s:url id="lnkEliminar" action="eliminarMarca">
                                                        <s:param value="idMarca" name="marca.idMarca" />
                                                    </s:url>

                                                    <s:a href="%{lnkEliminar}" cssClass="btn btn-mini btn-danger" ><i class="fa fa-remove"></i></s:a>  

                                                    </td>
                                            </s:iterator>	
                                    </tbody>

                                    <tfoot>
                                    <th>Id</th>
                                    <th>Nombre</th>
                                    <th>Opciones</th>
                                    </tfoot>

                                </table>
                            </div>
                        </div>
                    </div>
                </div>
             

            </div>
        </div>
    </section>
</div>
<%@include file="footer.jsp" %>