
public class PesoMeioMedio extends CategoriaPeso {

	@Override
	public void alterarCategoria(LutadorUFC l) {
		if(l.getPeso() > 81.0) {
			l.setCategoria(new PesoMedio());
			System.out.println(l.getNome() + " subiu para a categoria peso medio");
			l.getCategoria().alterarCategoria(l);
		}else if(l.getPeso() < 74.0){
			l.setCategoria(new PesoMosca());
			System.out.println(l.getNome() + " desceu para a categoria peso mosca");
			l.getCategoria().alterarCategoria(l);
		}
	}

}
