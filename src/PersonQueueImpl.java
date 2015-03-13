/**
 * A class of a queue of objects of type Person implemented
 * using doubly-linked list data structure.
 * 
 * @author Vladimirs Ivanovs
 *
 */
public class PersonQueueImpl implements PersonQueue{
	private Person head;
	private Person tail;
	private static int customersCount = 0;
	
	public PersonQueueImpl() {
		head = new Person("HEAD", 0, null, null);
		tail = new Person("TAIL", 0, null, head);
		head.setNext(tail);
	}

	/**
	 * Inserts a person in a queue.
	 */
	@Override
	public void insert(Person person) {
		person.setNext(head.getNext());
		person.setPrevious(head);
		head.getNext().setPrevious(person);
		head.setNext(person);
		customersCount++;
	}
	
	/**
	 * Creates and inserts a person in the queue using name and age.
	 * Overloaded method.
	 * @param name
	 * @param age
	 */
	public void insert(String name, int age){
		Person newCustomer = new Person(name, age);
		newCustomer.setNext(head.getNext());
		newCustomer.setPrevious(head);
	}
	
	public Person getHead(){
		return head;
	}

	@Override
	public Person retrieve() {
		
		// TODO Auto-generated method stub
		return null;
	}

	public static Person traverse(Person person){
		if(person != null){
			System.out.println(person);
			person = person.getNext();
			traverse(person);
		}
		return person;
		
	}
	/**
	 * Returns true if there is at least one Person in the queue.
	 * Returns false otherwise.
	 */
	@Override
	public boolean isEmpty() {
		if(head.getNext().equals(tail))
			return false;
		return true;
	}

	/**
	 * Returns first customer in the queue.
	 * Return null if queue is empty.
	 */
	@Override
	public Person first() {
		if(head.getNext().equals(tail)){
			return null;
		}
		return head.getNext();
	}

	/**
	 * Returns last customer in the queue.
	 * Returns null if queue is empty.
	 * 
	 */
	@Override
	public Person last() {
		if(tail.getPrevious().equals(head)){
			return null;
		}
		return tail.getPrevious();
	}

	/**
	 * Returns the size of the queue.
	 */
	@Override
	public int size() {
		return customersCount;
	}
	
	
	

}
