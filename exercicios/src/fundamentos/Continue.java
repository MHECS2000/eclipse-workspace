package fundamentos;

public class Continue {
	
	public static void main(String[] args) {
		
		externo:
		for (int i = 0; i < 10; i++ ) {
			if(i % 2 == 1) {
				continue externo;
			}
			
			System.out.println(i);
		}
	} 
}
