/* Programa de ejemplo para el Proyecto de Compiladores */
/******* Jos� Luis Fuertes, 15, octubre, 2011 ***********/
/* Este ejemplo incorpora elementos del lenguaje opcionales y elementos que no hay que implementar */

var s;	/* variable global */

function FactorialRecursivo (n)	/* n: par�metro formal de la funci�n entera */
{
	if (n == 0)
	{
		return 1
	}
	return n * FactorialRecursivo (n - 1)	/* llamada recursiva */
}

function FactorialDo (n)
{
	var factorial = 1	// variable local inicializada a uno
	do
	{
		factorial *= n--	// equivale a: factorial = factorial * n; n = n - 1;
	} while (n)		// mientras n no sea 0
	return factorial	// devuelve el valor de la variable factorial
}

function FactorialWhile ()
{
	var factorial = 1, i	// variables locales: factorial inicializada a 1 e i inicializada a 0 por omisi�n
	while (i < num)			// num es variable global sin declarar
	{
		factorial *= ++i	// equivale a: i = i + 1; factorial = factorial * i;
	}
	return factorial
}

function FactorialFor (n)
{
	var i, factorial = 1	/* variables locales */
	for (i = 1; i <= n; i++)
	{
		factorial *= i
	}
	return factorial
}

var For, Do, While;	// tres variables globales

function imprime (msg, f)	/* funci�n que recibe dos argumentos */
{
	document.write (s)
	document.write (msg)
	document.write (f);
	document.write ("\n")	// imprime un salto de l�nea */
	return	/* finaliza la ejecuci�n de la funci�n (en este caso, se podr�a omitir) */
}

s = "El factorial "	// Primera sentencia que se ejecutar�a

document.write (s)
document.write ("\nIntroduce un 'n�mero'.")
prompt (num)	/* se lee un n�mero del teclado y se guarda en la variable global num */

switch (num)
{
	case 1:
	case 0: document.write ("El factorial de ", num, " siempre es 1.\n"); break
	default:
		if (num < 0)
		{
			document.write ('No existe el factorial de un negativo.\n')
		}
		else
		{
			For = FactorialFor (num)
			While = FactorialWhile ()
			Do = FactorialDo (num)
			imprime ("recursivo es: ", FactorialRecursivo (num))
			imprime ("con do-while es: ", Do)
			imprime ("con while es: ", While)
			imprime ("con for es: ", For)
		}
}

function bisiesto (a)	
{			
	return (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
} // fin de bisiesto

function dias (m, a)	
{
	var maxdias
	switch (m)
	{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			maxdias = 31; break
		case 4: case 6: case 9: case 11:
			maxdias = 30; break
		case 2: maxdias = bisiesto (a)? 29: 28
			break
		default: maxdias = 0
	}
	return maxdias
} // fin de dias

function esFechaCorrecta (d, m, a)	
{
	return m>=1 && m<=12 && d>=1 && d <= dias (m, a)
} //fin de esFechaCorrecta

//Declaraci�n del objeto Fecha con tres campos (d, m y a):
function Fecha (dd, mm, aa)
{
	if (esFechaCorrecta (dd, mm, aa)
	{
		this.d=dd; this.m=mm; this.a=aa
		return
	}
	document.write ("Error: La fecha no es correcta.")
}

//Definici�n de funciones que usan el objeto Fecha:

function daDia (new f)
{
	return f.d
}
function daMes (new f)
{
	return f.m
}
function daAnno (new f)
{
	return f.a
}
function imprimeFecha (new f)
{
	var meses=new Array(12)
	meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", 
		 "agosto", "septiembre", "octubre", "noviembre", "diciembre"}
	document.write (d, "-", meses [m-1], "-", a)
}

//Declaraci�n del objeto Persona
function Persona (nom, new nac, mas, num)
{
	this.nombre = nom;	this.nacimiento = nac	// no hay que implementar objetos como campos de objetos
	this.masculino = mas;	this.numero = num
}

//Definici�n de funciones que usan el objeto Persona:
function ponNombre (new p, s)
{
	p.nombre=s
}
ponNumero (new p, n)
{
	p.numero=n
}
function ponFechaNacimiento (new p,f)
{
	p.nacimiento=f;
}
function ponSexo (new p, s)
{
	if (s==1)
	{
		p.masculino=true
	}
	else
	{
		p.masculino=false
	}
}
function daNombre (new p)
{
	return p.nombre;	// esta funci�n devuelve una cadena
}
function daNumero (new p)
{
	return p.numero		// esta funci�n devuelve un entero
}
function daFechaNacimiento (new p)
{
	return p.nacimiento
}
function esMujer (new p)
{
	return !p.masculino
}
function edad (new p)
{
	return 2011 - daAnno (p.nacimiento)
}
function imprimePersona (new p)
{
	var resultado = p.nombre
	resultado += ', con DNI n� ' + p.numero + ', ' + (p.masculino?'hombre':"mujer")
	resultado += ", de " + edad (p) + "a�os de edad, naci� el "
	document.write (resultado)
	imprimeFecha (p.nacimiento)
	document.write ("\n")	//salto de l�nea
}

function personas ()
{
	var yo=new Persona ("Pepe", 0, true, 0)
	var ella=new Persona (0, 0, 0, 0)	//declaro dos objetos de tipo Persona
	var fecha1=new Fecha (11, 2, 1975)	//declaro un objeto de tipo Fecha
	var fecha2=new Fecha (13, 10, 1977)	//declaro un objeto de tipo Fecha

	ponNumero (yo, 1234)	// pongo mi n�mero de DNI con la funci�n
	ella.numero = 4321	/* pongo su n�mero de DNI directamente con el campo */
	ponNombre (ella, "Paloma")

	yo.nacimiento=fecha1	// creo mi fecha de nacimiento
	ponFechaNacimiento (ella, fecha2) // pongo su fecha de nacimiento
	ponSexo (yo, true)	// pongo los sexos
	ponSexo (ella, 0)

	document.write ("Voy a imprimir los datos que he recopilado:\n")
	imprimePersona (yo)
	imprimePersona (ella)
	document.write ("Ahora voy a imprimir mis datos usando las funciones y los campos:\n")
	document.write (daNombre(yo), ", con DNI n� ", yo.numero, ", ")
	document.write ((!esMujer(yo)?"hombre":"mujer"), ", de ")
	document.write (2011-yo.nacimiento.a, " a�os de edad, naci� el ")
	imprimeFecha (yo.nacimiento)	
}

function imprime2 (v, w)	
{
	document.write (v + w, "\n")
} //fin de imprime2

function cuadrados (z[], dim)	
	/* no es necesario indicar el tama�o del vector que se pasa como par�metro */
{
	var s	// esta declaraci�n oculta la s de demo
	for (s=0; s < dim; s++)
	{
		z[s] *= z[s]	/* z[s] = z[s] * z[s]	*/
		imprime ("\nCuadrado:", z[s])	/* Imprime los elementos del vector al cuadrado */
	}
} // fin de cuadrados

function demo ()	/* definici�n de la funci�n demo, sin argumentos y que no devuelve nada */
{
	var i	// Variables locales
	var v = new Array (4), zv = new Array (10)
	var s	// Oculta a la global

	document.write ('Escriba "tres" n�meros: ')
	prompt (v[1]); prompt (v[2]); prompt (v[3])

	if (!((v[1] == v[2]) && (v[1] != v[3])))	/* NOT ((v[1] igual a v[2]) AND (v[1] distinto de v[3]))  */
	{
		v[0] = (v[2] < v[3]) ? v[2]: v[3]	/* si v[2]<v[3], v[0]=v[2]; en otro caso v[0]=v[3] */
	}
	s = "El primer valor era "
	if (v[1])
	{
		s = s + v[1]	// Se convierte v[1] a cadena
		document.write (s + ".\n")
	}
	else
	{
		document.write (s + 0 + ".\n")	// imprime la cadena `El primer valor era 0.\n�
	}

	s=4;	// s contiene ahora un entero
	cuadrados (v, s)
	for (i=1; i <= 10; ++i)
		zv[i-1]=i
	cuadrados (zv, 10)
	document.write ('A continuaci�n se escribe 4 m�s el n�mero introducido para el factorial: ')
	imprime2 (s, num); document.write ("\n")
}

demo(); personas()
/* esto constituye la llamada a dos funciones sin argumentos. 
Es en este instante cuando se llama a estas dos funciones y, por tanto, 
cuando se ejecuta todo el c�digo de dichas funciones */