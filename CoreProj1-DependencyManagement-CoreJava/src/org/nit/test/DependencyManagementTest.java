package org.nit.test;
import java.time.LocalDateTime;

import org.nit.sbeans.WishMessageGenerator;
public class DependencyManagementTest {
	public static void main(String[] args) {
		//create both target class and dependent class object
		LocalDateTime ldt=LocalDateTime.now();
		WishMessageGenerator wish=new WishMessageGenerator();
		//assign dependent class obj to target class
		wish.setLdt(ldt);
		//execute the b.logic
		String message=wish.displayMessage("Biswajit");
		System.out.println(message);
	}

}
