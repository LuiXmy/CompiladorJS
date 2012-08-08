/**
 * @author Luis Miguel Alberca
 *
 */
public class JSTemporal extends JSExpresion{
	static int conteo=0;
	int numero=0;
	
	public JSTemporal(JSExpresion expr){
		super(expr._operacion, expr._tipo);
		numero=++conteo;
	}
	
	public String toString(){
		return "t"+numero;
	}

}
