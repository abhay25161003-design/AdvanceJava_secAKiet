package calc;
import java.util.List;
import java.util.Arrays;
public class Maap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>names=Arrays.asList("sachin", "rahul", "amit");
		System.out.println(names);
		List<String>result=names.stream()
	    .map(n->n.toUpperCase())
	    .toList();
	    System.out.println(result);
	}

}
