package org.ies.tierno.readers;

import org.ies.tierno.models.Department;
import org.ies.tierno.models.Employee;

import java.util.Scanner;

public class DeparmentReader {
    private final Scanner scanner;
    private final EmployeeReader employeeReader;

    public DeparmentReader(Scanner scanner, EmployeeReader employeeReader) {
        this.scanner = scanner;
        this.employeeReader = employeeReader;
    }

    public Department read(){
        System.out.println("Nombre del departamento");
        String name = scanner.nextLine();
        System.out.println("Presupuesto del departamento");
        int budget = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Cuantos empleados tiene?:");
        int a = scanner.nextInt();
        scanner.nextLine();
        Employee[] employees = getEmployees(a);
        return new Department(name,budget,employees);
    }

    private Employee[] getEmployees(int a) {
        Employee[] employees = new Employee[a];
        for (int i = 0; i < a; i++) {
            employees[i] = employeeReader.read();
        }
        return employees;
    }
}
