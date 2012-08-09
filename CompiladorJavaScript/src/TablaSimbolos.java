import java.util.HashMap;
/**
 * @author Luis Miguel
 *
 */

class Symbol {//Esto se guardar� en el campo Value de la tabla de momento tira con enteros
	
	//Tama�o de los datos que se sumara al desplazamiento
	static final int entero=4;
	static final int car=1;
	static final int bool=4;
	
    public String key;
    public int numerolinea;
    public String tipo;
    public static int desplazamiento=0;//direccion relativa del identificador
    
    public Symbol(String key, int linea) {
    	super();
		this.key = key;
		this.numerolinea = linea;
    }
    
    public Symbol(String key, int linea, String tipo) {
    	super();
    	this.key = key;
    	this.numerolinea = linea;
    	this.tipo = tipo;
    }
    
    public Symbol(String key, int linea, String tipo, int tamano) {
    	super();
    	this.key = key;
    	this.numerolinea = linea;
    	this.tipo = tipo;
    	Symbol.desplazamiento+= tamano;
    }
    
	@Override
	public String toString() {
		return "Symbol [key=" + key + ", linea=" + numerolinea + "]";
	}
	 
}

public class TablaSimbolos {
	
	HashMap<String, Symbol> tabla;
	TablaSimbolos padre;
		
	public TablaSimbolos() {
		tabla=new HashMap<String, Symbol>();
		padre = null;
	}
	
	public TablaSimbolos(TablaSimbolos padre) {
		tabla = new HashMap<String, Symbol>();
		this.padre = padre;
	}
	
	void insertarTS(String nombre, Symbol simbolo){
		tabla.put(nombre, simbolo);
	}
	boolean buscar(String clave){
		if (tabla.containsKey(clave))
			return true;	
		else
			return false;
	}
	
	String tipo(String clave){
		Symbol res;
		if (tabla.containsKey(clave)){
			res=tabla.get(clave);
			return res.tipo;
		}else{
			return "ERROR";
		}
	}
	
	boolean existeClave(String nombre){
		return tabla.containsKey(nombre);
	}
	
	void imprimir(){
		System.out.println("Elementos de la Tabla: "+tabla.toString());
	}
	////////////////////////////PRUEBA////////////////////////////////////////////////////////////////////////
	/*public static void main(String[]args){
		TablaSimbolos tablapadre = new TablaSimbolos();
		TablaSimbolos activa = tablapadre;
		
		activa = tablapadre;
		Symbol simbolo=new Symbol("hola",3);
		tablapadre.insertarTS("hola", simbolo);
		tablapadre.insertarTS("hola23", simbolo);
		tablapadre.imprimir();
		
		TablaSimbolos tabla = new TablaSimbolos(activa); 
		//Esto es para ver si funciona bien el paso del puntero de la tabla
		activa = tabla;
		activa.insertarTS("padre", simbolo);
		activa.insertarTS("padre2", simbolo);
		activa.imprimir();
		System.out.println(tabla.padre.buscar(3));
		
		TablaSimbolos tablanieta = new TablaSimbolos(activa);
		activa = tablanieta;
		activa.insertarTS("nieta23", simbolo);
		activa.insertarTS("nieta", simbolo);
		activa.imprimir();
		System.out.println(activa.padre.padre.buscar(5));
	}*/
}
