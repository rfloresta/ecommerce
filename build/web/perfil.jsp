<%@include file="header.jsp" %>
<div class="container mb-5">
    <div class="row">
<s:if test="#session != null" >
        <div class="col-12 encabezado-perfilCliente mt-5 py-4 px-3 ">
            <h1 class="text-light">Mi cuenta: <s:label name="#session.nombres+ ' '+#session.apellidos" /></h1>
            <span>Datos y preferencias</span>
        </div>
        <div class="col-4 list-group pr-0 barra-lateral-perfilC">
            <s:hidden name="%{#session.id}"  id="idClie"/>
            <a href="#" class="btnPedidoClie list-group-item list-group-item-action"> <i class="fa fa-shopping-cart"></i> Mis Compras</a>
            <a href="#" class="btnDatosClie list-group-item list-group-item-action"><i class="fa fa-user-cog"></i> Datos Personales</a>
            <s:a href="devolverPagPass" id="btnCambiarPass" Class="list-group-item list-group-item-action"><i class="fa fa-lock"></i> Cambiar Contraseña</s:a>
        </div>
            <div id="div-contenido" class="col-8 contenido-cliente pt-3">
                <img src="imagenes/logo2.png" class="img-fluid logo-perfil">

            </div> 
   
</s:if>
<s:else>
    <div class="text-sm mt-5 mb-5 col-12">
    <p class="text-danger font-weight-bold">
        Debes iniciar sesión
    </p>
    </div>
</s:else>
 </div>
</div>
<%@include file="footer.jsp" %>
