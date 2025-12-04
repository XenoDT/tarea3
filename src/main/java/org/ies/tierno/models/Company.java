package org.ies.tierno.models;

import java.util.Arrays;
import java.util.Objects;

public class Company {
    private String name;
    private int cif;
    private Department[] departments;

    public Company(String name, int cif, Department[] departments) {
        this.name = name;
        this.cif = cif;
        this.departments = departments;
    }
    public boolean hasDepartment(String nameDepart){
        for (Department department: departments){
            if(department.getName().equals(nameDepart)){
                return true;
            }
        }
        return false;
    }
    public void findDepartment(String nameDepart){
        for (Department department: departments){
            if(department.getName().equals(nameDepart)){
                department.showInfo();
            }
        }
    }

    public void showEmployees(String nameDepart){
        for (Department department: departments){
            if(department.getName().equals(nameDepart)){
                department.showEmployees();
            }
        }
    }
    public void findEmployee(String nameDepart, String nif){
        for (Department department: departments){
            if(department.getName().equals(nameDepart)){
                if(department.hasNif(nif)){
                    department.showEmployeeNif(nif);
                }
            }
        }
    }
    public boolean hasEmployee(String nameDepart, String nif){
        for (Department department: departments){
            if(department.getName().equals(nameDepart)){
                if(department.hasNif(nif)){
                    return true;
                }
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return cif == company.cif && Objects.equals(name, company.name) && Objects.deepEquals(departments, company.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cif, Arrays.hashCode(departments));
    }
}
