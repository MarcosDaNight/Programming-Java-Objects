package aplication;

public class forEach {

	public static void main(String[] args) {
		
		/**
		 * This for is useful for access objects in lists or arrays
		 * This loop is similar to for in an vector / list
		 */
		
		String[] vect = new String[]  {"Maria", "Bob", "Alex"};
		
		for (int i=0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("-----------------");
		int sum = 0;
		for (String obj : vect) {//  : is similar an in of python
			System.out.println(obj);
			sum += 1;
//			if (sum >= 2) {
//				break;
//			}
		}

	}

}
