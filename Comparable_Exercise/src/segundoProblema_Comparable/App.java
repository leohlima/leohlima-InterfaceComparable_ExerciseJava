package segundoProblema_Comparable;

import segundoProblema_Comparable.entitie.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        String path = "C:\\Users\\leoli\\OneDrive\\Área de Trabalho\\JAVA\\secao18_Interfaces\\Comparable\\Comparable_Exercise\\in2.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                employeeList.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(employeeList);
            for (Employee n : employeeList) {
                System.out.println(n.getName() + "," + n.getSalary());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
