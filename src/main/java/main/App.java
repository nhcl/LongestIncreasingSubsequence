package main;

import excercise.LongestIncreasingSubsequence;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestIncreasingSubsequence LongestIncreasingSubsequence = new LongestIncreasingSubsequence();
		Integer[] result = LongestIncreasingSubsequence.getLongestIncreasingSubsequence();

        System.out.println("Winning sequence is");
        for (Integer i : result) {
            System.out.println("number: " + i);
        }
        System.out.println("End of sequence");
		

	}

}
