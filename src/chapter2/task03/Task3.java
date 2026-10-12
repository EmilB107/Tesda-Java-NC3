/*
    Change the variables in the first section, so that each if statement resolves as true.

    String a = new String("Wow");
    String b = "Wow";
    String c = a;
    String d = c;
*/
package chapter2.task03;

public class Task3 {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = a;
        String c = a + "!";
        String d = b + "!";

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Succcess!");
        }

    }
}