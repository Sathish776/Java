package com.trail;

public class Armstrong_Number {
	    public static void main(String[] args) {
			int val=1634;
			int arm=0;
			int rem;
			int val1=val;
			
			while (val>0) {
				rem=val%10;               //  371%10=1      //37%10=7
				arm=arm+(rem*rem*rem*rem);	//  0+1*1*1=1    //1+7*7*7=344
				val=val/10;                // 371/10=37  //37/10=3
			}
			if (val1==arm) {
				System.out.println("its armstrong number");
				
			}
			else {
				System.out.println("its not armstong number");
			}
		}

}







         //153=(1*1*1)+(5*5*5)+(3*3*3)
         // 1+125+27=153