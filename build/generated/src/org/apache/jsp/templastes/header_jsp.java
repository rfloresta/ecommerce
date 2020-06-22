package org.apache.jsp.templastes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_actionerror_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_label_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_theme_styleId_id_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_else;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_actionerror_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_label_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_theme_styleId_id_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_else = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_actionerror_nobody.release();
    _jspx_tagPool_s_label_name_nobody.release();
    _jspx_tagPool_s_submit_value_styleId_id_cssClass_nobody.release();
    _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.release();
    _jspx_tagPool_s_form_theme_styleId_id_action.release();
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_s_else.release();
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>W&V</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"imagenes/favicon.png\"/>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/themify-icons.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/icon-font.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/hamburgers.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"css/animsition.min.css\">-->\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/select2.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/daterangepicker.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/slick.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/lightbox.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link href=\"css/toastr.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"\">\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg fixed-top navbar-black p-t-26\">\n");
      out.write("\n");
      out.write("            <!-- Logo2 -->\n");
      out.write("            <div class=\"container-fluid d-block\">\n");
      out.write("                <div class=\"row w-100 justify-content-between  \">\n");
      out.write("                    <div class=\"col-md-4 redes-sociales \">\n");
      out.write("                        <a href=\"#\" class=\"topbar-social-item fa fa-facebook\"></a>\n");
      out.write("                        <a href=\"#\" class=\"topbar-social-item fa fa-instagram\"></a>\n");
      out.write("                        <a href=\"#\" class=\"topbar-social-item fa fa-pinterest-p\"></a>\n");
      out.write("                        <a href=\"#\" class=\"topbar-social-item fa fa-snapchat-ghost\"></a>\n");
      out.write("                        <a href=\"#\" class=\"topbar-social-item fa fa-youtube-play\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-6 col-md-4 text-center\">\n");
      out.write("                        <a href=\"index.html\" class=\"logo2 font-weight-bold  \">\n");
      out.write("                            W&V Negocios y Servicios S.A.C\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-4  col-md-4\">\n");
      out.write("                        <div class=\"topbar-child2\">\n");
      out.write("                            <span class=\"topbar-email\">\n");
      out.write("                                ");
      if (_jspx_meth_s_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_s_else_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            </span>\n");
      out.write("\n");
      out.write("                            <div class=\"dropdown ml-md-3\">\n");
      out.write("                                <button  class=\"dropdown-toggle\" type=\"button\" id=\"dropdownUsuario\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <img src=\"imagenes/icon-header-01.png\" class=\"header-icon1\" alt=\"ICON\">\n");
      out.write("                                </button>\n");
      out.write("                                <div class=\"dropdown-menu \" aria-labelledby=\"dropdownUsuario\" >\n");
      out.write("                                    ");
      if (_jspx_meth_s_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_s_else_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <span class=\"linedivide1\"></span>\n");
      out.write("                            <div class=\"header-wrapicon2 m-r-10\">\n");
      out.write("                                <!--Logo de Carrito de compras-->\n");
      out.write("                                <img src=\"imagenes/icon-header-02.png\" class=\"header-icon1 js-show-header-dropdown\" alt=\"ICON\">\n");
      out.write("                                <span class=\"header-icons-noti\">0</span>\n");
      out.write("\n");
      out.write("                                <!--Contenido de Carrito de compras-->\n");
      out.write("                                <div class=\"header-cart header-dropdown\">\n");
      out.write("                                    <ul class=\"header-cart-wrapitem\">\n");
      out.write("                                        <li class=\"header-cart-item\">\n");
      out.write("                                            <div class=\"d-none d-md-block header-cart-item-img\">\n");
      out.write("                                                <img src=\"imagenes/item-cart-01.jpg\" alt=\"IMG\">\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"header-cart-item-txt\">\n");
      out.write("                                                <a href=\"#\" class=\"header-cart-item-name\">\n");
      out.write("                                                    White Shirt With Pleat Detail Back\n");
      out.write("                                                </a>\n");
      out.write("\n");
      out.write("                                                <span class=\"header-cart-item-info\">\n");
      out.write("                                                    1 x $19.00\n");
      out.write("                                                </span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </li>\n");
      out.write("\n");
      out.write("                                        <li class=\"header-cart-item\">\n");
      out.write("                                            <div class=\"d-none d-md-block header-cart-item-img\">\n");
      out.write("                                                <img src=\"imagenes/item-cart-02.jpg\" alt=\"IMG\">\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"header-cart-item-txt\">\n");
      out.write("                                                <a href=\"#\" class=\"header-cart-item-name\">\n");
      out.write("                                                    Converse All Star Hi Black Canvas\n");
      out.write("                                                </a>\n");
      out.write("\n");
      out.write("                                                <span class=\"header-cart-item-info\">\n");
      out.write("                                                    1 x $39.00\n");
      out.write("                                                </span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </li>\n");
      out.write("\n");
      out.write("                                        <li class=\"header-cart-item\">\n");
      out.write("                                            <div class=\"d-none d-md-block header-cart-item-img\">\n");
      out.write("                                                <img src=\"imagenes/item-cart-03.jpg\" alt=\"IMG\">\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"header-cart-item-txt\">\n");
      out.write("                                                <a href=\"#\" class=\"header-cart-item-name\">\n");
      out.write("                                                    Nixon Porter Leather Watch In Tan\n");
      out.write("                                                </a>\n");
      out.write("\n");
      out.write("                                                <span class=\"header-cart-item-info\">\n");
      out.write("                                                    1 x $17.00\n");
      out.write("                                                </span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("\n");
      out.write("                                    <div class=\"header-cart-total\">\n");
      out.write("                                        Total: $75.00\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"header-cart-buttons\">\n");
      out.write("                                        <div class=\"header-cart-wrapbtn\">\n");
      out.write("                                            Button \n");
      out.write("                                            <a href=\"cart.html\" class=\"flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4\">\n");
      out.write("                                                View Cart\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"header-cart-wrapbtn\">\n");
      out.write("                                            Button \n");
      out.write("                                            <a href=\"#\" class=\"flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4\">\n");
      out.write("                                                Check Out\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#nav-principal\" aria-expanded=\"true\" aria-label=\"Navegación Principal\">\n");
      out.write("                        <i class=\"fa fa-bars\" style=\"font-size:1.5rem;\"></i>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"nav-principal\" class=\"navbar-collapse mt-3 mt-lg-0 collapse \" style=\"\">\n");
      out.write("                    <!-- Menu -->\n");
      out.write("                    <nav class=\"navegacion-principal nav justify-content-center container\n");
      out.write("                         flex-column flex-lg-row text-center\" id=\"menu-principal\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <a href=\"index.html\" class=\"nav-link\">Home</a>\n");
      out.write("\n");
      out.write("                        <div class=\"dropdown drophover\">\n");
      out.write("                            <a href=\"#\" class=\"nav-link\" id=\"dropCate\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Categoría</a>\n");
      out.write("\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"dropCate\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"dropdown drophover\">\n");
      out.write("                            <a href=\"#\" class=\"nav-link\" id=\"dropMarca\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Marca</a>\n");
      out.write("\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"dropMarca\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <a href=\"cart.html\" class=\"nav-link\">Caracteristicas</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <a href=\"blog.html\" class=\"nav-link\">Blog</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <a href=\"about.html\" class=\"nav-link\">Acerca de</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <a href=\"contact.html\" class=\"nav-link\">Contacto</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        <!-- Header -->\n");
      out.write("\n");
      out.write("        <!--Inicio Modal Para inicio de sesión -->\n");
      out.write("        <div class=\"modal fade\" id=\"loginModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header justify-content-center border-bottom-0\">\n");
      out.write("                        <div class=\"social-auth-links text-center  mb-3 mt-4\">\n");
      out.write("                            <a href=\"#\" class=\"btn  btn-primary my-3 my-md-0\">\n");
      out.write("                                <i class=\"fa fa-facebook mr-2\"></i> Sign in using Facebook\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#\" class=\"btn  btn-danger\">\n");
      out.write("                                <i class=\"fa fa-google-plus mr-2\"></i> Sign in using Google+\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body pt-0\">\n");
      out.write("                        <p class=\"text-center\">- OR -</p>\n");
      out.write("                        ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Olvidaste tu contraseña?</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Fin Modal Para inicio de sesión -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Inicio Modal Para Registrarse-->\n");
      out.write("        <div class=\"modal fade\" id=\"registrarseModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header justify-content-center border-bottom-0\">\n");
      out.write("                        <div class=\"social-auth-links text-center  mb-3 mt-4\">\n");
      out.write("                            <a href=\"#\" class=\"btn  btn-primary my-3 my-md-0\">\n");
      out.write("                                <i class=\"fa fa-facebook mr-2\"></i> Sign in using Facebook\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#\" class=\"btn  btn-danger\">\n");
      out.write("                                <i class=\"fa fa-google-plus mr-2\"></i> Sign in using Google+\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body pt-0\">\n");
      out.write("                        <p class=\"text-center\">- OR -</p>\n");
      out.write("                        <form action=\"#\" method=\"post\">\n");
      out.write("                            <div class=\"input-group mb-3 mt-3\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Full name\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group mb-3\">\n");
      out.write("                                <input type=\"email\" class=\"form-control\" placeholder=\"Email\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group mb-3\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group mb-3\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" placeholder=\"Retype password\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-8\">\n");
      out.write("                                    <div class=\"icheck-primary\">\n");
      out.write("                                        <input type=\"checkbox\" id=\"agreeTerms\" name=\"terms\" value=\"agree\">\n");
      out.write("                                        <label for=\"agreeTerms\">\n");
      out.write("                                            Acepto los  <a href=\"#\">Terminos</a>\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.col -->\n");
      out.write("                                <div class=\"col-4\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary btn-block\">Enviar</button>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.col -->\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Fin Modal Para Registrarse -->");
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
        out.write("\n");
        out.write("                                    <div class=\"errorDiv\" >\n");
        out.write("                                        ");
        if (_jspx_meth_s_actionerror_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    </div>\n");
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
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_s_label_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_else_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
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
    _jspx_th_s_if_1.setTest("clienteLog.Nombres.equals('')");
    int _jspx_eval_s_if_1 = _jspx_th_s_if_1.doStartTag();
    if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                        <button type=\"button\" class=\"dropdown-item\" data-toggle=\"modal\" data-target=\"#loginModal\">Iniciar Sesión</button>\n");
        out.write("                                        <button type=\"button\" class=\"dropdown-item\" data-toggle=\"modal\" data-target=\"#registrarseModal\">Registrarse</button>\n");
        out.write("                                        \n");
        out.write("\n");
        out.write("\n");
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
        out.write("\n");
        out.write("\n");
        out.write("                                        <button type=\"button\" class=\"dropdown-item\" data-toggle=\"modal\" data-target=\"#loginModal\">Ver perfil</button>\n");
        out.write("                                        <button type=\"button\" class=\"dropdown-item\" data-toggle=\"modal\" data-target=\"#registrarseModal\">Cerrar Sesión</button>\n");
        out.write("\n");
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
        out.write("\n");
        out.write("                            <div class=\"form-group\">\n");
        out.write("                                <label for=\"Email\">Correo Electronico</label>\n");
        out.write("                                ");
        if (_jspx_meth_s_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"form-group\">\n");
        out.write("                                    <label for=\"Password\">Password</label>\n");
        out.write("                                ");
        if (_jspx_meth_s_textfield_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"form-group\">\n");
        out.write("                                    <div class=\"form-check\">\n");
        out.write("                                        <input type=\"checkbox\" class=\"form-check-input ml-0\" id=\"dropdownCheck\">\n");
        out.write("                                        <label class=\"form-check-label\" for=\"Check\">\n");
        out.write("                                            Recordar Contraseña\n");
        out.write("                                        </label>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
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
    _jspx_th_s_textfield_0.setName("clienteLog.email");
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

  private boolean _jspx_meth_s_textfield_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_1.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_1.setCssClass("form-control");
    _jspx_th_s_textfield_1.setName("clienteLog.password");
    _jspx_th_s_textfield_1.setId("password");
    _jspx_th_s_textfield_1.setDynamicAttribute(null, "placeholder", new String("Ingrese Password"));
    int _jspx_eval_s_textfield_1 = _jspx_th_s_textfield_1.doStartTag();
    if (_jspx_th_s_textfield_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_textfield_1);
      return true;
    }
    _jspx_tagPool_s_textfield_placeholder_name_id_cssClass_nobody.reuse(_jspx_th_s_textfield_1);
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
}
