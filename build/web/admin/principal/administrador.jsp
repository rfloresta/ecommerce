<%@include file="sidebar.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header" id="sectionAjax">
<div class="container">
            <div class="row mb-2">
                <div class="col-sm-12 mb-5">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#">Home</a></li>
                        <li class="breadcrumb-item active">Pagina Inicio</li>
                    </ol>
                </div>                
                <div class="col-md-12">

                    <h1 class="my-5  text-center text-uppercase font-weight-bold display-1">Mantenimiento Administrador</h1>
                    
                
                    
              <div class="card card-danger">
              <div class="card-header">
                <h3 class="card-title">Registrar Administrador</h3>
              </div>
              <div class="card-body">
                  <s:form action="%{(edit==1)? 'actualizarAdmin': 'registrarAdmin'}" theme="simple" >
                <div class="row">
                     
                  <div class="col-3">
                      <label>Dni</label>
                    <s:textfield  name="admin.dni"  cssClass="form-control " placeholder="Ingrese Dni" />
                  </div>
                  <div class="col-3">
                      <label>Nombre</label>
                    <s:textfield  name="admin.nombres" cssClass="form-control" placeholder="Ingrese Nombre" />
                  </div>
                  <div class="col-3">
                      <label>Apellido</label>
                    <s:textfield  name="admin.apellidos" cssClass="form-control" placeholder="Ingrese Apellido"/>
                  </div>
                   <div class="col-3">
                       <label>Password</label>
                    <s:textfield  name="admin.password" cssClass="form-control"  placeholder="Ingrese Password"/>
                  </div>
                  
                   <div class="col-2 offset-5 btn-admin  my-4">
                     <s:submit value="%{(edit==1)? 'Editar' : 'Registrar'}" cssClass="%{(edit==1)? 'btn btn-warning btn-block ' : 'btn btn-success btn-block '}" />
                  </div>
                  
                 
                   
                </div>
                  </s:form>
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
                    <div id="tbl" class="mt-5">
                        <div class="table-responsive table-centered">
                            <table id="datos" class="table w-100">
                                <thead>
                                    <tr class="">
                                        <th>DNI</th>
                                        <th>Nombres</th>
                                        <th>Apellidos</th>
                                        <th>Password</th>
                                        <th></th>
                                        <th></th>
                                    </tr> 
                                </thead>     
                                <tbody>

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
                                                <s:a href="%{lnkEditar}" cssClass="fa fa-edit form-control btn-primary text-center "></s:a>
                                              
                                             <td>
                                                 <s:url id="lnkEliminar" action="eliminarAdmin">
                                                     <s:param value="dni" name="admin.dni"/>
                                                 </s:url>
                                                 
                                             <s:a href="%{lnkEliminar}" cssClass="form-control btn-danger text-center" > X </s:a>
                                                     
                                                 
                                             </td>
                                        </s:iterator>	
                                </tbody>

                                <tfoot>
                                <th>DNI</th>
                                <th>Nombres</th>
                                <th>Apellidos</th>
                                <th>Password</th>
                                <th></th>
                                <th></th>
                                </tfoot>

                            </table>
                        </div>
                    </div>
                </div>
            </div>     
        </div>
</section>
</div>
<%@include file="footer.jsp" %>