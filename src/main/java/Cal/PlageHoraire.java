package Cal;

public class PlageHoraire {
    private final static int DUREE_MIN = 30;
    private Horaire chHoraireDeDebut;
    private Horaire chHoraireDeFin;

    public PlageHoraire(Horaire parHoraireDeDebut, Horaire parHoraireDeFin) {
        chHoraireDeDebut = parHoraireDeDebut;
        chHoraireDeFin = parHoraireDeFin;
    }



    public boolean estValide() {
        if(chHoraireDeDebut.toMinutes() < chHoraireDeFin.toMinutes()) {
            return true;
        }
        return false;
    }
     public int duree(){
        return chHoraireDeFin.toMinutes() - chHoraireDeDebut.toMinutes();
     }

     public int compareTo(PlageHoraire parPlageHoraire) {
        if (parPlageHoraire.chHoraireDeFin.toMinutes() < parPlageHoraire.chHoraireDeDebut.toMinutes()) {
            return 1;
        }
         if (parPlageHoraire.chHoraireDeFin.toMinutes() > parPlageHoraire.chHoraireDeDebut.toMinutes()) {
             return -1;
         }
         return 0;

     }


    public String toString() {
        return chHoraireDeDebut + ":" + chHoraireDeFin + "duree" + duree()/60+ "m";
    }
}
