package timus.task_1025;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int K = in.nextInt();
        int[] groups = new int[K];

        for (int i = 0; i < K; i++) {
            groups[i] = in.nextInt();
        }

        int needGroups = K / 2 + 1;

        int[] cost = new int[K];
        for (int i = 0; i < K; i++) {
            cost[i] = groups[i] / 2 + 1;
        }

        Arrays.sort(cost);

        int answer = 0;
        for (int i = 0; i < needGroups; i++) {
            answer += cost[i];
        }

        System.out.println(answer);
    }}
