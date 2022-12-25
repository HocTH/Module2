package StopWatch;


import java.sql.Array;

public class StopWatch {
    private double startTime;
    private double endTime;
    public StopWatch(){
        this.startTime=0;
        this.endTime=0;
    }

    public StopWatch(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }
    public void star(){
        this.startTime = System.currentTimeMillis();
    }
    public void end(){
        this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return this.endTime-this.startTime;
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = -1;
        int max = arr[0];
        watch.star();
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max in arr is " + max);
        watch.end();
        System.out.println("Total time to sort: "+watch.getElapsedTime());

    }
}

