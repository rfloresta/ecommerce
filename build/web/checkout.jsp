<%@ taglib uri="/struts-tags" prefix="s"%>
<form id="formPaypal" action="${initParam['urlpaypal']}" method="POST" target="_top">
    <input type="hidden" name="business" value="wyv@hotmail.com"/>
    <input type="hidden" name="return" value="http://localhost:8080/W_V_S.A.C/registrarPedido.action?idcliente=<s:property value="%{#session.id}" />"/> 
    <input type="hidden" name="cmd" value="_cart"/> 
    <input type="hidden" name="upload" value="1"/> 
    
    <s:iterator value="#session.lstLinea" status="stat">
        <s:set var="c" value="%{#stat.index+1}"/>
        <input type="hidden" name="item_name_<s:property value="#c" />" value="<s:property value="proObj.nombre"/>" />
        <input type="hidden" name="item_number_<s:property value="#c" />" value="<s:property value="proObj.idProducto"/>"/>
        <input type="hidden" name="amount_<s:property value="#c" />" value="<s:property value="proObj.precioVenta" />"/>
        <input type="hidden" name="quantity_<s:property value="#c" />" value="<s:property value="can"/>"/>
        
    </s:iterator>
       
    <input  type="hidden" name="currency_code" value="USD"/>
    <input  id="buttonPaypal" type="image" src="https://www.sandbox.paypal.com/es_ES/ES/i/btn/btn_buynow_LG.gif" name="submit" alt="Paypal, la forma rápida y segura de pagar en internet">
    <img alt="" src="https://www.sandbox.paypal.com/es_ES/i/scr/pixel.gif" width="1" height="1" />
</form>
     