/**
 * @author Luis Miguel Alberca
 *
 */

public class AsignInstruccion extends Instruccion{

	public JSIdentificador _id;
	public JSExpresion _expr;
	
	public AsignInstruccion(JSIdentificador id, JSExpresion expr){
		_id=id;
		_expr=expr;	
	}
	
	public String comprobarTipo (JSIdentificador id, JSExpresion expr){
		if(id._tipo=="INTEGER" && expr._tipo=="INTEGER"){
			return "INTEGER";
		}
		if(id._tipo=="BOOL"    && expr._tipo=="BOOL"){
			return "BOOL";			
		}
		return null;
	}
}
