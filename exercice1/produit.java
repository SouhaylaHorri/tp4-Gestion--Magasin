package exercice1;

public class produit {
    private int id;
    private String libelle;
    private String marque;
    private double prix;
    private datee Date;

    public produit(int id, String libelle, String marque, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        if(prix>0.0) {
            this.prix = prix;
        }else
        {
            System.out.println("---Erreur---"+prix+"est positive");
        }
    }
    public produit()
    {}

    public produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix=0.0;
    }

    public void afficher()
    {
        System.out.println("l'indentifier e ce produit est "+this.id);
        System.out.println("la libellée ce produit est "+this.libelle);
        System.out.println("la marque ce produit est "+this.marque);
        System.out.println("la libellée ce produit est "+this.prix);
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setdate(datee d) {
        this.Date = d;
    }



    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public datee getDate() {
        return Date;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "id=" + getId()+
                ", libelle='" + getLibelle() + '\'' +
                ", marque='" + getMarque() + '\'' +
                ", prix=" + getPrix() +
                ", date=" + getDate() +
                '}';
    }

}
