package stringlinkedlist;
/**
 * Class to test Linked list implementation.
 * 
 * @author Vladimirs Ivanovs
 *
 */
public class AppStringLinkedList {

	public static void main(String[] args) {
		StringLinkedList list = new StringLinkedList();
		
		list.insertFirst("First");
		list.insertFirst("Second");
		list.insertFirst("Third");
		list.insertLastRecursive(list.getFirst(), new StringNode("LAST", null));
		list.insertLastRecursive(list.getFirst(), new StringNode("THE FINAL ONE", null));
		
		//check size of the list
		System.out.println("Size of the list: "+ list.getSize());
		list.removeFirst();
		//check size of the list after element was removed
		System.out.println("Size of the list after remove: "+ list.getSize());
		
		//search for element named LAST
		System.out.println(list.find("LAST"));

		list.reversePrint(list.getFirst());
	}
}
