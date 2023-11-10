package exercice1;
public class datee {


    int jour;
    int moin;
    int année;

    public datee(int jour, int moin, int année) {
        this.jour = jour;
        this.moin = moin;
        this.année = année;
    }

    public datee() {
    }

    public void affdate() {
        System.out.println(this.jour + "/" + this.moin + "/" + this.année);
    }
}

