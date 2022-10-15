
public class Assalto {
	private int ordinalRound;
	private LutadorUFC lutadorUm;
	private LutadorUFC lutadorDois;
	
	public void lutaRound() {
		System.out.println("\nvai começar o " + this.getOrdinalRound() + " round da luta\n");
		
		Golpear g = new Golpear();
		Agarrar a = new Agarrar();
			
		for(int i = 0; i< 4;i++) {
			if(lutadorUm.isNocauteado() || lutadorDois.isNocauteado() || lutadorUm.isImobilizado() || lutadorDois.isImobilizado() ) {
				break;
			}
			if(lutadorUm.getEstadoLuta() instanceof EmPe) {
				lutadorUm.setAtaqueGolpe(g);
				g.setLutadorUm(lutadorUm);
				g.setLutadorDois(lutadorDois);
				lutadorUm.golpe();
			}else{
				lutadorUm.setAtaqueAgarre(a);
				a.setLutadorUm(lutadorUm);
				a.setLutadorDois(lutadorDois);
				lutadorUm.agarre();
			}
			
			//System.out.println(lutadorUm.getNome() + " : " + lutadorUm.getPontos());
			//System.out.println(lutadorDois.getNome() + " : " + lutadorDois.getPontos());
		}
		
		for(int i=0;i<4;i++) {
			if(lutadorUm.isNocauteado() || lutadorDois.isNocauteado() || lutadorUm.isImobilizado() || lutadorDois.isImobilizado() ) {
				break;
			}
			if(lutadorDois.getEstadoLuta() instanceof EmPe) {
				lutadorDois.setAtaqueGolpe(g);
				g.setLutadorUm(lutadorDois);
				g.setLutadorDois(lutadorUm);
				lutadorDois.golpe();
			}else {
				lutadorDois.setAtaqueAgarre(a);
				a.setLutadorUm(lutadorDois);
				a.setLutadorDois(lutadorUm);
				lutadorDois.agarre();
			}
			//System.out.println(lutadorUm.getNome() + " : " + lutadorUm.getPontos());
			//System.out.println(lutadorDois.getNome() + " : " + lutadorDois.getPontos());
		}
	}

	public int getOrdinalRound() {
		return ordinalRound;
	}

	public void setOrdinalRound(int ordinalRound) {
		this.ordinalRound = ordinalRound;
	}

	public LutadorUFC getLutadorUm() {
		return lutadorUm;
	}

	public void setLutadorUm(LutadorUFC lutadorUm) {
		this.lutadorUm = lutadorUm;
	}

	public LutadorUFC getLutadorDois() {
		return lutadorDois;
	}

	public void setLutadorDois(LutadorUFC lutadorDois) {
		this.lutadorDois = lutadorDois;
	}

}
