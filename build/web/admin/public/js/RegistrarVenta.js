(function(){
"use strict";






document.addEventListener('DOMContentLoaded', function ()
{
   
   
  var pago=document.getElementById("pago");
  var btnRegistrar=document.getElementById("btnGrabar");
  var total=document.getElementById("total");
  var formulario=document.getElementById("form");
  
  
    btnRegistrar.addEventListener('click',RegistrarVenta);
   
    

    
    function RegistrarVenta(event)
{
   
 
 
         if(pago.value<total.value)
   {
      event.preventDefault();
       swal({
                    title: "Error !",
                    text: "El pago debe ser mayor que el total",
                    icon: "error",
                    button: "Aceptar",
                    });
                    
                    
    }else
    {
        formulario.action="RegistrarVenta";
        formulario.op.value="3";
        formulario.submit();
        
        
 
    }
        
        
 
    
    
}
    

  


});// DOM CONTENT LOADED
})();