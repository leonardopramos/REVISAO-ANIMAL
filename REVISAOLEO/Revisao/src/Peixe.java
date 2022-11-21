public class Peixe extends Animal{

    private boolean isAguaDoce;
    private boolean isAguaSalgada;

    public Peixe(String nome, float peso, boolean pet, boolean isAguaDoce) {
        super(nome, peso, pet);
        this.isAguaDoce = isAguaDoce;
    }

    public boolean isAguaDoce() {
        return isAguaDoce;
    }

    public boolean isAguaSalgada() {
        return isAguaSalgada;
    }

    
    
}
