package com.mindtree.Ass8;

import java.util.Scanner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.java.loggingdemo.UserAuthentication;
/*
 *@Saravanan Lalbagathur 
 * 30/11/2022 Console Based Examination System Main Class where 
 * the user can have list of question and where user can evaluate themselves.
 */
public class ExamSystemMain {

	static int counter = 0;
	static QuestionBank quesbank;
	static Log logger = LogFactory.getLog(ExamSystemMain.class);
	public static void main(String args[]) {
		quesbank = new QuestionBank();
		System.out.println("Welcome for LTIMindTree Examination!   \n Are You Ready ?\n(Y-Start  N- Cancel) ");
		Scanner ScannerIp = new Scanner(System.in);
		String userIp = ScannerIp.next();

		switch (userIp) {
		case "Y":
			while (counter >= 0) {
				logger.info("User Opted Yes to continue with Examination");
				System.out.println(quesbank.QuestionId(counter));
				System.out.println("Please enter your Option");
				String useropt = ScannerIp.next();

				if (useropt.equals(quesbank.answerData(counter))) {
					System.out.println("Well done! Answer is Right!\n\n Please proceed with Next Question\n");
					counter++;
					 if (quesbank.answerData(counter)==null) {
						
						System.out.println("Completed your Exam\n Thank You!");
					}
				} 
				
				else {
					logger.error("Sorry User Provided invalid Input data");
					System.out.println("Sorry your Answer is not Valid!\n\n Please try it once again\n");
					counter = counter - 0;
				}
			}
			break;
		case "N":
			System.out.println("Thank you! Your are Existing from Examination System.");
			System.exit(0);
			break;
		default:
			System.out.println("Please try valid option to Proceed further!");
			break;
		}

	}
}
