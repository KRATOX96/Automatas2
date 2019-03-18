package funciones;

import la2.Token;

import java.util.ArrayList;

import la2.*;
public class ValidarAsignacion {
	public static void validar(int tipo1,Token valor,Token token,Token identifier,Token tipo)
	{
		if(tipo1!=getTipos(tipo.image))
		{
			System.out.println("Error semantico("+token.beginLine+":"+valor.beginColumn+"):el tipo de dato de la variable "
					+identifier.image+"("+getTipos(tipo1)+")"+" no es correcto, se esperaba un valor de tipo "
					+tipo.image+" ");
		}
	}
	public static int getTipos(String tipo)
	{
		switch (tipo) {
		case "boolean":
			return 20;
		case "int":
			return 19;
	
		default: 
		return 0;
		}
		
	}
	
	public static String getTipos(int tipo)
	{
		switch (tipo) {
		case 19:
			return "int";
			
		case 20:
			return "boolean";
		default:
			return null;
	}
	
	}
	
	public static void estaDeclarado  (ArrayList<Identificador> Identificadores,Identificador identificador)
	{
		boolean estaDeclarado =false;
		for (Identificador v : Identificadores){
			if (v.getUso().equals("Declaracion"))
				{
				
				if(v.getNombre().equals(identificador.getNombre()))
					estaDeclarado =true;	
				}
			}
		if(!estaDeclarado)
			System.out.println("Error de sintaxis en la fila "+identificador.getPosicion()+": La variable "+identificador.getNombre()+ " no se encuentra declarada");
		
	}
}
