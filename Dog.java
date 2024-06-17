class Animal {
  public Animal() {
    System.out.println("Animal constructor");
  }
}
class Dog extends Animal {
  public Dog() {
    super(); // Call the Animal constructor
    System.out.println("Dog constructor");
  }
public static void main(String arg[]){

Dog  d1=new Dog();
}
}