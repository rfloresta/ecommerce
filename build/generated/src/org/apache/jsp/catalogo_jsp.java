package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class catalogo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_label_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_elseif_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_else;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_a_href_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_theme_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_actionerror_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_theme_styleId_id_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_id_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_label_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_elseif_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_else = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_a_href_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_theme_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_actionerror_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_theme_styleId_id_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_id_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_label_name_nobody.release();
    _jspx_tagPool_s_submit_value_id_cssClass_nobody.release();
    _jspx_tagPool_s_iterator_value.release();
    _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody.release();
    _jspx_tagPool_s_elseif_test.release();
    _jspx_tagPool_s_set_var_value_nobody.release();
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_else.release();
    _jspx_tagPool_s_a_href_cssClass.release();
    _jspx_tagPool_s_password_placeholder_name_id_cssClass_nobody.release();
    _jspx_tagPool_s_form_theme_action.release();
    _jspx_tagPool_s_actionerror_nobody.release();
    _jspx_tagPool_s_param_value_name_nobody.release();
    _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.release();
    _jspx_tagPool_s_form_theme_styleId_id_action.release();
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_s_url_id_action.release();
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
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/lightbox.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link href=\"css/toastr.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
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
      out.write("                            \r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-4  col-md-4\">\r\n");
      out.write("                        <div class=\"topbar-child2\">\r\n");
      out.write("                            <span class=\"topbar-email\">\r\n");
      out.write("                                ");
      if (_jspx_meth_s_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_s_else_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </span>\r\n");
      out.write("\r\n");
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
      if (_jspx_meth_s_elseif_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_s_else_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <span class=\"linedivide1\"></span>\r\n");
      out.write("                            <div class=\"header-wrapicon2 m-r-10\">\r\n");
      out.write("                                <!--Logo de Carrito de compras-->\r\n");
      out.write("                                <img src=\"imagenes/icon-header-02.png\" class=\"header-icon1 js-show-header-dropdown\" alt=\"ICON\">\r\n");
      out.write("                                <span class=\"header-icons-noti\">0</span>\r\n");
      out.write("\r\n");
      out.write("                                <!--Contenido de Carrito de compras-->\r\n");
      out.write("                                <div class=\"header-cart header-dropdown\">\r\n");
      out.write("                                    <ul class=\"header-cart-wrapitem\">\r\n");
      out.write("                                        <li class=\"header-cart-item\">\r\n");
      out.write("                                            <div class=\"d-none d-md-block header-cart-item-img\">\r\n");
      out.write("                                                <img src=\"imagenes/item-cart-01.jpg\" alt=\"IMG\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"header-cart-item-txt\">\r\n");
      out.write("                                                <a href=\"#\" class=\"header-cart-item-name\">\r\n");
      out.write("                                                    White Shirt With Pleat Detail Back\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <span class=\"header-cart-item-info\">\r\n");
      out.write("                                                    1 x $19.00\r\n");
      out.write("                                                </span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("\r\n");
      out.write("                                        <li class=\"header-cart-item\">\r\n");
      out.write("                                            <div class=\"d-none d-md-block header-cart-item-img\">\r\n");
      out.write("                                                <img src=\"imagenes/item-cart-02.jpg\" alt=\"IMG\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"header-cart-item-txt\">\r\n");
      out.write("                                                <a href=\"#\" class=\"header-cart-item-name\">\r\n");
      out.write("                                                    Converse All Star Hi Black Canvas\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <span class=\"header-cart-item-info\">\r\n");
      out.write("                                                    1 x $39.00\r\n");
      out.write("                                                </span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("\r\n");
      out.write("                                        <li class=\"header-cart-item\">\r\n");
      out.write("                                            <div class=\"d-none d-md-block header-cart-item-img\">\r\n");
      out.write("                                                <img src=\"imagenes/item-cart-03.jpg\" alt=\"IMG\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"header-cart-item-txt\">\r\n");
      out.write("                                                <a href=\"#\" class=\"header-cart-item-name\">\r\n");
      out.write("                                                    Nixon Porter Leather Watch In Tan\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <span class=\"header-cart-item-info\">\r\n");
      out.write("                                                    1 x $17.00\r\n");
      out.write("                                                </span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"header-cart-total\">\r\n");
      out.write("                                        Total: $75.00\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"header-cart-buttons\">\r\n");
      out.write("                                        <div class=\"header-cart-wrapbtn\">\r\n");
      out.write("                                            Button \r\n");
      out.write("                                            <a href=\"cart.html\" class=\"flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                View Cart\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"header-cart-wrapbtn\">\r\n");
      out.write("                                            Button \r\n");
      out.write("                                            <a href=\"#\" class=\"flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                Check Out\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </div>\r\n");
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
      out.write("                        <a href=\"index.html\" class=\"nav-link\">Home</a>\r\n");
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"http://example.com\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                Categoría\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("                                ");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"dropdown drophover\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link\" id=\"dropMarca\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Marca</a>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"dropMarca\">\r\n");
      out.write("                            ");
      if (_jspx_meth_s_iterator_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"cart.html\" class=\"nav-link\">Caracteristicas</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"blog.html\" class=\"nav-link\">Blog</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"about.html\" class=\"nav-link\">Acerca de</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"contact.html\" class=\"nav-link\">Contacto</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!-- Header -->\r\n");
      out.write("\r\n");
      out.write("    <!--Inicio Modal Para inicio de sesión -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"loginModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header justify-content-center border-bottom-0\">\r\n");
      out.write("                    <div class=\"social-auth-links text-center  mb-3 mt-4\">\r\n");
      out.write("                        <a href=\"#\" class=\"btn  btn-primary my-3 my-md-0\">\r\n");
      out.write("                            <i class=\"fa fa-facebook mr-2\"></i> Sign in using Facebook\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"#\" class=\"btn  btn-danger\">\r\n");
      out.write("                            <i class=\"fa fa-google-plus mr-2\"></i> Sign in using Google+\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body pt-0\">\r\n");
      out.write("                    <p class=\"text-center\">- OR -</p>\r\n");
      out.write("                    ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Olvidaste tu contraseña?</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--Fin Modal Para inicio de sesión -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--Inicio Modal Para Registrarse-->\r\n");
      out.write("    <div class=\"modal fade\" id=\"registrarseModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header justify-content-center border-bottom-0\">\r\n");
      out.write("                    <div class=\"social-auth-links text-center  mb-3 mt-4\">\r\n");
      out.write("                        <a href=\"#\" class=\"btn  btn-primary my-3 my-md-0\">\r\n");
      out.write("                            <i class=\"fa fa-facebook mr-2\"></i> Sign in using Facebook\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"#\" class=\"btn  btn-danger\">\r\n");
      out.write("                            <i class=\"fa fa-google-plus mr-2\"></i> Sign in using Google+\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body pt-0\">\r\n");
      out.write("                    <p class=\"text-center\">- OR -</p>\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_s_form_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--Fin Modal Para Registrarse -->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Slide1 -->\r\n");
      out.write("        <section class=\"slide1\">\r\n");
      out.write("            <div class=\"wrap-slick1\">\r\n");
      out.write("                <div class=\"slick1\">\r\n");
      out.write("                    <div class=\"item-slick1 item1-slick1\" style=\"background-image: url(imagenes/slider-2.jpg); \">\r\n");
      out.write("                        <div class=\"wrap-content-slide1 sizefull flex-col-c-m p-l-15 p-r-15 p-t-150 p-b-170\">\r\n");
      out.write("                            <h2 class=\"caption1-slide1 xl-text2 t-center bo14 p-b-6 animated visible-false m-b-22\" data-appear=\"fadeInUp\">\r\n");
      out.write("                                Leather Bags\r\n");
      out.write("                            </h2>\r\n");
      out.write("\r\n");
      out.write("                            <span class=\"caption2-slide1 m-text1 t-center animated visible-false m-b-33\" data-appear=\"fadeInDown\">\r\n");
      out.write("                                New Collection 2018\r\n");
      out.write("                            </span>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"wrap-btn-slide1 w-size1 animated visible-false\" data-appear=\"zoomIn\">\r\n");
      out.write("                                <!-- Button -->\r\n");
      out.write("                                <a href=\"product.html\" class=\"flex-c-m size2 bo-rad-23 s-text2 bgwhite hov1 trans-0-4\">\r\n");
      out.write("                                    Shop Now\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"item-slick1 item2-slick1\" style=\"background-image: url(imagenes/slider-5.jpg);\">\r\n");
      out.write("                        <div class=\"wrap-content-slide1 sizefull flex-col-c-m p-l-15 p-r-15 p-t-150 p-b-170\">\r\n");
      out.write("                            <h2 class=\"caption1-slide1 xl-text2 t-center bo14 p-b-6 animated visible-false m-b-22\" data-appear=\"rollIn\">\r\n");
      out.write("                                Leather Bags\r\n");
      out.write("                            </h2>\r\n");
      out.write("\r\n");
      out.write("                            <span class=\"caption2-slide1 m-text1 t-center animated visible-false m-b-33\" data-appear=\"lightSpeedIn\">\r\n");
      out.write("                                New Collection 2018\r\n");
      out.write("                            </span>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"wrap-btn-slide1 w-size1 animated visible-false\" data-appear=\"slideInUp\">\r\n");
      out.write("                                <!-- Button -->\r\n");
      out.write("                                <a href=\"product.html\" class=\"flex-c-m size2 bo-rad-23 s-text2 bgwhite hov1 trans-0-4\">\r\n");
      out.write("                                    Shop Now\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"item-slick1 item3-slick1\" style=\"background-image: url(imagenes/slider-1.jpg); background-image: cover\">\r\n");
      out.write("                        <div class=\"wrap-content-slide1 sizefull flex-col-c-m p-l-15 p-r-15 p-t-150 p-b-170\">\r\n");
      out.write("                            <h2 class=\"caption1-slide1 xl-text2 t-center bo14 p-b-6 animated visible-false m-b-22\" data-appear=\"rotateInDownLeft\">\r\n");
      out.write("                                Leather Bags\r\n");
      out.write("                            </h2>\r\n");
      out.write("\r\n");
      out.write("                            <span class=\"caption2-slide1 m-text1 t-center animated visible-false m-b-33\" data-appear=\"rotateInUpRight\">\r\n");
      out.write("                                New Collection 2018\r\n");
      out.write("                            </span>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"wrap-btn-slide1 w-size1 animated visible-false\" data-appear=\"rotateIn\">\r\n");
      out.write("                                <!-- Button -->\r\n");
      out.write("                                <a href=\"product.html\" class=\"flex-c-m size2 bo-rad-23 s-text2 bgwhite hov1 trans-0-4\">\r\n");
      out.write("                                    Shop Now\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write(" \r\n");
      out.write("        <!-- Banner -->\r\n");
      out.write("        <div class=\"banner bgwhite p-t-40 p-b-40\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"sec-title col-12 mb-5\">\r\n");
      out.write("                        <h3 class=\"m-text5 t-center\">\r\n");
      out.write("                            Lo favorito del mes\r\n");
      out.write("                        </h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-10 col-md-8 col-lg-4 m-l-r-auto\">\r\n");
      out.write("                        <!-- block1 -->\r\n");
      out.write("                        <div class=\"block1 hov-img-zoom pos-relative m-b-30\">\r\n");
      out.write("                            <img src=\"imagenes/KromoBlack.jpg\" alt=\"IMG-BENNER\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"block1-wrapbtn w-size2\">\r\n");
      out.write("                                <!-- Button -->\r\n");
      out.write("                                <a href=\"#\" class=\"flex-c-m size2 m-text2 bg3 hov1 trans-0-4\">\r\n");
      out.write("                                    Kromo Black\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-10 col-md-8 col-lg-4 m-l-r-auto\">\r\n");
      out.write("                        <!-- block1 -->\r\n");
      out.write("                        <div class=\"block1 hov-img-zoom pos-relative m-b-30\">\r\n");
      out.write("                            <img src=\"imagenes/Magnat.jpg\" alt=\"IMG-BENNER\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"block1-wrapbtn w-size2\">\r\n");
      out.write("                                <!-- Button -->\r\n");
      out.write("                                <a href=\"#\" class=\"flex-c-m size2 m-text2 bg3 hov1 trans-0-4\">\r\n");
      out.write("                                    Magnat\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-10 col-md-8 col-lg-4 m-l-r-auto\">\r\n");
      out.write("                        <!-- block1 -->\r\n");
      out.write("                        <div class=\"block1 hov-img-zoom pos-relative m-b-30\">\r\n");
      out.write("                            <img src=\"imagenes/Leyenda.jpg\" alt=\"IMG-BENNER\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"block1-wrapbtn w-size2\">\r\n");
      out.write("                                <!-- Button -->\r\n");
      out.write("                                <a href=\"#\" class=\"flex-c-m size2 m-text2 bg3 hov1 trans-0-4\">\r\n");
      out.write("                                    Leyenda\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Our product -->\r\n");
      out.write("        <section class=\"bgwhite p-t-45 p-b-58\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"sec-title p-b-22\">\r\n");
      out.write("                    <h3 class=\"m-text5 t-center\">\r\n");
      out.write("                        Otros Productos\r\n");
      out.write("                    </h3>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Tab01 -->\r\n");
      out.write("                <div class=\"tab01\">\r\n");
      out.write("                    <!-- Nav tabs -->\r\n");
      out.write("                    <ul class=\"nav nav-tabs\" role=\"tablist\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link active\" data-toggle=\"tab\" href=\"#best-seller\" role=\"tab\">Más vendido</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" data-toggle=\"tab\" href=\"#featured\" role=\"tab\">Destacados</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" data-toggle=\"tab\" href=\"#sale\" role=\"tab\">Rebaja</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" data-toggle=\"tab\" href=\"#top-rate\" role=\"tab\">Los más valorados</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Tab panes -->\r\n");
      out.write("                    <div class=\"tab-content p-t-35\">\r\n");
      out.write("                        <!-- - -->\r\n");
      out.write("                        <div class=\"tab-pane fade show active\" id=\"best-seller\" role=\"tabpanel\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                \r\n");
      out.write("                                ");
      //  s:iterator
      org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_3 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
      _jspx_th_s_iterator_3.setPageContext(_jspx_page_context);
      _jspx_th_s_iterator_3.setParent(null);
      _jspx_th_s_iterator_3.setValue("lstProducto");
      int _jspx_eval_s_iterator_3 = _jspx_th_s_iterator_3.doStartTag();
      if (_jspx_eval_s_iterator_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_iterator_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_iterator_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_iterator_3.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
          out.write("                                    <!-- Block2 -->\r\n");
          out.write("                                    <div class=\"block2\">\r\n");
          out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelnew\">\r\n");
          out.write("                                            <img src=\"");
          out.print(request.getContextPath());
          out.write("/admin/imagenes/");
          if (_jspx_meth_s_property_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
            return;
          out.write("\" alt=\"IMG-PRODUCT\">\r\n");
          out.write("\r\n");
          out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
          out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
          out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
          out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
          out.write("                                                </a>\r\n");
          out.write("\r\n");
          out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
          out.write("                                                    <!-- Button -->\r\n");
          out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
          out.write("                                                        Agregar al carro\r\n");
          out.write("                                                    </button>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("\r\n");
          out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
          out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
          out.write("                                                ");
          if (_jspx_meth_s_property_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                                            </a>\r\n");
          out.write("\r\n");
          out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
          out.write("                                                S/");
          if (_jspx_meth_s_property_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                                            </span>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
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
        return;
      }
      _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_3);
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                                \r\n");
      out.write("                        <!-- - -->\r\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"featured\" role=\"tabpanel\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelsale\">\r\n");
      out.write("                                            <img src=\"imagenes/Otros_productos_Brocha_DualOjo.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Frayed denim shorts\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-oldprice m-text7 p-r-5\">\r\n");
      out.write("                                                $29.50\r\n");
      out.write("                                            </span>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-newprice m-text8 p-r-5\">\r\n");
      out.write("                                                $15.90\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                                 </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("         \r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelnew\">\r\n");
      out.write("                                            <img src=\"imagenes/item-01.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Herschel supply co 25l\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $75.00\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative\">\r\n");
      out.write("                                            <img src=\"imagenes/item-14.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Denim jacket blue\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $92.50\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelnew\">\r\n");
      out.write("                                            <img src=\"imagenes/item-06.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Herschel supply co 25l\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $75.00\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelsale\">\r\n");
      out.write("                                            <img src=\"imagenes/item-11.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Frayed denim shorts\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-oldprice m-text7 p-r-5\">\r\n");
      out.write("                                                $29.50\r\n");
      out.write("                                            </span>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-newprice m-text8 p-r-5\">\r\n");
      out.write("                                                $15.90\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelnew\">\r\n");
      out.write("                                            <img src=\"imagenes/item-12.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Herschel supply co 25l\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $75.00\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative\">\r\n");
      out.write("                                            <img src=\"imagenes/item-15.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Denim jacket blue\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $92.50\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!--  -->\r\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"sale\" role=\"tabpanel\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelsale\">\r\n");
      out.write("                                            <img src=\"imagenes/item-01.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Herschel supply co 25l\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $75.00\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelsale\">\r\n");
      out.write("                                            <img src=\"imagenes/item-14.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Denim jacket blue\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $92.50\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelsale\">\r\n");
      out.write("                                            <img src=\"imagenes/item-06.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Herschel supply co 25l\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $75.00\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelsale\">\r\n");
      out.write("                                            <img src=\"imagenes/item-08.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Denim jacket blue\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $92.50\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!--  -->\r\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"top-rate\" role=\"tabpanel\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelnew\">\r\n");
      out.write("                                            <img src=\"imagenes/item-02.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Herschel supply co 25l\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $75.00\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative\">\r\n");
      out.write("                                            <img src=\"imagenes/item-03.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Denim jacket blue\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $92.50\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative\">\r\n");
      out.write("                                            <img src=\"imagenes/item-05.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Coach slim easton black\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $165.90\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelsale\">\r\n");
      out.write("                                            <img src=\"imagenes/item-07.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Frayed denim shorts\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-oldprice m-text7 p-r-5\">\r\n");
      out.write("                                                $29.50\r\n");
      out.write("                                            </span>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-newprice m-text8 p-r-5\">\r\n");
      out.write("                                                $15.90\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative\">\r\n");
      out.write("                                            <img src=\"imagenes/item-10.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Coach slim easton black\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $165.90\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelsale\">\r\n");
      out.write("                                            <img src=\"imagenes/item-11.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Frayed denim shorts\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-oldprice m-text7 p-r-5\">\r\n");
      out.write("                                                $29.50\r\n");
      out.write("                                            </span>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-newprice m-text8 p-r-5\">\r\n");
      out.write("                                                $15.90\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative block2-labelnew\">\r\n");
      out.write("                                            <img src=\"imagenes/item-12.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Herschel supply co 25l\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $75.00\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4 col-lg-3 p-b-50\">\r\n");
      out.write("                                    <!-- Block2 -->\r\n");
      out.write("                                    <div class=\"block2\">\r\n");
      out.write("                                        <div class=\"block2-img wrap-pic-w of-hidden pos-relative\">\r\n");
      out.write("                                            <img src=\"imagenes/item-15.jpg\" alt=\"IMG-PRODUCT\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"block2-overlay trans-0-4\">\r\n");
      out.write("                                                <a href=\"#\" class=\"block2-btn-addwishlist hov-pointer trans-0-4\">\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart_alt\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                    <i class=\"icon-wishlist icon_heart dis-none\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"block2-btn-addcart w-size1 trans-0-4\">\r\n");
      out.write("                                                    <!-- Button -->\r\n");
      out.write("                                                    <button class=\"flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4\">\r\n");
      out.write("                                                        Agregar al carro\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"block2-txt p-t-20\">\r\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"block2-name dis-block s-text3 p-b-5\">\r\n");
      out.write("                                                Denim jacket blue\r\n");
      out.write("                                            </a>\r\n");
      out.write("\r\n");
      out.write("                                            <span class=\"block2-price m-text6 p-r-5\">\r\n");
      out.write("                                                $92.50\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Banner delivery -->\r\n");
      out.write("        <section class=\"parallax0 \" style=\"background-image: url(imagenes/slider-4.jpg);\">\r\n");
      out.write("            <div class=\"overlay0 p-t-190 p-b-200\">\r\n");
      out.write("                <div class=\"flex-col-c-m p-l-15 p-r-15\">\r\n");
      out.write("                    <span class=\"m-text9 p-t-45 fs-20-sm\">\r\n");
      out.write("                        La Belleza\r\n");
      out.write("                    </span>\r\n");
      out.write("\r\n");
      out.write("                    <h3 class=\"l-text1 fs-35-sm\">\r\n");
      out.write("                        hacia tu hogar\r\n");
      out.write("                    </h3>\r\n");
      out.write("                    <span class=\"text-light \">\r\n");
      out.write("                        Cono más sobre nuestro servicio delivery\r\n");
      out.write("                    </span>\r\n");
      out.write("\r\n");
      out.write("                    <a class=\"btn btn-secondary text-light px-5 mt-5\">Más Información</a>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Shipping -->\r\n");
      out.write("        <section class=\"shipping bgwhite p-t-62 p-b-46\">\r\n");
      out.write("            <div class=\"flex-w p-l-15 p-r-15\">\r\n");
      out.write("                <div class=\"flex-col-c w-size5 p-l-15 p-r-15 p-t-16 p-b-15 respon1\">\r\n");
      out.write("                    <h4 class=\"m-text12 t-center\">\r\n");
      out.write("                        Free Delivery Worldwide\r\n");
      out.write("                    </h4>\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"s-text11 t-center\">\r\n");
      out.write("                        Click here for more info\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"flex-col-c w-size5 p-l-15 p-r-15 p-t-16 p-b-15 bo2 respon2\">\r\n");
      out.write("                    <h4 class=\"m-text12 t-center\">\r\n");
      out.write("                        30 Days Return\r\n");
      out.write("                    </h4>\r\n");
      out.write("\r\n");
      out.write("                    <span class=\"s-text11 t-center\">\r\n");
      out.write("                        Simply return it within 30 days for an exchange.\r\n");
      out.write("                    </span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"flex-col-c w-size5 p-l-15 p-r-15 p-t-16 p-b-15 respon1\">\r\n");
      out.write("                    <h4 class=\"m-text12 t-center\">\r\n");
      out.write("                        Store Opening\r\n");
      out.write("                    </h4>\r\n");
      out.write("\r\n");
      out.write("                    <span class=\"s-text11 t-center\">\r\n");
      out.write("                        Shop open from Monday to Sunday\r\n");
      out.write("                    </span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <!-- Instagram -->\r\n");
      out.write("        <section class=\"instagram p-t-20\">\r\n");
      out.write("            <div class=\"sec-title p-b-52 p-l-15 p-r-15\">\r\n");
      out.write("                <h3 class=\"m-text5 t-center\">\r\n");
      out.write("                    @ Siguenos en instagram\r\n");
      out.write("                </h3>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"flex-w\">\r\n");
      out.write("                <!-- Block4 -->\r\n");
      out.write("                <div class=\"block4 wrap-pic-w\">\r\n");
      out.write("                    <img src=\"imagenes/instagram_1.jpg\" alt=\"IMG-INSTAGRAM\">\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"block4-overlay sizefull ab-t-l trans-0-4\">\r\n");
      out.write("                        <span class=\"block4-overlay-heart s-text9 flex-m trans-0-4 p-l-40 p-t-25\">\r\n");
      out.write("                            <i class=\"icon_heart_alt fs-20 p-r-12\" aria-hidden=\"true\"></i>\r\n");
      out.write("                            <span class=\"p-t-2\">39</span>\r\n");
      out.write("                        </span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"block4-overlay-txt trans-0-4 p-l-40 p-r-25 p-b-30\">\r\n");
      out.write("                            <p class=\"s-text10 m-b-15 h-size1 of-hidden\">\r\n");
      out.write("                                Nullam scelerisque, lacus sed consequat laoreet, dui enim iaculis leo, eu viverra ex nulla in tellus. Nullam nec ornare tellus, ac fringilla lacus. Ut sit amet enim orci. Nam eget metus elit.\r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                            <span class=\"s-text9\">\r\n");
      out.write("                                Photo by @nancyward\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Block4 -->\r\n");
      out.write("                <div class=\"block4 wrap-pic-w\">\r\n");
      out.write("                    <img src=\"imagenes/instagram_2.jpg\" alt=\"IMG-INSTAGRAM\">\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"block4-overlay sizefull ab-t-l trans-0-4\">\r\n");
      out.write("                        <span class=\"block4-overlay-heart s-text9 flex-m trans-0-4 p-l-40 p-t-25\">\r\n");
      out.write("                            <i class=\"icon_heart_alt fs-20 p-r-12\" aria-hidden=\"true\"></i>\r\n");
      out.write("                            <span class=\"p-t-2\">39</span>\r\n");
      out.write("                        </span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"block4-overlay-txt trans-0-4 p-l-40 p-r-25 p-b-30\">\r\n");
      out.write("                            <p class=\"s-text10 m-b-15 h-size1 of-hidden\">\r\n");
      out.write("                                Nullam scelerisque, lacus sed consequat laoreet, dui enim iaculis leo, eu viverra ex nulla in tellus. Nullam nec ornare tellus, ac fringilla lacus. Ut sit amet enim orci. Nam eget metus elit.\r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                            <span class=\"s-text9\">\r\n");
      out.write("                                Photo by @nancyward\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Block4 -->\r\n");
      out.write("                <div class=\"block4 wrap-pic-w\">\r\n");
      out.write("                    <img src=\"imagenes/instagram_3.jpg\" alt=\"IMG-INSTAGRAM\">\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"block4-overlay sizefull ab-t-l trans-0-4\">\r\n");
      out.write("                        <span class=\"block4-overlay-heart s-text9 flex-m trans-0-4 p-l-40 p-t-25\">\r\n");
      out.write("                            <i class=\"icon_heart_alt fs-20 p-r-12\" aria-hidden=\"true\"></i>\r\n");
      out.write("                            <span class=\"p-t-2\">39</span>\r\n");
      out.write("                        </span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"block4-overlay-txt trans-0-4 p-l-40 p-r-25 p-b-30\">\r\n");
      out.write("                            <p class=\"s-text10 m-b-15 h-size1 of-hidden\">\r\n");
      out.write("                                Nullam scelerisque, lacus sed consequat laoreet, dui enim iaculis leo, eu viverra ex nulla in tellus. Nullam nec ornare tellus, ac fringilla lacus. Ut sit amet enim orci. Nam eget metus elit.\r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                            <span class=\"s-text9\">\r\n");
      out.write("                                Photo by @nancyward\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Block4 -->\r\n");
      out.write("                <div class=\"block4 wrap-pic-w\">\r\n");
      out.write("                    <img src=\"imagenes/instagram_4.png\" alt=\"IMG-INSTAGRAM\">\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"block4-overlay sizefull ab-t-l trans-0-4\">\r\n");
      out.write("                        <span class=\"block4-overlay-heart s-text9 flex-m trans-0-4 p-l-40 p-t-25\">\r\n");
      out.write("                            <i class=\"icon_heart_alt fs-20 p-r-12\" aria-hidden=\"true\"></i>\r\n");
      out.write("                            <span class=\"p-t-2\">39</span>\r\n");
      out.write("                        </span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"block4-overlay-txt trans-0-4 p-l-40 p-r-25 p-b-30\">\r\n");
      out.write("                            <p class=\"s-text10 m-b-15 h-size1 of-hidden\">\r\n");
      out.write("                                Nullam scelerisque, lacus sed consequat laoreet, dui enim iaculis leo, eu viverra ex nulla in tellus. Nullam nec ornare tellus, ac fringilla lacus. Ut sit amet enim orci. Nam eget metus elit.\r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                            <span class=\"s-text9\">\r\n");
      out.write("                                Photo by @nancyward\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Block4 -->\r\n");
      out.write("                <div class=\"block4 wrap-pic-w\">\r\n");
      out.write("                    <img src=\"imagenes/instagram_5.jpg\" alt=\"IMG-INSTAGRAM\">\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"#\" class=\"block4-overlay sizefull ab-t-l trans-0-4\">\r\n");
      out.write("                        <span class=\"block4-overlay-heart s-text9 flex-m trans-0-4 p-l-40 p-t-25\">\r\n");
      out.write("                            <i class=\"icon_heart_alt fs-20 p-r-12\" aria-hidden=\"true\"></i>\r\n");
      out.write("                            <span class=\"p-t-2\">39</span>\r\n");
      out.write("                        </span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"block4-overlay-txt trans-0-4 p-l-40 p-r-25 p-b-30\">\r\n");
      out.write("                            <p class=\"s-text10 m-b-15 h-size1 of-hidden\">\r\n");
      out.write("                                Nullam scelerisque, lacus sed consequat laoreet, dui enim iaculis leo, eu viverra ex nulla in tellus. Nullam nec ornare tellus, ac fringilla lacus. Ut sit amet enim orci. Nam eget metus elit.\r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                            <span class=\"s-text9\">\r\n");
      out.write("                                Photo by @nancyward\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        ");
      out.write("<!-- Footer -->\r\n");
      out.write("<footer class=\"bg6 p-t-45 p-b-43 p-l-45 p-r-45\">\r\n");
      out.write("    <div class=\"flex-w p-b-90\">\r\n");
      out.write("        <div class=\"w-size6 p-t-30 p-l-15 p-r-15 respon3\">\r\n");
      out.write("            <h4 class=\"s-text12 p-b-30\">\r\n");
      out.write("                Ponerse en contacto\r\n");
      out.write("            </h4>\r\n");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <p class=\"s-text7 w-size27\">\r\n");
      out.write("                    Any questions? Let us know in store at 8th floor, 379 Hudson St, New York, NY 10018 or call us on (+1) 96 716 6879\r\n");
      out.write("                </p>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"flex-m p-t-30\">\r\n");
      out.write("                    <a href=\"#\" class=\"fs-18 color1 p-r-20 fa fa-facebook\"></a>\r\n");
      out.write("                    <a href=\"#\" class=\"fs-18 color1 p-r-20 fa fa-instagram\"></a>\r\n");
      out.write("                    <a href=\"#\" class=\"fs-18 color1 p-r-20 fa fa-pinterest-p\"></a>\r\n");
      out.write("                    <a href=\"#\" class=\"fs-18 color1 p-r-20 fa fa-snapchat-ghost\"></a>\r\n");
      out.write("                    <a href=\"#\" class=\"fs-18 color1 p-r-20 fa fa-youtube-play\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"w-size7 p-t-30 p-l-15 p-r-15 respon4\">\r\n");
      out.write("            <h4 class=\"s-text12 p-b-30\">\r\n");
      out.write("                Categorias\r\n");
      out.write("            </h4>\r\n");
      out.write("\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li class=\"p-b-9\">\r\n");
      out.write("                    <a href=\"#\" class=\"s-text7\">\r\n");
      out.write("                        Hombre\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"p-b-9\">\r\n");
      out.write("                    <a href=\"#\" class=\"s-text7\">\r\n");
      out.write("                        Mujer\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"p-b-9\">\r\n");
      out.write("                    <a href=\"#\" class=\"s-text7\">\r\n");
      out.write("                        Para la piel\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"p-b-9\">\r\n");
      out.write("                    <a href=\"#\" class=\"s-text7\">\r\n");
      out.write("                        Cosmeticos\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"w-size7 p-t-30 p-l-15 p-r-15 respon4\">\r\n");
      out.write("            <h4 class=\"s-text12 p-b-30\">\r\n");
      out.write("                Redes Sociales\r\n");
      out.write("            </h4>\r\n");
      out.write("\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li class=\"p-b-9\">\r\n");
      out.write("                    <a href=\"#\" class=\"s-text7\">\r\n");
      out.write("                        Buscar\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"p-b-9\">\r\n");
      out.write("                    <a href=\"#\" class=\"s-text7\">\r\n");
      out.write("                        Acerca de Nosotros\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"p-b-9\">\r\n");
      out.write("                    <a href=\"#\" class=\"s-text7\">\r\n");
      out.write("                        Contactanos\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"w-size7 p-t-30 p-l-15 p-r-15 respon4\">\r\n");
      out.write("            <h4 class=\"s-text12 p-b-30\">\r\n");
      out.write("                Ayuda\r\n");
      out.write("            </h4>\r\n");
      out.write("\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li class=\"p-b-9\">\r\n");
      out.write("                    <a href=\"#\" class=\"s-text7\">\r\n");
      out.write("                        Track Order\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"p-b-9\">\r\n");
      out.write("                    <a href=\"#\" class=\"s-text7\">\r\n");
      out.write("                        Devoluciones\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"p-b-9\">\r\n");
      out.write("                    <a href=\"#\" class=\"s-text7\">\r\n");
      out.write("                        Envio\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"p-b-9\">\r\n");
      out.write("                    <a href=\"#\" class=\"s-text7\">\r\n");
      out.write("                        FAQs\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"w-size8 p-t-30 p-l-15 p-r-15 respon3\">\r\n");
      out.write("            <h4 class=\"s-text12 p-b-30\">\r\n");
      out.write("                Newsletter\r\n");
      out.write("            </h4>\r\n");
      out.write("\r\n");
      out.write("            <form>\r\n");
      out.write("                <div class=\"effect1 w-size9\">\r\n");
      out.write("                    <input class=\"s-text7 bg6 w-full p-b-5\" type=\"text\" name=\"email\" placeholder=\"email@example.com\">\r\n");
      out.write("                    <span class=\"effect1-line\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"w-size2 p-t-20\">\r\n");
      out.write("                    <!-- Button -->\r\n");
      out.write("                    <button class=\"flex-c-m size2 bg4 bo-rad-23 hov1 m-text3 trans-0-4\">\r\n");
      out.write("                        Suscribirse\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"t-center p-l-15 p-r-15\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"t-center s-text8 p-t-20\">\r\n");
      out.write("            Copyright Â© 2018 All rights reserved. | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Back to top -->\r\n");
      out.write("<div class=\"btn-back-to-top bg0-hov\" id=\"myBtn\">\r\n");
      out.write("    <span class=\"symbol-btn-back-to-top\">\r\n");
      out.write("        <i class=\"fa fa-angle-double-up\" aria-hidden=\"true\"></i>\r\n");
      out.write("    </span>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Container Selection1 -->\r\n");
      out.write("\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/animsition.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/popper.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/select2.min.js\"></script>\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/93bc7256e3.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(\".selection-1\").select2({\r\n");
      out.write("        minimumResultsForSearch: 20,\r\n");
      out.write("        dropdownParent: $('#dropDownSelect1')\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/slick.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/slick-custom.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/countdowntime.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/lightbox.min.js\"></script>\r\n");
      out.write("<script src=\"admin/js/funciones.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/sweetalert.min.js\"></script>\r\n");
      out.write("<script src=\"js/toastr.min.js\" type=\"text/javascript\"></script>>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $('.block2-btn-addcart').each(function () {\r\n");
      out.write("        var nameProduct = $(this).parent().parent().parent().find('.block2-name').html();\r\n");
      out.write("        $(this).on('click', function () {\r\n");
      out.write("            swal(nameProduct, \"is added to cart !\", \"success\");\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $('.block2-btn-addwishlist').each(function () {\r\n");
      out.write("        var nameProduct = $(this).parent().parent().parent().find('.block2-name').html();\r\n");
      out.write("        $(this).on('click', function () {\r\n");
      out.write("            swal(nameProduct, \"is added to wishlist !\", \"success\");\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/parallax100.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $('.parallax100').parallax100();\r\n");
      out.write("</script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
    _jspx_th_s_if_0.setTest("hasActionErrors()");
    int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
    if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                    <div class=\"errorDiv\" >\r\n");
        out.write("                                        ");
        if (_jspx_meth_s_actionerror_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </div>\r\n");
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

  private boolean _jspx_meth_s_actionerror_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionerror
    org.apache.struts2.views.jsp.ui.ActionErrorTag _jspx_th_s_actionerror_0 = (org.apache.struts2.views.jsp.ui.ActionErrorTag) _jspx_tagPool_s_actionerror_nobody.get(org.apache.struts2.views.jsp.ui.ActionErrorTag.class);
    _jspx_th_s_actionerror_0.setPageContext(_jspx_page_context);
    _jspx_th_s_actionerror_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    int _jspx_eval_s_actionerror_0 = _jspx_th_s_actionerror_0.doStartTag();
    if (_jspx_th_s_actionerror_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_actionerror_nobody.reuse(_jspx_th_s_actionerror_0);
      return true;
    }
    _jspx_tagPool_s_actionerror_nobody.reuse(_jspx_th_s_actionerror_0);
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
        if (_jspx_meth_s_label_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_else_0, _jspx_page_context))
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

  private boolean _jspx_meth_s_label_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_else_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_0 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_name_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_0.setPageContext(_jspx_page_context);
    _jspx_th_s_label_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_else_0);
    _jspx_th_s_label_0.setName("#session.NombreClienteCompleto");
    int _jspx_eval_s_label_0 = _jspx_th_s_label_0.doStartTag();
    if (_jspx_th_s_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_name_nobody.reuse(_jspx_th_s_label_0);
      return true;
    }
    _jspx_tagPool_s_label_name_nobody.reuse(_jspx_th_s_label_0);
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
    _jspx_th_s_if_1.setTest("#session.seccion==0");
    int _jspx_eval_s_if_1 = _jspx_th_s_if_1.doStartTag();
    if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                        <button type=\"button\" class=\"dropdown-item\" data-toggle=\"modal\" data-target=\"#loginModal\">Iniciar Sesión</button>\r\n");
        out.write("                                        <button type=\"button\" class=\"dropdown-item\" data-toggle=\"modal\" data-target=\"#registrarseModal\">Registrarse</button>\r\n");
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

  private boolean _jspx_meth_s_elseif_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_elseif_0 = (org.apache.struts2.views.jsp.ElseIfTag) _jspx_tagPool_s_elseif_test.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_elseif_0.setPageContext(_jspx_page_context);
    _jspx_th_s_elseif_0.setParent(null);
    _jspx_th_s_elseif_0.setTest("#session.seccion==1");
    int _jspx_eval_s_elseif_0 = _jspx_th_s_elseif_0.doStartTag();
    if (_jspx_eval_s_elseif_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_elseif_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_elseif_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_elseif_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_s_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_elseif_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_s_a_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_elseif_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            <button type=\"button\" class=\"dropdown-item\">Cerrar Sesión</button>\r\n");
        out.write("\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_s_elseif_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_elseif_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_elseif_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_elseif_test.reuse(_jspx_th_s_elseif_0);
      return true;
    }
    _jspx_tagPool_s_elseif_test.reuse(_jspx_th_s_elseif_0);
    return false;
  }

  private boolean _jspx_meth_s_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_elseif_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_elseif_0);
    _jspx_th_s_url_0.setId("lnkbuscar");
    _jspx_th_s_url_0.setAction("buscarClie");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_eval_s_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_s_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_s_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_s_url_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_id_action.reuse(_jspx_th_s_url_0);
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
    _jspx_th_s_param_0.setValue("#session.idClie");
    _jspx_th_s_param_0.setName("cliente.idCliente");
    int _jspx_eval_s_param_0 = _jspx_th_s_param_0.doStartTag();
    if (_jspx_th_s_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_0);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_0);
    return false;
  }

  private boolean _jspx_meth_s_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_1 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_1.setPageContext(_jspx_page_context);
    _jspx_th_s_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_0);
    _jspx_th_s_param_1.setValue("1");
    _jspx_th_s_param_1.setName("op");
    int _jspx_eval_s_param_1 = _jspx_th_s_param_1.doStartTag();
    if (_jspx_th_s_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_1);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_1);
    return false;
  }

  private boolean _jspx_meth_s_a_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_elseif_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href_cssClass.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_0.setPageContext(_jspx_page_context);
    _jspx_th_s_a_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_elseif_0);
    _jspx_th_s_a_0.setHref("%{lnkbuscar}");
    _jspx_th_s_a_0.setCssClass("dropdown-item");
    int _jspx_eval_s_a_0 = _jspx_th_s_a_0.doStartTag();
    if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_0.doInitBody();
      }
      do {
        out.write("Mi cuenta");
        int evalDoAfterBody = _jspx_th_s_a_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href_cssClass.reuse(_jspx_th_s_a_0);
      return true;
    }
    _jspx_tagPool_s_a_href_cssClass.reuse(_jspx_th_s_a_0);
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

  private boolean _jspx_meth_s_iterator_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent(null);
    _jspx_th_s_iterator_0.setValue("lstCategoria");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_s_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                        <ul class=\"dropdown-menu\">\r\n");
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_s_iterator_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                        </ul>\r\n");
        out.write("                                    </li>\r\n");
        out.write("                                \r\n");
        out.write("                            ");
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

  private boolean _jspx_meth_s_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_2 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_2.setPageContext(_jspx_page_context);
    _jspx_th_s_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_if_2.setTest("idCategoria==categoriaSuperior");
    int _jspx_eval_s_if_2 = _jspx_th_s_if_2.doStartTag();
    if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                    <li class=\"dropdown-submenu\"><a class=\"dropdown-item dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_2, _jspx_page_context))
          return true;
        out.write("</a>\r\n");
        out.write("                                        ");
        if (_jspx_meth_s_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_2, _jspx_page_context))
          return true;
        out.write(" \r\n");
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

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_2);
    _jspx_th_s_property_0.setValue("nombre");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_set_0 = (org.apache.struts2.views.jsp.SetTag) _jspx_tagPool_s_set_var_value_nobody.get(org.apache.struts2.views.jsp.SetTag.class);
    _jspx_th_s_set_0.setPageContext(_jspx_page_context);
    _jspx_th_s_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_2);
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

  private boolean _jspx_meth_s_iterator_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_1 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_1.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_iterator_1.setValue("lstCategoria");
    int _jspx_eval_s_iterator_1 = _jspx_th_s_iterator_1.doStartTag();
    if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_s_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                            ");
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
    _jspx_th_s_if_3.setTest("idCategoria!=categoriaSuperior&&categoriaSuperior==#idCat");
    int _jspx_eval_s_if_3 = _jspx_th_s_if_3.doStartTag();
    if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                                    <a class=\"dropdown-item\" href=\"#\">");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_3, _jspx_page_context))
          return true;
        out.write("</a>\r\n");
        out.write("                                                ");
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

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_3);
    _jspx_th_s_property_1.setValue("nombre");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_iterator_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_2 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_2.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_2.setParent(null);
    _jspx_th_s_iterator_2.setValue("lstMarca");
    int _jspx_eval_s_iterator_2 = _jspx_th_s_iterator_2.doStartTag();
    if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                <a class=\"dropdown-item\" href=\"#\">");
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("</a>\r\n");
        out.write("                            ");
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

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_2.setValue("nombre");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
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
        out.write("                        <div class=\"form-group\">\r\n");
        out.write("                            <label for=\"Email\">Correo Electronico</label>\r\n");
        out.write("                            ");
        if (_jspx_meth_s_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"form-group\">\r\n");
        out.write("                            <label for=\"Password\">Password</label>\r\n");
        out.write("                            ");
        if (_jspx_meth_s_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"form-group\">\r\n");
        out.write("                            <div class=\"form-check\">\r\n");
        out.write("                                <input type=\"checkbox\" class=\"form-check-input ml-0\" id=\"dropdownCheck\">\r\n");
        out.write("                                <label class=\"form-check-label\" for=\"Check\">\r\n");
        out.write("                                    Recordar Contraseña\r\n");
        out.write("                                </label>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("\r\n");
        out.write("                        ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                    ");
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
    _jspx_th_s_submit_0.setCssClass("btn btn-primary  toastrDefaultError");
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
        out.write("                        <div class=\"input-group mb-3 mt-3\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_textfield_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"input-group mb-3\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_textfield_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"input-group mb-3\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_textfield_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"input-group mb-3\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_password_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"input-group mb-3\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_password_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"row\">\r\n");
        out.write("                            <!-- /.col -->\r\n");
        out.write("                            <div class=\"col-8\">\r\n");
        out.write("                                <div class=\"icheck-primary\">\r\n");
        out.write("                                    <input type=\"checkbox\" id=\"agreeTerms\" name=\"terms\" value=\"agree\">\r\n");
        out.write("                                    <label for=\"agreeTerms\">\r\n");
        out.write("                                        Acepto los  <a href=\"#\">Terminos</a>\r\n");
        out.write("                                    </label>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"col-4\">\r\n");
        out.write("                                ");
        if (_jspx_meth_s_submit_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <!-- /.col -->\r\n");
        out.write("                        </div>\r\n");
        out.write("                    ");
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
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_1 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_id_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_1.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_submit_1.setId("enviar");
    _jspx_th_s_submit_1.setCssClass("btn btn-primary btn-block toastrDefaultError");
    _jspx_th_s_submit_1.setValue("Enviar");
    int _jspx_eval_s_submit_1 = _jspx_th_s_submit_1.doStartTag();
    if (_jspx_th_s_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_id_cssClass_nobody.reuse(_jspx_th_s_submit_1);
      return true;
    }
    _jspx_tagPool_s_submit_value_id_cssClass_nobody.reuse(_jspx_th_s_submit_1);
    return false;
  }

  private boolean _jspx_meth_s_property_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_3.setPageContext(_jspx_page_context);
    _jspx_th_s_property_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_property_3.setValue("imagen");
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }

  private boolean _jspx_meth_s_property_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_4 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_4.setPageContext(_jspx_page_context);
    _jspx_th_s_property_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_property_4.setValue("nombre");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_s_property_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_5 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_5.setPageContext(_jspx_page_context);
    _jspx_th_s_property_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_property_5.setValue("precioVenta");
    int _jspx_eval_s_property_5 = _jspx_th_s_property_5.doStartTag();
    if (_jspx_th_s_property_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
    return false;
  }
}
