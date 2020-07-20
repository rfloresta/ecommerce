$(document).ready(function () {


    $('#registrarVen').on('click', function (event) {
        event.preventDefault();
        if (!$('#idProducto').length > 0) {
           toastr.error('Ups ! al parecer no hay productos que registrar');
        }else if($('#idCliente').val() === ""){
             toastr.error('Debe iniciar sesi\u00F3n para continuar');
        }else {
            var form = $('#registrarPedido');
            swal({
                title: "Compra registrada!",
                text: "Gracias por su compra!",
                icon: "success",
                button: "Aceptar",
            })
            .then((willDelete) => {
            if (willDelete) {
                form.submit();
            }
            });
        }
    });


});
