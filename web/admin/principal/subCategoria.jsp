<%@include file="sidebar.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header" id="sectionAjax">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1 class="font-weight-bold ">Mantenimiento SubCategoria</h1>
                </div>
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#">Inicio</a></li>
                        <li class="breadcrumb-item active">SubCategoria</li>
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
                            <h3 class="card-title font-weight-bold">Resgistro/Edición</h3>
                        </div>
                        <s:form id="form_mante" action="%{(edit==1)? 'actualizarSubCate': 'registrarSubCate'}" theme="simple" >

                            <div class="card-body">
                                <s:if test="%{edit==1}">
                                    <div class="form-group">

                                        <s:hidden  name="subCategoria.idSubcategoria" cssClass="form-control" placeholder="Ingrese Nombre" />
                                    </div>
                                </s:if> 
                                <div class="form-group">
                                    <label for="inputID">Nombre</label>

                                    <s:textfield  name="subCategoria.nombre" cssClass="form-control" placeholder="Ingrese Nombre" />
                                </div>
                                 <div class="form-group">
                                    <label for="inputNombre">Categoría</label>
                                    <s:select list="lstCategoria" headerKey="0" 
                                              headerValue="[--Seleccione--]" name="subCategoria.idCategoria.idCategoria"
                                              listKey="idCategoria" listValue="nombre"
                                              label="Categoría" cssClass="form-control"  />
                                </div>
                              

                            </div>

                            <div class="card-footer">
                                <s:submit id="grabar" value="%{(edit==1)? 'Editar' : 'Registrar'}" cssClass="%{(edit==1)? 'btn btn-warning' : 'btn btn-success'}"/>
                            </div>
                        </s:form>   
                    </div>
                </div>

                <div class="col-md-8">
                    <div class="card card-text">
                        <div class="card-header">
                            <h3 class="card-title font-weight-bold">Listado</h3>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive table-centered">
                                <table id="datos" class="table w-100">
                                    <thead>
                                        <tr class="">
                                            <th>Nombre</th>
                                            <th>Categoria</th>
                                            <th>Opciones</th>
                                        </tr> 
                                    </thead>     
                                    <tbody>
                                        <s:iterator value="lstSubCate">
                                            <tr>
                                                <td><s:property value="nombre"/></td> 
                                                <td><s:property value="idCategoria.nombre"/></td> 
                                              
                                                <td>
                                                    <s:url id="lnkEditar" action="editarSubCate">
                                                        <s:param value="idSubcategoria" name="subCategoria.idSubcategoria" />
                                                    </s:url>
                                                    <s:a href="%{lnkEditar}" cssClass="btn btn-mini btn-primary"><i class="fa fa-edit"></i></s:a>

                                                    <s:url id="lnkEliminar" action="eliminarSubCate">
                                                         <s:param value="idSubcategoria" name="subCategoria.idSubcategoria" />
                                                    </s:url>

                                                    <s:a href="%{lnkEliminar}" cssClass="btn btn-mini btn-danger" ><i class="fa fa-remove"></i></s:a>  

                                                    </td>
                                            </tr>
                                            </s:iterator>	
                                    </tbody>
                                    <tfoot>
                                        <tr>
                                            <th>Nombre</th>
                                            <th>Categoria</th>
                                            <th>Opciones</th>
                                        </tr>
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