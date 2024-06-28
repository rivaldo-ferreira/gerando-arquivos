package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        System.out.println("***** gerando arquivos *****".toUpperCase());
        System.out.println();


        ArrayList<String> lines = new ArrayList<>();
        lines.add("Adauto");
        lines.add("Morfeu");
        lines.add("Celio");
        lines.add("Jurandir");
        lines.add("Raul");

        String path = "D:\\00_JAVA_ECLIPSE\\arquivos\\arquivos_gerados.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            int cont = 1;
            for(String line: lines){
                bw.write(cont + " - " + line);
                bw.newLine();
                cont++;
            }
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("arquivo gerado!".toUpperCase());
        }

    }
}
