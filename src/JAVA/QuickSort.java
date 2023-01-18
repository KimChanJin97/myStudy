package JAVA;

import java.util.*;

public class QuickSort {

    public static int partition(int[] arr, int left, int right) {

        int pivot = (left + right) / 2;

        while (left < right) { // left와 right가 교차하지 않을 때까지 반복
            while (left <= right && arr[left] <= arr[pivot])
                ++left; // left 옳은 경우, 틀린"값" 찾을 때까지 오른쪽으로 이동 (left는 pivot을 넘어가지만 않는다면 left는 옳음)
            while (left <= right && arr[right] > arr[pivot]) // arr[right] > arr[pivot] 하는 이유는 left와 right를 겹치게 하지 않기 위해
                --right; // right 옳은 경우, 틀린"값" 찾을 때까지 왼쪽으로 이동 (단 right는 pivot을 넘어가지만 않는다면 right는 옳음)

            // 애초에 left와 right가 교차하지 않도록 설계함
            // 그렇다면 도대체 어떤 trigger로 반복문을 끝낼 것인가?
            // pivot을 활용한다. pivot은 기존값을 그대로 유지한다
            // 즉, left값과 right값을 스왑할 때 left와 right 자체를 스왑하진 않지만 pivot 자체는 스왑한다
            // pivot과 right와 일치할 경우

           if (left <= right) { // left와 right가 이동한 결과 서로 교차하지 않는다면 (애초에 left와 right가 같은 곳에 존재하지 않도록 설계했으니 당연)
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp; // left"값"과 right"값" 스왑 (left와 right 자체를 스왑하는 것이 아님)
               // pivot은 기존값 그대로 유지하면서 left"값"과 right"값"을 스왑했다
               // 즉, 결국에는 left가 곧 pivot이 될텐데 그 상황에서 left"값"과 right"값"을 스왑한다면
               // right

                if (right == pivot) { // 스왑 결과 right가 pivot이라면 = left가 pivot이었다면 = pivot 왼쪽영역에는 틀린값 없다면
                    return left; // left 리턴 (left는 left가 갈 수 있는 최대 즉, 다음 재귀에서 right)
                }
            }
        }
        if (right != pivot) { //
            int temp = arr[right];
            arr[right] = arr[pivot];
            arr[pivot] = temp;
        }
        return right;

    }

    public static void quickSort(int[] ori, int left, int right) {

        if (left < right) {

            int newPivot = partition(ori, left, right); // 인자: 배열, 배열의 처음, 배열의 끝
            quickSort(ori, left, newPivot - 1); // 인자: 배열, left,
            quickSort(ori, newPivot + 1, right); //

        }
    }

    // 정렬 실행해보기
    public static void main(String[] args) {

        int[] a = {7,4,12,13,14,2,8,3,5,1,6,10,9,11,15};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }
}