package primeiroProblema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String path = "C:\\Users\\leoli\\OneDrive\\Área de Trabalho\\JAVA\\secao18_Interfaces\\Comparable\\Comparable_Exercise\\in1.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String name = br.readLine();
            while (name != null){
                list.add(name);
                name = br.readLine();
            }
            Collections.sort(list);
            for (String n : list){
                System.out.println(n);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
