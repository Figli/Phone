package ua.kiev.prog;

public class IPhone5 extends IPhone {
	
	public IPhone5() {
		screenSize = 4;
	}
	
	/*@Override
	public void call(String number) {
		System.out.println("IPhone class is calling " + number);
	}*/ // ������ �.�. ����� final
	
	/*@Override
	public void sendSMS(String number, String message) {
		super.sendSMS(number, message);
		System.out.println("IPhone5 class is sending sms " + message + " to " + number);	
	}*/

    @Override
    public void call(String number) {
        System.out.println("IPhone5 is calling " + number);
        super.call(number);
    }

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number,message);
        System.out.println("IPhone5 is sending sms " + message + " to " + number);
    }

    @Override
    public void answer() {
        System.out.println("Iphone5 say 'Hello'");
    }
}
