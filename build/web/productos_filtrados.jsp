<%@ taglib uri="/struts-tags" prefix="s"%>

<s:if test="#session.lstProductoFiltro.size() != 0">
<s:iterator value="#session.lstProductoFiltro">

    <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
        <!-- Block2 -->

        <div class="block2" >
            <div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
                <img src="admin/imagenes/<s:property value="imagen"/>" alt="IMG-PRODUCT">


                <div class="block2-overlay trans-0-4">

                    <s:url id="lnkBuscar" action="detalleProducto">
                        <s:param value="idProducto" name="producto.idProducto" />
                    </s:url>
                    <s:a href="%{lnkBuscar}" cssClass="block2-btn-addwishlist hov-pointer trans-0-4">
                        <i class="fa fa-2x fa-eye" style="margin-top: -1.2rem"></i>
                    </s:a>   


                    <div class="block2-btn-addcart w-size1 trans-0-4">
                        <!-- Button -->
                        <s:form action="AgregarCarrito"  theme="simple" >

                            <s:hidden value="%{idProducto}" name="proObj.idProducto" />
                            <s:hidden value="%{nombre}" name="proObj.nombre" />
                            <s:hidden value="%{descripcion}" name="proObj.descripcion" />
                            <s:hidden value="%{stock}" name="proObj.stock" /> 
                            <s:hidden value="%{precioCompra}" name="proObj.precioCompra" />
                            <s:hidden value="%{precioVenta}" name="proObj.precioVenta" />
                            <s:hidden value="%{descuento}" name="proObj.descuento" />
                            <s:hidden value="%{imagen}" name="proObj.imagen" />
                            <s:hidden value="%{#cantidad}" name="cantidad" />

                            <button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
                                Agregar al Carro
                            </button>

                        </s:form>


                    </div>
                </div>


            </div>

            <div class="block2-txt p-t-20">
                <a href="product-detail.html" class="block2-name dis-block s-text3 p-b-5">
                    <s:property value="nombre"/>
                </a>

                <span class="block2-price m-text6 p-r-5">
                    S/<s:property value="precioVenta"/>
                </span>
            </div>

        </div>

    </div>

</s:iterator>


<!-- Pagination -->
<div class="pagination flex-m flex-w p-t-26">
    <a href="#" class="item-pagination flex-c-m trans-0-4 active-pagination">1</a>
    <a href="#" class="item-pagination flex-c-m trans-0-4">2</a>
</div>
</s:if>
<s:else>
    <h3 class="text-center w-100" style="color: #b1a9a9">*No se encontraron producto*</h3>
</s:else>


