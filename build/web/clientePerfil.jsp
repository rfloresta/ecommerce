<%@include file="templastes/header.jsp" %>


<div class="container mb-5">
    <div class="row">
        <div class="col-12 encabezado-perfilCliente mt-5 py-4 px-3 ">
            <h1>Mi cuenta : <s:label name="cliente.nombres" /> <s:label name="cliente.apellidos" /></h1>
            <span>Datos y preferencias</span>
        </div>
        <div class="col-4 list-group pr-0 barra-lateral-perfilC">
            <a class="list-group-item list-group-item-action"> <i class="fa fa-shopping-cart"></i> Mis Compras</a>
            <a class="list-group-item list-group-item-action"><i class="fa fa-user-cog"></i> Datos Personales</a>
            <a class="list-group-item list-group-item-action"><i class="fa fa-user-cog"></i> Datos Personales</a>
        </div>
        <div class="col-8 contenido-cliente pt-3">
            <h3 class="mb-5">Editar Datos Personales</h3>
            <div class="row" >
                <div class="col-6">
                    <label>Nombre</label>
                    <input type="text" class="form-control mb-5" />
                    
                    <label>Dni</label>
                    <input type="text" class="form-control mb-5" />
                    
                </div>
                <div class="col-6">
                    <label>Apellidos</label>
                    <input type="text" class="form-control mb-5" />
                    
                    <label>Celular</label>
                    <input type="text" class="form-control mb-5" />
                </div>
            </div>
        </div>
        
    </div>
            
</div>


<%@include file="templastes/footer.jsp" %>