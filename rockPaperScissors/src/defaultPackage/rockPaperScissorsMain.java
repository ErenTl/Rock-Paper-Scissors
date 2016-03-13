package defaultPackage;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class rockPaperScissorsMain {

	public static void main(String[] args) throws IOException {
		Random rdm = new Random();
		int you,pc,score=0;
		do {
			save(score);
		System.out.println("Score:"+score);
		you=random();
		pc=rdm.nextInt(3)+1;
		switch (pc) {
		case 1: System.out.println("PC= Rock"); break;
		case 2: System.out.println("PC= Paper"); break;
		case 3: System.out.println("PC= Scissors"); break;
		}
		
		if (you==pc) {
			System.out.println("Draw. \n");
		}
		if(you-1==pc || you+2==pc) {
			System.out.println("You won. \n");
			score++;
		}
		if(you+1==pc || you-2==pc) {
			System.out.println("Lose. \n");
			score--;
		}
		
		} while (true);
	}
	
	public static String rps() {
		Scanner input = new Scanner(System.in);
		String you;
		input.nextLine();
		System.out.println("Rock-Paper-Scissors?");
		you=input.nextLine();
		you=you.toLowerCase();

		return you;
	}
	
	public static int random() {
		String you;
		int youint = 0;
		boolean x=true;
		you=rps();
		
		do {
		switch (you) {
		case "rock":
			youint=1;
			x=false;
			break;
		case "paper":
			youint=2;
			x=false;
			break;
			
		case "scissors":
			youint=3;		
			x=false;
			break;
		default:
			you=rps();
			}
		
		} while (x);
				
		return youint;
		
	}
	
	public static void save(int score) throws IOException {
		File savefile = new File("save.txt");
		BufferedWriter bWriter = new BufferedWriter(new FileWriter(savefile));
		bWriter.write(String.valueOf(score));
		bWriter.close();
	}
}
