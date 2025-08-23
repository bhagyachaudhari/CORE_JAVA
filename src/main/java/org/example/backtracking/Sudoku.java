package org.example.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sudoku {

    public static void main(String[] args) {

        ArrayList<ArrayList<Character>> a = new ArrayList<>();

        List<Character> charlist = String.copyValueOf("53..7....".toCharArray())
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        a.add((ArrayList<Character>) charlist);

        charlist = String.copyValueOf("6..195...".toCharArray())
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        a.add((ArrayList<Character>) charlist);

        charlist = String.copyValueOf(".98....6.".toCharArray())
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        a.add((ArrayList<Character>) charlist);

        charlist = String.copyValueOf("8...6...3".toCharArray())
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        a.add((ArrayList<Character>) charlist);

        charlist = String.copyValueOf("4..8.3..1".toCharArray())
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        a.add((ArrayList<Character>) charlist);

        charlist = String.copyValueOf("7...2...6".toCharArray())
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        a.add((ArrayList<Character>) charlist);

        charlist = String.copyValueOf(".6....28.".toCharArray())
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        a.add((ArrayList<Character>) charlist);

        charlist = String.copyValueOf("...419..5".toCharArray())
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        a.add((ArrayList<Character>) charlist);

        charlist = String.copyValueOf("....8..79".toCharArray())
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        a.add((ArrayList<Character>) charlist);



        solveSudoku(a);
        System.out.println(a);
    }

    public static void solveSudoku(ArrayList<ArrayList<Character>> a) {

        helper(a, 0, 0);

    }

    public static boolean helper(ArrayList<ArrayList<Character>> a, int row, int col){

        if(row == 9)
            return true;

        int nrow = 0;
        int ncol = 0;

        if(col != 8){
            nrow = row;
            ncol = col + 1;
        }else{
            nrow = row + 1;
            ncol = 0;
        }

        if(a.get(row).get(col) != '.'){
            if(helper(a, nrow, ncol))
                return true;
        }else{
            for(int i = 1; i <= 9; i++){
                if(isSafe(a, row, col, i)) {
                    a.get(row).set(col, (char) (i + '0'));
                    if (helper(a, nrow, ncol))
                        return true;
                    else
                        a.get(row).set(col, '.');
                }
            }
        }
        return false;
    }

    public static boolean isSafe(ArrayList<ArrayList<Character>> a, int row, int col, int number){
        for(int i = 0; i < 9; i++){
            if(a.get(i).get(col) == (char)number + '0')
                return false;
            if(a.get(row).get(i) == (char)number + '0')
                return false;
        }

        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        for(int i = sr; i < sr + 3; i++){
            for(int j = sc; j < sc + 3; j++){
                if(a.get(i).get(j) == (char)number + '0')
                    return false;
            }
        }
        return true;
    }

}
