class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Ruff! Ruff!");
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog(); // make Dog object
        d.size = 40; // use the dot operator to set the size of the dog
        d.bark(); // call its bark() method
    }
}