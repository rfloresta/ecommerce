<%@ taglib uri="/struts-tags" prefix="s"%>
          
                <h3 class="mb-3">Cambiar Contraseña</h3>
                <div class="row">
                    <div class="col-md-12">
                    <s:form id="form_pass" theme="simple" action="cambiarPasswordClie">
                        <div class="form-group">
                            <label>Contraseña Actual</label>
                            <s:if test="hasActionErrors()">  
                                <s:actionerror cssClass="text-danger font-weight-bold"/>
                            </s:if> 
                            <div class="input-group">
                                <s:password name="passwordActual" id="password1" cssClass="form-control"/>
                                <div class="input-group-append">
                                    <button class="btn btn-primary" type="button" onclick="mostrarPassword('password1')"> <span  id="show_password1" class="fa fa-eye-slash icon"></span> </button>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Nueva Contraseña</label>
                            <div class="input-group">
                                <s:password name="cliente.password" id="password2" cssClass="form-control"/>
                                <div class="input-group-append">
                                    <button class="btn btn-primary" type="button" onclick="mostrarPassword('password2')"> <span  id="show_password2" class="fa fa-eye-slash icon"></span> </button>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Confirmar Contraseña</label>
                            <div class="input-group">
                                <s:password name="passwordNuevo" id="password3" cssClass="form-control"/>
                                <div class="input-group-append">
                                    <button  class="btn btn-primary" type="button" onclick="mostrarPassword('password3')"> <span id="show_password3" class="fa fa-eye-slash icon"></span> </button>
                                </div>
                            </div>
                        </div>
                                <div class="text-center mb-3">
                        <p style="display:none" id="errorPassword" class="text-danger font-weight-bold">
        *La contraseña debe tener 8 caracteres como mínimo entre números, minúsculas y mayúsculas*
                  *No debe contener caracteres extraños ni espacios en blanco*
                        </p></div>
                        <div class="text-center pb-4">
                            <s:submit id="cambiar" cssClass="btn btn-primary " value="Guardar" />
                        </div>

                    </div>
                </div>
            </s:form>
