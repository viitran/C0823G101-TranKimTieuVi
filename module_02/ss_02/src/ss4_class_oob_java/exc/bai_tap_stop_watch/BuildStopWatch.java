package ss4_class_oob_java.exc.bai_tap_stop_watch;

public class BuildStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Đang đếm thời gian");
        for (int i = 0; i < 1000000000; i++) {
            i++;
        }
        stopWatch.stop();
        stopWatch.getElapsedTime();
    }
}