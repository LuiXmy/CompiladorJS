/**
 * @author Luis Miguel Alberca
 *
 */
public class JSRelacional extends JSOperacion {

	Token _t=null;
	JSExpresion _expr1=null;
	JSExpresion _expr2=null;
	
	public JSRelacional(Token t){
		super(t,"CADENA");
	}
	
	public JSRelacional(Token t, JSExpresion expr1, JSExpresion expr2){
		super(t, null);
		//if(expr1._tipo!="logico" && expr1._tipo!="logico"){
			//error de tipo
		//}
	}
	
	public JSRelacional generar(){
		return new JSRelacional(_operacion, _expr1.reducir(), _expr2.reducir());
	}
	
	public String toString(){
		return _expr1.toString()+" "+_operacion.toString()+" "+_expr2.toString();
	}
}
