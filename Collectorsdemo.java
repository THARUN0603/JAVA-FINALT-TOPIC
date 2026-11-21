package Finaltopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

	public class Collectorsdemo {

		public static void main (String [] args) {
	/*		List<String> names=Arrays.asList("don,boss,gangster");
			List<String> result=new ArrayList<>();
			for(String name:names) {
				result.add(name.toUpperCase());
			}
			System.out.println(result);
		
		*/
		List<String> names=Arrays.asList("welcome,to,my,world");
		List<String> result=names.stream().
				map(String::toUpperCase).
				collect(Collectors.toList());
		System.out.println(result);
	}

}
