public class Main {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        boolean x = true, y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        int c = 5;
        System.out.println(c);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

        int d = 10;
        d += 5;
        System.out.println(d);
        d -= 3;
        System.out.println(d);
        d *= 2;
        System.out.println(d);
        d /= 4;
        System.out.println(d);
        d %= 3;
        System.out.println(d);

        int e = (a > b) ? a : b;
        System.out.println(e);
    }
}
