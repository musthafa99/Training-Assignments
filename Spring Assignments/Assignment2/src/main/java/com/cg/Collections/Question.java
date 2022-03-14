package com.cg.Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	
	private int questionid;
	String Firstquestions;
	List <String> Firstanswers;
	String Secondquestions;
	Set<String>Secondanswers;
	String Thirdquestions;
	Map Thirdanswers;

	
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public void setFirstquestions(String Firstquestions) {
		this.Firstquestions = Firstquestions;
	}
	// Setter for List
	public void setFirstanswers(List<String> Firstanswers) {
		this.Firstanswers = Firstanswers;
	}
	public void setSecondquestions(String Secondquestions) {
		this.Secondquestions = Secondquestions;
	}
	//Setters for Set
	public void setSecondanswers(Set<String> Secondanswers) {
		this.Secondanswers = Secondanswers;
	}
	public void setThirdquestions(String Thirdquestions) {
		this.Thirdquestions = Thirdquestions;
	}
	//Setters for Map
	public void setThirdanswers(Map Thirdanswers) {
		this.Thirdanswers = Thirdanswers;
	}
	//Displaying Answers Using List
	public void DisplayList()
	{
		System.out.println("--------DISPLAY USING LIST----------");
		System.out.println("Question Id: "+questionid);
		System.out.println("Questions "+Firstquestions);
		System.out.println("Answers:");
	}
	public List getAnswers() {
		System.out.println(Firstanswers);
		System.out.println("----------------------------------");
		System.out.println();
		return Firstanswers;
	}
	
	
	//Displaying Answers Using Set
	public void DisplaySet()
	{
		System.out.println("--------DISPLAY USING SET----------");
		System.out.println("Questions "+Secondquestions);
		System.out.println("Answers:");
	}
	public Set<String> getSecondanswers() {
		System.out.println(Secondanswers);
		System.out.println("----------------------------------");
		System.out.println();
		return Secondanswers;
	}
	//Display using Map
	public void DisplayMap()
	{
		System.out.println("--------DISPLAY USING MAP----------");
		System.out.println("Questions "+Thirdquestions);
		System.out.println("Answers:");
	}
	public Map getThirdanswers() {
		System.out.println(Thirdanswers);
		System.out.println("----------------------------------");
		System.out.println();
		return Thirdanswers;
	}
	
	
	
	
}
