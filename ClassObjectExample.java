class ClassObjectExample

{
	
	public static void main (String[] args){
		Lamp l1= new Lamp(), l2= new Lamp();

		l1.turnOn();
		l2.turnOff();

		l1.displayLightStatus();
		l2.displayLightStatus();
	}
}
