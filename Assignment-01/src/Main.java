public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.capacity = 10;

        Mammal Lion = new Mammal("Lion",5,"Golden");
        Lion.setGender("Male");
        Lion.setHabitat("Jungle");

        Mammal  Elephant = new Mammal("Elephant",10,"Gray");
        Elephant.setGender("Female");
        Elephant.setHabitat("Forest");


        Mammal Giraffe = new Mammal("Giraffe",7,"Spotted");
        Giraffe.setGender("Male");
        Giraffe.setHabitat("Savannah");


        Bird Eagle = new Bird("Eagle",3,2.0);
        Eagle.setGender("Female");
        Eagle.setHabitat("Mountain");

        Bird Parrot = new Bird("Parrot",5,0.5);
        Parrot.setGender("Male");
        Parrot.setHabitat("Forest");


        Bird Penguin = new Bird("Penguin",2,1.0);
        Penguin.setHabitat("Antarctica");
        Penguin.setGender("Female");


        Reptile Snake = new Reptile("Snake",1,"Green");
        Snake.setGender("Female");
        Snake.setHabitat("Desert");


        Reptile Crocodile = new Reptile("Crocodile",3,"Brown");
        Crocodile.setGender("Male");
        Crocodile.setHabitat("Swamp");


        Reptile Turtle = new Reptile("Turtle",4,"Brown");
        Turtle.setGender("Female");
        Turtle.setHabitat("River");


        zoo.addAnimal(Lion);
        zoo.addAnimal(Elephant);
        zoo.addAnimal(Giraffe);
        zoo.addAnimal(Eagle);
        zoo.addAnimal(Parrot);
        zoo.addAnimal(Penguin);
        zoo.addAnimal(Snake);
        zoo.addAnimal(Crocodile);
        zoo.addAnimal(Turtle);

        zoo.feedAnimal(Lion);
        zoo.feedAnimal(Elephant);
        zoo.feedAnimal(Giraffe);
        System.out.println("---------------------------------------------------");

        zoo.feedAnimal(Eagle);
        Eagle.sleep(6);
        zoo.feedAnimal(Parrot);
        Parrot.sleep(8);
        zoo.feedAnimal(Penguin);
        Penguin.sleep(10);
        System.out.println("---------------------------------------------------");

        zoo.feedAnimal(Snake);
        Snake.thermoegulation(1);
        zoo.feedAnimal(Crocodile);
        Crocodile.thermoegulation(2);
        zoo.feedAnimal(Turtle);
        Turtle.thermoegulation(3);
        System.out.println("\n");


        // Sir below two are added to show the capacity exceeded message 😎😎😎
        // Lizard is the 10th animal added to the zoo
        // Cow is the 11th animal which exceeds the capacity of the zoo

        Reptile Lizard = new Reptile("Lizard",2,"Green");
        zoo.addAnimal(Lizard);

        Mammal Cow = new Mammal("Cow",5,"White");
        zoo.addAnimal(Cow);


    }
}
