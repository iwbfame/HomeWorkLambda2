public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorTaskListener = System.out::println;

        Worker worker = new Worker(listener, errorTaskListener);

        worker.start();
    }
}