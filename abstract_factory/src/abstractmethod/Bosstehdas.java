package abstractmethod;

public class Bosstehdas implements Vaatetehdas{

	@Override
	public Housut makeHousut() {
		return new BossHousut();
	}

	@Override
	public Kengat makeKengat() {
		return new BossKengat();
	}

	@Override
	public Lippis makeLippis() {
		return new BossLippis();
	}

	@Override
	public Tpaita makeTpaita() {
		return new BossTpaita();
	}

}
