package Cal;

public class ClientRerservation {
    Date date = new Date(31,12,2020);
    PlageHoraire horaire = new PlageHoraire(new Horaire(15,30),new Horaire(16,30));
    String string = "dentiste";
    Reservation reservation = new Reservation(date,horaire,string);
    /*System.out.println(Cal.Reservation)*/
}
