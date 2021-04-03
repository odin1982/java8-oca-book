package org.oca.pag029;

public class LocalVariables {
	public int notValid() {
		int y = 10;
		int x;
		int reply = x + y;//not valid, x is not initialized before use it
		return reply;
	}
	
	public int valid() {
		int y = 10;
		int x;
		x = 10;
		int reply = x + y;
		return reply;
	}
}
