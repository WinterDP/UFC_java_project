import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		Gappler g = new Gappler();
		g.setNome("Charles Oliveira");
		g.setApelido("Charles Do Bronxs");
		g.setIdade(31);
		g.setAltura(177);
		g.setPeso(76);
		g.setQuedasAplicadas(26);
		g.setTentativaQueda(83);
		g.setCidadeNatal("Guaruja");
		g.setStatus(EnumStatus.ATIVO);
		
		Equipe e = new Equipe();
		e.setNome("Chute Boxe - SP");
		
		g.setEquipe(e);
		
		g.setCategoria(new PesoMeioMedio());
		g.Dieta(-3);
		
		Striker s = new Striker();
		s.setNome("Conor Mcgregor");
		s.setApelido("The Notorious");
		s.setIdade(32);
		s.setAltura(175);
		s.setPeso(74);
		s.setGolpesContectados(599);;
		s.setGolpesDesferidos(1204);;
		s.setCidadeNatal("Dublin - Irlanda");
		s.setStatus(EnumStatus.ATIVO);
		
		Equipe t = new Equipe();
		t.setNome("SBG IRELAND");
		
		s.setEquipe(t);
		
		s.setCategoria(new PesoMosca());
		
		Date d = new Date(2023,4,2); 
		
		Arbitro a = new Arbitro();
		a.setNome("Mario Yamazaki");
		
		Luta l = new Luta(a);
		l.setValeCinturao(true);
		
		l.itsTIME(g, s, d);
		
		l.setValeCinturao(false);
		
		s.Dieta(10);
		g.Dieta(10);
		
		Date d2 = new Date(2023,10,5);
		
		l.itsTIME(g, s, d2);
	}

}
