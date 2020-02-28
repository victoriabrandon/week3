
public class HomeworkWk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int currentTemp = 80;
		boolean isHotOutside = currentTemp >= 85;
		
			System.out.println("Is it hot outside? " + isHotOutside);
			
		int monday = 1;
		int tuesday = 2;
		int friday = 5;
		int currentDay = tuesday;
		boolean isWeekday = currentDay < 5;
		System.out.println("Is today a weekday? " + isWeekday);

		int emptyPocket = 0;
		int pocket = 3;
		int rich = 11;
		boolean hasMoneyInPocket = rich > 5;
		System.out.println("I'm rich! " + hasMoneyInPocket);
		
		double costOfMilk = 3;
		if (costOfMilk <=1.99) {
			System.out.println("I'll buy 2 gallons");
		} else if (costOfMilk <= 1) {
			System.out.println("I will buy 3 gallons");
		} else {
			System.out.println("I don't want to buy any milk");
		}
		
		double moneyInWallet = 25;
		if (moneyInWallet >= 5) {
			System.out.println("I want to spend it!");
		} else if (moneyInWallet < 5) {
			System.out.println("Let's save it");
		}else {
			System.out.println("Otherwise I'm broke");
		}
		
		double thirstLevel = 2;
		if (thirstLevel <= 5) {
			System.out.println("I am very thirsty and need a drink");
		} else if (thirstLevel >= 6) {
			System.out.println("No thanks! I am not thirsty");
		} else {
			System.out.println("I am good");
		}
		int hotOutside = 85;
		int moneyInPocket = 6; 
		boolean shouldBuyIcecream = hotOutside >= 85 && moneyInPocket >=6;
		System.out.println("I should buy Icecream " + shouldBuyIcecream);
	
		for (int p = 0; p < 100; p += 2) {
			System.out.println(p);
		}
		
		
		int m = 100;
		while (m >= 0) {
			System.out.println(m);
			m -= 3;
		}
		
		int j = 100;
		while (j >= 0) {
			System.out.println(j);
			j -= 2;
		}
		
		int k = 100;
		while (k <=0) {
			System.out.println(k);
			k =2;
		}
		
		
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Hello World");
			} else if (i % 3 == 0) {
				System.out.println("Hello");
			} else if (i % 5 == 0) {
				System.out.println("World");
			} else {
				System.out.println(i);
			}
		}
			
	}
}
