<!--1-->
<%@ taglib uri="/struts-tags" prefix="s"%>
<s:form id="form-restablecer"  action="validarCodigoClie" name="form-restablecer" theme="simple" >
                    <div class="input-group mb-1">
                        <s:textfield name="codigo" cssClass="form-control" placeholder="Ingrese Código" />
                        
                    </div>
                    <div class="col-12">
                        <div class="input-group mr-2 mb-2 mt-3">
                            <label>¿No le llegó el código? </label> <s:a href="restablecerPasswordClie" cssClass="ml-2" >Enviar</s:a>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-12">
                        <s:submit id="btnRestablecer" cssClass="btn btn-primary btn-block" value="Validar"/>
                            <div id="incorrecto">
                            </div>
                        </div>

                        <!-- /.col -->
                    </div>
</s:form>
<script src="js/ajax.js" type="text/javascript"></script>