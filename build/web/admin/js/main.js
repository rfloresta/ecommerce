(function(){
"use strict";

var usuario=document.getElementById("dni");
var passw=document.getElementById("pass");
var acceso=document.getElementById("acc");
var error=document.getElementById("error_login");



document.addEventListener('DOMContentLoaded', function ()
{






    var btnacceso=document.getElementById("btnreg");
    

    
    btnacceso.addEventListener('click', login);
    

    function login(event)
    {
        
            event.preventDefault();
            if (usuario.value == '')
            {
                swal({
                    title: "Error !",
                    text: "Por favor complete el dni del usuario",
                    icon: "error",
                    button: "Aceptar",
                });
                

            } else if (passw.value == '')
            {
                    swal({
                        title: "Error !",
                        text: "Por favor complete el password del usuario",
                        icon: "error",
                        button: "Aceptar",
                    });
             }else
             {
                 acceso.submit();

             }
            
            
                
    
        }
        
        
        var location =window.location.pathname ;
        
        if("http://localhost:8084"+location == 'http://localhost:8084/W_V/Acceso.do')
        {
            error.style.display = 'none';
             swal({
                    title: "Error !",
                    text: "El usuario o password son incorrectos",
                    icon: "error",
                    button: "Aceptar",
                });
            
        }else
        {
            error.style.display='none';
        }

});// DOM CONTENT LOADED
})();


$(function()
{
        var descuento=document.getElementsByClassName('selectDescuento');
        var txtDescuento = document.getElementById('descuento');
        
        
        
        for(var i=0;i<descuento.length; i++)
        {
            descuento[i].addEventListener('change',function()
            {
                
            if(descuento[0].checked)
            {
               txtDescuento.style.display = "block";
            }else
            {
                txtDescuento.style.display = "none";
            }
                
                
            });
        }
  
       
});