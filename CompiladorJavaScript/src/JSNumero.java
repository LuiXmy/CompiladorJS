/**
 * 
 */

/**
 * @author Luis Miguel Alberca
 *
 */
public class JSNumero extends JSExpresion{
	public final int _valor;
	
	//Constructor de la clase
	
	/** RegularExpression Id. */
	//int DIGITO = 26;
	//sacado de eg1Constants.java
	public JSNumero(Token valor){
		super(valor,"ENTERO");
		_valor=Integer.parseInt(valor.image);		
	}
}