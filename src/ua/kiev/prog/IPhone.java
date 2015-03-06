package ua.kiev.prog;

public class IPhone extends Phone {
	
	public IPhone() {
		touch = true;
		hasWifi = true;
		screenSize = 3;
	}
	
	/*@Override
	final public void call(String number) {
		System.out.println("IPhone class is calling " + number);
	}
	
	@Override
	public void sendSMS(String number, String message) {
		System.out.println("IPhone class is sending sms " + message + " to " + number);	
	}*/

    public void call(String number) {
        System.out.println("IPhone is calling " + number);
        super.call(number);
    }

    public void sendSMS(String number, String message) {
        super.sendSMS(number,message);
        System.out.println("IPhone is sending sms " + message + " to " + number);
    }

    @Override
    public void answer() {
        System.out.println("IPhone say 'Hello'");
    }
}
