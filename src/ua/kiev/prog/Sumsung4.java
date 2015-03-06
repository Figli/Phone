package ua.kiev.prog;

public class Sumsung4 extends Phone {

    private String sayHello = "Hello";

    public Sumsung4() {
        touch = true;
        hasWifi = true;
        screenSize = 5;
    }

    public String getSayHello() {
        return sayHello;
    }

    public void call(String number) {
        super.call(number);
        System.out.println("Sumsung4 is calling " + number);
    }

    public void sendSMS(String number, String message) {
        super.sendSMS(number,message);
        System.out.println("Sumsung4 is sending sms " + message + " to " + number);
    }

    @Override
    public void answer() {
        System.out.println("Sumsung4 say 'Hello'");
    }
}
