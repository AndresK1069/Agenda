package Cal;

import java.util.Calendar;


public class DateCalendrier extends Date implements ConstantesCalendrier, Comparable<Date>{
    private  int chJourSemaine;


    public DateCalendrier() {

        super(0);
        Calendar today = Calendar.getInstance();

        chAnnee = today.get(Calendar.YEAR);

        // Calendar.MONTH retourne 0 pour janvier,1 pour fervier
        chMois = today.get(Calendar.MONTH) + 1;

        chJour = today.get(Calendar.DAY_OF_MONTH);

        //Calendar.DAY_OF_WEEK retourne 1 pour dimanche, 2 pour Lundi
        int dayofWeek = today.get(Calendar.DAY_OF_WEEK);


        if (dayofWeek == Calendar.SUNDAY) {
            chJourSemaine = 7;

        }
        else chJourSemaine = dayofWeek - 1;





    }

    public DateCalendrier(int parJour,int parMois,int parAnne){

        super(parJour,parMois,parAnne);
        Calendar today = Calendar.getInstance();
        today.set(parAnne,parMois -1,parJour);

        int dayofWeek = today.get(Calendar.DAY_OF_WEEK);

        if (dayofWeek == Calendar.SUNDAY) {
            chJourSemaine = 7;

        }
        else chJourSemaine = dayofWeek - 1;

    }


    public DateCalendrier dateDuLendemain() {
        Date date = super.dateDuLendemain();
        DateCalendrier today = new DateCalendrier(date.chJour, date.chMois, date.chAnnee);
        return today;
    }

    public DateCalendrier dateDeVeille() {
        Date date = super.dateDeLaVeille();
        DateCalendrier today = new DateCalendrier(date.chJour, date.chMois, date.chAnnee);
        return today;
    }

    public String toString() {
        return  JOURS_SEMAINE[chJourSemaine - 1] +" "+ chJour + "," + MOIS[chMois -1 ];

    }


    @Override
    public int compareTo(Date o) {
        return 0;
    }
}




