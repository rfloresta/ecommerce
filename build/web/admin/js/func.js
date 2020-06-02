
function enviarcliente(nomb,cod){
$('.form-control_clie').replaceWith('<input class="form-control_clie form-control" disable type="text"  name="nomClie"  value="'+nomb+'" />');
$('.clie').replaceWith(' <input type="hidden" id="clie" name="clie"  class="clie form-control" value="'+cod+'" />');
}


function enviarProd(pre,nom,codigo,desc){

 
$('#codPro').replaceWith('<input  type="hidden" name="codPro" id="codPro" value="'+codigo+'" class="codPro form-control" />');
$('.form-control_nom').replaceWith('<input  type="text" name="nom" id="nom" class="form-control_nom form-control"  value="'+nom+'" />');
$('.form-control_preven').replaceWith('<input  type="text" name="preven" id="preven" class="form-control_preven form-control" readonly="true" value="'+pre+'" />');
$('.desc').replaceWith('<input  type="hidden" name="desc" id="desc" class="desc" value="'+desc+'" />'); 
}

function limpiar()
{
	setTimeout('document.frrfcdet.reset()',2000);
	return false;
}

function passmd(num, prec)
{
    document.getElementById("nroinv").value = num;
		document.getElementById("precio").value = prec;
}

function pass2(nroi, can, pr)
{
	document.getElementById("nroinv").value=nroi;
	document.getElementById("cant").value=can;
	document.getElementById("precio").value=pr;
}

function selCli(cc)
{
	document.getElementById("cc").value =""+cc;
}

function selProv(nit)
{
	document.getElementById("nit").value =""+nit;
}

function sc()
{
	 $('#msgcli').load('/ControlBusiness/scli', "cc="+$('#ncli').val());
	 $('#clsscli').hide();
	 	if($('#ncli').val()=="")
				$('#clsscli').show();

}

function si()
{
	 $('#msg').load('/ControlBusiness/sprod', "nro="+$('#n').val());
	 $('#clss').hide();
	 	if($('#n').val()=="")
				$('#clss').show();

}

function sp()
 {
	 $('#msgp').load('/ControlBusiness/sprov', "nit="+$('#np').val());
	 $('#clssp').hide();
	 	if($('#np').val()=="")
				$('#clssp').show();
}

function clibus()
{
	$('#tbl').load('/ControlBusiness/buscarcli', "cc="+$('#cc').val())
}

function probus()
{
	$('#tbl').load('/ControlBusiness/buscarpro', "nit="+$('#nit').val())
}

function prodbus()
{
	$('#tbl').load('/ControlBusiness/buscarprod', "nro="+$('#nro').val())
}
