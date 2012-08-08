/**
 * @author Luis Miguel Alberca
 *
 */
public class InterrogInstruccion extends Instruccion{
		JSExpresion _expr;
		Instruccion _instr;
		Instruccion _instr2;
		public InterrogInstruccion(JSExpresion expr, Instruccion s, Instruccion s1){
			_expr=expr;
			_instr=s;
			_instr2=s1;
			if(_expr._tipo!="BOOL") _expr.error("Se requiere un tipo booleano aqui");
		}
		
		public InterrogInstruccion(JSExpresion _expr) {
			super();
			this._expr = _expr;
		}

		public void generar(int inicio, int fin){
			int etiqueta1=nuevaEtiqueta();
			int etiqueta2=nuevaEtiqueta();
			_expr.salto(0, etiqueta2);
			emitirEtiqueta(etiqueta1);
			_instr.generar(etiqueta1, fin);
			emitir("goto L"+ fin);
			emitirEtiqueta(etiqueta2);
			_instr2.generar(etiqueta2, fin);
		}

	}