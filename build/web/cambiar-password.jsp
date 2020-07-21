<%@include file="header.jsp" %>

<div class="container mb-5">
    <div class="row">
        <div class="col-12 encabezado-perfilCliente mt-5 py-4 px-3 ">
            <h1 class="text-light">Mi cuenta: <s:label name="#session.nombres+ ' '+#session.apellidos" /></h1>
            <span>Datos y preferencias</span>
        </div>
        <div class="col-4 list-group pr-0 barra-lateral-perfilC">
            <s:url id="lnkListarPedidoCliente" action="listarPedidoPorCliente">
                <s:param value="#session.idClie" name="cliente.idCliente"/>
                <s:param value="3" name="op"/>
            </s:url>
            <s:a href="%{lnkListarPedidoCliente}" cssClass="list-group-item list-group-item-action"> <i class="fa fa-shopping-cart"></i> Mis Compras</s:a>

            <s:url id="lnkbuscar" action="misDatos">
                <s:param value="2" name="op"/>
            </s:url>
            <s:a href="%{lnkbuscar}" cssClass="list-group-item list-group-item-action"><i class="fa fa-user-cog"></i> Datos Personales</s:a>

            <a href="cambiar_password.jsp" Class="list-group-item list-group-item-action"><i class="fa fa-lock"></i> Cambiar Contraseña</a>
            </div>

            <div class="col-8 contenido-cliente pt-3" >
                <h3 class="mb-3">Cambiar Contraseña</h3>
                <div class="row">

                    <div class="col-md-12">
                    <s:form id="form_pass" theme="simple" action="cambiarPasswordClie">

                        <div class="form-group">
                            <label>Contraseña Actual</label>
                                                       <s:if test="#session.incorrecto == 1">  
                                <p class="text-danger font-weight-bold">*La Contraseña Actual no es la correcta*</p>
                            </s:if> 
                            <div class="input-group">
                                <s:password name="passwordActual" id="password1" cssClass="form-control"/>
                                <div class="input-group-append">
                                    <button class="btn btn-primary" type="button" onclick="mostrarPassword('password1')"> <span  id="show_password1" class="fa fa-eye-slash icon"></span> </button>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Nueva Contraseña</label>
                            <div class="input-group">
                                <s:password name="cliente.password" id="password2" cssClass="form-control"/>
                                <div class="input-group-append">
                                    <button class="btn btn-primary" type="button" onclick="mostrarPassword('password2')"> <span  id="show_password2" class="fa fa-eye-slash icon"></span> </button>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Confirmar Contraseña</label>
                            <div class="input-group">
                                <s:password name="passwordNuevo" id="password3" cssClass="form-control"/>
                                <div class="input-group-append">
                                    <button  class="btn btn-primary" type="button" onclick="mostrarPassword('password3')"> <span id="show_password3" class="fa fa-eye-slash icon"></span> </button>
                                </div>
                            </div>
                        </div>
                                <div class="text-center mb-3">
                        <p style="display:none" id="errorPassword" class="text-danger font-weight-bold">
        *La contraseña debe tener 8 caracteres como mínimo entre números, minúsculas y mayúsculas*
                  *No debe contener caracteres extraños ni espacios en blanco*
                        </p></div>
                        <div class="text-center pb-4">
                            <s:submit id="cambiar" cssClass="btn btn-primary " value="Guardar" />
                        </div>

                    </div>
                </div>
            </s:form>
        </div> 
    </div>
</div>

<%@include file="footer.jsp" %>