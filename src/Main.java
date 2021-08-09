public class Main {
    public static void main(String[] arg){
        Heroe heroe1 = new Heroe();
        heroe1.NiveldeEnergia();
        heroe1.NumerodeVida();
        heroe1.CapOfensiva();
        heroe1.AlmacendeOb();

        ObjetosMuebles arma = new ObjetosMuebles();
        arma.NivelEnergia();
        arma.FacPotenciador();

        Enemigos enemigo1 = new Enemigos();
        enemigo1.NiveldeEnergia();
        enemigo1.NumerodeVida();
        enemigo1.CapOfensiva();
    }
}
