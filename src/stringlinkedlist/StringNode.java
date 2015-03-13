package stringlinkedlist;
/**
 * String node class
 * @author Vladimirs Ivanovs
 *
 */
public class StringNode {
	private String value;
	private StringNode next;
	
	public StringNode(String value, StringNode next){
		this.value = value;
		this.next = next;
	}
	
	public String getValue(){
		return this.value;
	}
	
	public StringNode getNextNode(){
		return this.next;
	}
	
	/**
	 * Returns true if element has next node. Returns false otherwise.
	 * @return
	 */
	public boolean hasNext(){
		if(this.getNextNode() != null)
			return true;
		return false;
					
	}
	
	public void setNextNode(StringNode next){
		this.next = next;
	}
	
	@Override
	public String toString(){
		return this.value;
		
	}

}
