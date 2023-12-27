package abstractmethod;

public class Adidastehdas implements Vaatetehdas{

	@Override
	public Housut makeHousut(){
		return new AdidasHousut();
	}
	
	@Override
	public Kengat makeKengat(){
		return new AdidasKengat();
	}
	
	@Override
	public Lippis makeLippis(){
		return new AdidasLippis();
	}
	
	@Override
	public Tpaita makeTpaita(){
		return new AdidasTpaita();
	}
}
