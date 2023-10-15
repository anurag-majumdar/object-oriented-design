package lld.smart_phone.phone;

public class AndroidPhone implements IPhone{
    @Override
    public void makeCall() {
        System.out.println("Make Phone Call!");
    }

    @Override
    public void answerCall() {
        System.out.println("Answer Call!");
    }

    @Override
    public void disconnectCall() {
        System.out.println("Disconnect Call!");
    }
}
