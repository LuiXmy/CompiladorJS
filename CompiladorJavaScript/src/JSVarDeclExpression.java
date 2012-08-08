import java.util.Vector;


public class JSVarDeclExpression {
	Token t;
	Vector<Token> v;
	
	public JSVarDeclExpression(Token t, Vector<Token> v){
		this.t = t;
		this.v = v;
	}

	/**
	 * @return the t
	 */
	public Token getT() {
		return t;
	}

	/**
	 * @param t the t to set
	 */
	public void setT(Token t) {
		this.t = t;
	}

	/**
	 * @return the v
	 */
	public Vector<Token> getV() {
		return v;
	}

	/**
	 * @param v the v to set
	 */
	public void setV(Vector<Token> v) {
		this.v = v;
	}
	
}
