$(function () {
    $("#ingresar").click(function (event)

    {
        event.preventDefault();
        var dni = $("#dni");
        var password = $("#password");
        var form = $("#form_login");
        if (dni.val() === "")
        {
            toastr.error('Debe completar el campo DNI');
            dni.focus();
            return;
        } else if (password.val() === "") {
            toastr.error('Debe completar el campo contraseña');
            password.focus();
            return;
        }
        form.submit();
    }
    );
});

$(function () {
    $("#cambiar").click(function (event)
    {
        event.preventDefault();
        var password2 = $("#password2").val();
        var password3 = $("#password3").val();
        var form = $("#form_pass");
        var error = $("#errorPassword");
        var mayuscula = false;
        var minuscula = false;
        var numero = false;
        var caracter_raro = false;

        for (var i = 0; i < password2.length; i++)
        {
            if (password2.charCodeAt(i) >= 65 && password2.charCodeAt(i) <= 90)
            {
                mayuscula = true;
            } else if (password2.charCodeAt(i) >= 97 && password2.charCodeAt(i) <= 122)
            {
                minuscula = true;
            } else if (password2.charCodeAt(i) >= 48 && password2.charCodeAt(i) <= 57)
            {
                numero = true;
            } else
            {
                caracter_raro = true;
            }
        }
        if (password2.length >= 8 && mayuscula && minuscula && caracter_raro && numero)
        {
            if (password2 !== password3) {
                toastr.error('Las contraseñas no coinciden');
                error.hide();
                return;
            }
            form.submit();
        } else {
            toastr.error('*La contraseña debe tener 8 caracteres como mínimo entre números, minúsculas y mayúsculas y almenos un caracter extraño (@ . - _)* *No debe estar en blanco*');
        }
    }
    );
});

function mostrarPassword(id) {
    var idPass = document.getElementById(id);
    if (idPass.type == "password") {
        idPass.type = "text";
        $('#show_' + id).removeClass('fa fa-eye-slash').addClass('fa fa-eye');
    } else {
        idPass.type = "password";
        $('#show_' + id).removeClass('fa fa-eye').addClass('fa fa-eye-slash');
    }
}

$(function () {
    $("#Categoria").on('change', function () {

        var selected = $("#Categoria option:selected").val();

        $.ajax({
            type: 'POST',
            url: 'listarSubCateFiltro.action?idCate=' + selected,
            success: function (respuesta) {
                var json = JSON.parse(respuesta);


                var html="";
               for(let i=0; i < json.length;i++){
                   html += `<option value="${json[i].idSubcategoria}">${json[i].nombre}</option>`;     
               }
               $('#selectSubCate').html(
                `<select name="producto.idSubCategoria.idSubcategoria" class="form-control">${html} </select>`);
            }});


    });
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
                text: "Debe completar los campos requeridos (*)",
                icon: "error",
                button: "Aceptar",
            });
        } else {
            form.submit();
        }
    }
    );
});

//$(function () {
//    $("#enviar").click(function (event)
//    {
//        event.preventDefault();
//        var email = $("#email");
//    var email2 = $("#email2");
//    var password = $("#password");
//    var password2 = $("#password2");
//    
//        var form = $("#form_cliente");
//         if(email.val() !== email2.val())
//    {
//        toastr.error('El campo confirmar email, no coincide con el dato original');
//      return;
//    }else if(password.val() !== password2.val())
//    {
//      toastr.error('El campo confirmar contraseña, no coincide con el dato original');
//      return;
//    }
//    
//    form.submit();
//    }
//    );
//});


//Función para comprobar los campos de texto
function checkCampos(obj) {
    var camposRellenados = true;
    obj.find("input").each(function () {
        var $this = $(this);
        if ($this.val().length <= 0 && $(this).attr("required") === "required" ) {
            camposRellenados = false;
        }
    });
        return camposRellenados;
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