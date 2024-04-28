package Polymorfizm;

public class Main {

    public static void main(String[] args) {

        Animal dog  = new Dog();
        Animal cat = new Cat();

        Animal[] animals = {dog,cat};
        for (Animal animal:animals){
            animal.sound();
        }
    }
}
