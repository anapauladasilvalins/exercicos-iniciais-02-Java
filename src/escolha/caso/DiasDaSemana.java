package escolha.caso;

import java.util.Scanner;

public class DiasDaSemana {
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual o seu dia da semana favorito? ");
		System.out.println(" Digite uma das op��es abaixo: ");
				
		int num = in.nextInt();
		
		String dia ;
		switch  (num) {
			case 1:
				dia = "DOMINGO";
				break;
			case 2:
				dia = "SEGUNDA";
				break;
			case 3: 
				dia = "TER�A";
				break;
			case 4:
				dia = "QUARTA";
				break;
			case 5: 
				dia = "QUINTA";
				break;
			case 6:
				dia = "SEXTA";
				break;
			case 7:
				dia = "S�BADO";
				break;
			default:
				dia = "DIA INV�LIDO!";
					
		
			
		}
		System.out.println("Meu dia da semana favorito � " + dia);
	}
	

}
