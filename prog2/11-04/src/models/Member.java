package models;

public class Member {
    private String name;
    private String lastname;
    private String dni;
    private String phone;
    private int age;
    private int yearOfInscription;
    private String category;

    public Member(String name, String lastname, String dni, String phone, int age, int yearOfInscription) {
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
        this.phone = phone;
        this.age = age;
        this.yearOfInscription = yearOfInscription;

        if(yearOfInscription < 2000) {
            this.category = "lifetime member";
        }else{
            this.category = "normal member";
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfInscription() {
        return yearOfInscription;
    }

    public void setYearOfInscription(int yearOfInscription) {
        this.yearOfInscription = yearOfInscription;
    }

    public boolean isMemberAdult(Member member) {
        return member.age > 18;
    }

    public static Member searchByDni(String dni, Member[] member) {
        Member result = null;
        for (Member m : member) {
            if (m.getDni().equals(dni)) {
                result = m;
            }
        }
        return result;
    }

}
