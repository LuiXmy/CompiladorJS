/**
 * @author Luis Miguel Alberca
 *
 */
public class Instruccion extends JSNodo{

	public Instruccion(){}
	public static Instruccion Null = new Instruccion();
	public void generar(int inicio, int fin){} //Inicio: inicio del codigo para esta instruccion
											   //fin: Primera instruccion despues del codigo para esta instruccion
	int despues=0;
	public static Instruccion Circundante=Instruccion.Null;	
}
