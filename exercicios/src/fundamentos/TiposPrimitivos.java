package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informaçoes do funcionario
		
		//tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcomulados = 3_134_845_223L;		
		
		//TIPOS NUMERICOS REAIS
		float salario = 11_445.44F;
		double vendasAcomuladas = 2_991_797_103.01;
		
		//TIPO BOORLEANO
		boolean estaDeFerias = false; // true
		
		//TIPO CARACTERE
		char status = 'A'; //ativo
		
		//Dias da empresa
		System.out.println(anosDeEmpresa * 365);
		
		//NUMEROS DE VIAGENS
		System.out.println(numeroDeVoos / 2);
		
		//PONTOS POR REAL
		System.out.println(salario / pontosAcomulados);
		
		System.out.println(id+": ganha -> "+ salario);
		System.out.println("Férias? "+estaDeFerias);
		System.out.println("Status"+status);
		System.out.println("pontos por real"+pontosAcomulados);
		System.out.println(vendasAcomuladas+" total de vendas");
			
	}

}
