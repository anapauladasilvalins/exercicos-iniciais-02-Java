package escolha.caso;

import java.util.Scanner;

public class MesAniversario {
	
	public static void main(String[] args) {
		
		Scanner niver = new Scanner(System.in);
		
		System.out.println("Informe o mês do seu aniversário:");
		 
		int num =  niver.nextInt();
		String mes;
		 
		switch (num) {
		 	case 1:
		 		mes = ("Janeiro. " + "Verão.");
		 		
		 		break;
		 		
		 	case 2: 
		 		mes = ("Fevereiro. " + "verão.");
		 		
		 		break;
		 	case 3: 
		 		mes = ("Março. " + "Outono.");
		 		break;
		 	case 4: 
		 		mes = ("Abril. " + "Outono.");
		 		break;
		 	case 5: 
		 		mes = ("Maio. " + "Outono.");
		 		break;
		 	case 6: 
		 		mes = ("Junho. " + "Iverno.");
		 		break;
		 	case 7: 
		 		mes = ("Julho. " + "Inverno.");
		 		break;
		 	case 8: 
		 		mes = ("Agosto. " + "Inverno.");
		 		break;
		 	case 9: 
		 		mes = ("Setebro. " + "Primavera.");
		 		break;
		 	case 10: 
		 		mes = ("Outubro." + "Primavera.");
		 		break;
		 	case 11: 
		 		mes = ("Novembro. " + "Primavera.");
		 		break;
		 	case 12: 
		 		mes = ("Dezembro. " + "Verão.");
		 		//System.out.println("Verão");// Pode ser assim também.
		 		break;
		 	default : 
		 		mes = "Mês Inválido!";
		 		break;
		 }
		 System.out.println("O mês do meu anversário é " + mes);
		
		/*				
		 if (num == 12 && num <=2 ) {
			 System.out.println("Verão");
			 
		 }
		 else if(num ==3 && num <= 5) {
				 System.out.println("Outono");
				 
		 }
		 else if(num ==6 && num <= 8) {
				 System.out.println("Inverno");
				 
		 }
		 else {
			 
			 System.out.println("primavera"); 
		}
		 */
	}

}