package org.ies.tierno.models;

import java.util.Objects;

public class Employee {
    private String nif;
    private String name;
    private String lastName;
    private Position position;

    public Employee(String nif, String name, String lastName, Position position) {
        this.nif = nif;
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public void showInfo(){
        System.out.println("nif = " + nif);
        System.out.println("name = " + name);
        System.out.println("lastName = " + lastName);
        System.out.println("position = " + position);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(nif, employee.nif) && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName) && position == employee.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, lastName, position);
    }

    public String getNif() {
        return nif;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setNif(String nif) {

        this.nif = nif;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
