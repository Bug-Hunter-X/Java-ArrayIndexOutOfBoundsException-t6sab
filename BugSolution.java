public class BugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int index = 5;
        if (index >= 0 && index < arr.length) {
            arr[index] = 10;
            System.out.println("Value at index " + index + ": " + arr[index]);
        } else {
            System.out.println("Index out of bounds!");
        }
    }
}