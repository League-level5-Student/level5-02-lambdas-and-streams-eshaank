package _03_Sorting_With_Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class StreamSorter {
	public static void main(String[] args) {
		Double[] nums = new Double[50];
		String[] list = {"hi", "bye"};
		Stream<String> dubStream = Arrays.stream(list);
		for(int i = 0; i < nums.length; i++) {
			Random rGen = new Random();
			nums[i] = rGen.nextDouble() * 30;
		}
		
		//1. Convert the Integer array to Stream object.
		Stream<Double> s = Stream.of(nums);
		
		//2. Use the sorted method of the stream to sort the numbers.
		//s.sorted().forEach(i -> System.out.println(i));
		//3. Use the forEach method with a lambda to print all the elements of the sorted Stream.
		//   They should be in ascending order.
		
		
		//Stream.of(nums).sorted().forEach((i -> System.out.println(i)));
		//dubStream.forEach(i -> System.out.println(i.charAt(0)));
		
		
		
		Double[] d = new Double[10];
		for (int i = 0; i < d.length; i++) {
			d[i] = (Math.random() * 30) + 1;
			//System.out.println(d[i]);
		}
		Stream st = Stream.of(d);
		st.sorted().forEach((i) -> System.out.println(i)); 

	}
	
	
	
}
