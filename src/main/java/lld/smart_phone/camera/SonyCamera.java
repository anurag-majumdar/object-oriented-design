package lld.smart_phone.camera;

public class SonyCamera implements ICamera {
    @Override
    public void takePhoto() {
        System.out.println("Take Photo!");
    }

    @Override
    public void takeVideo() {
        System.out.println("Take Video!");
    }
}
