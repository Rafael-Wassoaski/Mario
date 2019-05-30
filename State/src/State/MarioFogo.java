package State;

public class MarioFogo implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		// TODO Auto-generated method stub
		System.out.println("+1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		// TODO Auto-generated method stub
		System.out.println("+1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarPena() {
		// TODO Auto-generated method stub
		System.out.println("Mario com capa");
		return new MarioCapa();
	}

	@Override
	public MarioState levarDano() {
		// TODO Auto-generated method stub
		System.out.println("Levou dano");
		return new MarioPequeno();
	}

}
