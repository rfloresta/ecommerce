package org.apache.jsp.admin.principal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class administrador_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/admin/principal/sidebar.jsp");
    _jspx_dependants.add("/admin/principal/header.jsp");
    _jspx_dependants.add("/admin/principal/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_a_href_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_label_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_theme_id_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_id_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_a_href_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_label_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_theme_id_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_id_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody.release();
    _jspx_tagPool_s_a_href_cssClass.release();
    _jspx_tagPool_s_label_name_nobody.release();
    _jspx_tagPool_s_submit_value_id_cssClass_nobody.release();
    _jspx_tagPool_s_iterator_value.release();
    _jspx_tagPool_s_param_value_name_nobody.release();
    _jspx_tagPool_s_form_theme_id_action.release();
    _jspx_tagPool_s_property_value_nobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <title>AdminLTE 3 | Blank Page</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link href=\"../css/all.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\">\r\n");
      out.write(" \r\n");
      out.write("  <link href=\"../css/adminlte.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("  \r\n");
      out.write("  <!-- Datatables -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"//cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css\" >\r\n");
      out.write("  \r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("  <!-- overlayScrollbars -->\r\n");
      out.write(" \r\n");
      out.write("  <!-- Mis Estilos -->\r\n");
      out.write("  <link href=\"../css/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("  <!-- Google Font: Source Sans Pro -->\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700\" rel=\"stylesheet\">\r\n");
      out.write("  \r\n");
      out.write("\r\n");
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
      out.write("            <a  href=\"login.jsp\" class=\"dropdown-item\">Cerrar Sesion</a>\r\n");
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
      out.write("                <a href=\"listarMarca\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"fas fa-list nav-icon\"></i>\r\n");
      out.write("                  <p>Marcas</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"listarCate\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"fas fa-pen-square nav-icon\"></i>\r\n");
      out.write("                  <p>Categorías</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"listarProducto\" class=\"nav-link\">\r\n");
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
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("      </nav>\r\n");
      out.write("      <!-- /.sidebar-menu -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.sidebar -->\r\n");
      out.write("  </aside>");
      out.write("\r\n");
      out.write("<div class=\"content-wrapper\">\r\n");
      out.write("    <!-- Content Header (Page header) -->\r\n");
      out.write("    <section class=\"content-header\" id=\"sectionAjax\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row mb-2\">\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("                <h1 class=\"text-uppercase font-weight-bold\">Mantenimiento Administrador</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("                <ol class=\"breadcrumb float-sm-right\">\r\n");
      out.write("                    <li class=\"breadcrumb-item\"><a href=\"#\">Inicio</a></li>\r\n");
      out.write("                    <li class=\"breadcrumb-item active\">Administradores</li>\r\n");
      out.write("                </ol>\r\n");
      out.write("            </div>  \r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"content\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"card card-text\">\r\n");
      out.write("                        <div class=\"card-header\">\r\n");
      out.write("                            <h3 class=\"card-title text-uppercase font-weight-bold\">Resgistro/Edición</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("   \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <div class=\"card card-text\">\r\n");
      out.write("                        <div class=\"card-header\">\r\n");
      out.write("                            <h3 class=\"card-title text-uppercase font-weight-bold\">Listado</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"table-responsive table-centered\">\r\n");
      out.write("                                <table id=\"datos\" class=\"table w-100\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr class=\"\">\r\n");
      out.write("                                            <th>DNI</th>\r\n");
      out.write("                                            <th>Nombres</th>\r\n");
      out.write("                                            <th>Apellidos</th>\r\n");
      out.write("                                            <th>Password</th>\r\n");
      out.write("                                            <th>Opciones</th>\r\n");
      out.write("                                        </tr> \r\n");
      out.write("                                    </thead>     \r\n");
      out.write("                                    <tbody>\r\n");
      out.write("                                        ");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("\r\n");
      out.write("                                    <tfoot>\r\n");
      out.write("                                    <th>DNI</th>\r\n");
      out.write("                                    <th>Nombres</th>\r\n");
      out.write("                                    <th>Apellidos</th>\r\n");
      out.write("                                    <th>Password</th>\r\n");
      out.write("                                    <th>Opciones</th>\r\n");
      out.write("                                    </tfoot>\r\n");
      out.write("\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </row>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("</div>\r\n");
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
      out.write("<script src=\"//cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"../js/funciones.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    \r\n");
      out.write("function  cargaTablajQuery()\r\n");
      out.write("{\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        $('#datos').addClass( 'nowrap' ).DataTable({\r\n");
      out.write("            responsive: true,\r\n");
      out.write("            \r\n");
      out.write("            \"language\": {\r\n");
      out.write("                \"sProcessing\": \"Procesando...\",\r\n");
      out.write("                \"sLengthMenu\": \"Mostrar _MENU_ registros\",\r\n");
      out.write("                \"sZeroRecords\": \"No se encontraron resultados\",\r\n");
      out.write("                \"sEmptyTable\": \"Ningun dato disponible en esta tabla\",\r\n");
      out.write("                \"sInfo\": \"Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros\",\r\n");
      out.write("                \"sInfoEmpty\": \"Mostrando registros del 0 al 0 de un total de 0 registros\",\r\n");
      out.write("                \"sInfoFiltered\": \"(filtrado de un total de _MAX_ registros)\",\r\n");
      out.write("                \"sInfoPostFix\": \"\",\r\n");
      out.write("                \"sSearch\": \"Buscar:\",\r\n");
      out.write("                \"sUrl\": \"\",\r\n");
      out.write("                \"sInfoThousands\": \",\",\r\n");
      out.write("                \"sLoadingRecords\": \"Cargando...\",\r\n");
      out.write("                \"oPaginate\": {\r\n");
      out.write("                    \"sFirst\": \"Primero\",\r\n");
      out.write("                    \"sLast\": \"Utimo\",\r\n");
      out.write("                    \"sNext\": \"Siguiente\",\r\n");
      out.write("                    \"sPrevious\": \"Anterior\"\r\n");
      out.write("                },\r\n");
      out.write("                \"oAria\": {\r\n");
      out.write("                    \"sSortAscending\": \": Activar para ordenar la columna de manera ascendente\",\r\n");
      out.write("                    \"sSortDescending\": \": Activar para ordenar la columna de manera descendente\"\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("cargaTablajQuery();\r\n");
      out.write("</script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
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
    _jspx_th_s_label_0.setName("adminLog.nombres");
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

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_theme_id_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setId("form_mante");
    _jspx_th_s_form_0.setAction("%{(edit==1)? 'actualizarAdmin': 'registrarAdmin'}");
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
        out.write("\r\n");
        out.write("                            <div class=\"card-body\">\r\n");
        out.write("                                <div class=\"form-group\">\r\n");
        out.write("                                    <label for=\"inputDni\">Dni</label>\r\n");
        out.write("                                    ");
        if (_jspx_meth_s_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"form-group\">\r\n");
        out.write("                                    <label for=\"inputDni\">Nombres</label>\r\n");
        out.write("                                    ");
        if (_jspx_meth_s_textfield_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"form-group\">\r\n");
        out.write("                                    <label for=\"inputDni\">Apellidos</label>\r\n");
        out.write("                                    ");
        if (_jspx_meth_s_textfield_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"form-group\">\r\n");
        out.write("                                    <label for=\"inputDni\">Password</label>\r\n");
        out.write("                                    ");
        if (_jspx_meth_s_textfield_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </div> \r\n");
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("\r\n");
        out.write("                            <div class=\"card-footer\">\r\n");
        out.write("                                ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
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
      _jspx_tagPool_s_form_theme_id_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_theme_id_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_0.setName("admin.dni");
    _jspx_th_s_textfield_0.setCssClass("form-control ");
    _jspx_th_s_textfield_0.setDynamicAttribute(null, "placeholder", new String("Ingrese Dni"));
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody.reuse(_jspx_th_s_textfield_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_1.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_1.setName("admin.nombres");
    _jspx_th_s_textfield_1.setCssClass("form-control");
    _jspx_th_s_textfield_1.setDynamicAttribute(null, "placeholder", new String("Ingrese Nombre"));
    int _jspx_eval_s_textfield_1 = _jspx_th_s_textfield_1.doStartTag();
    if (_jspx_th_s_textfield_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody.reuse(_jspx_th_s_textfield_1);
      return true;
    }
    _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody.reuse(_jspx_th_s_textfield_1);
    return false;
  }

  private boolean _jspx_meth_s_textfield_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_2.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_2.setName("admin.apellidos");
    _jspx_th_s_textfield_2.setCssClass("form-control");
    _jspx_th_s_textfield_2.setDynamicAttribute(null, "placeholder", new String("Ingrese Apellido"));
    int _jspx_eval_s_textfield_2 = _jspx_th_s_textfield_2.doStartTag();
    if (_jspx_th_s_textfield_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody.reuse(_jspx_th_s_textfield_2);
      return true;
    }
    _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody.reuse(_jspx_th_s_textfield_2);
    return false;
  }

  private boolean _jspx_meth_s_textfield_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_3.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_3.setName("admin.password");
    _jspx_th_s_textfield_3.setCssClass("form-control");
    _jspx_th_s_textfield_3.setDynamicAttribute(null, "placeholder", new String("Ingrese Password"));
    int _jspx_eval_s_textfield_3 = _jspx_th_s_textfield_3.doStartTag();
    if (_jspx_th_s_textfield_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody.reuse(_jspx_th_s_textfield_3);
      return true;
    }
    _jspx_tagPool_s_textfield_placeholder_name_cssClass_nobody.reuse(_jspx_th_s_textfield_3);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_id_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setId("grabar");
    _jspx_th_s_submit_0.setValue("%{(edit==1)? 'Editar' : 'Registrar'}");
    _jspx_th_s_submit_0.setCssClass("%{(edit==1)? 'btn btn-warning' : 'btn btn-success'}");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_id_cssClass_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_id_cssClass_nobody.reuse(_jspx_th_s_submit_0);
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
    _jspx_th_s_iterator_0.setValue("lstAdmin");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                            <tr>\r\n");
        out.write("                                                <td>");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write(" </td>\r\n");
        out.write("                                                <td>");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("</td> \r\n");
        out.write("                                                <td>");
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("</td> \r\n");
        out.write("                                                <td>");
        if (_jspx_meth_s_property_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("                                                <td>\r\n");
        out.write("                                                    ");
        if (_jspx_meth_s_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_s_a_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_s_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_s_a_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("  \r\n");
        out.write("                                                    </td>\r\n");
        out.write("                                            ");
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

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_0.setValue("dni");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
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
    _jspx_th_s_property_1.setValue("nombres");
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
    _jspx_th_s_property_2.setValue("apellidos");
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
    _jspx_th_s_property_3.setValue("password");
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }

  private boolean _jspx_meth_s_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_0.setId("lnkEditar");
    _jspx_th_s_url_0.setAction("editarAdmin");
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
        out.write("\r\n");
        out.write("                                                    ");
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
    _jspx_th_s_param_0.setValue("dni");
    _jspx_th_s_param_0.setName("admin.dni");
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
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href_cssClass.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_0.setPageContext(_jspx_page_context);
    _jspx_th_s_a_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_0.setHref("%{lnkEditar}");
    _jspx_th_s_a_0.setCssClass("btn btn-mini btn-primary");
    int _jspx_eval_s_a_0 = _jspx_th_s_a_0.doStartTag();
    if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_0.doInitBody();
      }
      do {
        out.write("<i class=\"fa fa-edit\"></i>");
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

  private boolean _jspx_meth_s_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_1 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_1.setPageContext(_jspx_page_context);
    _jspx_th_s_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_url_1.setId("lnkEliminar");
    _jspx_th_s_url_1.setAction("eliminarAdmin");
    int _jspx_eval_s_url_1 = _jspx_th_s_url_1.doStartTag();
    if (_jspx_eval_s_url_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_url_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_url_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_s_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_url_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_s_url_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action.reuse(_jspx_th_s_url_1);
      return true;
    }
    _jspx_tagPool_s_url_id_action.reuse(_jspx_th_s_url_1);
    return false;
  }

  private boolean _jspx_meth_s_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_url_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_1 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_1.setPageContext(_jspx_page_context);
    _jspx_th_s_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_url_1);
    _jspx_th_s_param_1.setValue("dni");
    _jspx_th_s_param_1.setName("admin.dni");
    int _jspx_eval_s_param_1 = _jspx_th_s_param_1.doStartTag();
    if (_jspx_th_s_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_1);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_1);
    return false;
  }

  private boolean _jspx_meth_s_a_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_1 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href_cssClass.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_1.setPageContext(_jspx_page_context);
    _jspx_th_s_a_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_1.setHref("%{lnkEliminar}");
    _jspx_th_s_a_1.setCssClass("btn btn-mini btn-danger");
    int _jspx_eval_s_a_1 = _jspx_th_s_a_1.doStartTag();
    if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_1.doInitBody();
      }
      do {
        out.write("<i class=\"fa fa-remove\"></i>");
        int evalDoAfterBody = _jspx_th_s_a_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href_cssClass.reuse(_jspx_th_s_a_1);
      return true;
    }
    _jspx_tagPool_s_a_href_cssClass.reuse(_jspx_th_s_a_1);
    return false;
  }
}
