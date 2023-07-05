public class ArrayStudy {
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void addOne(int x) {
        x = x + 1;
    }

    static void addOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

    public static void main(String[] args) {
        int size = 5;
        int[] arr = new int[size]; // Array declaration syntax

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        print(arr);

        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }

        print(arr);

        int[] arr2 = {18, 53, 22};
        print(arr2);

        // To increase the size of the array, we can create a new array and copy the elements from the existing array
        int[] copyArr = new int[2 * size];
        System.arraycopy(arr, 0, copyArr, 0, size);
        copyArr[5] = 69;
        copyArr[6] = 70;
        print(copyArr);

        // Pass by value
        int x = 10;
        addOne(x);
        System.out.println(x); // will print 10

        int[] tempArr = {1, 2, 3, 4, 5};
        addOne(tempArr); // will increase all elements by one in the original array
        print(tempArr);
    }
}
