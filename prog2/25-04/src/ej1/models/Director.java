package ej1.models;

public class Director {
    private String name;
    private String lastName;
    private String age;
    private String nationality;

    public Director(String name, String age, String lastName, String nationality) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public void printDetails(){
        System.out.println("---Director---");
        System.out.println("Name: " + this.name);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("Nationality: " + this.nationality);
    }
}

