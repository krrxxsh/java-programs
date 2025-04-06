public class EvenOddCount {
    int evenCount = 0, oddCount = 0;

    
    EvenOddCount(int[] array) {
        Count(array);
    }

    
    void Count(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {  
                evenCount++;
            } else {  
                oddCount++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {20, 21, 18, 89, 9, 65, 1000, 109, 69};

        EvenOddCount c1 = new EvenOddCount(array);

        System.out.println("Even count: " + c1.evenCount);
        System.out.println("Odd count: " + c1.oddCount);
    }
}
