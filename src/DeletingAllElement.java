import java.util.HashSet;

public class DeletingAllElement {

	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<String>();

		hset.add("Element1");
		hset.add("Element2");
		hset.add("Element3");
		hset.add("Element4");
		hset.add("Element5");

		System.out.println("Before: HashSet contains: " + hset);

		hset.clear();

		System.out.println("After: HashSet contains: " + hset);
	}
}