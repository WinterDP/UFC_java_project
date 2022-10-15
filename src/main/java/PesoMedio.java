
public class PesoMedio extends CategoriaPeso {


	@Override
	public void alterarCategoria(LutadorUFC l) {
		if(l.getPeso() > 88.0) {
			l.setCategoria(new PesoMeioPesado());
			System.out.println(l.getNome() + " subiu para a categoria peso meio pesado");
			l.getCategoria().alterarCategoria(l);
		}else if(l.getPeso() < 81.0){
			l.setCategoria(new PesoMeioMedio());
			System.out.println(l.getNome() + " desceu para a categoria peso meio medio");
			l.getCategoria().alterarCategoria(l);
		}
	}

}
