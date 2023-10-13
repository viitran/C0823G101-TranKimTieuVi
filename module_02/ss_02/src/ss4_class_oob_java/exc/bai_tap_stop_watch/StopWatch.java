package ss4_class_oob_java.exc.bai_tap_stop_watch;

public class StopWatch {
    //fix lại - bị dư 1 vài chỗ + NOTE: chú ý get/set
    private long startTime;
    private long endTime;

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public void getElapsedTime() {
        long elaspedTime = this.endTime - this.startTime;
        System.out.println("Số mili giây đếm đc:" + elaspedTime);
    }


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
