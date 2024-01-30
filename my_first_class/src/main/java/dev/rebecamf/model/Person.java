package dev.rebecamf.model;

public class Person {
    public String name;
    public String firstName;
    public String dni;
    public int bornYear;
    public String bornCountry;
    public char gender;


    public Person(String name, String firstName, String dni, int bornYear,String bornCountry,String string ) {
        this.name = name;
        this.firstName = firstName;
        this.dni = dni;
        this.bornYear = bornYear;
        this.bornCountry = bornCountry;
        this.gender = extracted();
    }

    private char extracted() {
        return gender;
    }

    public void render() {
        System.out.println(name);
        System.out.println(firstName);
        System.out.println(dni);
        System.out.println(bornYear);
        System.out.println(bornCountry);
        System.out.println(extracted());

    }
}

