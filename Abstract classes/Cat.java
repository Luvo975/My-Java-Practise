public class Cat extends Animal{

    public void makeSound(){
        System.out.println("The cat will Meuuuw!");
    }

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}
