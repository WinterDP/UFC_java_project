
public class Agarrar implements Ataque {
	private LutadorUFC lutadorUm;
	private LutadorUFC lutadorDois;

	public void lutar() {

		int pQuedaUm = lutadorUm.precisaoQueda();
		int pQuedaDois = lutadorDois.precisaoQueda();
		
		if(pQuedaUm > pQuedaDois) {
			if(pQuedaUm == 6 && pQuedaDois == 1) {
				System.out.println("o lutador " + lutadorUm.getNome() + " consegue imobilizar " + lutadorDois.getNome());
				lutadorDois.setImobilizado(true);
				return;
			}
			System.out.println("o lutador " + lutadorUm.getNome() + " agarra " + lutadorDois.getNome());
			
			lutadorUm.setPontos(lutadorUm.getPontos()+1);
			
			lutadorDois.setEstamina(lutadorDois.getEstamina() - (pQuedaUm - pQuedaDois));
			
		}else if(pQuedaUm < pQuedaDois) {
			if(pQuedaDois == 6 && pQuedaUm == 1) {
				System.out.println("o lutador " + lutadorDois.getNome() + " consegue imobilizar " + lutadorUm.getNome());
				lutadorUm.setImobilizado(true);
				return;
			}
			System.out.println("o lutador " + lutadorDois.getNome() + " agarra " + lutadorUm.getNome());
			lutadorDois.setPontos(lutadorDois.getPontos()+1);
			lutadorUm.setEstamina(lutadorUm.getEstamina() - (pQuedaDois - pQuedaUm));
		}else {
			System.out.println("o lutador " + lutadorUm.getNome() + " e " + lutadorDois.getNome() + " travam uma disputada luta no chão");
			lutadorUm.setPontos(lutadorUm.getPontos()+1);
			lutadorDois.setPontos(lutadorDois.getPontos()+1);
		}
		
		lutadorUm.setEstamina(lutadorUm.getEstamina()+1);
		lutadorDois.setEstamina(lutadorDois.getEstamina()+1);
		
		
		lutadorUm.alterarPostura();
		lutadorDois.alterarPostura();
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
