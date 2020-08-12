<!-- Footer -->
<footer class="bg6 p-t-45 p-b-43 p-l-45 p-r-45">
    <div class="flex-w p-b-90">
        <div class="w-size6 p-t-30 p-l-15 p-r-15 respon3">
            <h4 class="s-text12 p-b-30">
                Ponerse en contacto
            </h4>

            <div>
                <p class="s-text7 w-size27">
                    Any questions? Let us know in store at 8th floor, 379 Hudson St, New York, NY 10018 or call us on (+1) 96 716 6879
                </p>

                <div class="flex-m p-t-30">
                    <a href="#" class="fs-18 color1 p-r-20 fa fa-facebook"></a>
                    <a href="#" class="fs-18 color1 p-r-20 fa fa-instagram"></a>
                    <a href="#" class="fs-18 color1 p-r-20 fa fa-pinterest-p"></a>
                    <a href="#" class="fs-18 color1 p-r-20 fa fa-snapchat-ghost"></a>
                    <a href="#" class="fs-18 color1 p-r-20 fa fa-youtube-play"></a>
                </div>
            </div>
        </div>

        <div class="w-size7 p-t-30 p-l-15 p-r-15 respon4">
            <h4 class="s-text12 p-b-30">
                Categorias
            </h4>

            <ul>
                <li class="p-b-9">
                    <a href="#" class="s-text7">
                        Hombre
                    </a>
                </li>

                <li class="p-b-9">
                    <a href="#" class="s-text7">
                        Mujer
                    </a>
                </li>

                <li class="p-b-9">
                    <a href="#" class="s-text7">
                        Para la piel
                    </a>
                </li>

                <li class="p-b-9">
                    <a href="#" class="s-text7">
                        Cosmeticos
                    </a>
                </li>
            </ul>
        </div>

        <div class="w-size7 p-t-30 p-l-15 p-r-15 respon4">
            <h4 class="s-text12 p-b-30">
                Redes Sociales
            </h4>

            <ul>
                <li class="p-b-9">
                    <a href="#" class="s-text7">
                        Buscar
                    </a>
                </li>

                <li class="p-b-9">
                    <a href="#" class="s-text7">
                        Acerca de Nosotros
                    </a>
                </li>

                <li class="p-b-9">
                    <a href="#" class="s-text7">
                        Contactanos
                    </a>
                </li>


            </ul>
        </div>

        <div class="w-size7 p-t-30 p-l-15 p-r-15 respon4">
            <h4 class="s-text12 p-b-30">
                Ayuda
            </h4>

            <ul>
                <li class="p-b-9">
                    <a href="#" class="s-text7">
                        Track Order
                    </a>
                </li>

                <li class="p-b-9">
                    <a href="#" class="s-text7">
                        Devoluciones
                    </a>
                </li>

                <li class="p-b-9">
                    <a href="#" class="s-text7">
                        Envio
                    </a>
                </li>

                <li class="p-b-9">
                    <a href="#" class="s-text7">
                        FAQs
                    </a>
                </li>
            </ul>
        </div>

        <div class="w-size8 p-t-30 p-l-15 p-r-15 respon3">
            <h4 class="s-text12 p-b-30">
                Newsletter
            </h4>

            <form>
                <div class="effect1 w-size9">
                    <input class="s-text7 bg6 w-full p-b-5" type="text" name="email" placeholder="email@example.com">
                    <span class="effect1-line"></span>
                </div>

                <div class="w-size2 p-t-20">
                    <!-- Button -->
                    <button class="flex-c-m size2 bg4 bo-rad-23 hov1 m-text3 trans-0-4">
                        Suscribirse
                    </button>
                </div>

            </form>
        </div>
    </div>

    <div class="t-center p-l-15 p-r-15">


        <div class="t-center s-text8 p-t-20">
            Copyright © 2018 All rights reserved. | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
        </div>
    </div>
</footer>

<!-- Back to top -->
<div class="btn-back-to-top bg0-hov" id="myBtn">
    <span class="symbol-btn-back-to-top">
        <i class="fa fa-angle-double-up" aria-hidden="true"></i>
    </span>
</div>

<!-- Container Selection1 -->

<!--===============================================================================================-->
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script type="text/javascript" src="js/animsition.min.js"></script>
<!--===============================================================================================-->
<script type="text/javascript" src="js/popper.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script type="text/javascript" src="js/select2.min.js"></script>
<script src="https://kit.fontawesome.com/93bc7256e3.js" crossorigin="anonymous"></script>
<script type="text/javascript">
    $(".selection-1").select2({
        minimumResultsForSearch: 20,
        dropdownParent: $('#dropDownSelect1')
    });</script>
<!--===============================================================================================-->
<script type="text/javascript" src="js/moment.min.js"></script>
<script type="text/javascript" src="js/daterangepicker.js"></script>
<!--===============================================================================================-->
<!--===============================================================================================-->
<script type="text/javascript" src="js/slick.min.js"></script>
<script type="text/javascript" src="js/slick-custom.js"></script>
<!--===============================================================================================-->
<!--===============================================================================================-->
<script type="text/javascript" src="vendor/sweetalert/sweetalert.min.js"></script>
<script type="text/javascript">
    $('.block2-btn-addcart').each(function () {
        var nameProduct = $(this).parent().parent().parent().find('.block2-name').html();
        $(this).on('click', function () {
            swal(nameProduct, "is added to cart !", "success");
        });
    });
   </script>

<!--===============================================================================================-->

<script type="text/javascript" src="js/countdowntime.js"></script>
<!--===============================================================================================-->
<script type="text/javascript" src="js/lightbox.min.js"></script>
<script src="admin/js/funciones.js" type="text/javascript"></script>
<script src="js/funciones.js" type="text/javascript"></script>
<!--===============================================================================================-->
<script type="text/javascript" src="js/sweetalert.min.js"></script>
<script src="js/toastr.min.js" type="text/javascript"></script>


<script type="text/javascript">
    $('.block2-btn-addcart').each(function () {
        var nameProduct = $(this).parent().parent().parent().find('.block2-name').html();
        $(this).on('click', function () {
            swal(nameProduct, "Producto agregado !", "success");
        });
    });
    </script>
<!--===============================================================================================-->
<script type="text/javascript" src="js/nouislider.min.js"></script>
<script type="text/javascript">
    /*[ No ui ]
     ===========================================================*/
    var filterBar = document.getElementById('filter-bar');
    noUiSlider.create(filterBar, {
        start: [0, 200],
        connect: true,
        range: {
            'min': 0,
            'max': 200
        }
    });
    var skipValues = [
        document.getElementById('value-lower'),
        document.getElementById('value-upper')
    ];
    filterBar.noUiSlider.on('update', function (values, handle) {
        skipValues[handle].innerHTML = Math.round(values[handle]);
    });</script>
<!--===============================================================================================-->
<script src="js/ajax.js" type="text/javascript"></script>
<script src="js/registroVenta.js" type="text/javascript"></script>
<!--===============================================================================================-->
<script type="text/javascript" src="js/parallax100.js"></script>
<script type="text/javascript">
    $('.parallax100').parallax100();</script>
<!--===============================================================================================-->
<script src="js/main.js"></script>
<!-- Integracion a paypal checkout -->
<script src="https://www.paypalobjects.com/api/checkout.js"></script>
<script>

    paypal.Button.render({

        // Configure environment
        env: 'sandbox',
        client: {
            sandbox: 'Aft06wqLKlN8jiexF1_Cijb1MTEHmDQHbCggqAabmQK-0wNAXxnYwRMlvta_vZokfM0Yd3h-x6VerT3r',
            production: 'demo_production_client_id'
        },
        // Customize button (optional)
        locale: 'en_US',
        style: {
            size: 'responsive',
            color: 'black',
            shape: 'pill',
            tagline: false
        },

        // Enable Pay Now checkout flow (optional)
        commit: true,

        // Set up a payment
        payment: function (data, actions) {
            var total = $('totalPay').val();
            var subtotal = $('subtotalPay').val();
            var listaJson = $.post("obtenerLista.action");
            return actions.payment.create({
                transactions: [{
                        amount: {
                            total: `${total}`,
                            currency: 'USD',
                            details: {
                                subtotal: `${subtotal}`,
                                tax: '0.00',
                                shipping: '0.00',
                                handling_fee: '0.00',
                                shipping_discount: '-0.00',
                                insurance: '0.00'
                            }
                        },
                        description: 'The payment transaction description.',
                        custom: '90048630024435',
                        //invoice_number: '12345', Insert a unique invoice number
                        payment_options: {
                            allowed_payment_method: 'INSTANT_FUNDING_SOURCE'
                        },
                        soft_descriptor: 'ECHI5786786',
                        item_list: {
                            items: [

                                {
                                    name: 'handbag',
                                    description: 'Black handbag.',
                                    quantity: '1',
                                    price: '80',
                                    tax: '0.02',
                                    sku: 'product34',
                                    currency: 'USD'
                                }]

                        }
                    }],
                note_to_payer: 'Detalle de productos'
            });
        },
        // Execute the payment
        onAuthorize: function (data, actions) {
            return actions.payment.execute().then(function () {
                // Show a confirmation message to the buyer
                swal({
                    title: "Bien Echo",
                    text: "Su trasaccion fue exitosa!",
                    icon: "success",
                    button: "Aceptar",
                });
            });
        }
    }, '#paypal-button');

</script>
</body>
</html>
