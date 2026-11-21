package Finaltopic;

class Vararg {
	int sum=0;
	public int add(int...i) {
		for(int value:i) {
			sum+=value;
		}
		return sum;
	}
}
public class VarargsDemo{
	public static void main(String[] args) {
		Vararg obj=new Vararg();
		int res=obj.add(11,33,68,90,3554,253,66,54);
		System.out.println(res);
		
	}
	}


