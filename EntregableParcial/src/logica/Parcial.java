package logica;

public class Parcial {

public static int potencia(int a, int e) throws Exception {
	Double respuesta = Math.pow(a, e);
	if(respuesta > 2147483647) {
		throw new Exception("Numero mayor a un entero");
	}else if(a == 0 && e == 0){
		throw new Exception("0^0 no esta definido");
	}
	else {
		return (int)  Math.pow(a, e);
	}
}
}
