package com.capgemini.gol;
//import java.util.List;
//import java.util.Scanner;
//
//public class PrintGame {
//
//	static Game g;
//	private static Scanner sc;
//
////	static void print2D(List<Cell> list) {
////		for (Cell cell : list) {
////			String[] t = cell.getCoords().split(" ");
////			int y = Integer.parseInt(t[1]);
////
////			if (cell.isAlive()) {
////				System.out.print("*");
////			} else {
////				System.out.print("0");
////			}
////
////			if (y % (Game.size) == Game.size - 1) {
////				System.out.println();
////			}
////		}
////	}
//
//	public static void main(String[] args) {
//		g = new Game();
//		Game.init();
//
//		// Cell c = Neighbourhood.getCellByCoords("0 0");
//		// c.ressurect();
//		// c = Neighbourhood.getCellByCoords("0 1");
//		// c.ressurect();
//		// c = Neighbourhood.getCellByCoords("0 2");
//		// c.ressurect();
//		// c = Neighbourhood.getCellByCoords("1 0");
//		// c.ressurect();
////		 Cell c = Neighbourhood.getCellByCoords("1 1");
////		 c.ressurect();
//		// c = Neighbourhood.getCellByCoords("1 2");
//		// c.ressurect();
//		// c = Neighbourhood.getCellByCoords("2 0");
//		// c.ressurect();
//		// c = Neighbourhood.getCellByCoords("2 1");
//		// c.ressurect();
//		// c = Neighbourhood.getCellByCoords("2 2");
//		// c.ressurect();
//
////		Random r = new Random();
////		for (int i = 0; i < g.board.size() / 2; i++) {
////			int ran = r.nextInt(g.board.size());
////			g.board.get(ran).ressurect();
////		}
//
//		print2D(Game.board);
//		System.out.println("==========================================================");
//		sc = new Scanner(System.in);
//		while (true) {
//			String input = sc.nextLine();
//			if (input.equals("n")) {
//				Game.calculateNextGeneration();
//				print2D(Game.board);
//			}
//			System.out.println("==========================================================");
//		}
//	}
//
//}
