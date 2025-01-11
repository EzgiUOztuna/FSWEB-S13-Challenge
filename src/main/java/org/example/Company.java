package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id=id;
        this.name=name;
        this.giro=giro;
        this.developerNames=developerNames;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }

    public String getName() {
        return  name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public double getGiro() {
        return giro;
    }
    public void setGiro(double giro){
        if(giro < 0) {
            System.out.println("Giro cannot be less than 0. Setting giro to 0.");
            this.giro=0;
        } else {
            this.giro=giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }
    public void setDeveloperNames(String[] developerNames) {
        this.developerNames=developerNames;
    }

    public void addEmployee(int index, String name) {
        if(index < 0 || index >= developerNames.length) {
            System.out.println("Index " + index + " is out of bounds for developerNames array.");
            return;
        }

        if(developerNames[index] == null) {
            developerNames[index] = name;
            System.out.println("Developernames added at index " + index + " with name: " + name);
        }else {
            System.out.println("Index " + index + " is already occupied by a developernames.");
        }
    }

    //@Override
    public String toString() {
        return "Company{id=" + id + ", name=" + name + ", giro=" + giro +
                ", developernames=" + Arrays.toString(developerNames) + "}";
    }
}


