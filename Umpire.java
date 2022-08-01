package com.ineuron.game;

import java.util.Scanner;

public class Umpire {
	
	public static void main(String args[]) {
		
		System.out.println("\t\t***********The guesser game***************\n");
		System.out.println("\t\t\t   By Sriman\n");
		
		System.out.println("'Summary of game': The guesser will guess one number and the players had to re-guess the number,\n if it matches with the guesser number, then thet player is the winner.\n if more than one player gusses the correct number then there will be re game for second time\n And if the same situation happens again then it will be a tie.\n");
		
		System.out.println("The Results will be Announced Shortly by Umpire...., Stay Tuned....!:)\n");
		
		Guesser g = new Guesser();
		
		int guessedNumber=g.guesserNumber();

		Player p = new Player();
		int p1_num=p.guessNumberP1();
		int p2_num=p.guessNumberP2();
		int p3_num=p.guessNumberP3();
		
		if(guessedNumber==p1_num && guessedNumber==p2_num && guessedNumber==p3_num) {
			System.out.println("And The Results are Out\n");
			System.out.println("Hurray...!,Player1, player2 and player3 you all Won the game,Congratulations...!");
			System.out.println("so play again..");
			int result=g.guesserNumber();
			int p1=p.guessNumberP1();
			int p2=p.guessNumberP2();
			int p3=p.guessNumberP3();
			
			if(guessedNumber==p1_num && guessedNumber==p2_num && guessedNumber==p3_num) {
				System.out.println("And The Results are Out\n");
				System.out.println("Hurray...!,Player1, player2 and player3 you all Won the game,Congratulations...!");
				System.out.println("So the game is tie..");
				return;
			}
			else if(result==p1 && result==p2) {
				System.out.println("And The Results are Out\n");
				System.out.println("Hurray...!,Player1 and player2 you both Won the game,Congratulations...!");
				return;
			}
			else if(result==p2 && result==p3) {
				System.out.println("And The Results are Out\n");
				System.out.println("Hurray...!,Player2 and player3 you both Won the game,Congratulations...!");
				return;
			}
			else if(result==p3 && guessedNumber==p1) {
				System.out.println("And The Results are Out\n");
				System.out.println("Hurray...!,Player3 and player1 you both Won the game,Congratulations...!");
				return;
			}
			else if(result==p1) {
				System.out.println("And The Results are Out\n");
				System.out.println("Hurray...!,Player1 You Won the game,Congratulations...!");
				return;
			}
			else if(result==p2) {
				System.out.println("And The Results are Out\n");
				System.out.println("Hurray...!,Player2 You Won the game,Congratulations...!");
				return;
			}
			else if(result==p3){
				System.out.println("\nAnd The Results are Out\n");
				System.out.println("Hurray...!,Player3 You Won the game,Congratulations...!");
				return;
			}
			else {
				System.out.println("\nAnd the Results are out\n");
				System.out.println("\tGame Lost");
				System.out.println("Better luck next time contenders:(");
			}
		}
		if(guessedNumber==p1_num && guessedNumber==p2_num) {
			System.out.println("And The Results are Out\n");
			System.out.println("Hurray...!,Player1 and player2 you both Won the game,Congratulations...!");
			System.out.println("so player1 and player2 play the game again..");
			int result=g.guesserNumber();
			int p1=p.guessNumberP1();
			int p2=p.guessNumberP2();
			
			if(result==p1 && result==p2) {
				System.out.println("And The Results are Out\n");
				System.out.println("Hurray...!,Player1 and player2 you both Won the game,Congratulations...!");
				System.out.println("So the game is tie\n");
				return;
			}
			else if(result==p1) {
				System.out.println("And The Results are Out\n");
				System.out.println("Hurray...!,Player1 You Won the game,Congratulations...!");
				return;
			}
			else if(result==p2) {
				System.out.println("And The Results are Out\n");
				System.out.println("Hurray...!,Player2 You Won the game,Congratulations...!");
				return;
			}
			else {
				System.out.println("\nAnd the Results are out\n");
				System.out.println("\tGame Lost");
				System.out.println("Better luck next time contenders:(");
			}
		}
		else if(guessedNumber==p2_num && guessedNumber==p3_num) {
			System.out.println("And The Results are Out\n");
			System.out.println("Hurray...!,Player2 and player3 you both Won the game,Congratulations...!");
			System.out.println("so player2 and player3 play again..");
			int result=g.guesserNumber();
			int p2=p.guessNumberP2();
			int p3=p.guessNumberP3();
			
			if(result==p2 && result==p3) {
				System.out.println("And The Results are Out\n");
				System.out.println("Hurray...!,Player2 and player3 you both Won the game,Congratulations...!");
				System.out.println("So the game is tie..");
				return;
			}
			else if(result==p2) {
				System.out.println("And The Results are Out\n");
				System.out.println("Hurray...!,Player2 You Won the game,Congratulations...!");
				return;
			}
			else if(result==p3){
				System.out.println("\nAnd The Results are Out\n");
				System.out.println("Hurray...!,Player3 You Won the game,Congratulations...!");
				return;
			}
			else {
				System.out.println("\nAnd the Results are out\n");
				System.out.println("\tGame Lost");
				System.out.println("Better luck next time contenders:(");
			}
			
		}
		else if(guessedNumber==p3_num && guessedNumber==p1_num) {
			System.out.println("And The Results are Out\n");
			System.out.println("Hurray...!,Player3 and player1 you both Won the game,Congratulations...!");
			System.out.println("So player1 and player3 play the game again..");
			int result=g.guesserNumber();
			int p1=p.guessNumberP1();
			int p3=p.guessNumberP3();
			
			if(result==p3 && guessedNumber==p1) {
				System.out.println("And The Results are Out\n");
				System.out.println("Hurray...!,Player3 and player1 you both Won the game,Congratulations...!");
				System.out.println("So the game is tie..");
				return;
			}
			else if(result==p1) {
				System.out.println("And The Results are Out\n");
				System.out.println("Hurray...!,Player1 You Won the game,Congratulations...!");
				return;
			}
			else if(result==p3){
				System.out.println("\nAnd The Results are Out\n");
				System.out.println("Hurray...!,Player3 You Won the game,Congratulations...!");
				return;
			}
			else {
				System.out.println("\nAnd the Results are out\n");
				System.out.println("\tGame Lost");
				System.out.println("Better luck next time contenders:(");
			}
		}
			
		
		else if(guessedNumber==p1_num) {
			System.out.println("And The Results are Out\n");
			System.out.println("Hurray...!,Player1 You Won the game,Congratulations...!");
			return;
		}
		else if(guessedNumber==p2_num) {
			System.out.println("And The Results are Out\n");
			System.out.println("Hurray...!,Player2 You Won the game,Congratulations...!");
			return;
		}
		else if(guessedNumber==p3_num){
			System.out.println("\nAnd The Results are Out\n");
			System.out.println("Hurray...!,Player3 You Won the game,Congratulations...!");
			return;
		}
		else {
			System.out.println("\nAnd the Results are out\n");
			System.out.println("\tGame Lost");
			System.out.println("Better luck next time contenders:(");
		}
	}
	

}

class Player{

	int player1;
	int player2;
	int player3;

	public int guessNumberP1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey Player1.....!,Guess the number :");
		player1=sc.nextInt();
		return player1;
	}

	public int guessNumberP2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey Player2.....!,Guess the number :");

		player2=sc.nextInt();
		return player2;
	}

	public int guessNumberP3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey Player3.....!,Guess the number :");

		player3=sc.nextInt();
		return player3;
	}

}

class Guesser{

	int guessNum;

	public int guesserNumber() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Hey Guesser...!'Guess the number :' ");
		guessNum = sc.nextInt();
		if(guessNum>20) {
			System.out.println("Kindly Guess a number from range (1 to 20)\n");
			guesserNumber();
		}

		return guessNum;
	}
}
