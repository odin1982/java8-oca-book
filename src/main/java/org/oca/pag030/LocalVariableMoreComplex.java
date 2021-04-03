package org.oca.pag030;

public class LocalVariableMoreComplex {
	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if(check) {
			answer = 0;
			onlyOneBranch = 1;
		}else {
			answer = 1;
		}
		
		System.out.println(answer);
		System.out.println(onlyOneBranch);//compile error
	}

}
