public class Magasin {
    int identifiant;
    String adresse;

    final int CAPACITE_PR=50;

    Produit [] tabprod=new Produit[CAPACITE_PR];

    int comp;
    public Magasin(){}
    public Magasin(int id,String ad)
    {
        this.identifiant=id;
        adresse=ad;
    }
    public  void ajouter(Produit p)
    {
       tabprod[comp]=p;
       comp++;
    }

    public void afficher()
    {
        System.out.println("id :"+identifiant+"adresse :"+adresse);

        /*for (Produit p:tabprod) {
            if(p!=null)
            p.afficher();
        }*/
        for (int i=0;i<comp;i++)
            tabprod[i].afficher();
    }
}
