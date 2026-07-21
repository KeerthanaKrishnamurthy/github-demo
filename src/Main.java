public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        Dog dog = new Dog();
//
//        dog.eat();
//        dog.sleep();
//        dog.makeSound();
//    }

//        //Example 2
//
//        Cat cat = new Cat();
//
//        dog.makeSound();
//        cat.makeSound();
//
//        makeDogSpeak(dog);
//
//        makeCatSpeak(cat);
//
//        Dog dog = new Dog();
//        Cat cat = new Cat();
        Animal animal = new Dog();
        makeAnimalSpeak(animal);

        //animal.makeSound();

        animal = new Cat();

        //animal.makeSound();

        makeAnimalSpeak(animal);

    }
//    static void makeDogSpeak(Dog dog) {
//        dog.makeSound();
//    }
//    static void makeCatSpeak(Cat cat) {
//        cat.makeSound();
//    }

    static void makeAnimalSpeak(Animal animal) {
        animal.makeSound();
    }

}