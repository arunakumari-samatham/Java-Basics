package generics;

public class DemoTestGenerics {
	public static < E > void printArray(E[] elements) {  
		for (E element:elements) {
			System.out.println(element);

		}
		System.out.println();

	}
	public static void main(String[] args) {
		Integer[] intArray = { 10, 50, 100, 140, 250 };  
		Character[] charArray = { 'A', 'R', 'U', 'N', 'A','K','U','M','A','R','I' };  

		printArray( intArray  );   

		printArray( charArray );   
	}   
}

