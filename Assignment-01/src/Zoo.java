public class Zoo implements ZooKeeper{

    int animalCount = 0;
    int capacity = 10;
    Animal[] animals = new Animal[capacity];

    public void addAnimal(Animal animal){
        if(animalCount < capacity){
            animals[animalCount] = animal;
            animalCount++;
        }
        else{
            System.out.println("Capacity is exceeded.");
        }
    }
    @Override
    public void feedAnimal(Animal animal) {
        System.out.println("Zookeeper is feeding " + animal.name);
        animal.eat();
        animal.makeSound();

    }
}
