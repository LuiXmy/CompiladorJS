/**
 * @author Luis Miguel Alberca
 *
 */
public class JSAritmetica extends JSOperacion {

	Token _t=null;
	JSExpresion _expr1=null;
	JSExpresion _expr2=null;
	
	public JSAritmetica(Token t, JSExpresion expr1, JSExpresion expr2){
		super(t, null);
		if(_expr1._tipo!="ENTERO" && _expr1._tipo!="ENTERO"){
			//error de tipo
		}
	}
	public JSAritmetica(JSExpresion expr1){//He añadido esto porque necesito pasar cadenas o enteros unicamente hacia arriba
		super(expr1._operacion,expr1._tipo);
		_expr1=expr1;
	}
	
	public JSAritmetica generar(){
		return new JSAritmetica(_operacion, _expr1.reducir(), _expr2.reducir());
	}
	
	public String toString(){
		return _expr1.toString()+" "+_operacion.toString()+" "+_expr2.toString();
	}
}
