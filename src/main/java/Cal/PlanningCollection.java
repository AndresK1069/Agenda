package Cal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class PlanningCollection {
    private ArrayList<Reservation> chliste;
    private TreeSet<Reservation> chset;

    public PlanningCollection() {
        chliste = new ArrayList();
        chset = new TreeSet();
    }

    public void ajout(Reservation parres) {
        chliste.add(parres);
        chset.add(parres);
    }

    public String toString() {
        String str="ArrayList\n"+chliste+"\nTreeset\n"+chset;
        return "TAILLE liSTE= "+chliste.size()+"Taille set= "+chset.size();
    }

    public TreeSet<Reservation> getReservations(DateCalendrier parDate) {
        TreeSet<Reservation> Treeretour = new TreeSet();
        Iterator<Reservation> Iterateur = chset.iterator();
        while(Iterateur.hasNext()) {
            Reservation current = Iterateur.next();
            if(current.toString().equals(parDate.toString())) {
                Treeretour.add(current);
            }
        }
        return Treeretour;

    }




    public TreeSet<Reservation> getReservations(String parstring) {
        TreeSet<Reservation> Treeretour = new TreeSet();
        Iterator<Reservation> Iterateur = chset.iterator();
        while(Iterateur.hasNext()) {
            Reservation current = Iterateur.next();
            if(current.getChString().equals(parstring)) {
                Treeretour.add(current);
            }
        }
        return Treeretour;

    }
}
