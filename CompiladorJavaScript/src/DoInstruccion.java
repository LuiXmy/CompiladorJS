/**
 * @author Luis Miguel Alberca
 *
 */
public class DoInstruccion extends Instruccion {
	JSExpresion _expr;
	Instruccion _instr;
	public DoInstruccion(){
		_expr = null;
		_instr = null;
	}
	public void inic(Instruccion s, JSExpresion expr){
		_expr = expr;
		_instr = s;
		if(_expr._tipo != "BOOL") _expr.error("Se necesita un tipo bool aqui");
	}
	public void generar(int inicio, int fin){
		despues = fin;
		int etiqueta = nuevaEtiqueta();
		_instr.generar(inicio, etiqueta);
		emitirEtiqueta(etiqueta);
		_expr.salto(inicio, 0);		
	}
}
