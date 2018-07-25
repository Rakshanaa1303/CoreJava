package unuploaded;

interface TVRemote 
{
	public void switchoff();
	public void switchon();
	public void changeChannel();
	public void increaseVolume();
	public void decresaseVolume();
	
}

class sony implements TVRemote
{

	@Override
	public void switchoff() {
		System.out.println("TV is switched off");
		
	}

	@Override
	public void switchon() {
		System.out.println("TV is switched on");
		
	}

	@Override
	public void changeChannel() {
		System.out.println("Channel is changed");
		
	}

	@Override
	public void increaseVolume() {
		System.out.println("Volume is increased");
		
	}

	@Override
	public void decresaseVolume() {
		System.out.println("Volume is decreased");
		
	}
	
}

public class Interface {

	public static void main(String[] args) {
		sony s = new sony();
		s.switchoff();
		s.switchon();
		s.changeChannel();
		s.increaseVolume();
		s.decresaseVolume();

	}

}
