package org.ies.tierno.apps;

import org.ies.tierno.models.Company;
import org.ies.tierno.readers.CompanyReader;
import org.ies.tierno.readers.DeparmentReader;
import org.ies.tierno.readers.EmployeeReader;

import java.util.Scanner;

public class CompanyApp {
    private final Scanner scanner;
    private final EmployeeReader employeeReader;
    private final DeparmentReader deparmentReader;
    private final CompanyReader companyReader;

    public CompanyApp(Scanner scanner, EmployeeReader employeeReader, DeparmentReader deparmentReader, CompanyReader companyReader) {
        this.scanner = scanner;
        this.employeeReader = employeeReader;
        this.deparmentReader = deparmentReader;
        this.companyReader = companyReader;
    }

    public void run(){
        Company company = companyReader.read();
        int opt = 0;
        do{
            System.out.println("1. Mostrar departamento");
            System.out.println("2. Mostrar empleados del departamento X");
            System.out.println("3. Mostar empleado");
            System.out.println("4. Salir");
            opt = scanner.nextInt();
            scanner.nextLine();
            if(opt == 1){
                menuOpt1(company);
            } else if(opt == 2){
                menuOpt2(company);
            } else if (opt == 3) {
                System.out.println("Introduce el nombre del departamento:");
                String nameDepart = scanner.nextLine();
                System.out.println("Introduce el NIF del Empleado:");
                String nifEmployee = scanner.nextLine();
                company.findEmployee(nameDepart,nifEmployee);
            } else if (opt == 4) {
                System.out.println("Adios");
            } else {
                System.out.println("Opcion erronea seleccione una correcta");
            }
        } while (opt != 4);
    }

    private void menuOpt2(Company company) {
        System.out.println("Introduce el nombre del departamento:");
        String nameDepart = scanner.nextLine();
        if (company.hasDepartment(nameDepart)){
            company.showEmployees(nameDepart);
        } else{
            System.out.println("No se encuentra el departamento");
        }
    }

    private void menuOpt1(Company company) {
        System.out.println("Introduce el nombre del departamento:");
        String nameDepart = scanner.nextLine();
        if(company.hasDepartment(nameDepart)){
            company.findDepartment(nameDepart);
        } else{
            System.out.println("No se encuentra el departamento");
        }
    }
}
