<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>W&V</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->
        <link rel="icon" type="image/png" href="imagenes/nego.png"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/themify-icons.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/icon-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/animate.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/hamburgers.min.css">
        <!--===============================================================================================-->
        <!--<link rel="stylesheet" type="text/css" href="css/animsition.min.css">-->
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/daterangepicker.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/slick.css">
        <link rel="stylesheet" type="text/css" href="css/nouislider.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/lightbox.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <link href="css/icheck-bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!--===============================================================================================-->
        <link href="css/toastr.min.css" rel="stylesheet" type="text/css"/>

    </head>
    <body class="">

        <nav class="navbar navbar-expand-lg fixed-top navbar-black p-t-26">

            <!-- Logo2 -->
            <div class="container-fluid d-block">
                <div class="row w-100 justify-content-between  ">
                    <div class="col-md-4 redes-sociales ">
                        <a href="#" class="topbar-social-item fa fa-facebook"></a>
                        <a href="#" class="topbar-social-item fa fa-instagram"></a>
                        <a href="#" class="topbar-social-item fa fa-pinterest-p"></a>
                        <a href="#" class="topbar-social-item fa fa-snapchat-ghost"></a>
                        <a href="#" class="topbar-social-item fa fa-youtube-play"></a>
                    </div>
                    <div class="col-6 col-md-4 text-center">
                        <a href="index.html" class="logo2 font-weight-bold  ">
                            W&V Negocios y Servicios S.A.C

                        </a>
                    </div>

                    <div class="col-4  col-md-4">
                        <div class="topbar-child2">
                            <span class="topbar-email">

                                <s:if test="#session.email!=null">
                                    <s:label name="#session.nombres+ ' '+#session.apellidos" />
                                </s:if>
                                <s:else>
                                    <s:fielderror cssClass="errorMessage text-center text-danger" fieldName="mensajeError"/>
                                </s:else>

                            </span>
                            <div class="dropdown ml-md-3">
                                <button  class="dropdown-toggle" type="button" id="dropdownUsuario" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <img src="imagenes/icon-header-01.png" class="header-icon1" alt="ICON">
                                </button>
                                <div class="dropdown-menu " aria-labelledby="dropdownUsuario" >
                                    <s:if test="#session.seccion==1">
                                        <a  href="perfil.jsp" Class="dropdown-item">Mi cuenta</a>
                                        <a href="cerrarSesionClie" class="dropdown-item">Cerrar Sesión</a>
                                    </s:if>
                                    <s:else>
                                        <button type="button" class="dropdown-item" data-toggle="modal" data-target="#loginModal">Iniciar Sesión</button>
                                        <button type="button" class="dropdown-item" data-toggle="modal" data-target="#registrarseModal">Registrarse</button>
                                    </s:else>
                                </div>
                            </div>

                            <span class="linedivide1"></span>
                            <div class="header-wrapicon2 m-r-10">
                                <!--Logo de Carrito de compras-->
                                <img src="imagenes/icon-header-02.png" class="header-icon1 js-show-header-dropdown" alt="ICON">
                                <span class="header-icons-noti">
                                    <s:if test="#session.cantidadCart == null || #session.cantidadCart == 0">
                                        0
                                    </s:if>
                                    <s:else>
                                        <s:property value="#session.cantidadCart"/>
                                    </s:else>

                                </span>

                                <!--Contenido de Carrito de compras-->
                                <div class="header-cart header-dropdown">

                                    <ul class="header-cart-wrapitem">
                                        <s:iterator value="#session.lstLinea">
                                            <li class="header-cart-item">
                                                <div class="d-none d-md-block header-cart-item-img">
                                                    <img src="admin/imagenes/<s:property value="proObj.imagen" />" alt="IMG">
                                                </div>

                                                <div class="header-cart-item-txt w-50">
                                                    <a href="#" class="header-cart-item-name">
                                                        <s:property value="proObj.nombre" />
                                                    </a>

                                                    <span class="header-cart-item-info">
                                                        <s:property value="can" /> x <s:property value="proObj.precioVenta" />
                                                    </span>
                                                </div>

                                                <div>
                                                    <s:url var="LnkQuitar" action="QuitarDelCarro" >
                                                        <s:param value="proObj.idProducto" name="proObj.idProducto" /> 
                                                    </s:url>
                                                    <s:a href="%{LnkQuitar}">
                                                        <i class="fas fa-times"></i>
                                                    </s:a>


                                                </div>
                                            </li>   

                                        </s:iterator>
                                    </ul>

                                    <div class="header-cart-total">
                                        Total: <s:property value="#session.total" />
                                    </div>

                                    <div class="header-cart-buttons">
                                        <div class="header-cart-wrapbtn">

                                            <a href="carro.jsp" class="flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4">
                                                Ver Carro
                                            </a>
                                        </div>


                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>

                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#nav-principal" aria-expanded="true" aria-label="Navegación Principal">
                        <i class="fa fa-bars" style="font-size:1.5rem;"></i>
                    </button>

                </div>

                <div id="nav-principal" class="navbar-collapse mt-3 mt-lg-0 collapse " style="">
                    <!-- Menu -->
                    <nav class="navegacion-principal nav justify-content-center container
                         flex-column flex-lg-row text-center" id="menu-principal" >


                        <a href="index.jsp" class="nav-link">Home</a>


                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Categoría
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">

                                <s:iterator value="#session.lstCategoria" var="cate">
                                    <s:url id="lnkCategoria" action="obtCategoria">
                                        <s:param value="idCategoria" name="categoria.idCategoria" />
                                    </s:url>
                                    <li class="dropdown-submenu"><s:a href="%{lnkCategoria}" cssClass="dropdown-item dropdown-toggle"><s:property value="nombre"/></s:a>
                                            <ul class="dropdown-menu">
                                            <s:iterator value="#session.lstSubCate" var="subcate">
                                                <s:url id="lnkSubcategoria" action="obtSubcategoria">
                                                    <s:param value="idSubcategoria" name="subcategoria.idSubcategoria" />
                                                </s:url>
                                                <s:if test="#cate.idCategoria == #subcate.idCategoria.idCategoria">

                                                    <li cssClass="dropdown-submenu"><s:a cssClass="dropdown-item" href="%{lnkSubcategoria}"><s:property value="nombre"/></s:a>
                                                </s:if>
                                                </s:iterator>
                                        </ul>
                                    </li>
                                </s:iterator>
                            </ul>
                        </li>
                        <div class="dropdown drophover">
                            <a href="#" class="nav-link dropdown-toggle" id="dropMarca" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Marca</a>

                            <div class="dropdown-menu" aria-labelledby="dropMarca">
                                <s:iterator value="#session.lstMarca">

                                    <s:url id="lnkMarca" action="obtMarca">
                                        <s:param value="idMarca" name="marca.idMarca" />
                                    </s:url>
                                    <s:a href="%{lnkMarca}" cssClass="dropdown-item">
                                        <s:property value="nombre"/>
                                    </s:a>
                                </s:iterator>
                            </div>
                        </div>
                        <s:a href="listarProductoCliente" cssClass="nav-link">Productos</s:a>
                        <a href="blog.html" class="nav-link">Blog</a>
                        <a href="about.html" class="nav-link">Acerca de</a>
                    </nav>
                </div>
            </div>

        </nav>
        <!-- Header -->

        <!--Inicio Modal Para inicio de sesión -->
        <div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">

                <div class="modal-content">
                    <div class="modal-header justify-content-center border-bottom-0">
                        <div class="social-auth-links text-center">
                            <div onlogin="checkLoginState();" appId="282898703055776" scope="public_profile,email" id="facebook-login-button" class="fb-login-button" data-size="large" data-button-type="continue_with" data-layout="default" data-auto-logout-link="false" data-use-continue-as="true" data-width=""></div>
                        </div>
                        <div id="fbStatus">

                        </div>
                    </div>
                    <div class="modal-body pt-0">
                        <div class="tab-content p-t-35">
                            <!--Inicio Tab Login-->
                            <div class="tab-pane fade show active" id="LoginTab" role="tabpanel">
                                <s:form  action="ingresoCliente" id="form_login"  styleId="acc" theme="simple">
                                    <div class="form-group">
                                        <s:textfield cssClass="form-control" name="cliente.email" id="email" placeholder="Ingrese Email"/>
                                    </div>
                                    <div class="form-group">
                                        <s:password cssClass="form-control" name="cliente.password" id="password" placeholder="Ingrese Password"/>
                                    </div>
                                    <div class="form-group">
                                        <div class="form-check">
                                            <input type="checkbox" class="form-check-input ml-0" id="dropdownCheck">
                                            <label class="form-check-label" for="Check">
                                                Recordar Contraseña
                                            </label>
                                        </div>
                                    </div>
                                    <s:submit id="ingresar" styleId="btnreg" cssClass="btn btn-primary btn-block  toastrDefaultError" value="Iniciar Sesión" />
                                    <div class="text-center"> 
                                        <button  type="button" Class="btn btn-link" data-toggle="modal" data-target="#registrarseModal" >Registrese</button>
                                    </div>
                                    <s:if test="hasActionErrors()">
                                        <s:actionerror cssClass="errorMessage text-center text-danger mr-5" />
                                    </s:if>
                                    <s:if test="hasActionMessages()">
                                        <s:actionmessage cssClass="errorMessage text-center text-success mr-5" />
                                    </s:if>
                                </s:form>
                            </div>
                            <!--Fin Tab Login-->

                            <!--Inicio Tab Restablecer password-->
                            <div class="tab-pane fade" id="RestablecerTab" role="tabpanel">
                                <s:form  id="form-restablecer" action="restablecerPasswordClie" name="form_rest" styleId="acc" theme="simple">
                                    <div class="input-group mb-3">
                                        <s:textfield type="email" cssClass="form-control" name="cliente.email" required="required" placeholder="Ingrese Email"/>
                                    </div>
                                    <div class="row">
                                        <div class="col-12">
                                            <s:submit id="btnRestablecer" cssClass="btn btn-primary btn-block" value="Enviar código"/>
                                            <div id="incorrecto">
                                            </div>
                                        </div>
                                    </div>
                                </s:form>
                            </div>
                            <!--Fin Tab Restablecer password -->
                        </div>
                    </div>
                    <div class="modal-footer">
                        <ul class="nav nav-tabs" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" data-toggle="tab" href="#LoginTab" role="tab">Login</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="tab" href="#RestablecerTab" role="tab">Olvidé mi contraseña</a>
                            </li>
                            <li class="nav-item">
                                <a class="btn btn-link" href="admin/seguridad/login.jsp">Iniciar como administrador</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <!--Fin Modal Para inicio de sesión -->


        <!--Inicio Modal Para Registrarse-->
        <div class="modal fade" id="registrarseModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header justify-content-center border-bottom-0">
                        <div class="social-auth-links text-center  mb-3 mt-4">
                            <div onlogin="checkLoginState();" appId="282898703055776" scope="public_profile,email" id="facebook-login-button" class="fb-login-button" data-size="large" data-button-type="continue_with" data-layout="default" data-auto-logout-link="false" data-use-continue-as="true" data-width=""></div>
                        </div>
                    </div>
                    <div class="modal-body pt-0">
                        <s:form id="form_pass" action="registrarse" theme="simple">
                            <div class="input-group mb-3 mt-3">
                                <s:textfield cssClass="form-control" name="cliente.nombres" id="nombres" placeholder="Ingrese Nombres" required="required"/>
                            </div>
                            <div class="input-group mb-3">
                                <s:textfield cssClass="form-control" name="cliente.apellidos" id="apellidos" placeholder="Ingrese Apellidos" required="required"/>
                            </div>
                            <div class="input-group mb-3">
                                <s:textfield type="email" cssClass="form-control" name="cliente.email" id="email" placeholder="Ingrese Email" required="required"/>
                            </div>
                            <div class="input-group mb-3">
                                <s:password cssClass="form-control" name="cliente.password" id="password2"  placeholder="Ingrese Contraseña" required="required"/>
                                <div class="input-group-append">
                                    <button  class="btn btn-primary" type="button" onclick="mostrarPassword('password2')"> <span id="show_password2" class="fa fa-eye-slash icon"></span> </button>
                                </div>
                            </div>
                            <s:if test="#session.email == null"> <!-- Validación para que no ocurra el error al duplicarse el id password3 en la funcion de cambiar contraseña -->
                                <div class="input-group mb-3">
                                    <s:password cssClass="form-control" name="password3" id="password3" placeholder="Confirmar Contraseña" required="required"/>
                                    <div class="input-group-append">
                                        <button  class="btn btn-primary" type="button" onclick="mostrarPassword('password3')"> <span id="show_password3" class="fa fa-eye-slash icon"></span> </button>
                                    </div>
                                </div>
                            </s:if>
                    </div>
                    <div class="modal-footer">
                        <div class="row">
                            <!-- /.col -->
                            <div class="col-8">
                                <div class="icheck-primary">
                                    <input type="checkbox" id="agreeTerms" name="terms" value="agree">
                                    <label for="agreeTerms">
                                        Acepto los  <a href="#">Terminos</a>
                                    </label>
                                </div>
                            </div>
                            <div class="col-4">
                                <s:submit id="cambiar"  cssClass="btn btn-primary btn-block toastrDefaultError" value="Enviar"/>
                            </div>
                            <!-- /.col -->
                        </s:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!--Fin Modal Para Registrarse -->

