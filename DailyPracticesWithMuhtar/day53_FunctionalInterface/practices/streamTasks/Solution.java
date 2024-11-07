package day53_FunctionalInterface.practices.streamTasks;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


class Solution {

    public boolean solution(int N, int[] A, int[] B) {

        if (doesContain(N, A, B)) {
            Set<String> edges = new HashSet<>(N);
            try {
                for (int i = 0; i < N; i++) {
                    int lo = Math.min(A[i], B[i]);
                    int hi = Math.max(A[i], B[i]);
                    edges.add("" + lo + "-" + hi);
                }
            } catch (Exception e) {
                return true;
            }
            for (int i = 1; i < N; i++) {
                if (!edges.contains("" + i + "-" + (i + 1))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean doesContain(int N, int[] A, int[] B) {
        List<Integer> listA = Arrays.stream(A).boxed().collect(Collectors.toList());

        List<Integer> listB = Arrays.stream(B).boxed().collect(Collectors.toList());

        boolean flag = true;
        for (int i = 1; i <= N; i++) {
            if ((!listA.contains(i)) && (!listB.contains(i))) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}