package com.take.u.forward;

import java.util.ArrayList;
import java.util.List;

public class TUF_14_N_Queen {
	public static void main(String[] args) {

		int n = 4;
		List<List<String>> res = solveNQueen(n);
		System.out.println(res);
	}

	private static List<List<String>> solveNQueen(int n) {
		char board[][] = new char[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = '.';
			}
		}
		List<List<String>> res = new ArrayList<List<String>>();

		int leftRow[] = new int[2 * n - 1];
		int upperDaignol[] = new int[2 * n - 1];
		int lowerDaignol[] = new int[2 * n - 1];
		Solve(0, board, res, leftRow, lowerDaignol, upperDaignol);
		return res;
	}

	private static void Solve(int col, char[][] board, List<List<String>> res, int[] leftRow, int[] lowerDaignol,
			int[] upperDaignol) {

		if (col == board.length) {
			res.add(construct(board));
			return;
		}

		for (int row = 0; row < board.length; row++) {

			if (leftRow[row] == 0 && lowerDaignol[row + col] == 0 && upperDaignol[board.length - 1 + col - row] == 0) {
				leftRow[row] = 1;
				lowerDaignol[row + col] = 1;
				upperDaignol[board.length - 1 + col - row] = 1;
				board[row][col] = 'Q';
				Solve(col + 1, board, res, leftRow, lowerDaignol, upperDaignol);
				leftRow[row] = 0;
				lowerDaignol[row + col] = 0;
				upperDaignol[board.length - 1 + col - row] = 0;
				board[row][col] = '.';
			}

		}
	}

	private static List<String> construct(char[][] board) {

		List<String> res = new ArrayList<>();
		for (int i = 0; i < board.length; i++) {
			String s = new String(board[i]);
			res.add(s);
		}
		return res;
	}

}
