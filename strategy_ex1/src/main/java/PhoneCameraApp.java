public abstract class PhoneCameraApp {

    ShareStrategy shareStrategy;

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    public void share() {
        shareStrategy.share();
    }

    public void take() {
        System.out.println("take picture");
    }

    public void save() {
        System.out.println("save picture");
    }

    public abstract void edit();

}
