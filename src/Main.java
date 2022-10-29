public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("dog");

        dog.name = "Szarik";
        dog.isAlive = true;


        System.out.println(dog.name);
        System.out.println(dog.weight);

        dog.feed();
        System.out.println(dog.weight);

        Human me = new Human();
        me.firstName = "Damian";
        me.pet = dog;

        dog.takeForAWalk();
        System.out.println(dog.weight);
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();


        Car samochód = new Car("Peugeot","307");



        System.out.println(samochód.producer);
        System.out.println(samochód.model);
        System.out.println(samochód);







    }
}