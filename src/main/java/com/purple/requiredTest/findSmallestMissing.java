package com.purple.requiredTest;

public class findSmallestMissing {



    public static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Quicksort의 파티셔닝 단계를 위한 선형 시간 루틴
    public static int partition(int[] nums)
    {
        int pIndex = 0;

        // 양수를 찾을 때마다 `pIndex`가 증가하고
        // 해당 요소는 피벗 앞에 배치됩니다.
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > 0)    {    // 피벗은 0
                swap(nums, i, pIndex);
                pIndex++;
            }
        }

        // 양수가 아닌 첫 번째 숫자의 인덱스 반환
        return pIndex;
    }

    // 어레이되지 않은 어레이에서 가장 작은 누락된 양수를 찾는 함수
    public static int findSmallestMissing(int[] nums)
    {
        int k = partition(nums);

        // 사례 1. 누락된 숫자가 1에서 k 범위에 있습니다.

        // 각 어레이 요소에 대해 수행
        for (int i = 0; i < k; i++)
        {
            // 현재 요소의 값 가져오기
            int val = Math.abs(nums[i]);

            // 인덱스 `val-1`의 요소가 양수이면 음수로 만듭니다.
            if (val-1 < k && nums[val-1] >= 0) {
                nums[val-1] = -nums[val-1];
            }
        }

        // 1에서 k까지 누락된 숫자 확인
        for (int i = 0; i < k; i++)
        {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        // Case 2. 어레이에 1부터 k까지의 숫자가 있는 경우
        // 누락된 숫자는 `k + 1`입니다. 예: {1, 2, 3, 4} —> 5

        return k + 1;
    }


    //    public static void quickSort(int[] arr, int low, int high) {
//        if (low < high) {
//            int pivotIndex = partition(arr, low, high);
//            quickSort(arr, low, pivotIndex - 1);
//            quickSort(arr, pivotIndex + 1, high);
//        }
//    }
//
//    public static int partition(int[] arr, int low, int high) {
//        // 무작위한 pivot 선택
//        Random random = new Random();
//        int randomIndex = random.nextInt(high - low + 1) + low;
//        swap(arr, randomIndex, high);
//
//        int pivot = arr[high];
//        int i = low - 1;
//
//        for (int j = low; j < high; j++) {
//            if (arr[j] < pivot) {
//                i++;
//                swap(arr, i, j);
//            }
//        }
//
//        swap(arr, i + 1, high);
//        return i + 1;
//    }
//
//    public static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

}
