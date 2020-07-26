import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromArraylist {

	public <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
		ArrayList<T> newList = new ArrayList<T>();
		for (T element : list) {
			if (!newList.contains(element)) {
				newList.add(element);
			}
		}

		return newList;
	}

	public static void main(String[] args) {
		List<String> itemList = Arrays.asList("apple", "mango", "cherry", "banana", "guava", "apple", "banana");
		ArrayList<String> list = new ArrayList<String>(itemList);
		System.out.println("List of items before removing duplicates " + list);
		RemoveDuplicateFromArraylist remove = new RemoveDuplicateFromArraylist();
		ArrayList<String> nList = remove.removeDuplicates(list);
		System.out.println("List of items after removing duplicates " + nList);
	}

}
