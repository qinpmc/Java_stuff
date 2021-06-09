package com.qp.statement;

public class Break_2 {
    public static void main(String[] args) {
        int count = 0;
/*		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if(i==2){
					break;
				}
				count++;
				System.out.println(i+": "+j); //i --0,1,3,4
			}

		}
		System.out.println(count); //16 = 4*4
*/

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if(j==2){
                    break;
                }
                count++;
                System.out.println(i+": "+j); //j --0,1
            }
        }
        System.out.println(count); //10 = 5*2


/*		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if(j==2){
					continue;
				}
				count++;
				System.out.println(i+": "+j); // j --0,1,3
			}
		}
		System.out.println(count); //15 = 5*3
*/
/*		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if(i==2){
					continue;
				}
				count++;
				System.out.println(i+": "+j); //i --0,1,34
			}
		}
		System.out.println(count); //16 = 4*4
*/
/*	outer:for (int i = 0; i < 5; i++) {
		inner:for (int j = 0; j < 4; j++) {
			if(i==2){
				break outer;
			}
			count++;
			System.out.println(i+": "+j); //i --0,1
		}
	}
	System.out.println(count); //8 = 2*4
*/
/*		outer:for (int i = 0; i < 5; i++) {
			inner:for (int j = 0; j < 4; j++) {
				if(j==2){
					break inner;
				}
				count++;
				System.out.println(i+": "+j); //j --0,1
			}
		}
		System.out.println(count); //10 = 5*2
*/
    }
}
