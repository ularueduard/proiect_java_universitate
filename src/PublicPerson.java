public class PublicPerson {

     private String nume;

    private String prenume;

    private String cnp;
    private int numarPasi;


    public PublicPerson(String CnpExtern){
        cnp = CnpExtern;
    }

    // sa pot sa is setez valori
    // dar sa si citesc
    // getter si setter

    //Setter
    public void setNume(String numeExtern){
        nume = numeExtern;
    }

    public void  setPrenume(String prenumeExtern){
        prenume = prenumeExtern;
    }

    public void setCnp(String cnpExtern){
        cnp = cnpExtern;

    }

    // Getters

    public String getNume(){
        System.out.println(nume);
        return nume;
    }

    public String getPrenume(){
        return prenume;
    }

    public String getCnp(){
        return cnp;

    }

    public  String saluta( String numePersoana){
        String greetings = "Salut "+ numePersoana;
        return greetings;
    }

    public void merge(){
        numarPasi++;
    }

    public int getNumarPasi(){
        return numarPasi;
    }



}
