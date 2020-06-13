<!-- Main Sidebar Container -->
<%@include file="sidebar.jsp" %>
<!-- fin Main sidebar container -->
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header" id="sectionAjax">
        <div class="container-fluid">
            <div class="row mb-2 justify-content-end d-flex">

                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item "><a href="#">Home</a></li>
                        <li class="breadcrumb-item active">Pagina Inicio</li>
                    </ol>
                </div>
            </div>
        </div><!-- /.container-fluid -->
    </section>
    <section>
        <div class="container-fluid">
            <div class="row">

                <div class="col-lg-3 col-6">
                    <!-- small card -->
                    <div class="small-box bg-info">
                        <div class="inner">
                            <h3><s:property value="contarPedidos"/></h3>

                            <p>Pedidos Registrados</p>
                        </div>
                        <div class="icon">
                            <i class="fas fa-shopping-cart"></i>
                        </div>
                        <a href="#" class="small-box-footer">
                            Mas información <i class="fas fa-arrow-circle-right"></i>
                        </a>
                    </div>
                </div>
                <!-- ./col -->
                <div class="col-lg-3 col-6">
                    <!-- small card -->
                    <div class="small-box bg-success">
                        <div class="inner">
                            <h3 id="LabelTotal"><sup style="font-size: 20px">$</sup> </h3>

                            <p>Ganancia Total</p>
                        </div>
                        <div class="icon">
                            <i class="ion ion-stats-bars"></i>
                        </div>
                        <a href="#" class="small-box-footer">
                            Mas información <i class="fas fa-arrow-circle-right"></i>
                        </a>
                    </div>
                </div>
                <!-- ./col -->
                <div class="col-lg-3 col-6">
                    <!-- small card -->
                    <div class="small-box bg-warning">
                        <div class="inner">
                            <h3><s:property value="contarAdministrador" /></h3>

                            <p>Administradores Registrados</p>
                        </div>
                        <div class="icon">
                            <i class="fas fa-user-plus"></i>
                        </div>
                        <a href="listarAdmin" class="small-box-footer">
                            Mas información <i class="fas fa-arrow-circle-right"></i>
                        </a>
                    </div>
                </div>
                <!-- ./col -->
                <div class="col-lg-3 col-6">
                    <!-- small card -->
                    <div class="small-box bg-danger">
                        <div class="inner">
                            <h3><s:property value="contarCliente" /></h3>

                            <p>Cliente registrados</p>
                        </div>
                        <div class="icon">
                            <i class="fas fa-chart-pie"></i>
                        </div>
                        <a href="listarClie" class="small-box-footer">
                            Mas información <i class="fas fa-arrow-circle-right"></i>
                        </a>
                    </div>
                </div>
                <!-- ./col -->

               
                    
                    <div class="chart-container col-8 offset-2" style="position: relative; height:30vh; width:60vw">
                        <h2 class="page-header text-uppercase text-bold text-center">Resumen de venta por Mes</h2>
                        <canvas id="myChart"></canvas>
                    </div>
               
                <s:hidden name="jsonMes"/>
                <s:hidden name="jsonTotal"/>
                

            </div>
        </div>
    </section>
    <!-- /.content -->
</div>
<!-- /.content-wrapper -->

<!-- Footer -->

<%@include file="footer.jsp" %>

