package lld.smart_phone;

import lld.smart_phone.camera.ICamera;
import lld.smart_phone.camera.SonyCamera;
import lld.smart_phone.phone.AndroidPhone;
import lld.smart_phone.phone.IPhone;

public class SmartPhone {
    private IPhone phone;
    private ICamera camera;

    public SmartPhone(IPhone phone, ICamera camera) {
        this.phone = phone;
        this.camera = camera;
    }

    public void takeSnapshot() {
        this.camera.takePhoto();
    }

    public void makePhoneCall() {
        this.phone.makeCall();
    }

    public static void main(String[] args) {
        AndroidPhone androidPhone = new AndroidPhone();
        SonyCamera sonyCamera = new SonyCamera();
        SmartPhone smartPhone = new SmartPhone(androidPhone, sonyCamera);
        smartPhone.makePhoneCall();
        smartPhone.takeSnapshot();
    }
}
