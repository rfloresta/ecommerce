(function(){
"use strict";






document.addEventListener('DOMContentLoaded', function ()
{
   
    var cantidad=document.getElementById("can");
   
    var pago=document.getElementById("pago");
  var errorDiv=document.getElementById("error");
  var btnAgregar=document.getElementById("agregar");

  var total=document.getElementById("total");
  
  
  
  
    btnAgregar.addEventListener('click',AgregarCarro);
    cantidad.addEventListener('blur',validarCampos);
    pago.addEventListener('blur',validarCampos);
    
    pago.addEventListener('blur',validarPago);
    
    
    
    function AgregarCarro(event)
{
    var nombre=document.getElementById("nom");
    var formulario=document.getElementById("form");
    console.log(form);
 
   if(nombre.value=="")
   {
       event.preventDefault();
       swal({
                    title: "Error !",
                    text: "Debe Seleccionar un producto",
                    icon: "error",
                    button: "Aceptar",
                    });
                    
                    
    }else
    {
        formulario.action="RegistrarVenta";
        formulario.op.value="1";
        formulario.submit();
    }
    
}
    

   function validarCampos()
        {
              if(this.value == '')
    {
        errorDiv.style.display = "block";
        
        this.style.border = '1px solid red';
        
    }else
    {
        errorDiv.style.display = "none";
        this.style.border = '1px solid #cccccc';
    }
        }
        
    
    function validarPago()
    {
        if(pago.value<total.value)
        {
                swal({
                    title: "Error !",
                    text: "El pago Debe ser mayor que el total",
                    icon: "error",
                    button: "Aceptar",
                    });
                    
                    errorDiv.style.display = "block";
                    this.style.border = '1px solid red';
        }else
        {
             errorDiv.style.display = "none";
            this.style.border = '1px solid #cccccc';
        }
    }


});// DOM CONTENT LOADED
})();

function QuitarCarro()
{
    var formulario=document.getElementById("form");
        formulario.action="RegistrarVenta";
        formulario.op.value="2";
        formulario.submit();
    
}


