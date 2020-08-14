<%@include file="sidebar.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header" id="sectionAjax">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1 class="font-weight-bold ">Mantenimiento Producto</h1>
                </div>
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#">Inicio</a></li>
                        <li class="breadcrumb-item active">Productos</li>
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
                        <s:form enctype="multipart/form-data" id="form_mante" action="%{(edit==1)? 'actualizarProducto': 'registrarProducto'}" theme="simple" >

                            <div class="card-body">
                                <s:if test="%{edit==1}">
                                    <div class="form-group">

                                        <s:hidden  name="producto.idProducto" cssClass="form-control"  placeholder="Ingrese Nombre" />
                                    </div>
                                </s:if>
                                <div class="form-group">
                                    <label for="inputID">Nombre</label>

                                    <s:textfield  name="producto.nombre" cssClass="form-control" placeholder="Ingrese Nombre" />
                                </div>
                                <div class="form-group">
                                    <label for="inputNombre">Descripción</label>
                                    <s:textfield  name="producto.descripcion" cssClass="form-control" placeholder="Ingrese Descripción"/>
                                </div>
                                <div class="form-group">
                                    <label for="inputNombre">Categoría</label>
                                    <s:select id="Categoria" list="lstCategoria" headerKey="0" 
                                              headerValue="[--Seleccione--]" name="producto.idCategoria.idCategoria"
                                              listKey="idCategoria" listValue="nombre"
                                              label="Categoría" cssClass="form-control"  />
                                </div>
                                
                                 <div class="form-group">
                                    <label for="inputNombre">Sub Categoría</label>
                                    <div id="selectSubCate">
                                        <select class="form-control">
                                            <option>[--Seleccione--]</option>
                                            
                                        </select>
                                        
                                    </div>
                                    
                                </div>

                                <div class="form-group">
                                    <label for="inputNombre">Marca</label>
                                    <s:select list="lstMarca" headerKey="0" 
                                              headerValue="[--Seleccione--]" name="producto.idMarca.idMarca"
                                              listKey="idMarca" listValue="nombre"
                                              label="Marca"  cssClass="form-control"  />
                                </div>

                                <div class="form-group">
                                    <label for="inputNombre">Stock</label>
                                    <s:textfield  name="producto.stock" cssClass="form-control" placeholder="Ingrese Stock"/>
                                </div>
                                <div class="form-group">
                                    <label for="inputNombre">Precio Compra</label>
                                    <s:textfield  key="producto.precioCompra" value="%{getText('{0,number,#0.0##}',{producto.precioCompra})}" cssClass="form-control" placeholder="Ingrese Precio de Compra"/>
                                </div>
                                <div class="form-group">
                                    <label for="inputNombre">Precio Venta</label>
                                    <s:textfield key="producto.precioVenta"  value="%{getText('{0,number,#0.0##}',{producto.precioVenta})}" cssClass="form-control" placeholder="Ingrese Precio de Venta"/>
                                </div>
                                <div class="form-group">
                                    <label for="inputNombre">Descuento</label>
                                    <s:textfield  key="producto.descuento" value="%{getText('{0,number,#0.0##}',{producto.descuento})}" cssClass="form-control" placeholder="Ingrese Descripción"/>
                                </div>
                                <div class="form-group">
                                    <label for="inputImagen">Imagen</label>
                                    <s:file  name="imagen" cssClass="form-control"/>
                                </div>
                            </div>
                            <div class="card-footer">
                                <s:submit id="grabar" value="%{(edit==1)? 'Actualizar' : 'Registrar'}" cssClass="%{(edit==1)? 'btn btn-warning' : 'btn btn-success'}"/>
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
                                             <th>Imagen</th>
                                            <th>Nombre</th>
                                            <th>Stock</th>
                                            <th>Categoría</th>
                                            <th>Marca</th>
                                            <th>Precio Compra</th>
                                            <th>Precio Venta</th>
                                            <th>Descuento</th>
                                            <th>Opciones</th>
                                        </tr> 
                                    </thead>     
                                    <tbody>
                                        <s:iterator value="lstProducto">
                                            <tr>
                                                <td><img class="profile-user-img img-responsive" src="<%=request.getContextPath()%>/admin/imagenes/<s:property value="imagen"/>" height="100" width="630"/></td>   
                                                <td><s:property value="nombre"/></td>    
                                                <td><s:property value="stock"/> </td>
                                                <td><s:property value="idCategoria.nombre"/> </td>
                                                <td><s:property value="idMarca.nombre"/> </td>
                                                <td><s:property value="precioCompra"/></td> 
                                                <td><s:property value="precioVenta"/></td>    
                                                <td><s:property value="descuento"/></td>

                                                <td>
                                                    <s:url id="lnkEditar" action="editarProducto">
                                                        <s:param value="idProducto" name="producto.idProducto" />
                                                    </s:url>
                                                    <s:a href="%{lnkEditar}" cssClass="btn btn-mini btn-primary"><i class="fa fa-edit"></i></s:a>

                                                    <s:url id="lnkEliminar" action="eliminarProducto">
                                                        <s:param value="idProducto" name="producto.idProducto" />
                                                    </s:url>
                                                    <s:a href="%{lnkEliminar}" cssClass="btn btn-mini btn-danger" ><i class="fa fa-remove"></i></s:a>  
                                                    </td>
                                            </tr>
                                            </s:iterator>	
                                    </tbody>

                                    <tfoot>
                                        <tr>
                                            <th>Imagen</th>
                                            <th>Nombre</th>
                                            <th>Stock</th>
                                            <th>Categoría</th>
                                            <th>Marca</th>
                                            <th>Precio Compra</th>
                                            <th>Precio Venta</th>
                                            <th>Descuento</th>
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