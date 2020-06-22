$(function () {
    $("#ingresar").click(function (event)

    {
        event.preventDefault();
        var dni = $("#dni");
        var password = $("#password");
        var form = $("#form_login");
        if (dni.val() === "")
        {
<<<<<<< HEAD
            toastr.error('Debe completar el campo usuario');
            dni.focus();
            return;
        } else if (password.val() === "") {

            toastr.error('Debe completar el campo password');
            password.focus();
            return;
        } else {
=======
            
        
                   toastr.error('Debe completar el campo usuario');
                   
                dni.focus();
            return;
        }else if(password.val() === ""){
            
            toastr.error('Debe completar el campo contraseña');
             password.focus();
             return;
        } 
        else {
>>>>>>> 97edac29254a5880c5c2e5d3c6e7960383a0a617
            form.submit();
        }
    }
    );
});

$(function () {
    $("#grabar").click(function (event)
    {
        event.preventDefault();
        var form = $(this).parents("#form_mante");
        var check = checkCampos(form);
        if (!check) {
            swal({
                title: "¡Error!",
                text: "Debe completar todos los campos",
                icon: "error",
                button: "Aceptar",
            });
        } else {
            form.submit();
        }
    }
    );
});


/*
 //Función para comprobar los campos de texto
 function checkCampos(obj) {
 var camposRellenados = true;
 obj.find("input").each(function() {
 var $this = $(this);
 if( $this.val().length <= 0 ) {
 camposRellenados = false;
 return false;
 }
 });
 if(camposRellenados == false) {
 return false;
 }
 else {
 return true;
 }
 }
 //$(function () {
 //    $(".menu").click(function (event)
 //
 //    {
 //       event.preventDefault();
 //        
 //     $("#sectionAjax").load($(this).attr('href'), function (response, status, xhr)
 //    {
 //        if (status == "success") {
 //           
 //        }
 //    });
 //        
 //    }
 //    );
 //});*/