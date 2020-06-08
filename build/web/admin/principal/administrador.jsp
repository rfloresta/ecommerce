<%@include file="sidebar.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header" id="sectionAjax">
        <div class="container-fluid">

            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1 class="font-weight-bold">Mantenimiento Administrador</h1>
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
                            <h3 class="card-title font-weight-bold">Resgistro/Edición</h3>
                        </div>
                        <s:form id="form_mante" action="%{(edit==1)? 'actualizarAdmin': 'registrarAdmin'}" theme="simple" >

                            <div class="card-body">
                                <div class="form-group">
                                    <label for="inputDni">Dni</label>
                                    <s:textfield  name="admin.dni"  cssClass="form-control " placeholder="Ingrese Dni" />
                                </div>
                                <div class="form-group">
                                    <label for="inputNombres">Nombres</label>
                                    <s:textfield  name="admin.nombres" cssClass="form-control" placeholder="Ingrese Nombre" />
                                </div>
                                <div class="form-group">
                                    <label for="inputApellidos">Apellidos</label>
                                    <s:textfield  name="admin.apellidos" cssClass="form-control" placeholder="Ingrese Apellido"/>
                                </div>
                                <div class="form-group">
                                    <label for="inputPrivilegio">Privilegio</label>
                                    <s:select list="#{"1":'Alto','2':'Medio'}" headerKey="0" label="Privilegio"
                                              headerValue="Selecione" name="admin.privilegio" 
                                              cssClass="form-control"/>
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
                                        <tr>
                                            <th>DNI</th>
                                            <th>Nombres</th>
                                            <th>Apellidos</th>
                                            <th>Privilegio</th>
                                            <th>Opciones</th>
                                        </tr> 
                                    </thead>     
                                    <tbody>
                                        <s:iterator value="lstAdmin">
                                            <tr>

                                                <s:if test="adminLog.dni.equals(dni)">

                                                </s:if>
                                                <s:else>
                                                    <td><s:property value="dni"/> </td>
                                                    <td><s:property value="nombres"/></td> 
                                                    <td><s:property value="apellidos"/></td> 
                                                    <td><s:property value="privilegio"/></td>

                                                    <td>
                                                        <s:if test='privilegio.equals("2")'>
                                                            <s:url id="lnkEditar" action="editarAdmin">
                                                                <s:param value="dni" name="admin.dni" />
                                                            </s:url>

                                                            <s:a href="%{lnkEditar}" cssClass="btn btn-mini btn-primary"><i class="fa fa-edit"></i></s:a>

                                                            <s:url id="lnkEliminar" action="eliminarAdmin">
                                                                <s:param value="dni" name="admin.dni"/>
                                                            </s:url>

                                                            <s:a href="%{lnkEliminar}" cssClass="btn btn-mini btn-danger" ><i class="fa fa-remove"></i></s:a>  

                                                        </s:if>
                                                        <s:else>
                                                            <a href="#" Class="btn btn-mini btn-primary disabled"><i class="fa fa-edit"></i></a>
                                                            <a href="#" Class="btn btn-mini btn-danger disabled" ><i class="fa fa-remove"></i></a>  
                                                        </s:else>

                                                    </td>

                                                </s:else>
                                            </tr>
                                        </s:iterator>	
                                    </tbody>

                                    <tfoot>
                                    <th>DNI</th>
                                    <th>Nombres</th>
                                    <th>Apellidos</th>
                                    <th>Privilegio</th>
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