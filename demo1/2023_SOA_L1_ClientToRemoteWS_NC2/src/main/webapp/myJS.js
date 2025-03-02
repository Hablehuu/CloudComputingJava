window.onload = customize;

function customize(){
	window.document.getElementById('div3').style.display = 'none';
}

function convertCurrency()
{
    window.document.getElementById('div3').style.display = 'none';
	var q_str ="to="+ document.getElementById('t4').value + "&from=" + document.getElementById('t2').value + "&amount=" + document.getElementById('t1').value +
	"&amount2=" + document.getElementById('t3').value;
	doAjax('Demo1servlet',q_str,'convertCurrency_back','post',0);
}
function convertCurrency_back(result)
{
	if (result.substring(0,5)=='error'){
	   window.document.getElementById('div3').style.display = 'block';
	   window.document.getElementById('div3').innerHTML="<p style='color:red;'><b>"+result.substring(6)+"</b></p>";
   }else{
	   window.document.getElementById('t5').value=""+result + " " + document.getElementById('t4').value;
   }
}