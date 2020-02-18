package xyz.infodata;

import java.io.IOException;
import java.util.Scanner;

public class String3 {

    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        String nome;
        char sexo;

        System.out.println("Informe um nome:");
        nome = ler.nextLine();

        System.out.println("Informe o sexo (M/F):");
        sexo = (char) System.in.read();

        if ((sexo == 'M') || (sexo == 'm')) {
            System.out.println("Seja bem-vindo Sr." + nome);
        } else {
            System.out.println("Seja bem-vinda Sra." + nome);
        }
    }
}
