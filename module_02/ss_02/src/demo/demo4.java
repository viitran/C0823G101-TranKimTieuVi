package demo;

public class demo4 {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    demo4() {
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

    @Override
    public String toString() {
        return "BuildStopWatch{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}

//    public static void main(Country[] args) {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        System.out.println("Đang đếm thời gian");
//        for (int i = 0; i < 1000000000; i++) {
//            i++;
//        }
//        stopWatch.stop();
//        stopWatch.getElapsedTime();
//        BuildStopWatch buildStopWatch = new BuildStopWatch();
//        long number = 3L;
//
//
//        long number1 = 4L;
//        System.out.println(buildStopWatch.toString());
//        System.out.println(buildStopWatch.getStartTime());
//    }
