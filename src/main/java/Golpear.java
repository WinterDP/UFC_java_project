
public class Golpear implements Ataque {
	private LutadorUFC lutadorUm;
	private LutadorUFC lutadorDois;

	public void lutar() {
		lutadorUm.setEstamina(lutadorUm.getEstamina()-1);
		lutadorDois.setEstamina(lutadorDois.getEstamina()-1);
		
		int pGolpeUm = lutadorUm.precisaoGolpe();
		int pGolpeDois = lutadorDois.precisaoGolpe();
		
		if(pGolpeUm > pGolpeDois) {
			if(pGolpeUm == 6 && pGolpeDois == 1) {
				System.out.println("o lutador " + lutadorUm.getNome() + " acerta um impressionante golpe em " + lutadorDois.getNome() + " que cai nocauteado");
				lutadorDois.setNocauteado(true);
				return;
			}
			System.out.println("o lutador " + lutadorUm.getNome() + " acerta um golpe em " + lutadorDois.getNome());
			lutadorUm.setPontos(lutadorUm.getPontos()+1);
			lutadorDois.setEstamina(lutadorDois.getEstamina() - (pGolpeUm - pGolpeDois));
			
		} else if(pGolpeUm < pGolpeDois) {
			if(pGolpeDois == 6 && pGolpeUm == 1) {
				System.out.println("o lutador " + lutadorDois.getNome() + " acerta um impressionante golpe em " + lutadorUm.getNome()+" que cai nocauteado");
				lutadorUm.setNocauteado(true);
				return;
			}
			System.out.println("o lutador " + lutadorDois.getNome() + " acerta um golpe em " + lutadorUm.getNome());
			lutadorDois.setPontos(lutadorDois.getPontos()+1);
			lutadorUm.setEstamina(lutadorUm.getEstamina() - (pGolpeDois - pGolpeUm));
		}else {
			System.out.println("o lutador " + lutadorUm.getNome() + " e " + lutadorDois.getNome() + " travam uma disputada troca de socos e defesas");
			lutadorUm.setPontos(lutadorUm.getPontos()+1);
			lutadorDois.setPontos(lutadorDois.getPontos()+1);
		}
		
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
