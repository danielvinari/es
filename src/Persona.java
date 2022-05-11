public class Persona extends Thread{
    Bagno bagno;
    String nome;
    
    public Persona(Bagno bagno, String nome) {
        this.bagno = bagno;
        this.nome = nome;
    }

    @Override
    public void start() {
        bagno.semaforo.P();
        bagno.usaBagno(nome);
        bagno.semaforo.V();


    
    }

    
    
}
