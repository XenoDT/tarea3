package org.ies.tierno.models;

import java.util.Arrays;
import java.util.Objects;

public class Department {
    private String name;
    private int budget;
    private Employee[] employees;

    public Department(String name, int budget, Employee[] employees) {
        this.name = name;
        this.budget = budget;
        this.employees = employees;
    }

    public void showInfo(){
        System.out.println("name = " + name);
        System.out.println("budget = " + budget);
        for (Employee employee: employees) {
            employee.showInfo();
        }
    }
    public void showEmployees(){
        for (Employee employee: employees) {
            employee.showInfo();
        }
    }
    public boolean hasNif(String nif){
        for (Employee employee: employees){
            if (employee.getNif().equals(nif)){
                return true;
            }
        }
        return false;
    }
    public void showEmployeeNif(String nif){
        for (Employee employee: employees) {
            if(employee.getNif().equals(nif)){
             employee.showInfo();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return budget == that.budget && Objects.equals(name, that.name) && Objects.deepEquals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, budget, Arrays.hashCode(employees));
    }
}
