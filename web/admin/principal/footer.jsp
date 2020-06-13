<footer class="main-footer">
    <div class="float-right d-none d-sm-block">
        <b>Version</b> 1.0.1
    </div>
    <strong>Copyright &copy; 2014-2019 <a href="http://adminlte.io">W&V S.A.C</a>.</strong> All rights
    reserved.
</footer>

<!-- Control Sidebar -->
<aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
</aside>
<!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="../js/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="../js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="../js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="../js/demo.js"></script>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>   
<script src="https://kit.fontawesome.com/93bc7256e3.js" crossorigin="anonymous"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script src="//cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<script src="../js/funciones.js" type="text/javascript"></script>
<script src="../js/Chart.min.js" type="text/javascript"></script>

<script>
    //Se obtiene la lista y se convierte a json
    var lstFecha = document.getElementById("jsonMes");
    var datalstFecha = JSON.parse(lstFecha.value);
    var lstTotal = document.getElementById("jsonTotal");
    var datalstTotal = JSON.parse(lstTotal.value);
    //Fin de obtener lista y convertir a json

    //Obtenemos los valores de los json para los widgets
    var total=0;
    for (var i = 0; i < datalstTotal.length; i++)
    {

        total = parseInt(datalstTotal[i])+total;
    }
    var VentaTotal= document.getElementById("LabelTotal");
    VentaTotal.innerHTML= "<h3 id='LabelTotal'><sup style='font-size: 20px'>$</sup> "+total+" </h3>";


    var ctx = document.getElementById('myChart').getContext('2d');
    var myChart = new Chart(ctx, {
        type: 'line',
        data: {
            labels: datalstFecha,
            datasets: [{
                    label: "Venta",
                    data: datalstTotal,
                    lineTension: 0,
                    fill: false,
                    borderColor: 'orange',
                    backgroundColor: 'transparent',
                    borderDash: [5, 5],
                    pointBorderColor: 'orange',
                    pointBackgroundColor: 'rgba(255,150,0,0.5)',
                    pointRadius: 5,
                    pointHoverRadius: 10,
                    pointHitRadius: 30,
                    pointBorderWidth: 2,
                    pointStyle: 'rectRounded'
                }]
        },
        options: {
            scales: {
                yAxes: [{
                        ticks: {
                            beginAtZero: true
                        }
                    }]
            }
        }
    });

</script>


<script>

    function  cargaTablajQuery()
    {
        $(document).ready(function () {
            $('#datos').addClass('nowrap').DataTable({
                responsive: true,

                "language": {
                    "sProcessing": "Procesando...",
                    "sLengthMenu": "Mostrar _MENU_ registros",
                    "sZeroRecords": "No se encontraron resultados",
                    "sEmptyTable": "Ningun dato disponible en esta tabla",
                    "sInfo": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
                    "sInfoEmpty": "Mostrando registros del 0 al 0 de un total de 0 registros",
                    "sInfoFiltered": "(filtrado de un total de _MAX_ registros)",
                    "sInfoPostFix": "",
                    "sSearch": "Buscar:",
                    "sUrl": "",
                    "sInfoThousands": ",",
                    "sLoadingRecords": "Cargando...",
                    "oPaginate": {
                        "sFirst": "Primero",
                        "sLast": "Utimo",
                        "sNext": "Siguiente",
                        "sPrevious": "Anterior"
                    },
                    "oAria": {
                        "sSortAscending": ": Activar para ordenar la columna de manera ascendente",
                        "sSortDescending": ": Activar para ordenar la columna de manera descendente"
                    }
                }
            });
        });

    }

    cargaTablajQuery();
</script>
</body>
</html>