package Cal;

public class Reservation {
    private DateCalendrier chDate;
    private PlageHoraire chPlage;
    public String chString;
    public Reservation chReservation;


    public Reservation(DateCalendrier parDate, PlageHoraire parPlage, String parString) {
        chDate = parDate;
        chPlage = parPlage;
        chString = parString;
    }

    public Date getChDate() {
        return chDate;
    }
    public String getChString() {return chString;}


    public int compareTo(Reservation parReserv) {
        if(parReserv.chPlage.compareTo(this.chPlage) == 0) {
            return chPlage.compareTo(parReserv.chPlage);
        }
            return chDate.CompareTo(parReserv.chDate);
    }

    public boolean RestValid(){
        if(chDate.estValide() == true && chPlage.estValide() == true){
            return true;
        }
        return false;
    }


    public String toString() {
        return chString;
    }
}
