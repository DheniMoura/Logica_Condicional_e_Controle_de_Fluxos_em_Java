public class operadoresSimilaridadeTamanho {
    public static void main(String[] args) throws Exception {
        
        int i1 = 10;
        int i2  = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;
        Long l1 = 1597l;
        Long l2 = 8897l;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 <= f2 " + (f1 <= f2));
        System.out.println("f1 >= f2 " + (f1 >= f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));
        System.out.println("c1 > c2 " + (c1 > c2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 != s2 " + (s1 != s2));
        System.out.println("s1 <= s2 não é possível comparar!"); 
        System.out.println("s1 > s2 não é possível comparar!");

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        System.out.println("b1 <= b2 não é possível comparar!"); 
        System.out.println("b1 > b2 não é possível comparar!");

        System.out.println("s1 == c2 não é possível comparar!");
        System.out.println("c1 != s2 não é possível comparar!");

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));

        System.out.println("l1 == l2 " + (l1 == l2));
        System.out.println("l1 > l2 " + (l1 > l2));
        System.out.println("l1 >= i1 " + (l1 >= i1));
        System.out.println("h1 < l2 " + (h1 == l2));
        System.out.println("y1 <= i2 " + (y1 <= i2));
    }
}
