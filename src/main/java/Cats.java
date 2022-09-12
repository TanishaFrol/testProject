public class Cats {
    String name;
    int age;

    public Cats(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void seeCat (Cats this) {
        System.out.println("Look! What a nice cat!");
    }


}
