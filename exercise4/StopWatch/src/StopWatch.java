class StopWatch {
    private  long startTime;
    private  long endTime;

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    void startTime(){
        this.startTime=System.currentTimeMillis();
    }
    void start(){
        long s = System.currentTimeMillis();
        this.setStartTime(s);
    }
    void stop(){
        long l = System.currentTimeMillis();
        this.setEndTime(l);
    }
   long getElapsedTime(){
        long gap = this.getEndTime()-this.getStartTime();
        return gap;
    }
}
