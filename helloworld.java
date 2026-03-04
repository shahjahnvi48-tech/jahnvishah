public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
// EXPECTED OUTPUT: Hello,World!


// classes and objects 
class Student {

    int id;
    String name;

    void display() {
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.id = 101;
        s1.name = "Jahnvi";

        s1.display();
    }
}
    // expected output: 101
                     // jahnvi
    
                    
