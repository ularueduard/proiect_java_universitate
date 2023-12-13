import College.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        College.Person  Adrian = new College.Person();
        universitate.Person Iulia = new universitate.Person("18546464");

        PublicPerson person = new PublicPerson("1884333222");
        person.setNume("Birsan");
        person.setPrenume("Julia");
        person.setCnp("1855458");
        person.getNume();

        System.out.println(person.getNume()+ " " + person.getPrenume() + " " + person.getCnp());

       System.out.println(person.saluta("Julia"));
       person.merge();
       System.out.println("Persoana a mers "+ person.getNumarPasi() + " pasi");
        person.merge();
        person.merge();
        person.merge();
        System.out.println("Persoana a mers "+ person.getNumarPasi() + " pasi");


    }
}
