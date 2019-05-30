package State;

public class MarioPequeno implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		
		System.out.println("Mario Grande");
		return new MarioGrande();
	}

	@Override
	public MarioState pegarFlor() {
		
		System.out.println("Mario Grande com Fogo");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario Grande com Capa");
		return new MarioCapa();
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Game Over");
		return new MarioMorto();
	}

}
