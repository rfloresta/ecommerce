package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detalle_005fproducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_label_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_a_href;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_else;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_fielderror_fieldName_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_theme_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_var_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_actionmessage_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_theme_styleId_id_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_label_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_a_href = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_else = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_fielderror_fieldName_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_theme_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_var_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_actionmessage_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_theme_styleId_id_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_label_name_nobody.release();
    _jspx_tagPool_s_iterator_value.release();
    _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody.release();
    _jspx_tagPool_s_set_var_value_nobody.release();
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_a_href.release();
    _jspx_tagPool_s_else.release();
    _jspx_tagPool_s_fielderror_fieldName_cssClass_nobody.release();
    _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody.release();
    _jspx_tagPool_s_form_theme_action.release();
    _jspx_tagPool_s_url_var_action.release();
    _jspx_tagPool_s_submit_value_cssClass_nobody.release();
    _jspx_tagPool_s_param_value_name_nobody.release();
    _jspx_tagPool_s_actionmessage_cssClass_nobody.release();
    _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.release();
    _jspx_tagPool_s_form_theme_styleId_id_action.release();
    _jspx_tagPool_s_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>W&V</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"imagenes/favicon.png\"/>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/themify-icons.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/icon-font.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/hamburgers.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"css/animsition.min.css\">-->\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/select2.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/daterangepicker.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/slick.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/nouislider.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/lightbox.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\r\n");
      out.write("        <link href=\"css/icheck-bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link href=\"css/toastr.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"\">\r\n");
      out.write("\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg fixed-top navbar-black p-t-26\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Logo2 -->\r\n");
      out.write("            <div class=\"container-fluid d-block\">\r\n");
      out.write("                <div class=\"row w-100 justify-content-between  \">\r\n");
      out.write("                    <div class=\"col-md-4 redes-sociales \">\r\n");
      out.write("                        <a href=\"#\" class=\"topbar-social-item fa fa-facebook\"></a>\r\n");
      out.write("                        <a href=\"#\" class=\"topbar-social-item fa fa-instagram\"></a>\r\n");
      out.write("                        <a href=\"#\" class=\"topbar-social-item fa fa-pinterest-p\"></a>\r\n");
      out.write("                        <a href=\"#\" class=\"topbar-social-item fa fa-snapchat-ghost\"></a>\r\n");
      out.write("                        <a href=\"#\" class=\"topbar-social-item fa fa-youtube-play\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-6 col-md-4 text-center\">\r\n");
      out.write("                        <a href=\"index.html\" class=\"logo2 font-weight-bold  \">\r\n");
      out.write("                            W&V Negocios y Servicios S.A.C\r\n");
      out.write("\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-4  col-md-4\">\r\n");
      out.write("                        <div class=\"topbar-child2\">\r\n");
      out.write("                            <span class=\"topbar-email\">\r\n");
      out.write("                                 \r\n");
      out.write("                                ");
      if (_jspx_meth_s_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_s_else_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                            </span>\r\n");
      out.write("                            <div class=\"dropdown ml-md-3\">\r\n");
      out.write("                                <button  class=\"dropdown-toggle\" type=\"button\" id=\"dropdownUsuario\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    <img src=\"imagenes/icon-header-01.png\" class=\"header-icon1\" alt=\"ICON\">\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <div class=\"dropdown-menu \" aria-labelledby=\"dropdownUsuario\" >\r\n");
      out.write("                                    ");
      if (_jspx_meth_s_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_s_else_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <span class=\"linedivide1\"></span>\r\n");
      out.write("                            <div class=\"header-wrapicon2 m-r-10\">\r\n");
      out.write("                                <!--Logo de Carrito de compras-->\r\n");
      out.write("                                <img src=\"imagenes/icon-header-02.png\" class=\"header-icon1 js-show-header-dropdown\" alt=\"ICON\">\r\n");
      out.write("                                <span class=\"header-icons-noti\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_s_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_s_else_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </span>\r\n");
      out.write("\r\n");
      out.write("                                <!--Contenido de Carrito de compras-->\r\n");
      out.write("                                <div class=\"header-cart header-dropdown\">\r\n");
      out.write("\r\n");
      out.write("                                    <ul class=\"header-cart-wrapitem\">\r\n");
      out.write("                                        ");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    </ul>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"header-cart-total\">\r\n");
      out.write("                                        Total: ");
      if (_jspx_meth_s_property_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"header-cart-buttons\">\r\n");
      out.write("                                        <div class=\"header-cart-wrapbtn\">\r\n");
      out.write("\r\n");
      out.write("                                            <a href=\"carro.jsp\" class=\"flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                Ver Carro\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#nav-principal\" aria-expanded=\"true\" aria-label=\"Navegación Principal\">\r\n");
      out.write("                        <i class=\"fa fa-bars\" style=\"font-size:1.5rem;\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"nav-principal\" class=\"navbar-collapse mt-3 mt-lg-0 collapse \" style=\"\">\r\n");
      out.write("                    <!-- Menu -->\r\n");
      out.write("                    <nav class=\"navegacion-principal nav justify-content-center container\r\n");
      out.write("                         flex-column flex-lg-row text-center\" id=\"menu-principal\" >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <a href=\"index.jsp\" class=\"nav-link\">Home</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"http://example.com\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                Categoría\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("                                ");
      if (_jspx_meth_s_iterator_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"dropdown drophover\">\r\n");
      out.write("                            <a href=\"#\" class=\"nav-link\" id=\"dropMarca\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Marca</a>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"dropMarca\">\r\n");
      out.write("                                ");
      if (_jspx_meth_s_iterator_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a href=\"productos.jsp\" class=\"nav-link\">Productos</a>\r\n");
      out.write("                        <a href=\"blog.html\" class=\"nav-link\">Blog</a>\r\n");
      out.write("                        <a href=\"about.html\" class=\"nav-link\">Acerca de</a>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- Header -->\r\n");
      out.write("\r\n");
      out.write("        <!--Inicio Modal Para inicio de sesión -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"loginModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header justify-content-center border-bottom-0\">\r\n");
      out.write("                        <div class=\"social-auth-links text-center\">\r\n");
      out.write("\r\n");
      out.write("                            <div onlogin=\"checkLoginState();\" appId=\"282898703055776\" scope=\"public_profile,email\" id=\"facebook-login-button\" class=\"fb-login-button\" data-size=\"large\" data-button-type=\"continue_with\" data-layout=\"default\" data-auto-logout-link=\"false\" data-use-continue-as=\"true\" data-width=\"\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"fbStatus\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body pt-0\">\r\n");
      out.write("                        ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <a Class=\"btn btn-link\" href=\"#\">Olvidé mi contraseña</a>\r\n");
      out.write("                        <a Class=\"btn btn-link\" href=\"admin/seguridad/login.jsp\">Iniciar como administrador</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--Fin Modal Para inicio de sesión -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--Inicio Modal Para Registrarse-->\r\n");
      out.write("        <div class=\"modal fade\" id=\"registrarseModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header justify-content-center border-bottom-0\">\r\n");
      out.write("                        <div class=\"social-auth-links text-center  mb-3 mt-4\">\r\n");
      out.write("                            <a href=\"#\" class=\"btn  btn-primary my-3 my-md-0\">\r\n");
      out.write("                                <i class=\"fa fa-facebook mr-2\"></i> Sign in using Facebook\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"#\" class=\"btn  btn-danger\">\r\n");
      out.write("                                <i class=\"fa fa-google-plus mr-2\"></i> Sign in using Google+\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body pt-0\">\r\n");
      out.write("                        <p class=\"text-center\">- OR -</p>\r\n");
      out.write("                        ");
      if (_jspx_meth_s_form_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--Fin Modal Para Registrarse -->\r\n");
      out.write("\r\n");
      out.write("        <!--Inicio Modal Para Restablecer Password -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"restablecerModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header justify-content-center border-bottom-0\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body pt-0\">\r\n");
      out.write("                        ");
      if (_jspx_meth_s_form_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <a Class=\"btn btn-link\" href=\"#\">Olvidé mi contraseña</a>\r\n");
      out.write("                        <a Class=\"btn btn-link\" href=\"admin/seguridad/login.jsp\">Iniciar como administrador</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Fin Modal Para Restablecer Password -->\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\t<!-- breadcrumb -->\n");
      out.write("\t<div class=\"bread-crumb bgwhite flex-w p-l-52 p-r-15 p-t-30 p-l-15-sm\">\n");
      out.write("\t\t<a href=\"index.html\" class=\"s-text16\">\n");
      out.write("\t\t\tHome\n");
      out.write("\t\t\t<i class=\"fa fa-angle-right m-l-8 m-r-9\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t</a>\n");
      out.write("\n");
      out.write("\t\t<a href=\"product.html\" class=\"s-text16\">\n");
      out.write("\t\t\tWomen\n");
      out.write("\t\t\t<i class=\"fa fa-angle-right m-l-8 m-r-9\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t</a>\n");
      out.write("\n");
      out.write("\t\t<a href=\"#\" class=\"s-text16\">\n");
      out.write("\t\t\tT-Shirt\n");
      out.write("\t\t\t<i class=\"fa fa-angle-right m-l-8 m-r-9\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t</a>\n");
      out.write("\n");
      out.write("\t\t<span class=\"s-text17\">\n");
      out.write("\t\t\tBoxy T-Shirt with Roll Sleeve Detail\n");
      out.write("\t\t</span>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- Product Detail -->\n");
      out.write("\t<div class=\"container bgwhite p-t-35 p-b-80\">\n");
      out.write("\t\t<div class=\"flex-w flex-sb\">\n");
      out.write("\t\t\t<div class=\"w-size13 p-t-30 respon5\">\n");
      out.write("\t\t\t\t<div class=\"wrap-slick3 flex-sb flex-w\">\n");
      out.write("\t\t\t\t\t<div class=\"wrap-slick3-dots\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"slick3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"item-slick3\" data-thumb=\"images/thumb-item-01.jpg\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-pic-w\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/product-detail-01.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"item-slick3\" data-thumb=\"images/thumb-item-02.jpg\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-pic-w\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/product-detail-02.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"item-slick3\" data-thumb=\"images/thumb-item-03.jpg\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-pic-w\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/product-detail-03.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"w-size14 p-t-30 respon5\">\n");
      out.write("\t\t\t\t<h4 class=\"product-detail-name m-text16 p-b-13\">\n");
      out.write("\t\t\t\t\tBoxy T-Shirt with Roll Sleeve Detail\n");
      out.write("\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t<span class=\"m-text17\">\n");
      out.write("\t\t\t\t\t$22\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t<p class=\"s-text8 p-t-10\">\n");
      out.write("\t\t\t\t\tNulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat ornare feugiat.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<!--  -->\n");
      out.write("\t\t\t\t<div class=\"p-t-33 p-b-60\">\n");
      out.write("\t\t\t\t\t<div class=\"flex-m flex-w p-b-10\">\n");
      out.write("\t\t\t\t\t\t<div class=\"s-text15 w-size15 t-center\">\n");
      out.write("\t\t\t\t\t\t\tSize\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"rs2-select2 rs3-select2 bo4 of-hidden w-size16\">\n");
      out.write("\t\t\t\t\t\t\t<select class=\"selection-2\" name=\"size\">\n");
      out.write("\t\t\t\t\t\t\t\t<option>Choose an option</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Size S</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Size M</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Size L</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Size XL</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"flex-m flex-w\">\n");
      out.write("\t\t\t\t\t\t<div class=\"s-text15 w-size15 t-center\">\n");
      out.write("\t\t\t\t\t\t\tColor\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"rs2-select2 rs3-select2 bo4 of-hidden w-size16\">\n");
      out.write("\t\t\t\t\t\t\t<select class=\"selection-2\" name=\"color\">\n");
      out.write("\t\t\t\t\t\t\t\t<option>Choose an option</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Gray</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Red</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Black</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Blue</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"flex-r-m flex-w p-t-10\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w-size16 flex-m flex-w\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"flex-w bo5 of-hidden m-r-22 m-t-10 m-b-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn-num-product-down color1 flex-c-m size7 bg8 eff2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fs-12 fa fa-minus\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"size8 m-text18 t-center num-product\" type=\"number\" name=\"num-product\" value=\"1\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn-num-product-up color1 flex-c-m size7 bg8 eff2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fs-12 fa fa-plus\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-addcart-product-detail size9 trans-0-4 m-t-10 m-b-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\tAdd to Cart\n");
      out.write("\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"p-b-45\">\n");
      out.write("\t\t\t\t\t<span class=\"s-text8 m-r-35\">SKU: MUG-01</span>\n");
      out.write("\t\t\t\t\t<span class=\"s-text8\">Categories: Mug, Design</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!--  -->\n");
      out.write("\t\t\t\t<div class=\"wrap-dropdown-content bo6 p-t-15 p-b-14 active-dropdown-content\">\n");
      out.write("\t\t\t\t\t<h5 class=\"js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4\">\n");
      out.write("\t\t\t\t\t\tDescription\n");
      out.write("\t\t\t\t\t\t<i class=\"down-mark fs-12 color1 fa fa-minus dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t<i class=\"up-mark fs-12 color1 fa fa-plus\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</h5>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-content dis-none p-t-15 p-b-23\">\n");
      out.write("\t\t\t\t\t\t<p class=\"s-text8\">\n");
      out.write("\t\t\t\t\t\t\tFusce ornare mi vel risus porttitor dignissim. Nunc eget risus at ipsum blandit ornare vel sed velit. Proin gravida arcu nisl, a dignissim mauris placerat\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"wrap-dropdown-content bo7 p-t-15 p-b-14\">\n");
      out.write("\t\t\t\t\t<h5 class=\"js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4\">\n");
      out.write("\t\t\t\t\t\tAdditional information\n");
      out.write("\t\t\t\t\t\t<i class=\"down-mark fs-12 color1 fa fa-minus dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t<i class=\"up-mark fs-12 color1 fa fa-plus\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</h5>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-content dis-none p-t-15 p-b-23\">\n");
      out.write("\t\t\t\t\t\t<p class=\"s-text8\">\n");
      out.write("\t\t\t\t\t\t\tFusce ornare mi vel risus porttitor dignissim. Nunc eget risus at ipsum blandit ornare vel sed velit. Proin gravida arcu nisl, a dignissim mauris placerat\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"wrap-dropdown-content bo7 p-t-15 p-b-14\">\n");
      out.write("\t\t\t\t\t<h5 class=\"js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4\">\n");
      out.write("\t\t\t\t\t\tReviews (0)\n");
      out.write("\t\t\t\t\t\t<i class=\"down-mark fs-12 color1 fa fa-minus dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t<i class=\"up-mark fs-12 color1 fa fa-plus\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</h5>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-content dis-none p-t-15 p-b-23\">\n");
      out.write("\t\t\t\t\t\t<p class=\"s-text8\">\n");
      out.write("\t\t\t\t\t\t\tFusce ornare mi vel risus porttitor dignissim. Nunc eget risus at ipsum blandit ornare vel sed velit. Proin gravida arcu nisl, a dignissim mauris placerat\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Relate Product -->\n");
      out.write("\t<section class=\"relateproduct bgwhite p-t-45 p-b-138\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"sec-title p-b-60\">\n");
      out.write("\t\t\t\t<h3 class=\"m-text5 t-center\">\n");
      out.write("\t\t\t\t\tRelated Products\n");
      out.write("\t\t\t\t</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Slide2 -->\n");
      out.write("\t\t\t<div class=\"wrap-slick2\">\n");
      out.write("\t\t\t\t<div class=\"slick2\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"item-slick2 p-l-15 p-r-15\">\n");
      out.write("\t\t\t\t\t\t<!-- Block2 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"block2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelnew\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/item-02.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-overlay trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"block2-btn-addcart w-size1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAdd to Cart\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-txt p-t-20\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\tHerschel supply co 25l\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block2-price m-text6 p-r-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t$75.00\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"item-slick2 p-l-15 p-r-15\">\n");
      out.write("\t\t\t\t\t\t<!-- Block2 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"block2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-img wrap-pic-w of-hidden pos-relative\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/item-03.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-overlay trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"block2-btn-addcart w-size1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAdd to Cart\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-txt p-t-20\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\tDenim jacket blue\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block2-price m-text6 p-r-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t$92.50\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"item-slick2 p-l-15 p-r-15\">\n");
      out.write("\t\t\t\t\t\t<!-- Block2 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"block2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-img wrap-pic-w of-hidden pos-relative\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/item-05.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-overlay trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"block2-btn-addcart w-size1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAdd to Cart\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-txt p-t-20\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\tCoach slim easton black\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block2-price m-text6 p-r-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t$165.90\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"item-slick2 p-l-15 p-r-15\">\n");
      out.write("\t\t\t\t\t\t<!-- Block2 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"block2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelsale\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/item-07.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-overlay trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"block2-btn-addcart w-size1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAdd to Cart\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-txt p-t-20\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\tFrayed denim shorts\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block2-oldprice m-text7 p-r-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t$29.50\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block2-newprice m-text8 p-r-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t$15.90\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"item-slick2 p-l-15 p-r-15\">\n");
      out.write("\t\t\t\t\t\t<!-- Block2 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"block2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelnew\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/item-02.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-overlay trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"block2-btn-addcart w-size1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAdd to Cart\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-txt p-t-20\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\tHerschel supply co 25l\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block2-price m-text6 p-r-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t$75.00\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"item-slick2 p-l-15 p-r-15\">\n");
      out.write("\t\t\t\t\t\t<!-- Block2 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"block2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-img wrap-pic-w of-hidden pos-relative\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/item-03.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-overlay trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"block2-btn-addcart w-size1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAdd to Cart\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-txt p-t-20\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\tDenim jacket blue\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block2-price m-text6 p-r-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t$92.50\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"item-slick2 p-l-15 p-r-15\">\n");
      out.write("\t\t\t\t\t\t<!-- Block2 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"block2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-img wrap-pic-w of-hidden pos-relative\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/item-05.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-overlay trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"block2-btn-addcart w-size1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAdd to Cart\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-txt p-t-20\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\tCoach slim easton black\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block2-price m-text6 p-r-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t$165.90\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"item-slick2 p-l-15 p-r-15\">\n");
      out.write("\t\t\t\t\t\t<!-- Block2 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"block2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelsale\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/item-07.jpg\" alt=\"IMG-PRODUCT\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"block2-overlay trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"block2-btn-addcart w-size1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAdd to Cart\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block2-txt p-t-20\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\tFrayed denim shorts\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block2-oldprice m-text7 p-r-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t$29.50\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block2-newprice m-text8 p-r-5\">\n");
      out.write("\t\t\t\t\t\t\t\t\t$15.90\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Footer -->\n");
      out.write("\t<footer class=\"bg6 p-t-45 p-b-43 p-l-45 p-r-45\">\n");
      out.write("\t\t<div class=\"flex-w p-b-90\">\n");
      out.write("\t\t\t<div class=\"w-size6 p-t-30 p-l-15 p-r-15 respon3\">\n");
      out.write("\t\t\t\t<h4 class=\"s-text12 p-b-30\">\n");
      out.write("\t\t\t\t\tGET IN TOUCH\n");
      out.write("\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<p class=\"s-text7 w-size27\">\n");
      out.write("\t\t\t\t\t\tAny questions? Let us know in store at 8th floor, 379 Hudson St, New York, NY 10018 or call us on (+1) 96 716 6879\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"flex-m p-t-30\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fs-18 color1 p-r-20 fa fa-facebook\"></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fs-18 color1 p-r-20 fa fa-instagram\"></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fs-18 color1 p-r-20 fa fa-pinterest-p\"></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fs-18 color1 p-r-20 fa fa-snapchat-ghost\"></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fs-18 color1 p-r-20 fa fa-youtube-play\"></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"w-size7 p-t-30 p-l-15 p-r-15 respon4\">\n");
      out.write("\t\t\t\t<h4 class=\"s-text12 p-b-30\">\n");
      out.write("\t\t\t\t\tCategories\n");
      out.write("\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tMen\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tWomen\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tDresses\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tSunglasses\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"w-size7 p-t-30 p-l-15 p-r-15 respon4\">\n");
      out.write("\t\t\t\t<h4 class=\"s-text12 p-b-30\">\n");
      out.write("\t\t\t\t\tLinks\n");
      out.write("\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tSearch\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tAbout Us\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tContact Us\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tReturns\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"w-size7 p-t-30 p-l-15 p-r-15 respon4\">\n");
      out.write("\t\t\t\t<h4 class=\"s-text12 p-b-30\">\n");
      out.write("\t\t\t\t\tHelp\n");
      out.write("\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tTrack Order\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tReturns\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tShipping\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"p-b-9\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"s-text7\">\n");
      out.write("\t\t\t\t\t\t\tFAQs\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"w-size8 p-t-30 p-l-15 p-r-15 respon3\">\n");
      out.write("\t\t\t\t<h4 class=\"s-text12 p-b-30\">\n");
      out.write("\t\t\t\t\tNewsletter\n");
      out.write("\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<div class=\"effect1 w-size9\">\n");
      out.write("\t\t\t\t\t\t<input class=\"s-text7 bg6 w-full p-b-5\" type=\"text\" name=\"email\" placeholder=\"email@example.com\">\n");
      out.write("\t\t\t\t\t\t<span class=\"effect1-line\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"w-size2 p-t-20\">\n");
      out.write("\t\t\t\t\t\t<!-- Button -->\n");
      out.write("\t\t\t\t\t\t<button class=\"flex-c-m size2 bg4 bo-rad-23 hov1 m-text3 trans-0-4\">\n");
      out.write("\t\t\t\t\t\t\tSubscribe\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"t-center p-l-15 p-r-15\">\n");
      out.write("\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t<img class=\"h-size2\" src=\"images/icons/paypal.png\" alt=\"IMG-PAYPAL\">\n");
      out.write("\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t<img class=\"h-size2\" src=\"images/icons/visa.png\" alt=\"IMG-VISA\">\n");
      out.write("\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t<img class=\"h-size2\" src=\"images/icons/mastercard.png\" alt=\"IMG-MASTERCARD\">\n");
      out.write("\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t<img class=\"h-size2\" src=\"images/icons/express.png\" alt=\"IMG-EXPRESS\">\n");
      out.write("\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t<img class=\"h-size2\" src=\"images/icons/discover.png\" alt=\"IMG-DISCOVER\">\n");
      out.write("\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"t-center s-text8 p-t-20\">\n");
      out.write("\t\t\t\tCopyright Â© 2018 All rights reserved. | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Back to top -->\n");
      out.write("\t<div class=\"btn-back-to-top bg0-hov\" id=\"myBtn\">\n");
      out.write("\t\t<span class=\"symbol-btn-back-to-top\">\n");
      out.write("\t\t\t<i class=\"fa fa-angle-double-up\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t</span>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- Container Selection -->\n");
      out.write("\t<div id=\"dropDownSelect1\"></div>\n");
      out.write("\t<div id=\"dropDownSelect2\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(\".selection-1\").select2({\n");
      out.write("\t\t\tminimumResultsForSearch: 20,\n");
      out.write("\t\t\tdropdownParent: $('#dropDownSelect1')\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$(\".selection-2\").select2({\n");
      out.write("\t\t\tminimumResultsForSearch: 20,\n");
      out.write("\t\t\tdropdownParent: $('#dropDownSelect2')\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/slick/slick.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/slick-custom.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"vendor/sweetalert/sweetalert.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$('.block2-btn-addcart').each(function(){\n");
      out.write("\t\t\tvar nameProduct = $(this).parent().parent().parent().find('.block2-name').html();\n");
      out.write("\t\t\t$(this).on('click', function(){\n");
      out.write("\t\t\t\tswal(nameProduct, \"is added to cart !\", \"success\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$('.block2-btn-addwishlist').each(function(){\n");
      out.write("\t\t\tvar nameProduct = $(this).parent().parent().parent().find('.block2-name').html();\n");
      out.write("\t\t\t$(this).on('click', function(){\n");
      out.write("\t\t\t\tswal(nameProduct, \"is added to wishlist !\", \"success\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$('.btn-addcart-product-detail').each(function(){\n");
      out.write("\t\t\tvar nameProduct = $('.product-detail-name').html();\n");
      out.write("\t\t\t$(this).on('click', function(){\n");
      out.write("\t\t\t\tswal(nameProduct, \"is added to wishlist !\", \"success\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_0 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_0.setPageContext(_jspx_page_context);
    _jspx_th_s_if_0.setParent(null);
    _jspx_th_s_if_0.setTest("hasActionMessages()");
    int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
    if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_s_actionmessage_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_s_label_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_s_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
    return false;
  }

  private boolean _jspx_meth_s_actionmessage_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionmessage
    org.apache.struts2.views.jsp.ui.ActionMessageTag _jspx_th_s_actionmessage_0 = (org.apache.struts2.views.jsp.ui.ActionMessageTag) _jspx_tagPool_s_actionmessage_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.ActionMessageTag.class);
    _jspx_th_s_actionmessage_0.setPageContext(_jspx_page_context);
    _jspx_th_s_actionmessage_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    _jspx_th_s_actionmessage_0.setCssClass("errorMessage text-center text-success mr-5");
    int _jspx_eval_s_actionmessage_0 = _jspx_th_s_actionmessage_0.doStartTag();
    if (_jspx_th_s_actionmessage_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_actionmessage_cssClass_nobody.reuse(_jspx_th_s_actionmessage_0);
      return true;
    }
    _jspx_tagPool_s_actionmessage_cssClass_nobody.reuse(_jspx_th_s_actionmessage_0);
    return false;
  }

  private boolean _jspx_meth_s_label_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_0 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_name_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_0.setPageContext(_jspx_page_context);
    _jspx_th_s_label_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    _jspx_th_s_label_0.setName("#session.nombres+ ' '+#session.apellidos");
    int _jspx_eval_s_label_0 = _jspx_th_s_label_0.doStartTag();
    if (_jspx_th_s_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_name_nobody.reuse(_jspx_th_s_label_0);
      return true;
    }
    _jspx_tagPool_s_label_name_nobody.reuse(_jspx_th_s_label_0);
    return false;
  }

  private boolean _jspx_meth_s_else_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_else_0 = (org.apache.struts2.views.jsp.ElseTag) _jspx_tagPool_s_else.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_else_0.setPageContext(_jspx_page_context);
    _jspx_th_s_else_0.setParent(null);
    int _jspx_eval_s_else_0 = _jspx_th_s_else_0.doStartTag();
    if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_else_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_else_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_s_fielderror_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_else_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_s_else_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_else_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_else.reuse(_jspx_th_s_else_0);
      return true;
    }
    _jspx_tagPool_s_else.reuse(_jspx_th_s_else_0);
    return false;
  }

  private boolean _jspx_meth_s_fielderror_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_else_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_fielderror_0 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _jspx_tagPool_s_fielderror_fieldName_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_fielderror_0.setPageContext(_jspx_page_context);
    _jspx_th_s_fielderror_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_else_0);
    _jspx_th_s_fielderror_0.setCssClass("errorMessage text-center text-danger");
    _jspx_th_s_fielderror_0.setFieldName("mensajeError");
    int _jspx_eval_s_fielderror_0 = _jspx_th_s_fielderror_0.doStartTag();
    if (_jspx_th_s_fielderror_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_fielderror_fieldName_cssClass_nobody.reuse(_jspx_th_s_fielderror_0);
      return true;
    }
    _jspx_tagPool_s_fielderror_fieldName_cssClass_nobody.reuse(_jspx_th_s_fielderror_0);
    return false;
  }

  private boolean _jspx_meth_s_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_1 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_1.setPageContext(_jspx_page_context);
    _jspx_th_s_if_1.setParent(null);
    _jspx_th_s_if_1.setTest("#session.seccion==1");
    int _jspx_eval_s_if_1 = _jspx_th_s_if_1.doStartTag();
    if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                        <a  href=\"perfil.jsp\" Class=\"dropdown-item\">Mi cuenta</a>\r\n");
        out.write("                                        <a href=\"cerrarSesionClie\" class=\"dropdown-item\">Cerrar Sesión</a>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_s_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_1);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_1);
    return false;
  }

  private boolean _jspx_meth_s_else_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_else_1 = (org.apache.struts2.views.jsp.ElseTag) _jspx_tagPool_s_else.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_else_1.setPageContext(_jspx_page_context);
    _jspx_th_s_else_1.setParent(null);
    int _jspx_eval_s_else_1 = _jspx_th_s_else_1.doStartTag();
    if (_jspx_eval_s_else_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_else_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_else_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_else_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                        <button type=\"button\" class=\"dropdown-item\" data-toggle=\"modal\" data-target=\"#loginModal\">Iniciar Sesión</button>\r\n");
        out.write("                                        <button type=\"button\" class=\"dropdown-item\" data-toggle=\"modal\" data-target=\"#registrarseModal\">Registrarse</button>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_s_else_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_else_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_else_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_else.reuse(_jspx_th_s_else_1);
      return true;
    }
    _jspx_tagPool_s_else.reuse(_jspx_th_s_else_1);
    return false;
  }

  private boolean _jspx_meth_s_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_2 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_2.setPageContext(_jspx_page_context);
    _jspx_th_s_if_2.setParent(null);
    _jspx_th_s_if_2.setTest("#session.cantidadCart == null || #session.cantidadCart == 0");
    int _jspx_eval_s_if_2 = _jspx_th_s_if_2.doStartTag();
    if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                        0\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_s_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_2);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_2);
    return false;
  }

  private boolean _jspx_meth_s_else_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_else_2 = (org.apache.struts2.views.jsp.ElseTag) _jspx_tagPool_s_else.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_else_2.setPageContext(_jspx_page_context);
    _jspx_th_s_else_2.setParent(null);
    int _jspx_eval_s_else_2 = _jspx_th_s_else_2.doStartTag();
    if (_jspx_eval_s_else_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_else_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_else_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_else_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_else_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_s_else_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_else_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_else_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_else.reuse(_jspx_th_s_else_2);
      return true;
    }
    _jspx_tagPool_s_else.reuse(_jspx_th_s_else_2);
    return false;
  }

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_else_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_else_2);
    _jspx_th_s_property_0.setValue("#session.cantidadCart");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_iterator_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent(null);
    _jspx_th_s_iterator_0.setValue("#session.lstLinea");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                            <li class=\"header-cart-item\">\r\n");
        out.write("                                                <div class=\"d-none d-md-block header-cart-item-img\">\r\n");
        out.write("                                                    <img src=\"admin/imagenes/");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\" alt=\"IMG\">\r\n");
        out.write("                                                </div>\r\n");
        out.write("\r\n");
        out.write("                                                <div class=\"header-cart-item-txt w-50\">\r\n");
        out.write("                                                    <a href=\"#\" class=\"header-cart-item-name\">\r\n");
        out.write("                                                        ");
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    </a>\r\n");
        out.write("\r\n");
        out.write("                                                    <span class=\"header-cart-item-info\">\r\n");
        out.write("                                                        ");
        if (_jspx_meth_s_property_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write(" x ");
        if (_jspx_meth_s_property_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    </span>\r\n");
        out.write("                                                </div>\r\n");
        out.write("\r\n");
        out.write("                                                <div>\r\n");
        out.write("                                                    ");
        if (_jspx_meth_s_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_s_a_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                            </li>   \r\n");
        out.write("\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_s_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_0);
      return true;
    }
    _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_1.setValue("proObj.imagen");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_2.setValue("proObj.nombre");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_property_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_3.setPageContext(_jspx_page_context);
    _jspx_th_s_property_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_3.setValue("can");
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }

  private boolean _jspx_meth_s_property_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_4 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_4.setPageContext(_jspx_page_context);
    _jspx_th_s_property_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_4.setValue("proObj.precioVenta");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_s_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_var_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_0.setVar("LnkQuitar");
    _jspx_th_s_url_0.setAction("QuitarDelCarro");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_eval_s_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_s_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_url_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_var_action.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_var_action.reuse(_jspx_th_s_url_0);
    return false;
  }

  private boolean _jspx_meth_s_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_0 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_0.setPageContext(_jspx_page_context);
    _jspx_th_s_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_0);
    _jspx_th_s_param_0.setValue("proObj.idProducto");
    _jspx_th_s_param_0.setName("proObj.idProducto");
    int _jspx_eval_s_param_0 = _jspx_th_s_param_0.doStartTag();
    if (_jspx_th_s_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_0);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_0);
    return false;
  }

  private boolean _jspx_meth_s_a_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_0.setPageContext(_jspx_page_context);
    _jspx_th_s_a_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_0.setHref("%{LnkQuitar}");
    int _jspx_eval_s_a_0 = _jspx_th_s_a_0.doStartTag();
    if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                                        <i class=\"fas fa-times\"></i>\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_a_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_0);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_0);
    return false;
  }

  private boolean _jspx_meth_s_property_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_5 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_5.setPageContext(_jspx_page_context);
    _jspx_th_s_property_5.setParent(null);
    _jspx_th_s_property_5.setValue("#session.total");
    int _jspx_eval_s_property_5 = _jspx_th_s_property_5.doStartTag();
    if (_jspx_th_s_property_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
    return false;
  }

  private boolean _jspx_meth_s_iterator_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_1 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_1.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_1.setParent(null);
    _jspx_th_s_iterator_1.setValue("#session.lstCategoria");
    int _jspx_eval_s_iterator_1 = _jspx_th_s_iterator_1.doStartTag();
    if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_s_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                        <ul class=\"dropdown-menu\">\r\n");
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_s_iterator_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                        </ul>\r\n");
        out.write("                                    </li>\r\n");
        out.write("\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_s_iterator_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_1);
      return true;
    }
    _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_1);
    return false;
  }

  private boolean _jspx_meth_s_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_3 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_3.setPageContext(_jspx_page_context);
    _jspx_th_s_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_if_3.setTest("idCategoria==categoriaSuperior");
    int _jspx_eval_s_if_3 = _jspx_th_s_if_3.doStartTag();
    if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                        <li class=\"dropdown-submenu\"><a class=\"dropdown-item dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">");
        if (_jspx_meth_s_property_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_3, _jspx_page_context))
          return true;
        out.write("</a>\r\n");
        out.write("                                            ");
        if (_jspx_meth_s_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_3, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_s_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_3);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_3);
    return false;
  }

  private boolean _jspx_meth_s_property_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_6 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_6.setPageContext(_jspx_page_context);
    _jspx_th_s_property_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_3);
    _jspx_th_s_property_6.setValue("nombre");
    int _jspx_eval_s_property_6 = _jspx_th_s_property_6.doStartTag();
    if (_jspx_th_s_property_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
    return false;
  }

  private boolean _jspx_meth_s_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_0 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_0.setPageContext(_jspx_page_context);
    _jspx_th_s_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_3);
    _jspx_th_s_set_0.setVar("idCat");
    _jspx_th_s_set_0.setValue("idCategoria");
    int _jspx_eval_s_set_0 = _jspx_th_s_set_0.doStartTag();
    if (_jspx_th_s_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_0);
      return true;
    }
    _jspx_tagPool_s_set_var_value_nobody.reuse(_jspx_th_s_set_0);
    return false;
  }

  private boolean _jspx_meth_s_iterator_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_2 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_2.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_iterator_2.setValue("#session.lstCategoria");
    int _jspx_eval_s_iterator_2 = _jspx_th_s_iterator_2.doStartTag();
    if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_s_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_s_iterator_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_2);
      return true;
    }
    _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_2);
    return false;
  }

  private boolean _jspx_meth_s_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_4 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_4.setPageContext(_jspx_page_context);
    _jspx_th_s_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_if_4.setTest("idCategoria!=categoriaSuperior&&categoriaSuperior==#idCat");
    int _jspx_eval_s_if_4 = _jspx_th_s_if_4.doStartTag();
    if (_jspx_eval_s_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                                    <a class=\"dropdown-item\" href=\"#\">");
        if (_jspx_meth_s_property_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_4, _jspx_page_context))
          return true;
        out.write("</a>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_s_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_4);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_4);
    return false;
  }

  private boolean _jspx_meth_s_property_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_7 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_7.setPageContext(_jspx_page_context);
    _jspx_th_s_property_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_4);
    _jspx_th_s_property_7.setValue("nombre");
    int _jspx_eval_s_property_7 = _jspx_th_s_property_7.doStartTag();
    if (_jspx_th_s_property_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_7);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_7);
    return false;
  }

  private boolean _jspx_meth_s_iterator_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_3 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_3.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_3.setParent(null);
    _jspx_th_s_iterator_3.setValue("#session.lstMarca");
    int _jspx_eval_s_iterator_3 = _jspx_th_s_iterator_3.doStartTag();
    if (_jspx_eval_s_iterator_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                    <a class=\"dropdown-item\" href=\"#\">");
        if (_jspx_meth_s_property_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
          return true;
        out.write("</a>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_s_iterator_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_3);
      return true;
    }
    _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_3);
    return false;
  }

  private boolean _jspx_meth_s_property_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_8 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_8.setPageContext(_jspx_page_context);
    _jspx_th_s_property_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_property_8.setValue("nombre");
    int _jspx_eval_s_property_8 = _jspx_th_s_property_8.doStartTag();
    if (_jspx_th_s_property_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
    return false;
  }

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_theme_styleId_id_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("ingresoCliente");
    _jspx_th_s_form_0.setId("form_login");
    _jspx_th_s_form_0.setDynamicAttribute(null, "styleId", new String("acc"));
    _jspx_th_s_form_0.setTheme("simple");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                ");
        if (_jspx_meth_s_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                ");
        if (_jspx_meth_s_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <div class=\"form-check\">\r\n");
        out.write("                                    <input type=\"checkbox\" class=\"form-check-input ml-0\" id=\"dropdownCheck\">\r\n");
        out.write("                                    <label class=\"form-check-label\" for=\"Check\">\r\n");
        out.write("                                        Recordar Contraseña\r\n");
        out.write("                                    </label>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            <div class=\"text-center\"> \r\n");
        out.write("                                <button  type=\"button\" Class=\"btn btn-link\" data-toggle=\"modal\" data-target=\"#registrarseModal\" >Registrese</button>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_theme_styleId_id_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_theme_styleId_id_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_0.setCssClass("form-control");
    _jspx_th_s_textfield_0.setName("cliente.email");
    _jspx_th_s_textfield_0.setId("email");
    _jspx_th_s_textfield_0.setDynamicAttribute(null, "placeholder", new String("Ingrese Email"));
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_textfield_0);
    return false;
  }

  private boolean _jspx_meth_s_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_0 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_0.setPageContext(_jspx_page_context);
    _jspx_th_s_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_password_0.setCssClass("form-control");
    _jspx_th_s_password_0.setName("cliente.password");
    _jspx_th_s_password_0.setId("password");
    _jspx_th_s_password_0.setDynamicAttribute(null, "placeholder", new String("Ingrese Password"));
    int _jspx_eval_s_password_0 = _jspx_th_s_password_0.doStartTag();
    if (_jspx_th_s_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_password_0);
      return true;
    }
    _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_password_0);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setId("ingresar");
    _jspx_th_s_submit_0.setDynamicAttribute(null, "styleId", new String("btnreg"));
    _jspx_th_s_submit_0.setCssClass("btn btn-primary btn-block  toastrDefaultError");
    _jspx_th_s_submit_0.setValue("Iniciar Sesión");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }

  private boolean _jspx_meth_s_form_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_1 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_theme_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_1.setPageContext(_jspx_page_context);
    _jspx_th_s_form_1.setParent(null);
    _jspx_th_s_form_1.setAction("registrarse");
    _jspx_th_s_form_1.setTheme("simple");
    int _jspx_eval_s_form_1 = _jspx_th_s_form_1.doStartTag();
    if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                            <div class=\"input-group mb-3 mt-3\">\r\n");
        out.write("                                ");
        if (_jspx_meth_s_textfield_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"input-group mb-3\">\r\n");
        out.write("                                ");
        if (_jspx_meth_s_textfield_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"input-group mb-3\">\r\n");
        out.write("                                ");
        if (_jspx_meth_s_textfield_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"input-group mb-3\">\r\n");
        out.write("                                ");
        if (_jspx_meth_s_password_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"input-group mb-3\">\r\n");
        out.write("                                ");
        if (_jspx_meth_s_password_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"row\">\r\n");
        out.write("                                <!-- /.col -->\r\n");
        out.write("                                <div class=\"col-8\">\r\n");
        out.write("                                    <div class=\"icheck-primary\">\r\n");
        out.write("                                        <input type=\"checkbox\" id=\"agreeTerms\" name=\"terms\" value=\"agree\">\r\n");
        out.write("                                        <label for=\"agreeTerms\">\r\n");
        out.write("                                            Acepto los  <a href=\"#\">Terminos</a>\r\n");
        out.write("                                        </label>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"col-4\">\r\n");
        out.write("                                    ");
        if (_jspx_meth_s_submit_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <!-- /.col -->\r\n");
        out.write("                            </div>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_s_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_theme_action.reuse(_jspx_th_s_form_1);
      return true;
    }
    _jspx_tagPool_s_form_theme_action.reuse(_jspx_th_s_form_1);
    return false;
  }

  private boolean _jspx_meth_s_textfield_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_1.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_textfield_1.setCssClass("form-control");
    _jspx_th_s_textfield_1.setName("cliente.nombres");
    _jspx_th_s_textfield_1.setId("nombres");
    _jspx_th_s_textfield_1.setDynamicAttribute(null, "placeholder", new String("Ingrese Nombres"));
    int _jspx_eval_s_textfield_1 = _jspx_th_s_textfield_1.doStartTag();
    if (_jspx_th_s_textfield_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_textfield_1);
      return true;
    }
    _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_textfield_1);
    return false;
  }

  private boolean _jspx_meth_s_textfield_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_2.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_textfield_2.setCssClass("form-control");
    _jspx_th_s_textfield_2.setName("cliente.apellidos");
    _jspx_th_s_textfield_2.setId("apellidos");
    _jspx_th_s_textfield_2.setDynamicAttribute(null, "placeholder", new String("Ingrese Apellidos"));
    int _jspx_eval_s_textfield_2 = _jspx_th_s_textfield_2.doStartTag();
    if (_jspx_th_s_textfield_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_textfield_2);
      return true;
    }
    _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_textfield_2);
    return false;
  }

  private boolean _jspx_meth_s_textfield_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_3.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_textfield_3.setCssClass("form-control");
    _jspx_th_s_textfield_3.setName("cliente.email");
    _jspx_th_s_textfield_3.setId("email");
    _jspx_th_s_textfield_3.setDynamicAttribute(null, "placeholder", new String("Ingrese Email"));
    int _jspx_eval_s_textfield_3 = _jspx_th_s_textfield_3.doStartTag();
    if (_jspx_th_s_textfield_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_textfield_3);
      return true;
    }
    _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_textfield_3);
    return false;
  }

  private boolean _jspx_meth_s_password_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_1 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_1.setPageContext(_jspx_page_context);
    _jspx_th_s_password_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_password_1.setCssClass("form-control");
    _jspx_th_s_password_1.setName("cliente.password");
    _jspx_th_s_password_1.setId("password");
    _jspx_th_s_password_1.setDynamicAttribute(null, "placeholder", new String("Ingrese Password"));
    int _jspx_eval_s_password_1 = _jspx_th_s_password_1.doStartTag();
    if (_jspx_th_s_password_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_password_1);
      return true;
    }
    _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_password_1);
    return false;
  }

  private boolean _jspx_meth_s_password_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_2 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_2.setPageContext(_jspx_page_context);
    _jspx_th_s_password_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_password_2.setCssClass("form-control");
    _jspx_th_s_password_2.setName("password2");
    _jspx_th_s_password_2.setId("password2");
    _jspx_th_s_password_2.setDynamicAttribute(null, "placeholder", new String("Confirmar Password"));
    int _jspx_eval_s_password_2 = _jspx_th_s_password_2.doStartTag();
    if (_jspx_th_s_password_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_password_2);
      return true;
    }
    _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_password_2);
    return false;
  }

  private boolean _jspx_meth_s_submit_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_1 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_1.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_submit_1.setCssClass("btn btn-primary btn-block toastrDefaultError");
    _jspx_th_s_submit_1.setValue("Enviar");
    int _jspx_eval_s_submit_1 = _jspx_th_s_submit_1.doStartTag();
    if (_jspx_th_s_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_cssClass_nobody.reuse(_jspx_th_s_submit_1);
      return true;
    }
    _jspx_tagPool_s_submit_value_cssClass_nobody.reuse(_jspx_th_s_submit_1);
    return false;
  }

  private boolean _jspx_meth_s_form_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_2 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_theme_styleId_id_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_2.setPageContext(_jspx_page_context);
    _jspx_th_s_form_2.setParent(null);
    _jspx_th_s_form_2.setAction("restablecerPassword");
    _jspx_th_s_form_2.setId("form_rest");
    _jspx_th_s_form_2.setDynamicAttribute(null, "styleId", new String("acc"));
    _jspx_th_s_form_2.setTheme("simple");
    int _jspx_eval_s_form_2 = _jspx_th_s_form_2.doStartTag();
    if (_jspx_eval_s_form_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_s_textfield_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"form-group\">\r\n");
        out.write("                                <div class=\"form-check\">\r\n");
        out.write("                                    <input type=\"checkbox\" class=\"form-check-input ml-0\" id=\"dropdownCheck\">\r\n");
        out.write("                                    <label class=\"form-check-label\" for=\"Check\">\r\n");
        out.write("                                        Recordar Contraseña\r\n");
        out.write("                                    </label>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_submit_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            <div class=\"text-center\"> \r\n");
        out.write("                                <button  type=\"button\" Class=\"btn btn-link\" data-toggle=\"modal\" data-target=\"#registrarseModal\" >Registrese</button>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_s_form_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_theme_styleId_id_action.reuse(_jspx_th_s_form_2);
      return true;
    }
    _jspx_tagPool_s_form_theme_styleId_id_action.reuse(_jspx_th_s_form_2);
    return false;
  }

  private boolean _jspx_meth_s_textfield_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_4 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_4.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_2);
    _jspx_th_s_textfield_4.setCssClass("form-control");
    _jspx_th_s_textfield_4.setName("cliente.email");
    _jspx_th_s_textfield_4.setId("email");
    _jspx_th_s_textfield_4.setDynamicAttribute(null, "placeholder", new String("Ingrese Email"));
    int _jspx_eval_s_textfield_4 = _jspx_th_s_textfield_4.doStartTag();
    if (_jspx_th_s_textfield_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_textfield_4);
      return true;
    }
    _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_textfield_4);
    return false;
  }

  private boolean _jspx_meth_s_submit_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_2 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_2.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_2);
    _jspx_th_s_submit_2.setId("ingresar");
    _jspx_th_s_submit_2.setDynamicAttribute(null, "styleId", new String("btnreg"));
    _jspx_th_s_submit_2.setCssClass("btn btn-primary btn-block  toastrDefaultError");
    _jspx_th_s_submit_2.setValue("Iniciar Sesión");
    int _jspx_eval_s_submit_2 = _jspx_th_s_submit_2.doStartTag();
    if (_jspx_th_s_submit_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody.reuse(_jspx_th_s_submit_2);
      return true;
    }
    _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody.reuse(_jspx_th_s_submit_2);
    return false;
  }
}
