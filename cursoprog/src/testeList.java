import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class testeList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		String palavra = sc.nextLine();
		
		list.add("Maria");
		list.add("Marcos");
		list.add("Karine");
		list.add("Aurora");
		list.add("Amélia");
		list.add("Alice");
		list.add("Gisele");
		list.add(palavra);
		list.add(2, "EHNOIS");
		
		System.out.println(list.size());
		
		
		for (String x : list) {
			System.out.println(x);
			
		}
		System.out.println("----------------------");
		list.remove(2);
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
			
		}
		System.out.println("----------------------");
		System.out.println("Index of Aurora: " + list.indexOf("Aurora"));
		
		System.out.println("----------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
			
		}
		System.out.println("----------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println(name);
		
	}	
		
}
