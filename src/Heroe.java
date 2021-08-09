
public class Heroe extends Personajes {
    private int AlmacendeOb;

    public int getAlmacendeOb() {
        return AlmacendeOb;
    }

    public void setAlmacendeOb(int AlmacendeOb) {
        this.AlmacendeOb = AlmacendeOb;
    }
    public void NiveldeEnergia(){
        String nivelVida = "3/3";
        System.out.println("---------------------------------------------");
        System.out.println("El nivel de vidas de tu personaje es: " + nivelVida);
    }
    public void NumerodeVida(){
        String numVidas = "92%";
        System.out.println("El numero de vidas de tu personaje es: " + numVidas );
    }
    public void CapOfensiva(){
        String capVidas = "70";
        System.out.println("La capacidad ofensiva de tu personaje es: " + capVidas);
    }
    public void AlmacendeOb(){
        String alm = "No cuenta con almacenamiento ";
        System.out.println("La capacidad de almacenamiento es: " + alm);
    }
    //private List<ObjetosMuebles> listaObMuebles;
    //private List<ObjetosInmuebles> listaObInmuebles;
}
