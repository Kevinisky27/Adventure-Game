public class ObjetosMuebles extends Personajes{
    private int NivelEnergia;
    private int FacPotenciador;

    public int getNivelEnergia() {
        return NivelEnergia;
    }

    public void setNivelEnergia(int NivelEnergia) {
        this.NivelEnergia = NivelEnergia;
    }

    public int getFacPotenciador() {
        return FacPotenciador;
    }

    public void setFacPotenciador(int FacPotenciador) {
        this.FacPotenciador = FacPotenciador;
    }
    public void NivelEnergia(){
        System.out.println("El arma que a elegido el heroe cuenta con:");
        System.out.println("vidas al 50% ");
    }
    public void FacPotenciador(){
        System.out.println("y su factor potenciador es: El enemigo mas cercano");
        System.out.println("--------------------------------------------------");
    }

}
