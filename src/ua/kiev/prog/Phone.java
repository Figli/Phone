package ua.kiev.prog;

public abstract class Phone {

    protected int counterCall;
    protected int counterSMS;
	protected boolean touch;
	protected boolean hasWifi;
	protected int screenSize;
	
	public Phone() {
	}
	
	public boolean isTouch() {
		return touch;
	}
	
	public boolean isHasWifi() {
		return hasWifi;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	
	public void call(String number) {
        counterCall++;
        ATS.dial(number);
	}
	
	public void sendSMS(String number, String message) {
        counterSMS++;
    }

    public void answer() {
        System.out.println("Hello");
    }
}
