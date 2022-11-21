import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Animal implements Comparable<Animal>{

    private String nome;

    private float peso;

    private boolean pet;

    public Animal(String nome, float peso, boolean pet) {


        if(nome.length() < 3){
            throw new NomeInvalidoException();
        }

        this.nome = nome;

        this.peso = peso;

        this.pet = pet;

    }

    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public boolean isPet() {
        return pet;
    }

    public boolean mesmaCategoria(Animal outro) {

        if (Math.abs(this.getPeso() - outro.getPeso()) > 5) {

            return false;

        } else {

            return true;

        }

    }

    public long quantidadePeixesProtegidos(List<Animal> lst){
        return lst.stream().filter(a -> a instanceof Peixe)
                        .filter(a -> a instanceof Protegido)
                        .count();
    }

    public Collection<Animal> oredemSemRep(List<Animal> lst){
        Set<Animal> st = new TreeSet<>(lst);
        return st;
    }

    public void imprimeNomesNaoPetsNaoProtegidos(List<Animal> lst){
        lst.stream().filter(a -> a instanceof Peixe)
                    .filter(a -> !(a.isPet()))
                    .filter(a -> !(a instanceof Protegido))
                    .map(a -> a.getNome())
                    .forEach(n -> System.out.println(n));
    }
    public double pesoMedioHerbivoro(List<Animal> lst){
        return lst.stream().filter(a -> a instanceof Mamifero)
                            .filter(a -> ((Mamifero) a).isHerbivoro())
                            .mapToDouble(a -> a.getPeso())
                            .summaryStatistics()
                            .getAverage();
    }

    public String toString() {

        String str = getNome() + ", " + getPeso() + "kgs";

        if (isPet() == true) {

            str = str + ", é um pet";

        }

        return str;

    }

    @Override
    public int compareTo(Animal o) {
        return getNome().compareTo(o.getNome());
    }


}