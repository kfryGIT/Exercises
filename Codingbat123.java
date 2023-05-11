

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Codingbat123 {
	
	public static List<Integer> square(List<Integer> nums) {
		  return nums.stream()
		  .map(el->el*el)
		  .collect(Collectors.toList());
		}

	public static void main(String[] args) {
		
		List <Integer>list1=new ArrayList<>();
		list1.add(1);
		list1.add(6);
		list1.add(3);
		System.out.print(list1);
		System.out.print(
		square(list1));

	}

}
