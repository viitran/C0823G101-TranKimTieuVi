package ss4_class_oob_java.exc.bai_tap_fan;

public class BuildTheFan {
    public static void main(String[] args) {
        //NOTE : ĐỌC KỸ ĐỀ
        TheFan fan1 = new TheFan();
        fan1.setOn(true);
        fan1.setSpeed(fan1.getSLOW());
        fan1.setRadius(10);
        fan1.setColor("yellow");

        TheFan fan2 = new TheFan();
        fan2.setOn(false);
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("red");

        TheFan fan3 = new TheFan();

        System.out.println("Fan default: " + fan3.toString());
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2:" + fan2.toString());
    }
}
