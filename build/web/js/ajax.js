$('.btnDatosClie').on('click', function () {
    var idCliente = $('#idClie').val();
    $.ajax({
        url: 'api/clientes/' + idCliente,
        beforeSend: function (xhr) {
                $('#div-contenido').html('<div class="loading text-center"><img src="imagenes/carga.gif" class="w-50" alt="loading" /><br/></div>');
        },
        success: function (respuesta) {
            var json = respuesta;
            var dni = json.dni == null ? '' : json.dni;
            var numCelular = json.numCelular == null ? '' : json.numCelular;
            var direccion = json.direccion == null ? '' : json.direccion;
            
            console.log(json);
            $('#div-contenido').html("\n\
            <h3 class='mb-4'>Datos Personales</h3>\n\
            <form id='form-datos'>\n\
            <div class='row text-left text-bold' >\n\
            <div class='col-6'>\n\
            <label class='text-start'>Nombre</label>\n\
            <input  type='text' id='nombre' name='nombres' class='form-control mb-3' value='" + json.nombres + "'>\n\
            <label>Dni</label>\n\
            <input  type='text' id='dni' name='dni' class='form-control mb-3' value='" + dni + "'>\n\
            </div>\n\
            <div class='col-6'>\n\
            <label>Apellidos</label>\n\
            <input  type='text' id='apellido' name='apellidos' class='form-control mb-3' value='" + json.apellidos + "'>\n\
            <label>Celular</label>\n\
            <input  type='text' id='numCelular' name='numCelular' class='form-control mb-3' value='" + numCelular + "'>\n\
            </div>\n\
            <div class='col-6'>\n\
            <label>Direccion</label>\n\
            <textarea id='direccion' name='direccion' class='form-control mb-3'>" + direccion + "</textarea>\n\
            </div>\n\
            <div class='col-6'>\n\
            <label>Email</label>\n\
            <input  type='email' id='email' name='email' class='form-control mb-5' value='" + json.email + "'>\n\
            <input  type='hidden' name='password' class='form-control mb-5' value=" + json.password + ">\n\
            </div>\n\
            <div class='col-12 text-center pb-4'>\n\
            <input type='button' onclick='ActualizarDatos()' class='btn btn-warning' value='Actualizar' />\n\
            </form>\n\
            </div>\n\
            </div>");
        }});
});

function ActualizarDatos() {
    var form = $("#form-datos");
    var idClie = $('#idClie').val();
    var jsonData=form.serializeArray().reduce(function(a, z) { a[z.name] = z.value; return a; }, {});
    $.ajax({
        url: 'api/clientes/' + idClie + '/edit',
        data: {json:JSON.stringify(jsonData)},
        success: function (respuesta) {
            if (respuesta == "ok") {
                swal({
                    title: "Bien Echo",
                    text: "!Tus datos han sido actualizados!",
                    icon: "success",
                    button: "Aceptar",
                });
            }
        }});
}

$('.btnPedidoClie').on('click', function () {
    var idClie = $('#idClie').val();
    $('#div-contenido').html('<div class="loading text-center"><img src="imagenes/carga.gif" class="w-50" alt="loading" /><br/></div>');
    $.ajax({
        url: 'api/clientes/' + idClie,
        success: function (respuesta) {
            var json = respuesta.pedidoList;
            var lista = "";
            json.forEach(pedido => {
                lista += "<div class='row'>\n\
                        <div class='col-6 '>\n\
                            <h4 class='text-muted'>Compra Realizada: <span>" + pedido.fecha + "</span></h4>\n\
                            <div class='detalle my-3'>\n\
                                <div class='d-inline-block ml-2'>\n\
                                 <p>Tipo Pago: " + pedido.pago + "</p>\n\
                                 <span class='text-success d-block'>Total: S/" + pedido.total + "</span>\n\
                                </div>\n\
                            </div>\n\
                        </div>\n\
                        <div class='col-6 d-flex justify-content-end'>\n\
                            <div class='d-block'>\n\
                                <p class='d-block'>Compra numero: " + pedido.numero + "</p>\n\
                                <button class='btn btn-warning mt-2 text-light'> Ver comprobante</button>\n\
                            </div>\n\
                        </div>\n\
                    </div>";
            });
            $('#div-contenido').html(lista);
        }
    });
});

$(function () {
    $("#btnCambiarPass").click(function (event)
    {
        event.preventDefault();
        $("#div-contenido").load($(this).attr('href'));
    }
    );
});

$(function () {
    $("#btnRestablecer").click(function (event)
    {
        event.preventDefault();
        var form = $("#form-restablecer");
        var action = form.attr("action");
        var formSer = form.serialize();
        $.ajax({
            type: 'POST',
            url: action,
            cache: false,
            data: formSer,
            success: function (respuesta) {
                if (respuesta.substr(0, 5) === "<!--1") {
                    $('#RestablecerTab').html(respuesta);
                }
                if (respuesta.substr(0, 5) === "<!--0") {
                    $('#incorrecto').html(respuesta);
                }
            }
        });
    });
});
 
    $("#btnCambiarPass").click(function (event)
    {
        event.preventDefault();
        $("#div-contenido").load($(this).attr('href'));
    });



//Filtros de la pagina productos

$('#btnfiltro').on('click', function () {

    var min_val = $('#value-lower').text();
    var max_val = $('#value-upper').text();
     $('#contenido-productos').html('<div class="loading text-center"><img src="imagenes/carga.gif" class="w-50" alt="loading" /><br/>Un momento, por favor...</div>');
    $.ajax({
        type: 'POST',
        url: 'listarFiltroPrecioProducto.action?min_val=' + min_val+ '&max_val='+max_val,
        success: function (respuesta) {
           $('#contenido-productos').fadeIn(1000).html(respuesta);
        }
    });
});
