package xyz.infodata;

public class String2 {

    public static void main(String[] args) {

        char c;
        int n;
        String nl = System.lineSeparator();

        for(c='0'; c<='9'; c++) {
            n = c - 48;
            System.out.printf("%d X 10 = %d"+nl, n, (n * 10));
        }
    }

}
