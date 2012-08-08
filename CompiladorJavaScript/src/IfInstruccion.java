/**
 * @author Luis Miguel Alberca
 *
 */
public class IfInstruccion extends Instruccion{
	JSExpresion _expr;
	Instruccion _instr;
	public IfInstruccion(JSExpresion expr, Instruccion s){
		_expr=expr;
		_instr=s;
		if(_expr._tipo!="BOOL") _expr.error("Se requiere un tipo booleano aqui");
	}
	
	public void generar(int inicio, int fin){
		int etiqueta=nuevaEtiqueta();
		_expr.salto(0, fin);
		emitirEtiqueta(etiqueta);
		_instr.generar(etiqueta, fin);
	}

}
