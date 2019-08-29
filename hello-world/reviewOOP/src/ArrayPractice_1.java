public class ArrayPractice_1 {

    public static void main(String[] args) {
        int[] a = new int[]{2, 4, 6, 8, 1, 5, 3, 9, 7};
        print(a);
        ArrayPractice_1 arr = new ArrayPractice_1();
       // arr.intArraySort(a);
        arr.intArraySort_1(a);
        System.out.println();
        print(a);
    }

    private static void print(int[] a) {
//        for(int i=0; i<a.length; i++){
//            System.out.print(a[i] + ' ');
//        }
        for (int i : a) {     //foreach
            System.out.print(i + " ");
        }
    }

    private void intArraySort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    private void intArraySort_1(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//            int res = a[i];
//            int position = 0;
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[j] < res) {
//                    res = a[j];
//                    position = j;
//                }
//            }
//
//            a[position] = a[i];
//            a[i] = res;
//        }

        int k, temp;
        for (int i = 0; i < a.length; i++) {
            k = i;
            for (int j = i + 1; j < a.length; j++) {
                if(a[k] > a[j]){
                    k = j;
                }
            }
            temp = a[i];
            a[i] = a[k];
            a[k] = temp;
        }
    }
}
