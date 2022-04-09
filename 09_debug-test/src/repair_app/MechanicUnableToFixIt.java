package repair_app;
public class MechanicUnableToFixIt extends Exception {

	public MechanicUnableToFixIt() {
		super("The mechanic(s) can't repair your broke-ass car.");
	}
	
}
