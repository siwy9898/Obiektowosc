package equals.hashcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Pracownik p1 = new Pracownik("Jan", "Kowalski", 3000);
		Pracownik p2 = new Pracownik("Jan", "Kowalski", 3001);

		Set <Pracownik> pracownicy = new HashSet<>(Arrays.asList(p1, p2));
		
		System.out.println(p1 == p2); //false
		System.out.println(p1.equals(p2)); // true
		System.out.println(pracownicy.size()); // 1
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		 
	}

}
