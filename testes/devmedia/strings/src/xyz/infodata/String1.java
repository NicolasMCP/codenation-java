package xyz.infodata;

public class String1 {

    public static void main(String[] args) {
        int i;
        String nl = System.lineSeparator();
        System.out.println("Caracteres Numéricos:");
        for (i=48; i<=57; i++) {
            System.out.printf("%c", i);
        }
        System.out.println(nl+nl+"Caracteres alfabéticos maiúsculos:");
        for (i=65; i<=90; i++) {
            System.out.printf("%c", i);
        }
        System.out.println(nl+nl+"Caracteres alfabéticos minúsculos:");
        for (i=97; i<=122; i++) {
            System.out.printf("%c", i);
        }
        System.out.println();
    }

}
