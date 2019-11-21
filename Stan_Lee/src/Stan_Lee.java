import java.util.Scanner;

public class Stan_Lee {

	public static void main(String[] args) {
		Scanner leernum = new Scanner(System.in);
		Scanner leer = new Scanner(System.in);
		int repeticiones = 0;
		String frase = "";
		int contRep = 0;
		int contCam = 0;
		int cont = 0;
		repeticiones = leernum.nextInt();
		do {
			frase = leer.nextLine().toLowerCase();
			for (int i = 0; i < frase.length(); i++) {
				switch (frase.codePointAt(i)) {
				case 115:
					cont=0;
					cont+=1;
					
					break;
				case 116:
					if (cont==1)
					cont++;
					break;
				case 97:
					if (cont==2)
					cont++;
					break;
				case 110:
					if (cont==3)
					cont++;
					break;
				case 108:
					if (cont==4)
					cont++;//cont = 5
					break;
				case 101:
					if (cont==5) {
						cont++;
					}else if (cont==6) {
						contCam++;
						cont=0;
					}
					
					
					break;
				}
				
				
				
				
				
				
			}
			System.out.println(contCam);
			contRep += 1;
		} while (contRep != repeticiones);
		
		
//		if (frase.charAt(i) == 'S' || frase.charAt(i) == 's') {
//					cont = 0;
//					cont += 1;
//				} else if (( frase.charAt(i) == 't') && cont == 1) {
//					cont += 1;
//				} else if (( frase.charAt(i) == 'a') && cont == 2) {
//					cont += 1;
//				} else if (( frase.charAt(i) == 'n') && cont == 3) {
//					cont += 1;
//				} else if (( frase.charAt(i) == 'l') && cont == 4) {
//					cont += 1;
//				} else if (( frase.charAt(i) == 'e') && cont == 5) {
//					cont += 1;
//				} else if (( frase.charAt(i) == 'e') && cont == 6) {
//					contCam += 1;
//					cont = 0;
//				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
