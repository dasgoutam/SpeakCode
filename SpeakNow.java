import java.io.*;
import java.util.*;


import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.speakcode.SpeakCode;

public class SpeakNow
{
	public static  void main(String args [])
	{
		Configuration cm= new Configuration();

		cm.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		cm.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/8669.dic");
		cm.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/8669.lm");

		
		try{
			LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(cm);
			recognizer.startRecognition(true);

			SpeechResult result;
			
			String input;
			String[] str_class = {"create a class", "create a new class", "build a class", "create class", "create a claass", "create a new claass", "build a claass", "create claass"};
			String[] str_string = {"create a string", "new string", "create a streeng", "new streeng"};
			String[] str_integer = {"create an integer", "create a new integer", "create an eenteger", "create a new eenteger"};
			String[] str_close = {"kill body","keel body"};
 			String[] str_quit = {"stop program", "stop pro gram"};
 			String[] str_function={"create a function"};
 			String[] str_main={"create main"};
 			String[] str_print={"print a line","print a new line"};
 			SpeakCode sc = new SpeakCode();
 			
			while(true)
			{
				System.out.println("Speak to the system. And check if it's working :\n");

			result= recognizer.getResult();

			input = result.getHypothesis().toLowerCase();
			System.out.println(input);
			
			if (Arrays.asList(str_class).contains(input))
			{	
				sc.createClass();
			}
			else if (Arrays.asList(str_string).contains(input))
			{
				sc.createString();
			}
			else if (Arrays.asList(str_integer).contains(input))
			{
				sc.createInteger();
			}
			else if (Arrays.asList(str_main).contains(input))
			{
				sc.createMain();
			}
			else if (Arrays.asList(str_function).contains(input))
			{
				sc.createFunction();
			}
			else if (Arrays.asList(str_print).contains(input))
			{
				sc.createPrint();
			}
			
			
			else if (Arrays.asList(str_close).contains(input))
			{
				sc.close();
			}
			else if (Arrays.asList(str_quit).contains(input))
			{
				sc.closeFile();
			}
						
			}

		}
	    catch(IOException e)
	    {
	    	System.out.println("this is not working");
	    }

	}
}