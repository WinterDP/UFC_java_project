
public class EmPe implements EstadoLuta {


	public void alterarEstadoLuta(LutadorUFC l) {
		if(l.getEstamina() < 0) {
			l.setEstamina(0);
			l.setEstadoLuta(new NoChao());
			l.getAdversario().setEstamina(0);
			l.getAdversario().setEstadoLuta(new NoChao());
			System.out.println(l.getNome() + " caiu e a luta vai para o chao");	
					
		}
	}

}
