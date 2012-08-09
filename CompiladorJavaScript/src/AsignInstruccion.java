/**
 * @author Luis Miguel Alberca
 *
 */

public class AsignInstruccion extends Instruccion{

	public JSExpresion _id;
	public JSExpresion _expr;
	
	public AsignInstruccion(JSExpresion id, JSExpresion expr){
		_id=id;
		_expr=expr;	
	}
	
	public String comprobarTipo (JSExpresion id, JSExpresion expr){
		if(id._tipo=="INTEGER" && expr._tipo=="INTEGER"){
			return "INTEGER";
		}
		if(id._tipo=="BOOL"    && expr._tipo=="BOOL"){
			return "BOOL";			
		}
		return null;
	}
}
