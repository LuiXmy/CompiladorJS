/**
 * 
 */

/**
 * @author Luis Miguel Alberca
 *
 */
public class JSCadena extends JSExpresion {
	String _valor;
	/** RegularExpression Id. */
	//int STRING_LITERAL = 28;
	public JSCadena(Token valor) {
		super(valor,"CADENA");
		_valor = valor.image;
		// TODO Auto-generated constructor stub
	}

}
