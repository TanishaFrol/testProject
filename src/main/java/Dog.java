public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void seeDog (Dog this) {
        System.out.println("Look! What a nice dog!");
    }
}
