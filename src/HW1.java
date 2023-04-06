public class HW1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();  // +1
        int n = 10; //  +1
        int[] arr = new int[n]; //  +1

        int sum = 0; // +1
        // Populate the array with random numbers
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * n) ; // +n
            sum += arr[i];
            System.out.println(arr[i]);
        }
        long endTime = System.currentTimeMillis(); // +1
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds"); //   +1

    }
}
