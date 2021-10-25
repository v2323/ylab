package HW02;

public class MainApp {
    public static void main(String[] args) {
        Bird crown = new Bird();
        Cat homeCat = new Cat();
        Dog husky = new Dog();

//        Try to make sound
        crown.makeSound();
        homeCat.makeSound();
        husky.makeSound();

//        Feed animals
        crown.feedAnimal();
        homeCat.feedAnimal();
        husky.feedAnimal();

//        Try to make sound again
        crown.makeSound();
        homeCat.makeSound();
    }
}
