
public interface PersonQueue {
	
	/**
	 * Adds another person to the queue.
	 * @param person
	 */
	void insert(Person person);
	
	/**
	 * Removes a person from the queue.
	 * 
	 * @return a person
	 */
	Person retrieve();
	
	boolean isEmpty();
	
	Person first();
	
	Person last();
	
	int size();
	
	
	
	


}
