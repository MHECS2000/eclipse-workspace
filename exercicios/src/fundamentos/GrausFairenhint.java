package fundamentos;

public class GrausFairenhint {
	public static void main(String[] args) {
		// (F° - 32) X 5/9 = C
		/*
		double f =  59.3;
		double c = ((f -32)*5/9);
		
		System.out.print(c+"c°");
		*/
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double firenheit = 86;
		double celcius = (firenheit - AJUSTE)*FATOR;
		
		System.out.print(firenheit+"°f correspondem á "+celcius+"C°");
		
	}

}
