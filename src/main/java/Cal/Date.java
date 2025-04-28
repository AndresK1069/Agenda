package Cal;

public class Date {
    protected int chJour;
    protected int chMois;
    protected int chAnnee;

    public Date(int parJour, int parMois, int parAnnee) {
        chJour = parJour;
        chMois = parMois;
        chAnnee = parAnnee;
    }
    public Date(int parAnnee){
        chJour = 1;
        chMois = 1;
        chAnnee = parAnnee;
    }

    public String toString() {
        return chJour + "/" + chMois + "/" + chAnnee;
    }

    public static boolean estBissextile(int parAnnee){
        if ((parAnnee % 4 == 0 && parAnnee % 100 != 0) || parAnnee % 400 == 0){
            return true;
        }
        return false;
    }

    public static int dernierJourDuMois(int parAnnee,int parMois){
        switch(parMois){
            case 2:
                if (estBissextile(parAnnee))
                    return 29;
                else
                    return 28;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            default:
                return 31;
        }
    }

    public boolean estValide(){
        if(chJour >=1 && chJour <= dernierJourDuMois(chAnnee,chMois)){
            return true;
        }
        return false;
    }

    public int CompareTo(Date parDate) {
        if(chAnnee > parDate.chAnnee){return 1;}
        else if(chAnnee < parDate.chAnnee){return -1;}
        else if(chMois > parDate.chMois){return 1;}
        else if(chMois < parDate.chMois){return -1;}
        else if(chJour > parDate.chJour){return 1;}
        else if(chJour < parDate.chJour){return -1;}
        return 0;
    }

    public static Date LireDate() {
        System.out.println("entrez un jour ");
        Scanner scJour = new Scanner(System.in);
        int jour = scJour.nextInt();

        System.out.println("entrez un mois ");
        Scanner scMois = new Scanner(System.in);
        int mois = scMois.nextInt();

        System.out.println("entrez un annee");
        Scanner scAnnee = new Scanner(System.in);
        int annee = scAnnee.nextInt();

        return new Date(jour,mois,annee);
    }

   public Date dateDuLendemain(){
        int jour =chJour;
        int mois = chMois;
        int annee = chAnnee;
        jour ++;
        if(jour > dernierJourDuMois(annee,mois)) {
            jour = 1;
            mois ++;
            if(mois > 12){
                mois = 1;
                annee ++;
            }
        }
        return new Date(jour,mois,annee);
    }

    public Date dateDeLaVeille(){
        int jour = chJour;
        int mois = chMois;
        int annee = chAnnee;
        jour --;
        if(jour <= 0){
            mois --;
            if(mois <= 0){
                mois = 12;
                annee --;
            }

        }
        return new Date(jour,mois,annee);
    }
}
