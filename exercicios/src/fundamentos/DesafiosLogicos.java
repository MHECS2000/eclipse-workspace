package fundamentos;

public class DesafiosLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean TV50	 = trabalho1 && trabalho2 ;
		boolean TV32	 = trabalho1 ^ trabalho2;
		boolean SORVETE  = trabalho1 || trabalho2;
		boolean SHOPING  = trabalho1 || trabalho2;
		boolean SALDAVEL = !SORVETE;
		
		//CONVERÇÃO DE BOOLEAN PARA ISTRING
		
		String Tv50 = Boolean.toString(trabalho1 && trabalho2);
		String Tv32 = Boolean.toString(trabalho1 ^ trabalho2);
		String shoping = Boolean.toString(trabalho1 || trabalho2);
		String sorvete = Boolean.toString(trabalho1 || trabalho2);
		String saldavel = Boolean.toString(!(trabalho1 || trabalho2));
		
		
		System.out.printf("\nTV de 50'' = " + Tv50);
		System.out.printf("\nTV de 32'' = " + Tv32);
		System.out.printf("\nshoping    = " + shoping);
		System.out.printf("\nsorveteria = " + sorvete);
		System.out.println("\nMais saldavel? = " + saldavel);
		
		//UTLIZAÇÃO SEM A CONVERSAO
		
		System.out.printf("\nTV de 50'' = " + TV50);
		System.out.printf("\nTV de 32'' = " + TV32);
		System.out.printf("\nshoping    = " + SHOPING);
		System.out.printf("\nsorveteria = " + SORVETE);
		System.out.println("\nMais saldavel? = " + SALDAVEL);
		
		
	}
	
	


}
