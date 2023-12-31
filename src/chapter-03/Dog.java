class Dog {
    String name;

    public static void main(String[] args) {
        // make a Dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        // make a Dog array
        Dog[] myDogs = new Dog[3];
        // put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // access the Dogs using the array
        // references
        myDogs[0].name = "Kiki";
        myDogs[1].name = "Momo";

        System.out.print("the last dog's name is ");
        System.out.println(myDogs[2].name);

        // loop through the array
        // tell the dog to bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " says bark.");
    }

    public void eat(){
        System.out.println(name + " eats.");
    }

    public void chaseCat() {
        System.out.println(name + " chases cat.");
    }
}