class Animal {
  public void eat() {
    System.out.println("Animal eats");
  }
}

class Dog1 extends Animal {
  @Override
  public void eat() {
    super.eat(); // Call the Animal eat() method
    System.out.println("Dog eats");
  }
public static void main(String arg[]){

Dog1 d1=new Dog1();
d1.eat();
}
}
