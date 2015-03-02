package second;

public class TV_Runner {

    public void changeVolume(Television television, String operation) {
        if (operation.equals("up")) {
            television.volumeUp();
        } else {
            television.volumeDown();
        }
    }

    public void watchTv(SamsungTelevision tv) {
        System.out.println("Watching tv");
        tv.recordVoice("private conversation");
    }

    public static void main(String[] args) {
        TV_Runner tv_runner = new TV_Runner();

        second.SonyTelevision sonyTelevision = new SonyTelevision();
        SamsungTelevision samsungTelevision = new SamsungTelevision();

        second.more.SonyTelevision knockOff = new second.more.SonyTelevision();

        tv_runner.changeVolume(sonyTelevision, "up");
        tv_runner.changeVolume(samsungTelevision, "down");

        tv_runner.watchTv(samsungTelevision);



    }

}
