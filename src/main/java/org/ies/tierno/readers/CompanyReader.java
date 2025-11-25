package org.ies.tierno.readers;

import org.ies.tierno.models.Company;
import org.ies.tierno.models.Department;

import java.util.Scanner;

public class CompanyReader {
    private final Scanner scanner;
    private final EmployeeReader employeeReader;
    private final DeparmentReader deparmentReader;

    public CompanyReader(Scanner scanner, EmployeeReader employeeReader, DeparmentReader deparmentReader) {
        this.scanner = scanner;
        this.employeeReader = employeeReader;
        this.deparmentReader = deparmentReader;
    }

    public Company read(){
        System.out.print("Nombre de la compañia");
        String name = scanner.nextLine();
        System.out.println("CIF de la compañia");
        int cif = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Cuantos departamentos tiene?:");
        int a = scanner.nextInt();
        scanner.nextLine();
        Department[] departments = getDepartments(a);
        return new Company(name,cif,departments);
    }

    private Department[] getDepartments(int a) {
        Department[] departments = new Department[a];
        for (int i = 0; i < a; i++) {
            departments[i] = deparmentReader.read();
        }
        return departments;
    }
}
