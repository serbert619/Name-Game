import java.util.Scanner;
public class game {
	public static void main (String[] args) {
		System.out.println("What is your name?");
		//User input name for song
		Scanner input = new Scanner(System.in);
		String name;
		name = input.nextLine();
		//Vowel and constant converting
		String s1 = name.replace(name.charAt(0), 'b');
		String s2 = name.substring(1);
		
		System.out.println(s1);
		System.out.println(name + ", " + s1 + ", bo-" + s2);
		System.out.println("banana-fana fo-f" + s2);
		System.out.println("fee-fi-fo-m" + s2);
		System.out.println(name);
		
	}
/*Billy, Billy bo-illy,
Bonana fanna fo Filly,
Fee fy mo Milly,
Billy!*/
}
