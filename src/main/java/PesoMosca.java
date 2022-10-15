
public class PesoMosca extends CategoriaPeso {

	@Override
	public void alterarCategoria(LutadorUFC l) {
		if(l.getPeso() > 74.0) {
			l.setCategoria(new PesoMeioMedio());
			System.out.println(l.getNome() + " subiu para a categoria peso meio medio");
			l.getCategoria().alterarCategoria(l);
		}else if(l.getPeso() < 70.0){
			l.setCategoria(null);
		}
	}

}
