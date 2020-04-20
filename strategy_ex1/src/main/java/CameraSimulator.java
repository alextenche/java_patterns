public class CameraSimulator {

    public static void main(String[] args) {

        PhoneCameraApp basicCameraApp = new BasicCameraApp();
        basicCameraApp.shareStrategy = new ShareBySocialMedia();

        basicCameraApp.take();
        basicCameraApp.edit();
        basicCameraApp.save();
        basicCameraApp.share();

    }
}
