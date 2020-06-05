$(function () {
    $("#ingresar").click(function (event)

    {
       event.preventDefault();
        var dni = $("#dni");
        var password = $("#password");
        var form = $("#form_login");
        console.log(dni);
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