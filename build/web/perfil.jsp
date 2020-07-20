<%@include file="header.jsp" %>


<div class="container mb-5">
    <div class="row">
        <div class="col-12 encabezado-perfilCliente mt-5 py-4 px-3 ">
            <h1 class="text-light">Mi cuenta: <s:label name="#session.NombreClienteCompleto" /></h1>
            <span>Datos y preferencias</span>
        </div>
        <div class="col-4 list-group pr-0 barra-lateral-perfilC">
           <s:hidden name="#session.idClie" id="idClie"/>
            <a href="#" class="btnPedidoClie list-group-item list-group-item-action"> <i class="fa fa-shopping-cart"></i> Mis Compras</a>

             
            <a href="#" class="btnDatosClie list-group-item list-group-item-action"><i class="fa fa-user-cog"></i> Datos Personales</a>

            <a href="#" id="btnBuscarPass" Class=" list-group-item list-group-item-action"><i class="fa fa-lock"></i> Cambiar Contraseña</a>

        </div>

            <div id="div-contenido" class="col-8 text-center principal">

                <img src="imagenes/logo2.png" class="img-fluid logo-perfil">

            </div> 
       
    </div>

</div>

<div id="prueba"></div>
<%@include file="footer.jsp" %>
