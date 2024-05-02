package chapter4;
/*
does not compile
 */
int size = 420;
String name = "Donny";

class PoorDog {
    private int size = 300;
    private String name = "Fido";

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}

public class PoorDogTestDrive {
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("Dog size is " + one.getSize());
        System.out.println("Dog name is " + one.getName());
    }
}
