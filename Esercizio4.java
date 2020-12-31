import java.util.Scanner;

public class Esercizio4 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			String email = null;
			System.out.println("Inserisci il tuo indirizzo email ");
			email=input.nextLine();
			if(controlloEmail(email)) {
				System.out.println("Il tuo indirizzo email e' valido");
			}else {
				System.out.println("Indirizzo email non valido");
			}
		}catch(Exception e) {
			System.out.println("Indirizzo email non valido");
		}
	}
	
	
	public static boolean controlloEmail(String e) throws ArrayIndexOutOfBoundsException{
		String[] parte2 = null;
		String[] parte4 = null;
		String tmp = null;
		boolean flag = false;
		boolean flag2 = false;
		int count = 0;
		
		char[] parte1= e.toCharArray();
		for (char c : parte1) {
			if(c==' ') {
				return false;
			}
			if(c=='@') {
				parte2=e.split("@");
				flag=true;
			}
		}
		if(!flag) {
			return false;
		}
		if(parte2[0].length() == 0) {
			return false;
		}
		char[] parte3= parte2[1].toCharArray();
		tmp=parte2[1].toString();
		for (char c : parte3) {
			if(c=='.') {
				parte4 = tmp.split(Pattern.quote("."));
				flag2 = true;
				count++;
			}
		}
		if(!flag2) {
			return false;
		}
		if(count > 1) {
			return false;
		}
		if(parte4[1].length()<2 || parte4[1].length()>3) {
			return false;
		}
		
		return true;
	}


}
