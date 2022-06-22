package Main;

//归并排序
class Merge {
    // 表示递归最后一步的逻辑
    static void merge(int[] arr, int L, int M, int R) {
        int LEFT_SIZE = M - L;
        int RIGHT_SIZE = R - M + 1;
        int[] left = new int[LEFT_SIZE];
        int[] right = new int[RIGHT_SIZE];
        int i, j, k;
        // fill left
        for (i = L; i < M; i++) {
            left[i - L] = arr[i];
        }
        // fill right
        for (i = M; i <= R; i++) {
            right[i - M] = arr[i];
        }
        i = 0;
        j = 0;
        k = L; // 表示复原的下标
        while (i < LEFT_SIZE && j < RIGHT_SIZE) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < LEFT_SIZE) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < RIGHT_SIZE) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr, int L, int R) {
        if (L == R)
            return;
        int M = (L + R) / 2;
        mergeSort(arr, L, M);
        mergeSort(arr, M + 1, R);
        merge(arr, L, M + 1, R);

    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 10, 9, 4, 5, 2, 7 };
        int L = 0;
        int R = 7;
        mergeSort(arr, L, R);
        for (int a : arr)
            System.out.print(a);
    }
}
