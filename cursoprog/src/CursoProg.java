import java.util.Scanner;

public class CursoProg {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int combustivel, gasolina,alcool,disel;
		
		alcool = 0;
		gasolina = 0;
		disel = 0;
		
		combustivel = sc.nextInt();
		
		while (combustivel != 4) {
			
			if (combustivel == 1) {
				alcool = alcool + 1;
			}
			else if (combustivel == 2) {
				gasolina = gasolina + 1;
			}
			else if (combustivel == 3) {
				disel = disel + 1;
			}
			
			combustivel = sc.nextInt();
		}
		System.out.println ("MUITO OBRIGADO");
		System.out.println ("Alcool: " + alcool);
		System.out.println ("Gasolina: " + gasolina);
		System.out.println ("Disel: " + disel);
		
		sc.close();
	}
}
