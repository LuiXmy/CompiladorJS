/**
 * 
 */

/**
 * @author Luis Miguel Alberca
 *
 */
public class JSDocumenWInstr extends Instruccion{

	JSExpresion _expr=null;
	public JSDocumenWInstr(JSExpresion expr) {
		super();
		if(expr._tipo=="CADENA"){
		String salida=expr._operacion.image.substring(1, expr._operacion.image.length()-1);
		System.out.println("Cadena leida "+salida);
		}
		if(expr._tipo=="ENTERO"){
		System.out.println("Cadena leida "+expr._operacion.image);
		}
		//EVALUAR EXPRESION FALTARIA
		// TODO Auto-generated constructor stub
	}
	
	public void generar(int inicio, int fin){
		despues=fin;
		//CODIGO INTERMEDIO DE IMPRIMIR
	}

}
