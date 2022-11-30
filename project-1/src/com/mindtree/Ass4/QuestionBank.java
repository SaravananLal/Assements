package com.mindtree.Ass4;

/*
 * @Saravanan Lalbagathur 30-11-2022
 * QuestionBank has two methods
 * Question Id - which will display list of Questions
 * AnswerData - Which will have the exact option w.r.t the Questions.
 * 
 */
public class QuestionBank {

	String[] question;
	String[] answer;
	String QuesElement = null;
	String answerElement = null;

	public String QuestionId(int id) {
		question = new String[10];

		question[0] = "What is Java? \n1.Java is Procedure Oriented\n2.Java is Object Oriented language"
				+ "\n3.Java is a not a user language \n4.None of these";
		question[1] = "What is JVM ? "
				+ "\n1.Virtual Program      2.Virtual IDE\n3.Java Virtual Machine        4.None of these.";
		question[2] = "What is JRE ? "
				+ "\n1.Java Runtime Execution      2.Java Runnable edition IDE\n3.Java Runnable Environment        4.Java Runtime Environment.";
		question[3] = "Select option which suits features of JAVA ? "
				+ "\n1.PlatformDependent      2.Procedure orinented \n3.Platform Independent        4.None of these";
		question[4] = "Select option which suits Principle of JAVA ? "
				+ "\n1.NotScalable      2.Procedure orinented \n3.not listed        4.Polymorphism";
		question[5] = "What is Compiler ? "
				+ "\n1.it is tool      2.converting byte code to machine code \n3.translating user level to intermediate level       4.None of these";

		for (int i = 0; i < question.length; i++) {
			QuesElement = question[id];
		}
		return QuesElement;
	}

	public String answerData(int id) {
		answer = new String[10];
		answer[0] = "2";
		answer[1] = "3";
		answer[2] = "4";
		answer[3] = "3";
		answer[4] = "4";
		answer[5] = "3";

		for (int i = 0; i < answer.length; i++) {
			answerElement = answer[id];
		}
		return answerElement;
	}

}
