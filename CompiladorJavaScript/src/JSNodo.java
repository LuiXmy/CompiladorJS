/**
 * 
 */

/**
 * @author Luis Miguel Alberca
 *
 */

/*
 *  Los nodos del arbol sintáctico los implementaré con objetos de ésta clase
 *  El atributo linea programa lo que hace es guardar la linea en la que nos encontramos
 *  para devolver el lugar donde se ha producido un error.
 *  
 *  La generación de código intermedio se realiza también desde el nodo
 *  
 *  Ésa generacion de código se hará dependiendo del tipo: Expresión ó Código.
 * 
 * */
public class JSNodo {

	
	int lineaprograma=0;
	
	public JSNodo(){//Tengo que obtener el número de linea del léxico (JavaCC)
	}
	
	void error(String s){
		throw new Error("Error en la linea"+lineaprograma+s);
	}
	//Generacion de código intermedio
	static int etiqueta=0;
	public int nuevaEtiqueta(){return etiqueta++;}
	public void emitirEtiqueta(int i){ System.out.println("Lugar"+i+":");}
	public void emitir(String s){System.out.println("\t"+s);}
}
