/**
 * A simple class of a Person.
 * 
 * @author Ivanovs Vladimirs
 *
 */
public class Person {
	private String name;
	private int age;
	private Person next;
	private Person previous;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, Person next, Person previous) {
		this.name = name;
		this.age = age;
		this.next = next;
		this.previous = previous;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setNext(Person next) {
		this.next = next;
	}

	public void setPrevious(Person previous) {
		this.previous = previous;
	}

	public Person getNext() {
		return next;
	}
	
	public Person getPrevious() {
		return previous;
	}

	/**
	 * Returns customer name and age as a string.
	 */
	@Override
	public String toString() {
		String resultName = "Customer: " + this.name + " Age: " + this.age;
		return resultName;

	}

	/**
	 * Returns true if names and ages of customers of type Person are identical.
	 * Otherwise returns false.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person && obj != null) {
			Person person = (Person) obj;
			return person.getName().equals(this.getName())
					&& person.getAge() == this.getAge();
		} else {
			return false;
		}

	}
}