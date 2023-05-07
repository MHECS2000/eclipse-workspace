package fundamentos;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.print(a);
		System.out.print(b);
		
		System.out.println("Mini desafio...");//imagine se vai ser verdadeiro ou falso
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
		/*
		 * na linha 18 da verdadeiro, pois é executado o ++a antes da verificação
		 * de verdadeiro ou falso e após é executado o b-- o operador que estiver a 
		 * esquerda sempre será executado antes do boolean
		 */
		
		
	}

}
