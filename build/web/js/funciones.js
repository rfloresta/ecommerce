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
        if (password2.length >= 8 && mayuscula && minuscula && !caracter_raro && numero)
        {
            if (password2 !== password3) {
                toastr.error('Las contraseñas no coinciden');
                error.hide();
                return;
            }
            form.submit();
        } else {
            
            error.hide();
            error.show("low");
        }
    }
    );
});

function mostrarPassword(id) {
    var idPass = document.getElementById(id);
    if (idPass.type == "password") {
        idPass.type = "text";
        $('#show_'+id).removeClass('fa fa-eye-slash').addClass('fa fa-eye');
    } else {
        idPass.type = "password";
        $('#show_'+id).removeClass('fa fa-eye').addClass('fa fa-eye-slash');
    }
}
$(document).ready(function () {

    if ($('.errorDiv').find('span').text() != "")
    {
        toastr.error('Email y/o password incorrecto');
    }
});


//function compararPass(password2){
//        var password3 = $("#password3").val();
//         if (password2 !== password3) {
//                toastr.error('Las contraseñas no coinciden');
//                return false;
//            }
//}