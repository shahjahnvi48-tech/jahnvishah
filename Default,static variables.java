class classobj {

    String name;
    int age;
    float height;
    static int weight;

    // Constructor
    classobj(String a, int b, float c, int d) {
        name = a;
        age = b;
        height = c;
        weight = d;
    }

    // Method to display info
    void displayinfo() {
        System.out.println(
            "Person info: " + name + " " + age + " " + height + " " + weight
        );
    }

    // Static method
    static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    // Main method
    public static void main(String[] args) {

        classobj obj = new classobj("Rahul", 20, 5.8f, 60);
        obj.displayinfo();

        int sum = add(10, 20);
        System.out.println("Sum = " + sum);
    }
}
