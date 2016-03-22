package edu.cmu.sphinx.speakcode;

import java.io.*;


public class SpeakCode {

	private int noClass;
	private int noInt;
	private int noString;
	private int noBoolean;
	private int noChar;
	private int noDouble;
	private int noFloat;
	private int noFunctions;
	private int noForLoops;
	private int noIf;
	private int noMain;

	private PrintWriter file;

	private String buffer;

	public SpeakCode() {
		try{
			file = new PrintWriter("file.java");
			System.out.println("success");
		}
		catch (FileNotFoundException e) {System.out.println(e);}
	}

	public void createClass() {
		//System.out.println(noClass);
		noClass++;
		buffer = "public class DefaultClass" + noClass + " {\n";
		System.out.println(buffer);
		file.println(buffer);
	}

	public void createInteger() {
		noInt++;
		buffer = "\tprivate int int" + noInt + ";";
		System.out.println(buffer);
		file.println(buffer);
	}
	public void createMain() {
		buffer = "\tpublic static void main(String[] args) {";
		System.out.println(buffer);
		file.println(buffer);
	}

	public void createPrint() {
		buffer = "\tSystem.out.println();" ;
		System.out.println(buffer);
		file.println(buffer);
	}

	public void createString() {
		noString++;
		buffer = "\tprivate String str" + noString + ";";
		System.out.println(buffer);
		file.println(buffer);
	}

	public void createFunction() {
		noFunctions++;
		buffer = "\tpublic void function" + noFunctions + " () {";
		System.out.println(buffer);
		file.println(buffer);
	}

	public void createBoolean() {
		noBoolean++;
		buffer = "\tprivate Boolean bool" + noBoolean + ";";
		System.out.println(buffer);
		file.println(buffer);
	}

	public void closeFile() {
		file.close();
	}

	public void close() {
		buffer = "}";
		file.println(buffer);
		System.out.println(buffer);
	}

	public static void main(String[] args) {
		SpeakCode sc = new SpeakCode();
		sc.createClass();
		sc.createInteger();
		sc.closeFile();
	}

}