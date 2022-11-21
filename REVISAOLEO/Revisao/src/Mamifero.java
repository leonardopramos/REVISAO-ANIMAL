public class Mamifero extends Animal {

	public Mamifero(String nome,float peso,boolean pet){
		super(nome,peso,pet);
	}

	public boolean isCarnivoro() {
		return false;
	}

	public boolean isHerbivoro() {
		return false;
	}

	public boolean isOnivoro() {
		return false;
	}

	@Override
	public String toString(){
		String str =  getNome()+", "+getPeso()+"kgs";
		if (isPet() == true){
			str = str + ", é um pet";
		}
		if (isOnivoro() == true){
			str = str + ", onivaro";
		}
		if (isHerbivoro() == true){
			str = str + ", herbivoro";
		}
		if (isCarnivoro() == true){
			str = str + ", carnivaro";
		}

		return str;
	}
}
