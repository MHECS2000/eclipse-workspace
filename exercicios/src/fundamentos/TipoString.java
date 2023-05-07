package fundamentos;

public class TipoString {
		
		public static void main(String[] args) {
			System.out.println("Olá pessoal".charAt(2));
			
			String s = "Boa tarde";
			System.out.println(s.concat("!!!"));
			System.out.println(s+"!!!");
			System.out.println(s.startsWith("Boa"));
			//booleano
			System.out.println(s.toLowerCase().startsWith("boa"));
			//booleano
			System.out.println(s.toUpperCase().endsWith("TARDE"));
			//booleano
			System.out.println(s.length());
			//vai um numero inteiro de quantidade de caracteres da string
			System.out.println(s.toLowerCase().equals("boa tarde"));
			System.out.println(s.equalsIgnoreCase("boa tarde"));
			
			var nome = "Mateus";
			var sobrenome ="Santos";
			var idade = 23;
			var salario = 12345.987;
			
			System.out.println("Nome: " + nome + "\nSobrenome:"
			+ sobrenome +"\nIdade:"+ idade + "\nsalario" + salario);
			
			System.out.printf("O senhor %s %s tem %d anos e ganha %.2f", nome, sobrenome, idade, salario);
			
			String frase = String.format("O senho %s %s tem %d anos e ganha %.2f", nome,
					sobrenome, idade, salario);
			System.out.println(frase);
		}
	
}
