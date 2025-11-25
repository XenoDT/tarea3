package org.ies.tierno.readers;

import org.ies.tierno.models.Employee;
import org.ies.tierno.models.Position;

import java.util.Scanner;

public class EmployeeReader {
    private final Scanner scanner;

    public EmployeeReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Employee read(){
        System.out.print("Nombre del empleado: ");
        String name = scanner.nextLine();
        System.out.print("Apellidos del empleado");
        String lastName = scanner.nextLine();
        System.out.print("NIF del empleado");
        String nif = scanner.nextLine();
        System.out.println("Posicion del empleado");
        Position position = askPosition();
        Employee employee = new Employee(nif,name,lastName,position);
        return employee;
    }
    private Position askPosition(){
        Position op;
        do{
            Position.printMenu();
            op = Position.fromIndex(scanner.nextInt());
            scanner.nextLine();
        } while (op == null);
        return op;
    }
}
