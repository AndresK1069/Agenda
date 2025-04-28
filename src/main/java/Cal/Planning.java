package Cal;

public class Planning {

    private Reservation [] chTable;
    private int chTaille;
    private int chNbreff= 0;

    public Planning(int parTaille) {
        chTable = new Reservation[parTaille];
        chTaille = parTaille;

    }

    public void ajout(Reservation parReservation) throws ExceptionPlanning {
        if (parReservation.RestValid() == false ){
            throw new ExceptionPlanning(0);
        }

        if (chNbreff >= chTaille){
            throw new ExceptionPlanning(1);
        }
        for (int i = 0; i < chTaille; i++) {
            if (chTable[i].compareTo(parReservation) == 0) {
                throw new ExceptionPlanning(2);
            }
        }
    chTable[chNbreff++] = parReservation;
    }


    public Reservation getReservation(Date parDate) {
        for (int i = 0; i < chNbreff; i++) {
            if(chTable[i].getChDate().CompareTo(parDate) == 0){
                return chTable[i];
            }
        }
        return null;
    }
    public Reservation [] getReservations(Date parDates) {
        Reservation [] doublons = new Reservation[chTaille];
        int var = 0;
        for (int i = 0; i < chNbreff; i++) {
            if(chTable[i].getChDate().CompareTo(parDates) == 0){
                doublons[var] = chTable[i];
                var++;
            }
        }
        return null;
    }

    /*public int PlusAncienneReservation(int parDebut, int parFin){
        for (int i = parDebut; i <= parFin; i++) {
            if (chTable[i].chReservation.getChDate().CompareTo(chTable[parDebut]) == 0){}
        }

    }*/


    public String toString(){return ;}

}
