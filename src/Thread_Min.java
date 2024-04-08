public class Thread_Min extends Thread {
    final Work_Array arr;
    final int startIdx;
    final int endIdx;

    public Thread_Min(Work_Array arr, int startIdx, int endIdx) {
        this.arr = arr;
        this.startIdx = startIdx;
        this.endIdx = endIdx;
    }

    @Override
    public void run() {
        NumberAndIndex min = arr.partMinimum(startIdx, endIdx);
        try {
            arr.setPartMinimum(min);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
