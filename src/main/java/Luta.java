import java.util.Date;

public class Luta {
	private Date dataLuta;
	private boolean valeCinturao;
	private Arbitro arbitro;
	
	public Luta(Arbitro a) {
		this.setArbitro(a);
	}
	
	private boolean pesagem(LutadorUFC lutadorUm, LutadorUFC lutadorDois) {
		return (lutadorUm.getCategoria().getClass().isAssignableFrom(lutadorDois.getCategoria().getClass()));
	}
	
	private void marcarLuta(LutadorUFC lutadorUm, LutadorUFC lutadorDois, Date dataLuta) {
		setDataLuta(dataLuta);
		lutadorUm.setAdversario(lutadorDois);
		lutadorDois.setAdversario(lutadorUm);
	}
	
	public LutadorUFC itsTIME(LutadorUFC lutadorUm, LutadorUFC lutadorDois, Date dataLuta) {
		marcarLuta(lutadorUm,lutadorDois,dataLuta);
		Assalto r = new Assalto();
		r.setLutadorUm(lutadorUm);
		r.setLutadorDois(lutadorDois);
		
		lutadorUm.setEstamina(6);
		lutadorDois.setEstamina(6);
		lutadorUm.setEstadoLuta(new EmPe());
		lutadorDois.setEstadoLuta(new EmPe());
		lutadorUm.setNocauteado(false);
		lutadorDois.setNocauteado(false);
		lutadorUm.setImobilizado(false);
		lutadorDois.setImobilizado(false);
		lutadorUm.setPontos(0);
		lutadorDois.setPontos(0);
		
		
		if (pesagem(lutadorUm,lutadorDois)) {
			System.out.println("\n\nIT'S TIIIIIME");
			if(valeCinturao){
				for(int i = 0; i<5 ; i++) {
					if(lutadorUm.isNocauteado()) {
						System.out.println("\nPor Nocaute, o vencedor e " + lutadorDois.getApelido()+", "+ lutadorDois.getNome()+"\n");
						return lutadorDois;
					}else if(lutadorUm.isImobilizado()) {
						System.out.println("\nPor Submissao, o vencedor e " + lutadorDois.getApelido()+", "+ lutadorDois.getNome()+"\n");
						return lutadorDois;
					}
					else if(lutadorDois.isImobilizado()) {
						System.out.println("\nPor Submissao, o vencedor e " + lutadorUm.getApelido()+", "+ lutadorUm.getNome()+"\n");
						return lutadorUm;
					}else if(lutadorDois.isNocauteado()){
						System.out.println("\nPor Nocaute, o vencedor e " + lutadorUm.getApelido()+", "+ lutadorUm.getNome()+"\n");
						return lutadorUm;	
					}else{
						lutadorUm.setEstamina(6);
						lutadorDois.setEstamina(6);
						lutadorUm.setEstadoLuta(new EmPe());
						lutadorDois.setEstadoLuta(new EmPe());
						r.setOrdinalRound(i+1);
						r.lutaRound();
					}	
				}
			}else{
				for(int i = 0; i<5 ; i++) {
					if(lutadorUm.isNocauteado()) {
						System.out.println("\nPor Nocaute, o vencedor e " + lutadorDois.getApelido()+", "+ lutadorDois.getNome()+"\n");
						return lutadorDois;
					}else if(lutadorUm.isImobilizado()) {
						System.out.println("\nPor Submissao, o vencedor e " + lutadorDois.getApelido()+", "+ lutadorDois.getNome()+"\n");
						return lutadorDois;
					}
					else if(lutadorDois.isImobilizado()) {
						System.out.println("\nPor Submissao, o vencedor e " + lutadorUm.getApelido()+", "+ lutadorUm.getNome()+"\n");
						return lutadorUm;
					}else if(lutadorDois.isNocauteado()){
						System.out.println("\nPor Nocaute, o vencedor e " + lutadorUm.getApelido()+", "+ lutadorUm.getNome()+"\n");
						return lutadorUm;	
					}else{
						lutadorUm.setEstamina(6);
						lutadorDois.setEstamina(6);
						lutadorUm.setEstadoLuta(new EmPe());
						lutadorDois.setEstadoLuta(new EmPe());
		        		r.setOrdinalRound(i+1);
		        		r.lutaRound();
					}
				}
			}
			if(lutadorUm.isNocauteado()) {
				System.out.println("\nPor Nocaute, o vencedor e " + lutadorDois.getApelido()+", "+ lutadorDois.getNome()+"\n");
				return lutadorDois;
			}else if(lutadorUm.isImobilizado()) {
				System.out.println("\nPor Submissao, o vencedor e " + lutadorDois.getApelido()+", "+ lutadorDois.getNome()+"\n");
				return lutadorDois;
			}
			else if(lutadorDois.isImobilizado()) {
				System.out.println("\nPor Submissao, o vencedor e " + lutadorUm.getApelido()+", "+ lutadorUm.getNome()+"\n");
				return lutadorUm;
			}else if(lutadorDois.isNocauteado()){
				System.out.println("\nPor Nocaute, o vencedor e " + lutadorUm.getApelido()+", "+ lutadorUm.getNome()+"\n");
				return lutadorUm;	
			}else if(lutadorUm.getPontos()>lutadorDois.getPontos()) {
				System.out.println("\n" + lutadorUm.getNome() + " : " + lutadorUm.getPontos() + " X " + lutadorDois.getNome() + " : " + lutadorDois.getPontos());
				System.out.println("Por Decisao Unanime, o vencedor e " + lutadorUm.getApelido() +", "+ lutadorUm.getNome()+"\n");
				return lutadorUm;	
			}else if(lutadorUm.getPontos()<lutadorDois.getPontos()) {
				System.out.println("\n" +lutadorUm.getNome() + " : " + lutadorUm.getPontos() + " X " + lutadorDois.getNome() + " : " + lutadorDois.getPontos());
				System.out.println("Por Decisao Unanime, o vencedor e " + lutadorDois.getApelido() +", "+ lutadorDois.getNome()+"\n");
				return lutadorDois;
			}else if(lutadorUm.getPontos()==lutadorDois.getPontos()) {
				System.out.println("\nEmpate Unanime\n");
				return null;   
			}
		}
		System.out.println("luta nao pode ocorrer");
		return null;
	}

	public Date getDataLuta() {
		return dataLuta;
	}

	public void setDataLuta(Date dataLuta) {
		this.dataLuta = dataLuta;
	}

	public boolean isValeCinturao() {
		return valeCinturao;
	}

	public void setValeCinturao(boolean valeCinturao) {
		this.valeCinturao = valeCinturao;
	}

	public Arbitro getArbitro() {
		return arbitro;
	}

	public void setArbitro(Arbitro a) {
		this.arbitro = a;
	}
}
