package designpatterns.flyweight;

public class StringMain {

    public static void main(String[] args) {
        String name = "John";
        String s = "John";

        System.out.println(name == s);

        String s1 = "Jo" + "hn";
        System.out.println(name == s1);

        String p1 = "Jo";
        String p2 = "hn";
        String s2 = p1 + p2;
        System.out.println(name == s2);

        String s3 = s2.intern();
        System.out.println(name == s3);

        Integer i = 6;
        Integer i1 = 6;
        System.out.println(i == i1);

        Integer i2 = 300;
        Integer i3 = 300;
        System.out.println(i2 == i3);
    }
}
