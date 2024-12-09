package com.noah;

import com.noah.Solution.Solution;

import java.util.Arrays;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        assert Arrays.equals(solution.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1}) : "twoSum error ";
    }
}