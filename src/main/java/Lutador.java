
public abstract class Lutador extends Pessoa {

	private Ataque ataqueGolpe;
	private Ataque ataqueAgarre;
	
	public void chamarAgarre(){
		ataqueAgarre.lutar();
	}
	
	public void chamarGolpe(){
		ataqueGolpe.lutar();
	}

	public Ataque getAtaqueGolpe() {
		return ataqueGolpe;
	}

	public void setAtaqueGolpe(Ataque ataqueGolpe) {
		this.ataqueGolpe = ataqueGolpe;
	}

	public Ataque getAtaqueAgarre() {
		return ataqueAgarre;
	}

	public void setAtaqueAgarre(Ataque ataqueAgarre) {
		this.ataqueAgarre = ataqueAgarre;
	}
}
