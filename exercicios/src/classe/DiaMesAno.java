package classe;

public class DiaMesAno{
	
	int dia;
	int mes;
	int ano;
	
	DiaMesAno(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
				
	}
	
	String dataFormatada(){
		return String.format("%d/%d/%d", dia, mes, ano) ;
		
	}

}

