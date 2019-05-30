package State;

public class Mario {
	
	private MarioState estado;
	
	public Mario() {
		// TODO Auto-generated constructor stub
		
		estado = new MarioPequeno();
	}

	public void pegarCogumelo() {
		estado = estado.pegarCogumelo();
	}
	
	public void pegarPena() {
		estado = estado.pegarPena();
	}
	
	public void pegarFlor() {
		estado = estado.pegarFlor();
	}
	
	public void levarDano() {
		estado = estado.levarDano();
	}
	
}
