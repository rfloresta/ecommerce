<%@include file="header.jsp" %>

<div class="container mb-5">
    <div class="row">
        <div class="col-12 encabezado-perfilCliente mt-5 py-4 px-3 ">
            <h1 class="text-light">Mi cuenta: <s:label name="#session.NombreClienteCompleto" /></h1>
            <span>Datos y preferencias</span>
        </div>
        <div class="col-4 list-group pr-0 barra-lateral-perfilC">
            <s:url id="lnkListarPedidoCliente" action="listarPedidoPorCliente">
                <s:param value="#session.idClie" name="cliente.idCliente"/>
                <s:param value="3" name="op"/>
            </s:url>
            <s:a href="%{lnkListarPedidoCliente}" cssClass="list-group-item list-group-item-action"> <i class="fa fa-shopping-cart"></i> Mis Compras</s:a>

            <s:url id="lnkbuscar" action="buscarClie">
                <s:param value="#session.idClie" name="cliente.idCliente"/>
                <s:param value="2" name="op"/>
            </s:url>
            <s:a href="%{lnkbuscar}" cssClass="list-group-item list-group-item-action"><i class="fa fa-user-cog"></i> Datos Personales</s:a>

            <a href="cambiar_password.jsp" Class="list-group-item list-group-item-action"><i class="fa fa-lock"></i> Cambiar Contraseña</a>
            </div>

<div class="col-8 contenido-cliente pt-3">
                <h3 class="mb-3">Cambiar Contraseña</h3>
                 <div class="row">
                     
                        <div class="col-md-12">
                <s:form theme="simple" action="actualizarClie" method="POST">
                   
                            <div class="form-group">
                            <s:hidden name="cliente.dni" />
                            <label>Contraseña Actual</label>
                            <s:password name="password" cssClass="form-control" />
                            </div>
                            <div class="form-group">
                            <s:hidden name="cliente.dni" />
                            <label>Nueva Contraseña</label>
                            <s:password name="cliente.password2" cssClass="form-control" />
                            </div>
                       <div class="form-group">
                            <label>Confirmar Nueva Contraseña</label>
                            <s:password name="password3" cssClass="form-control" />
                        </div>
                        <div class="text-center pb-4">
                            <s:submit cssClass="btn btn-warning " value="Enviar" />
                        </div>
                        
                        </div>
                    </div>
                </s:form>
            </div> 
            </div>
            </div>
          
<%@include file="footer.jsp" %>