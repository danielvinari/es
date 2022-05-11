public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Inizio programma");
        Semaforo SUomini = new Semaforo(1);
        Semaforo SDonne = new Semaforo(1);

        Bagno BUomini = new Bagno(SUomini);
        Bagno BDonne = new Bagno(SDonne);

        Persona p1 = new Persona(BUomini, "Ciccio");
        Persona p2 = new Persona(BUomini, "Mario");
        Persona p3 = new Persona(BUomini, "Dario");

        Persona p4 = new Persona(BDonne, "Ciccia");
        Persona p5 = new Persona(BDonne, "Maria");
        Persona p6 = new Persona(BDonne, "Daria");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();

        System.out.println("Tutti i bagni sono liberi");

    }
}
