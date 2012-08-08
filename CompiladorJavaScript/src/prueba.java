/**
 * 
 */

/**
 * @author Luis Miguel Alberca
 *
 */
public class prueba {

	String s1;
	String s2;
	/**
	 * @param args
	 */
	public prueba(){
		s1="INTEGER";
		s2="INTEGE";
	}
	
	public String comprobarTipo (String id, String expr){
		if(id=="INTEGER" && expr=="INTEGER"){
			return "INTEGER";
		}
		if(id=="BOOL"    && expr=="BOOL"){
			return "BOOL";			
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prueba s1=new prueba();
		String res;
		res=s1.comprobarTipo(s1.s1, s1.s2);
		System.out.println("imprimir "+res);
		
		
		
		
	}

}
