//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sedan corolla = new Sedan("Toyota", "Corolls", 0, 20000);
        Coupe camaro = new Coupe("Chevrolet", "Camaro", 15000, 35000);

        corolla.drive(12000);
        camaro.drive(5000);

        corolla.forSale(18000);
        camaro.forSale(30000);

//        Cat cat = new Cat("Tom", "American Shorthair");
//        cat.setName("Simba");
//
//        System.out.println("We have a " + cat.getBreed() + " cat named " + cat.getName());
//
//        cat.makeSound();
//        cat.sleep();
//
//        Dog dog = new Dog("Rex", "Golden Retriever");
//        dog.makeSound();
//        dog.sleep();
//        dog.goodBoy();


//        ClassDemo instance = new ClassDemo();
//        ClassDemo instance2 = new ClassDemo();
//
//        instance.number = 10;
//        instance2.text = "New text";
//
//        instance.printNumber();
//        instance2.printNumber();
//
//        instance.printText();
//        instance2.printText();
//
//        ClassDemo.text = "Third text";
//        instance.printText();
//        ClassDemo.printText();

//        Lamp kitchenLamp = new Lamp("Kitchen");
//        Lamp bedroomLamp = new Lamp("Bedroom");
//
//        kitchenLamp.printLightStatus();
//        bedroomLamp.printLightStatus();
//
//        kitchenLamp.lightStatus = true;
//
//        kitchenLamp.printLightStatus();
//        bedroomLamp.printLightStatus();

//        Programming programming = new Programming("Java");
//        programming.learningStatus();
//        programming.completeLearning();
//        programming.learningStatus();
    }
}