<%@include file="header.jsp" %>
 <script src="https://www.paypalobjects.com/api/checkout.js"></script>
<!-- Title Page -->
<section class="bg-title-page p-t-40 p-b-50 flex-col-c-m" style="background-image: url(imagenes/cart.jpg);">
    <h2 class="l-text2 t-center">
        Mis Pedidos

    </h2>
</section>

<!-- Cart -->
<section class="cart bgwhite p-t-70 p-b-100">
    <div class="container">
        <!-- Cart item -->
        <div class="container-table-cart pos-relative">
            <div class="wrap-table-shopping-cart bgwhite">
                <table class="table-shopping-cart">
                    <tr class="table-head">
                        <th class="column-1"></th>
                        <th class="column-2">Producto</th>
                        <th class="column-3">Precio</th>
                        <th class="column-4 p-l-70">Cantidad</th>
                        <th class="column-5">Total</th>
                    </tr>
                    <s:iterator value="#session.lstLinea">
                        <tr class="table-row">
                            <td class="column-1">
                                <div class="cart-img-product b-rad-4 o-f-hidden">
                                    <s:hidden id="idProducto" name="proObj.idProducto"></s:hidden>
                                    <img src="admin/imagenes/<s:property value="proObj.imagen" />" alt="IMG-PRODUCT">
                                </div>
                            </td>
                            <td class="column-2"><s:property value="proObj.nombre" /></td>
                            <td class="column-3"><s:property value="proObj.precioVenta" /></td>
                            <td class="column-4">
                                <div class="flex-w bo5 of-hidden w-size17">
                                    <s:url var="LnkDisminuir" action="actualizarCantidadCar" >
                                        <s:param value="proObj.idProducto" name="proObj.idProducto" />
                                        <s:param value="true" name="disminuirCar" />
                                    </s:url>
                                    <s:a href="%{LnkDisminuir}" cssClass="%{(can <= 1)? 'disminuir': ''} color1 flex-c-m size7 bg8 eff2">
                                        <i class="fs-12 fa fa-minus" aria-hidden="true"></i>
                                    </s:a>

                                    <input class="size8 m-text18 t-center num-product" type="number" name="num-product1" disabled="disabled" value="<s:property value="can" />">
                                    <s:url var="LnkAumentar" action="actualizarCantidadCar" >
                                        <s:param value="proObj.idProducto" name="proObj.idProducto" />
                                        <s:param value="true" name="aumentarCar" />
                                    </s:url>
                                    <s:a  href="%{LnkAumentar}" cssClass="color1 flex-c-m size7 bg8 eff2">
                                        <i class="fs-12 fa fa-plus" aria-hidden="true"></i>
                                    </s:a>
                                </div>
                            </td>
                            <td class="column-5">$<s:property value="importe" /></td>
                            <s:url var="LnkQuitar" action="QuitarDelCarro" >
                                <s:param value="proObj.idProducto" name="proObj.idProducto" /> 
                            </s:url>
                            <td><s:a href="%{LnkQuitar}"><i class="fa fa-2x fa-trash-o mr-3"></i></s:a></td>

                            </tr>

                    </s:iterator>
                </table>
            </div>
        </div>

        <div class="flex-w flex-sb-m p-t-25 p-b-25 bo8 p-l-35 p-r-60 p-lr-15-sm">
            <div class="flex-w flex-m w-full-sm">

                <div class="size12 trans-0-4 m-t-10 m-b-10 m-r-10">
                    <!-- Button -->
                    <button class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4">
                        Seguir Comprando
                    </button>
                </div>
            </div>

            <div class="size10 trans-0-4 m-t-10 m-b-10">
                <!-- Button -->
                <button class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4">
                    Actualizar Carro
                </button>
            </div>
        </div>

        <!-- Total -->
       
            <div class="bo9 w-size18 p-l-40 p-r-40 p-t-30 p-b-38 m-t-30 m-r-0 m-l-auto p-lr-15-sm">
                <h5 class="m-text20 p-b-24">
                    Total de los acticulos
                </h5>

                <!--  -->
                <div class="flex-w flex-sb-m p-b-12">
                    <span class="s-text18 w-size19 w-full-sm">
                        Subtotal:
                    </span>

                    <span class="m-text21 w-size20 w-full-sm">
                        $/<s:property value="#session.subtotal" />
                    </span>
                </div>
                <div class="flex-w flex-sb-m p-b-12">
                    <span class="s-text18 w-size19 w-full-sm">
                        Descuento:
                    </span>

                    <span class="m-text21 w-size20 w-full-sm">
                        $/<s:property value="#session.descuento" />
                    </span>
                </div>

                <div class="flex-w flex-sb-m p-b-12">
                    <span class="s-text18 w-size19 w-full-sm">
                        Igv:
                    </span>

                    <span class="m-text21 w-size20 w-full-sm">
                        $/<s:property value="#session.igv" />
                    </span>
                </div>

                <div class="flex-w flex-sb-m p-b-12">
                    <span class="s-text18 w-size19 w-full-sm">
                        Total:
                    </span>

                    <span class="m-text21 w-size20 w-full-sm">
                        $/<s:property value="#session.total" />

                    </span>
                </div>
                <div class="">
                    <s:hidden name="clieObj.idCli" value="%{#session.id}"  id="idCliente"/>
                    <s:hidden value="%{#session.total}"  id="totalPay"/>
                    <s:hidden value="%{#session.subtotal}"  id="subtotalPay"/>
                    
                    <%@include  file="checkout.jsp" %>
                    
            
			<a href="#">
				<img class="h-size2" src="images/icons/paypal.png" alt="IMG-PAYPAL">
			</a>

			<a href="#">
				<img class="h-size2" src="images/icons/visa.png" alt="IMG-VISA">
			</a>

			<a href="#">
				<img class="h-size2" src="images/icons/mastercard.png" alt="IMG-MASTERCARD">
			</a>

			<a href="#">
				<img class="h-size2" src="images/icons/express.png" alt="IMG-EXPRESS">
			</a>

			<a href="#">
				<img class="h-size2" src="images/icons/discover.png" alt="IMG-DISCOVER">
			</a>

		
                </div>



                </div>
  
        
    </div>
</section>

<%@include file="footer.jsp" %>
