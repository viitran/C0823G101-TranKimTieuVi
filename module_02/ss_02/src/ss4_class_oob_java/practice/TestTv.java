package ss4_class_oob_java.practice;

public class TestTv {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(10);
        tv1.setVolume(3);
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.volumeDown();
        System.out.println("Channel cua tv1 dang la " + tv1.channel + " va volume dang la " + tv1.volumeLevel);
        System.out.println("Channel cua tv2 dang la " + tv2.channel + " va volume dang la: " + tv2.volumeLevel);
    }
}
