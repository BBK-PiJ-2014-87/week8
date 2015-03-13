/**
 * A class of a supermarket to test implementation of a PersonQueue class.
 * 
 * @author Vladimirs Ivanovs
 *
 */
public class Supermarket {
	public String name;
	public PersonQueueImpl queue = new PersonQueueImpl();

	public Supermarket(String name) {
		this.name = name;
	}

	public void addPerson(Person person) {
		queue.insert(person);
	}

	public void servePerson() {
		queue.retrieve();

	}

	public static void main(String[] args) {

		// create supermarket for our customers
		Supermarket tesco = new Supermarket("TESCO");
		
		//add a first customer
		tesco.addPerson(new Person("First", 100));

		// predefined array of customers
		Person[] customers = new Person[10];
		customers[0] = new Person("Dave", 72);
		customers[1] = new Person("Jhon", 50);
		customers[2] = new Person("Anna", 29);
		customers[3] = new Person("Matilda", 20);
		customers[4] = new Person("Vlad", 44);
		customers[5] = new Person("Martin", 28);
		customers[6] = new Person("Kate", 10);
		customers[7] = new Person("Mike", 66);
		customers[8] = new Person("Liza", 52);
		customers[9] = new Person("Ted", 22);
		

		

		// inserts predefined array into queue
		for (Person p : customers) {
			tesco.addPerson(p);
		}

		// print out all customers
		PersonQueueImpl.traverse(tesco.queue.getHead());

	}

}
