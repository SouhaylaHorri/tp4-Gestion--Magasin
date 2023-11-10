package exercice1;

public class testepro {
    public static void main(String[]args)
    {

        produit p1=new produit();
        produit p2=new produit(1021,"lait","Délice");
        produit p3=new produit(2510,"Yaourt","Vitalait");
        produit p4=new produit(3250,"tomat","Sicam",1200);
        p2.afficher();
        p3.afficher();
        p4.afficher();

        p2.setPrix(0.7);
        System.out.println("le prix de produit de marque est 'lait' qui modifier est ");
        p2.afficher();
        System.out.println("\n");

        p1.setId(1010);
        p1.setLibelle("warda");
        p1.setMarque("makrouna");
        p1.setPrix(800);
        p1.afficher();
        System.out.println("\n");
        p3.setId(1020);
        p3.setLibelle("watan 9ebli");
        p3.setMarque("Hrisa");
        p3.setPrix(1630);
        p3.afficher();

        System.out.println("\n\n  affichage avec toString");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


        p1.setdate(new datee(20,10,2023));
        p2.setdate(new datee(18,9,2003));
        p3.setdate(new datee(1,5,200));
        p4.setdate(new datee(25,01,2003));

        System.out.println("la date de ce produit est  \n");
        p1.getDate().affdate();
        p2.getDate().affdate();
        p3.getDate().affdate();
        p4.getDate().affdate();






    }
}
