$(document).ready(function () {

   $( window ).on("load", function() {
         var form = $('#form-clie');
        if($('.drop-nav').children().length == 0)
        {
         form.submit();
          
            
        }else
        {
            console.log('tiene hijos');
        }
        
        
        
    });
  
});
 