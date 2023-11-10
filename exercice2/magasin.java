package exercice2;

public class magasin {

    public int id;
    public String adresse;
    public int capacite=50;
    produit[] tab=new produit[capacite];
    public  int num=0;

    public magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
        num++;
    }
    public magasin()
    {
        num++;
    }

    public void affmagasin()
    {
        System.out.println("l'indentifient de est"+this.id);
        System.out.println("l'adresse de magasin est"+this.adresse);
        System.out.println("la capacité est"+this.capacite);
        for(int i=0; i<tab.length;i++)
        {
            System.out.println("le nom de produit dans un magasin est"+tab[i].getLibelle());
            System.out.println("le nom de produit dans un magasin est"+tab[i].getPrix());
        }
    }

    public void ajouter(produit p){
        if(num<=capacite)
        {
            tab[num]=p;
        }
        else{
            System.out.println("la qantite est dépacée la qantité maximale de produit");
        }
    }
}

