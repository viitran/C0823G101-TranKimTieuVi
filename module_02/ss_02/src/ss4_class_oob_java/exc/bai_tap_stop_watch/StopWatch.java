package ss4_class_oob_java.exc.bai_tap_stop_watch;

public class StopWatch {
    //fix lại - bị dư 1 vài chỗ + NOTE: chú ý get
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
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
}

