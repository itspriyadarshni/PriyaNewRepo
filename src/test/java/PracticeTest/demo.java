package PracticeTest;

public class demo {

	public static void main(String[] args) {
		int []s1= {123,121,313,456};
		for (int i = 0; i < s1.length; i++) {
			int num = s1[i];
			int rev=0;
			int temp=num;
			while(num>0) {
				int ld=num%10;
				rev=rev*10+ld;
				num=num/10;
			}
			if (rev==temp) {
				System.out.println(s1[i]+" is a palindrome");
			}
		}

	}

	}

