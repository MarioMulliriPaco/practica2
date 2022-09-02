public class Tickeo {
    String horario;
    Integer suben;
    Integer bajan;
    Autobus autobus;
    Parada parada;
    public Tickeo(){
    }
    public Tickeo(String horario, Integer suben, Integer bajan, Autobus autobus, Parada parada){
        this.horario = horario;
        this.suben = suben;
        this.bajan = bajan;
        this.autobus = autobus;
        this.parada = parada;
    }
}
