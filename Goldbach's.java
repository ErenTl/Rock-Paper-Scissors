import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long sayi;
		
		ArrayList<Long> asal = new ArrayList<Long>();
		
		System.out.println("Goldbach's kuralını görmek istediğiniz sayıyı girin.");
		sayi=input.nextLong();
		
		for (long i = 2; i < sayi; i++) {
			
			if (asalmi(i)) {
				asal.add(i);
			}
			
		}
		
		for (long i = 0; i < asal.size(); i++) {
			long vx=0;
			for (long j = vx; j < asal.size(); j++) {
				
				
				
			}
			vx++;
		}
		
		for (int i = 0; i < asal.size(); i++) {
			System.out.println(asal.get(i));
		}
	}
	
	static boolean asalmi(long sayi) {
		boolean x=true;
		for (long i = 2; i < sayi; i++) {
			if ( (sayi/i)*i == sayi ) {
				x=false;
				break;
			}
		}
		
		return x;
	}

}
