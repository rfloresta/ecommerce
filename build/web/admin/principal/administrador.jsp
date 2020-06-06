<%@include file="sidebar.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header" id="sectionAjax">
        <div class="container-fluid">
        <div class="row mb-2">
            <div class="col-sm-6">
                <h1>Mantenimiento Administrador</h1>
            </div>
            <div class="col-sm-6">
                <ol class="breadcrumb float-sm-right">
                    <li class="breadcrumb-item"><a href="#">Inicio</a></li>
                    <li class="breadcrumb-item active">Administradores</li>
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
                            <h3 class="card-title">Resgistro/Edición</h3>
                        </div>
                        <s:form id="form_mante" action="%{(edit==1)? 'actualizarAdmin': 'registrarAdmin'}" theme="simple" >

                            <div class="card-body">
                                <div class="form-group">
                                    <label for="inputDni">Dni</label>
                                    <s:textfield  name="admin.dni"  cssClass="form-control " placeholder="Ingrese Dni" />
                                </div>
                                <div class="form-group">
                                    <label for="inputDni">Nombres</label>
                                    <s:textfield  name="admin.nombres" cssClass="form-control" placeholder="Ingrese Nombre" />
                                </div>
                                <div class="form-group">
                                    <label for="inputDni">Apellidos</label>
                                    <s:textfield  name="admin.apellidos" cssClass="form-control" placeholder="Ingrese Apellido"/>
                                </div>
                                <div class="form-group">
                                    <label for="inputDni">Password</label>
                                    <s:textfield  name="admin.password" cssClass="form-control"  placeholder="Ingrese Password"/>
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
                            <h3 class="card-title">Listado</h3>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive table-centered">
                                <table id="datos" class="table w-100">
                                    <thead>
                                        <tr class="">
                                            <th>DNI</th>
                                            <th>Nombres</th>
                                            <th>Apellidos</th>
                                            <th>Password</th>
                                            <th>Opciones</th>
                                        </tr> 
                                    </thead>     
                                    <tbody>
                                        <s:iterator value="lstAdmin">
                                            <tr>
                                                <td><s:property value="dni"/> </td>
                                                <td><s:property value="nombres"/></td> 
                                                <td><s:property value="apellidos"/></td> 
                                                <td><s:property value="password"/></td>

                                                <td>
                                                    <s:url id="lnkEditar" action="editarAdmin">
                                                        <s:param value="dni" name="admin.dni" />
                                                    </s:url>

                                                    <s:a href="%{lnkEditar}" cssClass="btn btn-mini btn-primary"><i class="fa fa-edit"></i></s:a>

                                                    <s:url id="lnkEliminar" action="eliminarAdmin">
                                                        <s:param value="dni" name="admin.dni"/>
                                                    </s:url>

                                                    <s:a href="%{lnkEliminar}" cssClass="btn btn-mini btn-danger" ><i class="fa fa-remove"></i></s:a>  
                                                    </td>
                                            </s:iterator>	
                                    </tbody>

                                    <tfoot>
                                    <th>DNI</th>
                                    <th>Nombres</th>
                                    <th>Apellidos</th>
                                    <th>Password</th>
                                    <th>Opciones</th>
                                    </tfoot>

                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                </row>

            </div>
        </div>
    </section>
</div>
<%@include file="footer.jsp" %>