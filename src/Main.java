//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int threads = 7;
        int length = 10000000;
        Work_Array arr = new Work_Array(threads, length);
        System.out.printf("min number: %d on index: %d\n",
                arr.getMin().getNumber(), arr.getMin().getIndex());
    }
}