class Animal {
  public String name;

  public Animal(String name) {
    this.name = name;
  }
}

class Dog2 extends Animal {
  public Dog2 (String name) {
    super(name); // Call the Animal constructor.
  }

  public void printName() {
    System.out.println(super.name); // Access the Animal name variable
  }
public static void main (String arg[]){
	Dog2 d1=new Dog2("Puppy");
	d1.printName();
}
}
