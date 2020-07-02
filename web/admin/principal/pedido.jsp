<%@include file="sidebar.jsp" %>
<%@page import="java.text.SimpleDateFormat"%>
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
                                            <th>IGV</th>
                                            <th>Total</th>
                                            <th>Tipo Pago</th>
                                            <th>Estado</th>
                                            <th>Cliente</th>
                                            <th>Reporte</th>
                                        </tr> 
                                    </thead>     
                                    <tbody>
                                        <s:iterator value="lstPedido" >
                                            <tr>
                                                <td><s:property value="numero"/></td> 
                                                <td><s:property value="fecha"/></td>
                                                <td><s:property value="subtotal"/></td> 
                                                <td><s:property value="igv"/></td> 
                                                <td><s:property value="total"/></td> 
                                                <td><s:property value="pago"/></td> 
                                                <td>

                                                    <s:url id="lnkActuProceso" action="actualizarPedido">
                                                        <s:param value="idPedido" name="pedido.idPedido" />
                                                        <s:param value="numero" name="pedido.numero" />
                                                        <s:param value="subtotal" name="pedido.subtotal" />
                                                        <s:param value="igv" name="pedido.igv" />
                                                        <s:param value="total" name="pedido.total" />
                                                        <s:param value="pago" name="pedido.pago" />
                                                        <s:param value="fecha" name="pedido.fecha"  />
                                                        <s:param value="0" name="pedido.estado" />
                                                        <s:param value="idCliente.idCliente" name="cliente.idCliente" />
                                                    </s:url>
                                                    <s:url id="lnkActuEnviado" action="actualizarPedido">
                                                        <s:param value="idPedido" name="pedido.idPedido" />
                                                        <s:param value="numero" name="pedido.numero" />
                                                        <s:param value="subtotal" name="pedido.subtotal" />
                                                        <s:param value="igv" name="pedido.igv" />
                                                        <s:param value="total" name="pedido.total" />
                                                        <s:param value="pago" name="pedido.pago" />
                                                        <s:param value="fecha" name="pedido.fecha"  />
                                                        <s:param value="2" name="pedido.estado" />
                                                        <s:param value="idCliente.idCliente" name="cliente.idCliente" />
                                                    </s:url>
                                                    <s:url id="lnkActuEntregado" action="actualizarPedido">
                                                        <s:param value="idPedido" name="pedido.idPedido" />
                                                        <s:param value="numero" name="pedido.numero" />
                                                        <s:param value="subtotal" name="pedido.subtotal" />
                                                        <s:param value="igv" name="pedido.igv" />
                                                        <s:param value="total" name="pedido.total" />
                                                        <s:param value="pago" name="pedido.pago" />
                                                        <s:param value="fecha" name="pedido.fecha"  />
                                                        <s:param value="1" name="pedido.estado" />
                                                        <s:param value="idCliente.idCliente" name="cliente.idCliente" />
                                                    </s:url>
                                                    <s:if test="estado == '1'">
                                                        <button class="dropdown-toggle btn btn-success" type="button" id="dropPedido" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                            Entregado
                                                        </button>
                                                        <div class="dropdown-menu"  aria-labelledby="dropPedido">

                                                            <s:a href="%{lnkActuProceso}" cssClass="dropdown-item">En proceso</s:a>

                                                            <s:a href="%{lnkActuEnviado}" cssClass="dropdown-item">Enviado</s:a>
                                                            </div>

                                                    </s:if>
                                                    <s:elseif test="estado == '0'">
                                                        <button class="dropdown-toggle btn btn-danger" type="button" id="dropPedido" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                            En proceso
                                                        </button>
                                                        <div class="dropdown-menu"  aria-labelledby="dropPedido">
                                                            <s:a href="%{lnkActuEntregado}" cssClass="dropdown-item">Entregado</s:a>
                                                            <s:a href="%{lnkActuEnviado}" cssClass="dropdown-item">Enviado</s:a>
                                                            </div>
                                                    </s:elseif>
                                                    <s:elseif test="estado == '2'">
                                                        <button class="dropdown-toggle btn btn-warning" type="button" id="dropPedido" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                            Enviado
                                                        </button>
                                                        <div class="dropdown-menu"  aria-labelledby="dropPedido">
                                                            <s:a href="%{lnkActuProceso}" cssClass="dropdown-item">En proceso</s:a>
                                                            <s:a href="%{lnkActuEntregado}" cssClass="dropdown-item">Entregado</s:a>
                                                            </div>
                                                    </s:elseif>

                                                </td>
                                                <td><s:property value="idCliente.nombres"/></td> 
                                                <td><i class="fas fa-eye "></i></td>

                                            </s:iterator>	
                                    </tbody>

                                    <tfoot>
                                        <tr>
                                            <th>Numero Pedido</th>
                                            <th>Fecha</th>
                                            <th>SubTotal</th>
                                            <th>IGV</th>
                                            <th>Total</th>
                                            <th>Pago</th>
                                            <th>Estado</th>
                                            <th>Cliente</th>
                                            <th>Reporte</th>
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