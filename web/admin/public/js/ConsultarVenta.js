  function ConsultarVenta(numerVenta)
 {
     var formularioC = document.getElementById('Cventa');
     var numero = numerVenta;
        formularioC.action="ConsultarVenta";
        formularioC.op.value="1";
        formularioC.numV.value=numerVenta;
        formularioC.submit();
     
     
 }
 
 


var tableBody = document.getElementsByTagName('tbody');
var registrosTr = document.querySelectorAll('tbody tr');


function Anularventa(numero,dniU,idClie,fecha,total,pago,e)
{
    event.preventDefault();
    
    
    swal({
        title: "Esta seguro?",
        text: "Si se anula la venta, no se podra volver a reactivar!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
            .then((willDelete) => {
                if (willDelete) {
                    swal("Se anulo la venta correctamente!", {
                        icon: "success",
                    }).then((respuesta)=>
                    {
                        var formularioC = document.getElementById('Cventa');

                        formularioC.action="ConsultarVenta";
                        formularioC.op.value="2";
                        formularioC.numV.value=numero;
                        formularioC.dniU.value=dniU;
                        formularioC.idClie.value=idClie;
                        formularioC.fecha.value=fecha;
                        formularioC.total.value=total;
                        formularioC.pago.value=pago;
                        formularioC.estado.value=0;

                        formularioC.submit(); 
                        
                    });
                    
                   
                    
                    
                } else {
                    swal("Se cancelo la anulacion de la venta!");
                }
            });
    
    
    
  
        
   

    
}

 for(var i=0; i<registrosTr.length;i++)
    {

        if (registrosTr[i].childNodes[13].textContent == '0' )
        {
           registrosTr[i].childNodes[13].innerHTML='Desactivo';
           registrosTr[i].childNodes[13].classList.add('desactivado');
           registrosTr[i].classList.add('trdesactivado');
   
           
          
            
        }else
        {
            registrosTr[i].childNodes[13].innerHTML='Activo';
            registrosTr[i].childNodes[13].classList.add('activo');
        }
    }

/*
function RecorrerBtn()
{
    var btn_anular = tableBody[0].querySelectorAll('button#btn-anular');
    
    for(var i=0; i < btn_anular.length;i++)
    {
        btn_anular[i].addEventListener('click', function(event){
            event.preventDefault();
            desabilitarAnulado();
          
        var registroActivo = this.parentNode.parentNode;
        registroActivo.classList.add('desactivado');
        registroActivo.classList.remove('activo');
        
            
        });
    }
}

function desabilitarAnulado()
{
    var registrosTr = document.querySelectorAll('tbody tr');
    for(var i =0; i< registrosTr.length; i++)
    {
       registrosTr[i].classList.add('activo');
       
    }
}*/