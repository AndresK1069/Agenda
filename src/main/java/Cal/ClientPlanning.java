package Cal;

public class ClientPlanning {
    public static void main(String[] args) {



        try{
            Planning p = new Planning(15);
            p.ajout(new Reservation(new DateCalendrier(5,12,2025),new PlageHoraire(new Horaire(15,15),new Horaire(15,45)) ,"1111"));
            p.ajout(new Reservation(new DateCalendrier(5,12,2025),new PlageHoraire(new Horaire(15,15),new Horaire(15,45)) ,"1111"));
            p.ajout(new Reservation(new DateCalendrier(5,12,2025),new PlageHoraire(new Horaire(15,15),new Horaire(15,45)) ,"1111"));
            System.out.println();


        }
        catch(ExceptionPlanning parExcep){
            System.out.println("code err : " + parExcep.getChCodeErrur());
        }

    }
}
