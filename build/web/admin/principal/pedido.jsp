<%@include file="sidebar.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header" id="sectionAjax">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1 class="font-weight-bold ">Pedidos</h1>
                </div>
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#">Inicio</a></li>
                        <li class="breadcrumb-item active">Pedidos</li>
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
                                            <th>Numero Pedido</th>
                                            <th>Fecha</th>
                                            <th>SubTotal</th>
                                            <th>Total descuento</th>
                                            <th>IGV</th>
                                            <th>Total</th>
                                            <th>Pago</th>
                                            <th>Estado</th>
                                            <th>Cliente</th>
                                            <th>Empresa</th>
                                            <th>Reporte</th>


                                        </tr> 
                                    </thead>     
                                    <tbody>
                                        <s:iterator value="lstPedido" var="lstpedido">
                                            <tr>
                                                <td><s:property value="numero"/></td> 
                                                <td><s:property value="fecha"/></td>
                                                <td><s:property value="subtotal"/></td> 
                                                <td><s:property value="totalDescuento"/></td> 
                                                <td><s:property value="igv"/></td> 
                                                <td><s:property value="total"/></td> 
                                                <td><s:property value="pago"/></td> 
                                                <s:if test="estado == '1'">
                                                    <td class="bg-success">Entregado</td>
                                                </s:if>
                                                <s:elseif test="estado == '0'">
                                                <td class="bg-danger">Pendiente</td>
                                                </s:elseif>
                                                <s:elseif test="estado == '2'">
                                                   <td class="bg-warning">En proceso</td>
                                                </s:elseif>
                                                <td><s:property value="idCliente.nombres"/></td> 
                                                <td><s:property value="idEmpresa.razonSocial"/></td> 
                                                <td><i class="fas fa-eye "></i></td>

                                            </s:iterator>	
                                    </tbody>

                                    <tfoot>
                                    <th>Numero Pedido</th>
                                    <th>Fecha</th>
                                    <th>SubTotal</th>
                                    <th>Total descuento</th>
                                    <th>IGV</th>
                                    <th>Total</th>
                                    <th>Pago</th>
                                    <th>Estado</th>
                                    <th>Cliente</th>
                                    <th>Empresa</th>
                                    <th>Reporte</th>            
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