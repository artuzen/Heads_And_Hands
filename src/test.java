import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] sortedArrays = generationAndSortArrays(n);

        for (int[] sortedArray : sortedArrays) {
            System.out.println(Arrays.toString(sortedArray));
        }
    }

    public static int[][]generationAndSortArrays(int n){
        Random random = new Random();
        List<int[]> arrays = new ArrayList<>();
        List<Integer> sizeArrays = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            int size = random.nextInt(n) + 1;
            while (sizeArrays.contains(size)){
                size = random.nextInt(n) + 1;
            }
            sizeArrays.add(size);

            int[] array = new int[size];

            for (int j = 0; j < size; j++){
                array [j] = random.nextInt(100);
            }

            Arrays.sort(array);

            if (i % 2 != 0) {
                reverse(array);
            }

            arrays.add(array);
        }
        return arrays.toArray(new int[0][]);
    }

    public static void reverse(int[] array){
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
