package Finaltopic;


enum Shapes{
	CIRCLE,TRIANGLE,SQUARE;
}
public class EnumDemo {
	public static void main(String[] args) {
		Shapes s=Shapes.CIRCLE;
		System.out.println(s.ordinal());
		System.out.println(s);
		
		Shapes s1[]=Shapes.values();
		for(Shapes value:s1) {
			System.out.println(value);
		}
		
// Comparing using if-else
		Shapes q=Shapes.SQUARE;
		if(q==Shapes.CIRCLE) {
			System.out.println("No Sides");
		}
		else if(q==Shapes.TRIANGLE) {
			System.out.println("Three Sides");
		}
		else if(q==Shapes.SQUARE) {
			System.out.println("Four Sides");
		}
		else {
			System.out.println("Somethimg Wrong");
		}
		
// Literally using switch case statement
		Shapes c=Shapes.TRIANGLE;
		switch(c){
			case CIRCLE:
				System.out.println("No Sides in Circle");
				break;
			case TRIANGLE:
				System.out.println("Three Sides in Triangle");
				break;
			case SQUARE:
				System.out.println("Foue Sides in Square");
			    break;
			default:
				System.out.println("No Match Found");
			
		}
	}

}
