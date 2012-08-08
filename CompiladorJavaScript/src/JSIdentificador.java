/**
 * @author Luis Miguel Alberca
 *
 */
public class JSIdentificador extends JSExpresion {
	//Un identificador es una direcci�n
	//El nodo ID es una hoja
	//Desplazamiento tiene la direcci�n relativa del identificador
	
	public int _desplazamiento;
	
	public JSIdentificador(Token id, String tipo, int despl){
		super(id, tipo);
		_desplazamiento = despl;
	}
	
	
	
}