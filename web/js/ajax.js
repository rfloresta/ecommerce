 /* Prueba 
 $("#DatosP").on('click',function(){
     $.ajax({
            url: 'buscarCliePerfil?cliente.idCliente='+$("#idClie").val()+'',
            type: 'POST',
            dataType: 'json',           
            success:function(response){
               alert(response.jsonPerfil);          
            },
            error:function(jqXhr, textStatus, errorThrown){
                alert(textStatus);
            }
        });    
    
 })
 
*/