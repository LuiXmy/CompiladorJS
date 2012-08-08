/**
 * @author Luis Miguel Alberca
 *
 */

/*
 * Las construcciones de expresiones las har� con subclases de �sta.
 * 
 * 
 */
public class JSExpresion extends JSNodo{
	public Token _operacion;	//La operacion que realiza la expresi�n en este nodo(CREO QUE ES CODIGO DE TRES DIRECCIONES)
	public String _tipo;		//El tipo que esa expresi�n tiene en el nodo del arbol
	
	public JSExpresion(Token op, String tipo){
		_operacion=op;
		_tipo=tipo;
	}
	public JSExpresion(Token op){//He a�adido esto porque necesito pasar cadenas o enteros unicamente hacia arriba
		_operacion=op;
	}
	public JSExpresion generar(){//Se redefinir� en subclases para hacerlo m�s espec�fico
		return this;
	}
	
	public JSExpresion reducir(){//Se redefinir� en subclases para hacerlo m�s espec�fico
								 //reduce una expresion hasta una sola direcci�n E1+E2 a E por ejemplo
		return this;
	}
	
	/////SALTO DE LAS EXPRESIONES BOOLEANAS tenemos que pensar como hacerlo 
	public void salto(int verdadero, int falso){
		emitirsalto(toString(), verdadero, falso);
	}
	public void emitirsalto(String prueba, int verdadero, int falso){
		if(verdadero!=0 && falso!=0){
			//imprimir("if "+ prueba+" goto L"+verdadero);
			//imprimir("goto Lugar "+falso);
			System.out.println("if "+ prueba+" goto L"+verdadero);
			System.out.println("goto Lugar "+falso);
		}
		else if( verdadero != 0) System.out.println("if "+prueba+"goto L"+verdadero);//imprimir("if "+prueba+"goto L"+verdadero);
		else if( falso != 0) System.out.println("iffalse "+prueba+"goto L"+falso);//imprimir("iffalse "+prueba+"goto L"+falso);
		else ; //no hacemos nada aqui por que verdadero y falso pasan directos
	}
	/////FIN SALTO OPERACIONES BOOLEANAS
	
	public String toString(){
		return _operacion.toString();
	}
}
