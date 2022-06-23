package Main;

class Quick {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 1, 10, 2, 9 };
        quickSort(arr, 0, 5);
        for (int a : arr)
            System.out.print(a);
    }

    static void quickSort(int[] nums, int left, int right) {
        if (left >= right)
            return;
        int p = partition(nums, left, right);
        quickSort(nums, left, p - 1);
        quickSort(nums, p + 1, right);
    }

    static int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int low = left + 1;
        int high = right;
        while (true) {
            while (low <= high && nums[low] < pivot) {
                low++;
            }
            while (low <= high && nums[high] > pivot) {
                high--;
            }
            if (low >= high)
                break;

            // 交换low,high
            int t = nums[low];
            nums[low] = nums[high];
            nums[high] = t;
            low++;
            high--;
        }
        // 交换left high
        int t = nums[left];
        nums[left] = nums[high];
        nums[high] = t;
        return high;
    }
}
