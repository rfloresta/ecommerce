$('.btnDatosClie').on('click', function () {
    var idCliente = $('#idClie').val();
    $.ajax({
        url: 'api/cliente/'+idCliente,
        success: function (respuesta) {
            var json = respuesta;
            console.log(json);
            var dni = json.dni == null ? '' : json.dni;
            var numCelular = json.numCelular == null ? '' : json.numCelular;
            var direccion = json.direccion == null ? '' : json.direccion;

            $('#div-contenido').html("\n\
            <h3 class='mb-4'>Datos Personales</h3>\n\
            <div class='row' >\n\
            <div class='col-6'>\n\
            <label class='text-start'>Nombre</label>\n\
            <input  type='text' id='nombre' class='form-control mb-3' value='" + json.nombres + "'>\n\
            <label>Dni</label>\n\
            <input  type='text' id='dni' class='form-control mb-3' value='" + dni + "'>\n\
            </div>\n\
            <div class='col-6'>\n\
            <label>Apellidos</label>\n\
            <input  type='text' id='apellido' class='form-control mb-3' value='" + json.apellidos + "'>\n\
            <label>Celular</label>\n\
            <input  type='text' id='numCelular' class='form-control mb-3' value='" + numCelular + "'>\n\
            </div>\n\
            <div class='col-6'>\n\
            <label>Direccion</label>\n\
            <input  type='text' id='direccion' class='form-control mb-3' value='" + direccion + "'>\n\
            </div>\n\
            <div class='col-6'>\n\
            <label>Email</label>\n\
            <input  type='text' id='email' class='form-control mb-5' value='" + json.email + "'>\n\
            <input  type='hidden' id='contrasena' class='form-control mb-5' value='" + json.password + "'>\n\
            </div>\n\
            <div class='col-12 text-center pb-4'>\n\
            <input type='submit' id='actuaInfo' onclick='ActualizarDatos()' class='actuaInfo btn btn-warning' value='Actualizar' />\n\
            </div>\n\
            </div>");
        }});

});

//$('#btnBuscarPass').on('click', function () {
//   var idClie = $('#idClie').val();
//    console.log(idClie);
//    $.ajax({
//        type: 'POST',
//        url: 'buscarCliePerfil.action?idClie=' + idClie,
//        success: function (respuesta) {
//            var json = JSON.parse(respuesta);
//            $('#div-contenido').html("\n\
//             <h3 class='mb-3 mt-3'>Cambiar Contrase&ntilde;a</h3>\n\
//                 <div class='row'>\n\
//                        <div class='col-md-12'>\n\
//                            <div class='form-group'>\n\
//                            <input  type='hidden' id='nombre' class='form-control mb-5' value='" + json.nombres + "'>\n\
//                            <input  type='hidden' id='dni' class='form-control mb-5' value='" + json.dni + "'>\n\
//                            <input  type='hidden' id='apellido' class='form-control mb-5' value='" + json.apellidos + "'>\n\
//                            <input  type='hidden' id='numCelular' class='form-control mb-5' value='" + json.numCelular + "'>\n\
//                            <input  type='hidden' id='direccion' class='form-control mb-5' value='" + json.direccion + "'>\n\
//                            <input  type='hidden' id='email' class='form-control mb-5' value='" + json.email + "'>\n\
//                            <label>Contrase&ntilde;a Actual</label>\n\
//                            <input type='password' name='password' class='form-control' />\n\
//                            </div>\n\
//                            <div class='form-group'>\n\
//                            <label>Nueva Contrase&ntilde;a</label>\n\
//                            <input type='password'  name='password2' class='form-control' />\n\
//                            </div>\n\
//                       <div class='form-group'>\n\
//                            <label>Confirmar Nueva Contrase&ntilde;a</label>\n\
//                             <input type='password' id='contrasena' name='password2' class='form-control' />\n\
//                        </div>\n\
//                        <div class='text-center pb-4'>\n\
//                            <input type='submit'  onclick='ActualizarDatos()' class='actuaInfo btn btn-warning' value='Enviar' />\n\
//                        </div>\n\
//                        </div>\n\
//                    </div>");
//        }});
//});

function ActualizarDatos() {
    var idClie = $('#idClie').val();
    var nombre = $('#nombre').val();
    var dni = $('#dni').val();
    var apellido = $('#apellido').val();
    var numCelular = $('#numCelular').val();
    var direccion = $('#direccion').val();
    var email = $('#email').val();
    var password = $('#contrasena').val();
    $.ajax({
        type: 'POST',
        url: 'actualizarClie.action?idClie=' + idClie + '&nombre=' + nombre + '&dni=' + dni + '&apellido=' + apellido + '&numCelular=' + numCelular + '&direccion=' + direccion + '&email=' + email + '&password=' + password,
        success: function (respuesta) {
            swal({
                title: "Bien Echo",
                text: "Tus datos se actualizaron!",
                icon: "success",
                button: "Aceptar",
            });
        }});
}

$('.btnPedidoClie').on('click', function () {
    var idClie = $('#idClie').val();
    $.ajax({
        url: 'api/pedido/'+idClie,
        success: function (respuesta) {
            var json = respuesta;
            var lista = "";
            
            var link = /*[[@{/edit.html}]]*/ 'test';
            json.forEach(pedido => {
                lista += "<div class='row'>\n\
                        <div class='col-6'>\n\
                            <h3 class='text-bold'>Numero de Orden: <span>" + pedido.pedido.numero + "</span></h3>\n\
                            <div class='detalle my-3'>\n\
                                <img class='img-fluid img-pro-pefil' src='http://localhost:8084/W_V_S.A.C/admin/imagenes/" + pedido.producto.imagen + "'>\n\
                                <div class='d-inline-block ml-2'>\n\
                                    <h4 class='mb-2'>" + pedido.producto.nombre + "</h4>\n\
                                    <span class='text-success'>S/" + pedido.producto.precioVenta + "</span>\n\
                                    <p>" + pedido.cantidad + " unidad</p>\n\
                                </div>\n\
                            </div>\n\
                        </div>\n\
                        <div class='col-6 d-flex justify-content-end'>\n\
                            <div class='d-block'>\n\
                                <p >Total: S/" + pedido.pedido.total + "</p>\n\
                                <p class='d-block'>Fecha de compra: " + pedido.pedido.fecha + "</p>\n\
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
        var action=form.attr("action");
        var formSer = form.serialize();
    $.ajax({
        type: 'POST',
        url: action,
        cache: false,
        data: formSer,
        success: function (respuesta) {
            if(respuesta.substr(0,5)==="<!--1"){
               $('#RestablecerTab').html(respuesta); 
            }
            if(respuesta.substr(0,5)==="<!--0"){
               $('#incorrecto').html(respuesta);
            }
           }
     });
 });
 });
 