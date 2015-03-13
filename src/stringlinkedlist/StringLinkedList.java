package stringlinkedlist;

/**
 * Linked list data structure of strings.
 * 
 * @author Vladimirs Ivanovs
 *
 */
public class StringLinkedList implements LinkedList {
	private StringNode head;
	private int size = 0;

	public StringLinkedList() {
	}

	@Override
	public StringNode getFirst() {
		return this.head;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void insertFirst(String value) {
		StringNode newNode = new StringNode(value, null);
		newNode.setNextNode(head);
		head = newNode;
		size++;
	}

	@Override
	public void insertLastRecursive(StringNode startNode, StringNode newNode) {
		if (startNode.getNextNode() == null) {
			startNode.setNextNode(newNode);
			size++;
		} else {
			insertLastRecursive(startNode.getNextNode(), newNode);
		}
		
	}

	@Override
	public String removeFirst() {
		if (isEmpty())
			return null;
		String result = head.getValue();
		head = head.getNextNode();
		size--;
		return result;
	}

	@Override
	public StringNode reversePrint(StringNode node) {
		if (this.size == 0) {
			return null;
		}
		if (node.hasNext()) {
			reversePrint(node.getNextNode());
		}
		System.out.println("NODE: " + node);
		return node;

	}

	@Override
	public boolean find(String value) {
		if(size == 0) return false;
		StringNode node = head;
		while(node.hasNext()){
			if(node.getValue().equals(value)){
				return true;
			}else{
				node = node.getNextNode();
			}
		}
		return false;
	}

}
