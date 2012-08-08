/**
 * @author Luis Miguel Alberca
 *
 */
public class JSOperacion extends JSExpresion{

	Token t;
		
	public JSOperacion(Token t, String tipo){
		super(t,tipo);
	}
	public JSOperacion(Token t){//He añadido esto porque necesito pasar cadenas o enteros unicamente hacia arriba
		super(t);
	}
	public JSExpresion reducir(){
		JSExpresion expr = generar();
		JSTemporal t = new JSTemporal(expr);
		emitir(t.toString() + " = " + expr.toString());
		return expr;
	}
}
