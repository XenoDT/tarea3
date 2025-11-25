package org.ies.tierno;

import org.ies.tierno.apps.CompanyApp;
import org.ies.tierno.readers.CompanyReader;
import org.ies.tierno.readers.DeparmentReader;
import org.ies.tierno.readers.EmployeeReader;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeReader employeeReader = new EmployeeReader(scanner);
        DeparmentReader deparmentReader = new DeparmentReader(scanner,employeeReader);
        CompanyReader companyReader = new CompanyReader(scanner,employeeReader,deparmentReader);
        CompanyApp companyApp = new CompanyApp(scanner,employeeReader,deparmentReader,companyReader);
        companyApp.run();
    }
}