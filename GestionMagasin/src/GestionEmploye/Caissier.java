package GestionEmploye;

public class Caissier extends Employe{
    private int numCaisse;

public Caissier(int numC,int id,String n)
{
    super(id,n);
    this.numCaisse=numC;
}

public Caissier(){

}

    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }
}
