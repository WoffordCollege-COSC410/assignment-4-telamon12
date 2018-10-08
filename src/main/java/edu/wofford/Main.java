
package edu.wofford;


public class Main {

	public static void main(String[] args) {
		String s = args[0];
		if(s.equals("console")){
			ConsoleMain con = new ConsoleMain();


		}
		else{
			GuiMain gui = new GuiMain();
		}




	}
}