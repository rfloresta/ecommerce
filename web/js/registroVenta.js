$(document).ready(function () {


    $('#buttonPaypal').on('click', function (event) {
        event.preventDefault();
        if (!$('#idProducto').length > 0) {
            toastr.error('Ups ! al parecer no hay productos que registrar');
        } else if ($('#idCliente').val() === "") {
            toastr.error('Debe iniciar sesi\u00F3n para continuar');
        } else {
           
          $('#formPaypal').submit();

        }
    });


});
