/**
 * 
 */

/**
 * @author Luis Miguel Alberca
 *
 */

/*
 *  Los nodos del arbol sint�ctico los implementar� con objetos de �sta clase
 *  El atributo linea programa lo que hace es guardar la linea en la que nos encontramos
 *  para devolver el lugar donde se ha producido un error.
 *  
 *  La generaci�n de c�digo intermedio se realiza tambi�n desde el nodo
 *  
 *  �sa generacion de c�digo se har� dependiendo del tipo: Expresi�n � C�digo.
 * 
 * */
public class JSNodo {

	
	int lineaprograma=0;
	
	public JSNodo(){//Tengo que obtener el n�mero de linea del l�xico (JavaCC)
	}
	
	void error(String s){
		throw new Error("Error en la linea"+lineaprograma+s);
	}
	//Generacion de c�digo intermedio
	static int etiqueta=0;
	public int nuevaEtiqueta(){return etiqueta++;}
	public void emitirEtiqueta(int i){ System.out.println("Lugar"+i+":");}
	public void emitir(String s){System.out.println("\t"+s);}
}
