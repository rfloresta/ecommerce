$(function () {
    $("#ingresar").click(function (event)

    {
        event.preventDefault();
        var email = $("#email");
        var password = $("#password");
        var form = $("#form_login");
        if (email.val() === "")
        {
            toastr.error('Debe completar el email');
            email.focus();
            return;
        } else if (password.val() === "") {
            toastr.error('Debe completar el campo password');
            password.focus();
            return;
        }
        form.submit();
    }
    );
});

//$(document).ready(function () {
//
//    if ($('.msgError').text() != "")
//    {
//        toastr.error('Email y/o password incorrecto');
//    }
//    if ($('#resultado').val() != "")
//    {
//        toastr.success($('#resultado').val() + " " + ", Por favor, Complete sus datos antes de realizar una compra");
//    } else
//    {
//
//    }
//});

$(function () {
    $("#cambiar").click(function (event)
    {
        event.preventDefault();
        var password2 = $("#password2").val();
        var password3 = $("#password3").val();
        var form = $("#form_pass");
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
        var check = checkCampos($(this).parents("#form_pass"));
        if (!check) {
            toastr.error('Debe completar los campos');
            return;
        } else if (password2.length >= 8 && mayuscula && minuscula && caracter_raro && numero)
        {
            if (password2 !== password3) {
                toastr.error('Las contraseñas no coinciden');
                return;
            }
            form.submit();
        } else {
            toastr.error('*La contraseña debe tener 8 caracteres como mínimo entre números, minúsculas y mayúsculas y almenos un caracter extraño (@ . - _)*');
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
    $("#grabar").click(function (event)
    {
        event.preventDefault();
        var form = $(this).parents("#form");
        var check = checkCampos(form);
        if (!check) {
            swal({
                title: "Error!",
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

function checkCampos(obj) {
    var camposRellenados = true;
    obj.find("input").each(function () {
        var $this = $(this);
        if ($this.val().length <= 0 && $(this).attr("required") === "required") {
            camposRellenados = false;
        }
    });
    return camposRellenados;
}