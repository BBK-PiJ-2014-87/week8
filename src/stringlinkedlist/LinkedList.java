package stringlinkedlist;

/**
 * Interface containing most useful methods for a linked list class.
 * 
 * @author Vladimirs Ivanovs
 *
 */
public interface LinkedList {

	/**
	 * Returns true if the list is empty.
	 * 
	 * @return
	 */
	boolean isEmpty();

	/**
	 * Returns the size of linked list.
	 * 
	 * @return
	 */
	int getSize();

	/**
	 * Returns first element in the list
	 * 
	 * @return
	 */
	StringNode getFirst();

	/**
	 * Creates and inserts new node in the beginning of the list.
	 * 
	 * @param value
	 */
	void insertFirst(String value);

	/**
	 * Inserts node in the end of the list.
	 * 
	 * @param value
	 */
	void insertLastRecursive(StringNode head, StringNode node);

	/**
	 * Removes and returns the first element of the list.
	 * 
	 * @return
	 */
	String removeFirst();

	/**
	 * Prints nodes of the list in the reverse order using recursion.
	 * 
	 * @param node
	 * @return
	 */
	StringNode reversePrint(StringNode node);

	/**
	 * Returns true if element was found in the list. Returns false otherwise.
	 * 
	 * @param node
	 * @return
	 */
	boolean find(String value);

}
