package GestionEmploye;

public class Employe {

    protected int id;
    protected String nom,adresse;
    protected  int nbHeure;


   public Employe()
    {
        System.out.println("je suis Employe");
    }

    public Employe(int id,String n)
    {
        this.id=id;
        nom=n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
