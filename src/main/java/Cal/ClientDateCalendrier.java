package Cal;

public class ClientDateCalendrier {
    public static void main(String[] args) {
        DateCalendrier d1 = new DateCalendrier();
        System.out.println(d1);
        DateCalendrier d2 = new DateCalendrier(31,12,2025);
        System.out.println(d2.dateDuLendemain());
        DateCalendrier d3 = new DateCalendrier(31,12,2025);
        System.out.println(d3.dateDeVeille());

        DateCalendrier [] TAbles = new DateCalendrier[3];
    }
}
