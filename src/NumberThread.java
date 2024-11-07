public class NumberThread extends Thread {
    private int start;
    private int stop;
    private int delay;

    public NumberThread (int start, int stop, int delay) {
        this.start = start;
        this.stop = stop;
        this.delay = delay;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public void run() {
        for (int i=start; i<=stop; i++) {
            System.out.println(i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
