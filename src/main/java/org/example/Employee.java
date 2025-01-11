package org.example;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String password;
    private String email;
    private String[] healthPlans;

    public Employee(int id, String fullName, String password, String email, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.password = password;
        this.email=email;
        this.healthPlans=healthPlans;
        /*this.healthplans = new String[healthplans.length + 1];
        this.healthplans[0] = singleHealthplan;
        System.arraycopy(healthplans, 0, this.healthplans, 1, healthplans.length);
        /*System.arraycopy metodu, bir diziyi başka bir diziye kopyalamak için kullanılır.
            Parametreler:
            Kaynak dizi (healthplans): Kopyalanacak dizi (örneğin ["Plan A", "Plan B"]).
            Kaynak başlangıç indeksi (0): Hangi elemandan itibaren kopyalama yapılacağını belirtir (burada başlangıçtan, yani 0'dan itibaren).
            Hedef dizi (this.healthplans): Kopyanın yerleştirileceği dizi.
            Hedef başlangıç indeksi (1): Yeni dizide kopyalamaya nereden başlanacağını belirtir (burada 1. indeksten itibaren).
            Kopyalanacak eleman sayısı (healthplans.length): Kaynak diziden kaç eleman kopyalanacağını belirtir.*/
    }

    public void addHealthPlan(int index, String name) {
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Index " + index + " is out of bounds for healthplans array.");
            return;
        }

        if (healthPlans[index] == null) {
            healthPlans[index] = name;
            System.out.println("Healthplan added at index " + index + " with name: " + name);
        } else {
            System.out.println("Index " + index + " is already occupied by a healthplan.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullname) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthplans) {
        this.healthPlans = healthplans;
    }

    //@Override
    public String toString() {
        return "Employee{id=" + id + ", fullName=" + fullName + ", password=" + password +
                ", healthplans=" + Arrays.toString(healthPlans) + "}";
    }
}
