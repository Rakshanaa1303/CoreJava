package unuploaded;

abstract class Abstract1 {
	public abstract boolean whatDoYouDO();
	
	public boolean doYouSpeak()
	{
		System.out.println("Yes, I speak");
		return true;
	}
}

class Trainer extends Abstract1
{
	@Override
	public boolean whatDoYouDO() {
		System.out.println("I am a trainer");
		return true;
	}
}

class Doctor extends Abstract1
{
	@Override
	public boolean whatDoYouDO() {
		System.out.println("I am a doctor");
		return true;
	}
}

class Pilot extends Abstract1
{
	@Override
	public boolean whatDoYouDO() {
		System.out.println("I am a pilot");
		return true;
	}
}

public class AbstractClass {
	
	public static void main(String args[]) {
	Trainer t = new Trainer();
	t.whatDoYouDO();
	t.doYouSpeak();
	Doctor d = new Doctor();
	d.whatDoYouDO();
	d.doYouSpeak();
	Pilot p = new Pilot();
	p.whatDoYouDO();
	p.doYouSpeak();
	

	
	

	}	
}