$(function () {
    $("#ingresar").click(function (event)

    {
       event.preventDefault();
        var dni = $("#dni");
        var password = $("#password");
        var form = $("#form_login");
        if (dni.val() === "")
        {
            dni.focus();
            return;
        }else if(password.val() === ""){
             password.focus();
             return;
        } 
        else {
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
        if(!check) {
            swal({
                    title: "¡Error!",
                    text: "Debe completar todos los campos",
                    icon: "error",
                    button: "Aceptar",
                    });  
        }
        else {
            form.submit();
        }
    }
    );
});

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
//});