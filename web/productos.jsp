<%@include file="header.jsp" %>
<!-- Title Page -->
<section class="bg-title-page p-t-50 p-b-40 flex-col-c-m" style="background-image: url(imagenes/slider-productos.jpg);">
    <h2 class="l-text2 t-center">
        Todos los productos
    </h2>
    <p class="m-text13 t-center">
        En la nueva coleccion 2020
    </p>
</section>

<!-- Content page -->
<section class="bgwhite p-t-55 p-b-65">
    <div class="container">
        <div class="row">
            <div class="col-sm-6 col-md-4 col-lg-3 p-b-50">
                <div class="leftbar p-r-20 p-r-0-sm">
                    <s:if test="#session.marca != null && #session.lstMarcas == null">
                        <s:set var="lstCategoria" value="#session.categoria"></s:set>
                        <s:set var="lstSubCate" value="#session.subcategoria"></s:set>
                        <s:set var="lstProducto" value="#session.marca.productoList"></s:set>
                    </s:if>
                    <s:elseif test="#session.categoria != null">
                        <s:set var="lstCategoria" value="#session.categoria"></s:set>
                        <s:set var="lstSubCate" value="#session.categoria.subcategoriaList"></s:set>
                        <s:set var="lstProducto" value="#session.categoria.productoList"></s:set>
                    </s:elseif>
                    <s:else>
                        <s:set var="lstCategoria" value="#session.subcategoria.idCategoria"></s:set>
                        <s:set var="lstSubCate" value="#session.subcategoria"></s:set>
                        <s:set var="lstProducto" value="#session.subcategoria.productoList"></s:set>
                    </s:else>
                    <!--  -->
                    <h4 class="m-text14 p-b-7">
                        Marcas
                    </h4>
                    <ul class="p-b-54">

                        <s:iterator value="#session.marca" >
                            <s:url id="lnkMarca" action="obtMarca">
                                <s:param value="idMarca" name="marca.idMarca" />
                            </s:url>
                            <li class="p-t-4">
                                <s:a href="%{lnkMarca}" cssClass="s-text13">
                                    <s:property value="nombre"/>
                                </s:a>
                            </li>
                        </s:iterator>

                    </ul>
                    <h4 class="m-text14 p-b-7">
                        Categorias
                    </h4>
                    <ul class="p-b-54">
                        <s:iterator value="lstCategoria">
                            <s:url id="lnkCategoria" action="obtCategoria">
                                <s:param value="idCategoria" name="categoria.idCategoria" />
                            </s:url>
                            <li class="p-t-4">
                                <s:a href="%{lnkCategoria}" cssClass="s-text13">
                                    <s:property value="nombre"/>
                                </s:a>
                            </li>
                        </s:iterator>
                    </ul>
                    <!--  -->
                    <h4 class="m-text14 p-b-7">
                        Subcategorias
                    </h4>

                    <ul class="p-b-54">
                        <s:iterator value="lstSubCate" >
                            <s:url id="lnkSubcategoria" action="obtSubcategoria">
                                <s:param value="idSubcategoria" name="subcategoria.idSubcategoria" />
                            </s:url>
                            <li class="p-t-4">
                                <s:a href="%{lnkSubcategoria}" cssClass="s-text13">
                                    <s:property value="nombre"/>
                                </s:a>
                            </li>
                        </s:iterator>

                    </ul>

                    <!--  -->
                    <h4 class="m-text14 p-b-32">
                        Filtros
                    </h4>

                    <div class="filter-price p-t-22 p-b-50 bo3">
                        <div class="m-text15 p-b-17">
                            Precio
                        </div>

                        <div class="wra-filter-bar">
                            <div id="filter-bar"></div>
                        </div>

                        <div class="flex-sb-m flex-w p-t-16">
                            <div class="w-size11">
                                <!-- Button -->
                                <button id="btnfiltro" class="flex-c-m size4 bg7 bo-rad-15 hov1 s-text14 trans-0-4">
                                    Filtro
                                </button>
                            </div>

                            <div class="s-text3 p-t-10 p-b-10">
                                Rango: S/<span id="value-lower">510</span> - S/<span id="value-upper">980</span>
                            </div>
                        </div>
                    </div>

                    <div class="filter-color p-t-22 p-b-50 bo3">
                        <div class="m-text15 p-b-12">
                            Color
                        </div>

                        <ul class="flex-w">
                            <li class="m-r-10">
                                <input class="checkbox-color-filter" id="color-filter1" type="checkbox" name="color-filter1">
                                <label class="color-filter color-filter1" for="color-filter1"></label>
                            </li>

                            <li class="m-r-10">
                                <input class="checkbox-color-filter" id="color-filter2" type="checkbox" name="color-filter2">
                                <label class="color-filter color-filter2" for="color-filter2"></label>
                            </li>

                            <li class="m-r-10">
                                <input class="checkbox-color-filter" id="color-filter3" type="checkbox" name="color-filter3">
                                <label class="color-filter color-filter3" for="color-filter3"></label>
                            </li>

                            <li class="m-r-10">
                                <input class="checkbox-color-filter" id="color-filter4" type="checkbox" name="color-filter4">
                                <label class="color-filter color-filter4" for="color-filter4"></label>
                            </li>

                            <li class="m-r-10">
                                <input class="checkbox-color-filter" id="color-filter5" type="checkbox" name="color-filter5">
                                <label class="color-filter color-filter5" for="color-filter5"></label>
                            </li>
                            <li class="m-r-10">
                                <input class="checkbox-color-filter" id="color-filter6" type="checkbox" name="color-filter6">
                                <label class="color-filter color-filter6" for="color-filter6"></label>
                            </li>
                            <li class="m-r-10">
                                <input class="checkbox-color-filter" id="color-filter7" type="checkbox" name="color-filter7">
                                <label class="color-filter color-filter7" for="color-filter7"></label>
                            </li>
                        </ul>
                    </div>

                    <div class="search-product pos-relative bo4 of-hidden">
                        <input class="s-text7 size6 p-l-23 p-r-50" type="text" id="search-product" placeholder="Buscar Productos...">

                        <button class="flex-c-m size5 ab-r-m color2 color0-hov trans-0-4">
                            <i class="fs-12 fa fa-search" aria-hidden="true"></i>
                        </button>
                    </div>
                </div>
            </div>

            <div class="col-sm-6 col-md-8 col-lg-9 p-b-50">
                <!--  -->
                <div class="flex-sb-m flex-w p-b-35">
                    <div class="flex-w">
                        <div class="mr-5">
                            <select class=" form-control" name="sorting">
                                <option>Clasificacion por defecto</option>
                                <option>Populares</option>
                                <option>Precio: menor a mayor</option>
                                <option>Precio: mayor a menor</option>


                            </select>
                        </div>

                        <div class="">
                            <select class=" form-control" name="sorting">
                                <option>Price</option>
                                <option>S/0.00 - S/50.00</option>
                                <option>S/50.00 - S/100.00</option>
                                <option>S/100.00 - S/150.00</option>
                                <option>S/150.00 - S/200.00</option>
                                <option>S/200.00+</option>

                            </select>
                        </div>
                    </div>

                    <span class="s-text8 p-t-5 p-b-5">
                        Mostrando <s:property value="lstProducto.size()"/> resultado(s)
                    </span>
                </div>

                <!-- Product -->
                <s:if test="#session.lstProducto.size() != 0">

                <div class="row" id="contenido-productos">
                    <s:iterator value="lstProducto">
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
                    </div>
                </s:if>
                <s:else>
                    <h3 class="text-center w-100" style="color: #b1a9a9">*No se encontraron productos*</h3>
                </s:else>
            </div>
        </div>
</section>

<%@include file="footer.jsp" %>

