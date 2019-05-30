package State;

public class MarioCapa implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		// TODO Auto-generated method stub
		System.out.println("+1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		// TODO Auto-generated method stub
		System.out.println("Mario fogo");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPena() {
		// TODO Auto-generated method stub
		System.out.println("+1000 pontos");
		return this;
	}

	@Override
	public MarioState levarDano() {
		// TODO Auto-generated method stub
		System.out.println("Levou dano");
		return new MarioPequeno();
	}

}
