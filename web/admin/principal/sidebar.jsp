<%@include file="header.jsp" %>
<aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="../../index3.html" class="brand-link">
        <img src="../imagenes/nego.png"
           alt="AdminLTE Logo"
           class="brand-image img-circle elevation-3"
           style="opacity: .8">
      <span class="brand-text font-weight-light">W&V S.A.C</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
            <img src="../imagenes/8.jpg" class="img-circle elevation-2" alt="User Image">
        </div>
        <div class="info">
            
            <s:label  name="adminLog.nombres" cssClass="text-light" /><s:label  name="adminLog.apellidos" cssClass="text-light" />
            <!--<s:iterator value="%{#session.admSession}">
            //<a href="#" class="d-block"><s:property value="adminLog" />  </a>
            //</s:iterator>-->
            </div>
      </div>

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <li class="nav-item has-treeview">
             <a href="RedireccionVentas" class="nav-link">
                 <i class="nav-icon fas fa-cash-register"></i>
                  <p>Pedidos</p>
                </a>
          </li>
          
          <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-warehouse"></i>
              <p>
                Almacen
                <i class="fa fa-angle-left right"></i> 
               
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="listarMarca" class="nav-link">
                  <i class="fas fa-list nav-icon"></i>
                  <p>Marcas</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="listarCate" class="nav-link">
                  <i class="fas fa-pen-square nav-icon"></i>
                  <p>Categorías</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="listarProducto" class="nav-link">
                  <i class="fas fa-list nav-icon"></i>
                  <p>Productos</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item has-treeview">
            <a href="listarClie" class="nav-link">
              <i class="nav-icon fas fa-people-arrows"></i>
              <p>
                Clientes
              </p>
            </a>
            
          </li>
           <s:if  test='adminLog.privilegio.equals("A")'>
          <li class="nav-item has-treeview">
              <a  href="listarAdmin" class="nav-link menu">
              <i class="nav-icon fas fa-users"></i>
              <p>
                Administradores
              </p>
            </a>
              </li>
              </s:if>
        </ul>

      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>