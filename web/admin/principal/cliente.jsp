<%@include file="sidebar.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header" id="sectionAjax">
        <div class="container-fluid">
        <div class="row mb-2">
            <div class="col-sm-6">
                <h1 class="font-weight-bold ">Clientes Registrados</h1>
            </div>
            <div class="col-sm-6">
                <ol class="breadcrumb float-sm-right">
                    <li class="breadcrumb-item"><a href="#">Inicio</a></li>
                    <li class="breadcrumb-item active">Clientes</li>
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

                                            </s:iterator>	
                                    </tbody>

                                    <tfoot>
                                    <th>Nombre</th>
                                            <th>Apellido</th>
                                            <th>Dni</th>
                                            <th>N° Celular</th>
                                            <th>Direccion</th>
                                            <th>Email</th>             
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