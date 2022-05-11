public class Bagno{
    Semaforo semaforo;

    public Bagno(Semaforo semaforo){
        
        this.semaforo=semaforo;
    }

    public void usaBagno(String s){

        System.out.println(s +" Bagno occupato");

        System.out.println(s +" ha liberato il bagno");
    }

    
}
