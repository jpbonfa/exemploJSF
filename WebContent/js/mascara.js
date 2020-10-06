function masc_total(objeto) {
	var quantidade = document.getElementById("quantidade");
	var v_total;
	var v = objeto.value.replace(/\D/g, '');

	v = (v / 100).toFixed(2) + '';
	v_total = quantidade.value * v;

	v = v.replace(".", ",");
	v = v.replace(/(\d)(\d{3})(\d{3}),/g, "$1.$2.$3,");
	v = v.replace(/(\d)(\d{3}),/g, "$1.$2,");

	document.getElementById('valor_total').value = "R$" + v_total;
	objeto.value = "R$" + v

}

function masc_numero(objeto) {
	var numero = "";
	var padrao = /\D/g;

	numero = objeto.value.replace(padrao, "");
	objeto.value = numero;

}

function masc_cnpj(objeto) {
	var retorno = "";
	var padrao = /\D/g;
	var numero;

	numero = objeto.value.replace(padrao, "");
	parte1 = numero.substr(0, 2);
	if (parte1.length > 0) {
		retorno = parte1;
	}

	parte2 = numero.substr(2, 3);
	if (parte2.length > 0) {
		retorno += "." + parte2;
	}

	parte3 = numero.substr(5, 3);
	if (parte3.length > 0) {
		retorno += "." + parte3;
	}

	parte4 = numero.substr(8, 4);
	if (parte4.length > 0) {
		retorno += "/" + parte4;
	}

	parte5 = numero.substr(12, 2);
	if (parte5.length > 0) {
		retorno += "." + parte5;
	}
	objeto.value = retorno;
}
function masc_data(objeto) {
	var retorno = "";
	var padrao = /\D/g;
	var numero;
	numero = objeto.value.replace(padrao, "");
	parte1 = numero.substr(0, 2);
	if (parte1.length > 0) {
		retorno = parte1;
	}
	parte2 = numero.substr(2, 2);
	if (parte2.length > 0) {
		retorno += "/" + parte2;
	}
	parte3 = numero.substr(4, 4);
	if (parte3.length > 0) {
		retorno += "/" + parte3;
	}
	objeto.value = retorno;
}

function masc_ie(objeto) {
	var retorno = "";
	var padrao = /\D/g;
	var numero;
	numero = objeto.value.replace(padrao, "");

	parte1 = numero.substr(0, 3);
	if (parte1.length > 0) {
		retorno = parte1;
	}

	parte2 = numero.substr(3, 3);
	if (parte2.length > 0) {
		retorno += "." + parte2;
	}

	parte3 = numero.substr(6, 3);
	if (parte3.length > 0) {
		retorno += "." + parte3;
	}
	parte4 = numero.substr(9, 3);
	if (parte4.length > 0) {
		retorno += "." + parte4;
	}
	objeto.value = retorno;
}

function masc_cep(objeto) {
	var retorno = "";
	var padrao = /\D/g;
	var numero;
	numero = objeto.value.replace(padrao, "");
	parte1 = numero.substr(0, 5);
	if (parte1.length > 0) {
		retorno = parte1;
	}

	parte2 = numero.substr(5, 3);
	if (parte2.length > 0) {
		retorno += "-" + parte2;
	}
	objeto.value = retorno;

}

function masc_telefone(objeto) {
	var retorno = "";
	var padrao = /\D/g;
	var numero;
	numero = objeto.value.replace(padrao, "");
	parte1 = numero.substr(0, 2)
	if (parte1.length > 0) {
		retorno = "(" + parte1 + ")"
	}

	parte2 = numero.substr(2, 4);
	if (parte2.length > 0) {
		retorno += parte2;
	}

	parte3 = numero.substr(6, 4);
	if (parte3.length > 0) {
		retorno += "-" + parte3;
	}
	objeto.value = retorno;
}

function masc_celular(objeto) {
	var retorno = "";
	var padrao = /\D/g;
	var numero;
	numero = objeto.value.replace(padrao, "");
	parte1 = numero.substr(0, 2)
	if (parte1.length > 0) {
		retorno = "(" + parte1 + ")"
	}

	parte2 = numero.substr(2, 5);
	if (parte2.length > 0) {
		retorno += parte2;
	}

	parte3 = numero.substr(7, 4);
	if (parte3.length > 0) {
		retorno += "-" + parte3;
	}
	objeto.value = retorno;
}

function masc_cpf(objeto) {
	var retorno = "";
	var padrao = /\D/g;
	var numero;
	numero = objeto.value.replace(padrao, "");
	parte1 = numero.substr(0, 3)
	if (parte1.length > 0) {
		retorno = parte1;
	}

	parte2 = numero.substr(3, 3)
	if (parte2.length > 0) {
		retorno += "." + parte2;
	}

	parte3 = numero.substr(6, 3)
	if (parte3.length > 0) {
		retorno += "." + parte3;
	}

	parte4 = numero.substr(9, 2)
	if (parte4.length > 0) {
		retorno += "-" + parte4;
	}
	objeto.value = retorno;
}

function masc_rg(objeto) {
	var retorno = "";
	var padrao = /\D/g;
	var numero;
	numero = objeto.value.replace(padrao, "");
	parte1 = numero.substr(0, 2)
	if (parte1.length > 0) {
		retorno = parte1;
	}

	parte2 = numero.substr(2, 3)
	if (parte2.length > 0) {
		retorno += "." + parte2;
	}

	parte3 = numero.substr(5, 3)
	if (parte3.length > 0) {
		retorno += "." + parte3;
	}

	parte4 = numero.substr(8, 1)
	if (parte4.length > 0) {
		retorno += "-" + parte4;
	}
	objeto.value = retorno;
}

function alerta() {
	alert('metodo acionado');
}

function masc_moeda(objeto) {
	var v = objeto.value.replace(/\D/g, '');
	v = (v / 100).toFixed(2) + '';
	v = v.replace(".", ",");
	v = v.replace(/(\d)(\d{3})(\d{3}),/g, "$1.$2.$3,");
	v = v.replace(/(\d)(\d{3}),/g, "$1.$2,");
	objeto.value = "R$" + v

}
