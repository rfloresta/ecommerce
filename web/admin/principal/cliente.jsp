<%@include file="sidebar.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header" id="sectionAjax">
        <div class="container-fluid">
        <div class="row mb-2">
            <div class="col-sm-6">
                <h1 class="font-weight-bold ">Mantenimiento Categoria</h1>
            </div>
            <div class="col-sm-6">
                <ol class="breadcrumb float-sm-right">
                    <li class="breadcrumb-item"><a href="#">Inicio</a></li>
                    <li class="breadcrumb-item active">Categorias</li>
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
                           <s:form id="form_mante" action="%{(edit==1)? 'actualizarClie': 'registrarClie'}" theme="simple" >

                            <div class="card-body">
                                 <s:if test="%{edit==1}">
                                 <div class="form-group">
                                    
                                    <s:hidden  name="cliente.idCliente" cssClass="form-control" placeholder="Ingrese Nombre" />
                                </div>
                                </s:if> 
                                <div class="form-group">
                                    <label for="inputID">Nombre</label>
                                    
                                    <s:textfield  name="cliente.nombres" cssClass="form-control" placeholder="Ingrese Nombres" />
                                </div>
                                <div class="form-group">
                                    <label for="inputNombre">Apellidos</label>
                                    <s:textfield  name="cliente.apellidos" cssClass="form-control" placeholder="Ingrese Apellidos"/>
                                </div>
                                 <div class="form-group">
                                    <label for="inputNombre">Dni</label>
                                    <s:textfield  name="cliente.dni" cssClass="form-control" placeholder="Ingrese Dni"/>
                                </div>
                                 <div class="form-group">
                                    <label for="inputNombre">N° Celular</label>
                                    <s:textfield  name="cliente.numCelular" cssClass="form-control" placeholder="Ingrese N° Celular"/>
                                </div>
                                 <div class="form-group">
                                    <label for="inputNombre">Direccion</label>
                                    <s:textfield  name="cliente.direccion" cssClass="form-control" placeholder="Ingrese Direccion"/>
                                </div>
                                 <div class="form-group">
                                    <label for="inputNombre">Email</label>
                                    <s:textfield  name="cliente.email" cssClass="form-control" placeholder="Ingrese Email"/>
                                </div>
                                 <div class="form-group">
                                    <label for="inputNombre">Password</label>
                                    <s:textfield  name="cliente.password" cssClass="form-control" placeholder="Ingrese password"/>
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
                                            <th>Apellido</th>
                                            <th>Dni</th>
                                            <th>N° Celular</th>
                                            <th>Direccion</th>
                                            <th>Email</th>
                                            <th>Password</th>
                                            <th>Opciones</th>
                                            
                                        </tr> 
                                    </thead>     
                                    <tbody>
                                        <s:iterator value="lstClie">
                                            <tr>
                                                <td><s:property value="nombres"/></td> 
                                                <td><s:property value="apellidos"/></td>
                                                <td><s:property value="dni"/></td> 
                                                <td><s:property value="numCelular"/></td> 
                                                <td><s:property value="direccion"/></td> 
                                                <td><s:property value="email"/></td> 
                                                <td><s:property value="password"/></td> 
                                                

                                                <td>
                                                    <s:url id="lnkEditar" action="editarClie">
                                                        <s:param value="idCliente" name="cliente.idCliente" />
                                                    </s:url>
                                                    <s:a href="%{lnkEditar}" cssClass="btn btn-mini btn-primary"><i class="fa fa-edit"></i></s:a>
                                               
                                                    <s:url id="lnkEliminar" action="eliminarClie">
                                                        <s:param value="idCliente" name="cliente.idCliente"/>
                                                    </s:url>

                                                    <s:a href="%{lnkEliminar}" cssClass="btn btn-mini btn-danger" ><i class="fa fa-remove"></i></s:a>  

                                                    </td>
                                            </s:iterator>	
                                    </tbody>

                                    <tfoot>
                                    <th>Nombre</th>
                                            <th>Apellido</th>
                                            <th>Dni</th>
                                            <th>N° Celular</th>
                                            <th>Direccion</th>
                                            <th>Email</th>
                                            <th>Password</th>
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