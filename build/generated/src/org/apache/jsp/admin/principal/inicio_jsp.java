package org.apache.jsp.admin.principal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/admin/principal/sidebar.jsp");
    _jspx_dependants.add("/admin/principal/header.jsp");
    _jspx_dependants.add("/admin/principal/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_label_name_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_label_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_label_name_nobody.release();
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

      out.write("<!-- Main Sidebar Container -->\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <title>AdminLTE 3 | Blank Page</title>\r\n");
      out.write("  <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link href=\"../css/all.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\">\r\n");
      out.write(" \r\n");
      out.write("  <link href=\"../css/adminlte.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write(" \r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("  <!-- overlayScrollbars -->\r\n");
      out.write(" \r\n");
      out.write("  <!-- Google Font: Source Sans Pro -->\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition sidebar-mini\">\r\n");
      out.write("<!-- Site wrapper -->\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("  <!-- Navbar -->\r\n");
      out.write("  <nav class=\"main-header navbar navbar-expand navbar-white navbar-light\">\r\n");
      out.write("    <!-- Left navbar links -->\r\n");
      out.write("    <ul class=\"navbar-nav\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" data-widget=\"pushmenu\" href=\"#\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item d-none d-sm-inline-block\">\r\n");
      out.write("        <a href=\"Principal.jsp\" class=\"nav-link\">Inicio</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item d-none d-sm-inline-block\">\r\n");
      out.write("        <a href=\"#\" class=\"nav-link\">Contacto</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <!-- SEARCH FORM -->\r\n");
      out.write("    <form class=\"form-inline ml-3\">\r\n");
      out.write("      <div class=\"input-group input-group-sm\">\r\n");
      out.write("        <input class=\"form-control form-control-navbar\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("        <div class=\"input-group-append\">\r\n");
      out.write("          <button class=\"btn btn-navbar\" type=\"submit\">\r\n");
      out.write("            <i class=\"fa fa-search\"></i>\r\n");
      out.write("          </button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <!-- Right navbar links -->\r\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("      <!-- Messages Dropdown Menu -->\r\n");
      out.write("      <li class=\"nav-item dropdown\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\"  \r\n");
      out.write("           id=\"cerrarsesion\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("         Administrador: ");
      if (_jspx_meth_s_label_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-right\"\r\n");
      out.write("             aria-labelledby=\"#cerrarsesion\" >\r\n");
      out.write("            <a  href=\"Login.jsp\" class=\"dropdown-item\">Cerrar Sesion</a>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("     </ul>\r\n");
      out.write("      \r\n");
      out.write("  </nav>\r\n");
      out.write("  <!-- /.navbar -->");
      out.write("\r\n");
      out.write("<aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\r\n");
      out.write("    <!-- Brand Logo -->\r\n");
      out.write("    <a href=\"../../index3.html\" class=\"brand-link\">\r\n");
      out.write("        <img src=\"../imagenes/nego.png\"\r\n");
      out.write("           alt=\"AdminLTE Logo\"\r\n");
      out.write("           class=\"brand-image img-circle elevation-3\"\r\n");
      out.write("           style=\"opacity: .8\">\r\n");
      out.write("      <span class=\"brand-text font-weight-light\">W&V S.A.C</span>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Sidebar -->\r\n");
      out.write("    <div class=\"sidebar\">\r\n");
      out.write("      <!-- Sidebar user (optional) -->\r\n");
      out.write("      <div class=\"user-panel mt-3 pb-3 mb-3 d-flex\">\r\n");
      out.write("        <div class=\"image\">\r\n");
      out.write("            <img src=\"../imagenes/8.jpg\" class=\"img-circle elevation-2\" alt=\"User Image\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"info\">\r\n");
      out.write("            <a href=\"#\" class=\"d-block\">");
      if (_jspx_meth_s_label_1(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_s_label_2(_jspx_page_context))
        return;
      out.write("</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Sidebar Menu -->\r\n");
      out.write("      <nav class=\"mt-2\">\r\n");
      out.write("        <ul class=\"nav nav-pills nav-sidebar flex-column\" data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\r\n");
      out.write("          <!-- Add icons to the links using the .nav-icon class\r\n");
      out.write("               with font-awesome or any other icon font library -->\r\n");
      out.write("          <li class=\"nav-item has-treeview\">\r\n");
      out.write("             <a href=\"RedireccionVentas\" class=\"nav-link\">\r\n");
      out.write("                 <i class=\"nav-icon fas fa-cash-register\"></i>\r\n");
      out.write("                  <p>Pedidos</p>\r\n");
      out.write("                </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          \r\n");
      out.write("          <li class=\"nav-item has-treeview\">\r\n");
      out.write("            <a href=\"#\" class=\"nav-link\">\r\n");
      out.write("              <i class=\"nav-icon fas fa-warehouse\"></i>\r\n");
      out.write("              <p>\r\n");
      out.write("                Almacen\r\n");
      out.write("                <i class=\"fa fa-angle-left right\"></i> \r\n");
      out.write("               \r\n");
      out.write("              </p>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"nav nav-treeview\">\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"producto\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"fas fa-list nav-icon\"></i>\r\n");
      out.write("                  <p>Marcas</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"registrarProducto.jsp\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"fas fa-pen-square nav-icon\"></i>\r\n");
      out.write("                  <p>Categorías</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"listarAdmin\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"fas fa-list nav-icon\"></i>\r\n");
      out.write("                  <p>Productos</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item has-treeview\">\r\n");
      out.write("            <a href=\"#\" class=\"nav-link\">\r\n");
      out.write("              <i class=\"nav-icon fas fa-people-arrows\"></i>\r\n");
      out.write("              <p>\r\n");
      out.write("                Clientes\r\n");
      out.write("              </p>\r\n");
      out.write("            </a>\r\n");
      out.write("            \r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item has-treeview\">\r\n");
      out.write("              <a  href=\"listarAdmin\" class=\"nav-link menu\">\r\n");
      out.write("              <i class=\"nav-icon fas fa-users\"></i>\r\n");
      out.write("              <p>\r\n");
      out.write("                Administradores\r\n");
      out.write("              </p>\r\n");
      out.write("            </a>\r\n");
      out.write("              </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      </nav>\r\n");
      out.write("      <!-- /.sidebar-menu -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.sidebar -->\r\n");
      out.write("  </aside>");
      out.write("\r\n");
      out.write("  <!-- fin Main sidebar container -->\r\n");
      out.write("  <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("  <div class=\"content-wrapper\">\r\n");
      out.write("    <!-- Content Header (Page header) -->\r\n");
      out.write("    <section class=\"content-header\" id=\"sectionAjax\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row mb-2\">\r\n");
      out.write("          <div class=\"col-sm-6\">\r\n");
      out.write("            <h1>Blank Page</h1>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-sm-6\">\r\n");
      out.write("            <ol class=\"breadcrumb float-sm-right\">\r\n");
      out.write("              <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\r\n");
      out.write("              <li class=\"breadcrumb-item active\">Pagina Inicio</li>\r\n");
      out.write("            </ol>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div><!-- /.container-fluid -->\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- /.content -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.content-wrapper -->\r\n");
      out.write("  \r\n");
      out.write("  <!-- Footer -->\r\n");
      out.write("  ");
      out.write("<footer class=\"main-footer\">\r\n");
      out.write("    <div class=\"float-right d-none d-sm-block\">\r\n");
      out.write("      <b>Version</b> 1.0.1\r\n");
      out.write("    </div>\r\n");
      out.write("    <strong>Copyright &copy; 2014-2019 <a href=\"http://adminlte.io\">W&V S.A.C</a>.</strong> All rights\r\n");
      out.write("    reserved.\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("  <!-- Control Sidebar -->\r\n");
      out.write("  <aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("    <!-- Control sidebar content goes here -->\r\n");
      out.write("  </aside>\r\n");
      out.write("  <!-- /.control-sidebar -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 4 -->\r\n");
      out.write("<script src=\"../js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"../js/adminlte.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE for demo purposes -->\r\n");
      out.write("<script src=\"../js/demo.js\"></script>\r\n");
      out.write("\r\n");
      out.write(" <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>   \r\n");
      out.write("<script src=\"https://kit.fontawesome.com/93bc7256e3.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write(" \r\n");
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

  private boolean _jspx_meth_s_label_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_0 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_name_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_0.setPageContext(_jspx_page_context);
    _jspx_th_s_label_0.setParent(null);
    _jspx_th_s_label_0.setName("admin.nombre");
    int _jspx_eval_s_label_0 = _jspx_th_s_label_0.doStartTag();
    if (_jspx_th_s_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_name_nobody.reuse(_jspx_th_s_label_0);
      return true;
    }
    _jspx_tagPool_s_label_name_nobody.reuse(_jspx_th_s_label_0);
    return false;
  }

  private boolean _jspx_meth_s_label_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_1 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_name_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_1.setPageContext(_jspx_page_context);
    _jspx_th_s_label_1.setParent(null);
    _jspx_th_s_label_1.setName("adminLog.nombres");
    int _jspx_eval_s_label_1 = _jspx_th_s_label_1.doStartTag();
    if (_jspx_th_s_label_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_name_nobody.reuse(_jspx_th_s_label_1);
      return true;
    }
    _jspx_tagPool_s_label_name_nobody.reuse(_jspx_th_s_label_1);
    return false;
  }

  private boolean _jspx_meth_s_label_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_2 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_name_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_2.setPageContext(_jspx_page_context);
    _jspx_th_s_label_2.setParent(null);
    _jspx_th_s_label_2.setName("adminLog.apellidos");
    int _jspx_eval_s_label_2 = _jspx_th_s_label_2.doStartTag();
    if (_jspx_th_s_label_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_name_nobody.reuse(_jspx_th_s_label_2);
      return true;
    }
    _jspx_tagPool_s_label_name_nobody.reuse(_jspx_th_s_label_2);
    return false;
  }
}
