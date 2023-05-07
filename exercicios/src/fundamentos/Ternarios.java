package fundamentos;

public class Ternarios {
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoFinal = media >= 7.0 ?"aprovado" :media >= 5.0 ?"em recuperação ":"reprovado";
				/*
				 * media >= 7 -> sim entao -> aprovado
				 * 			  -> se não, media >= 5 -> recuperação
				 * 									-> se não, reprovado
				 */
		System.out.println("O aluno está" + resultadoFinal);
		
		
		
	}
}
