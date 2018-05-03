import java.util.*; 

import java.io.*;

public class text {
	private static String TextIO = null;

	@SuppressWarnings("null")
	public static void main(String[] args) {

	Object TextIO = null; 
	
	TextIO.equals ("Enter the path for the file (example: /home/rock/file.txt): ");

	String file = TextIO.toString();

	String translation = translateIntoPigLatin(readFile(file));

	TextIO.equals (translation);

	writeFile(translation, "PigLatinOutput.txt");

	TextIO.equals ("nThe translation has been saved to the current directory as PigLatinOutput.txt");

	}

	private static String readFile(String filename) {

	File file = new File(filename);

	StringBuffer contents = new StringBuffer();

	BufferedReader reader = null;

	try 
	{

	reader = new BufferedReader(new FileReader(file));

	String text = null;

	while ((text = reader.readLine()) != null) {

	contents.append(text).append(

	System.getProperty("line.separator"));

	}

	} catch (FileNotFoundException e) {

	e.printStackTrace();

	} catch (IOException e) {

	e.printStackTrace();

	} finally {

	try {

	if (reader != null) {

	reader.close();

	}

	} catch (IOException e) {

	e.printStackTrace();

	}

	}

	return contents.toString();

	}

	public static void writeFile(String input, String filename){

	try {Writer output = null;

	File file = new File(filename);

	output = new BufferedWriter(new FileWriter(file));

	output.write(input);

	output.close();

	} catch (IOException e) {

	TextIO.equals ("I/O error");

	}

	}

	private static String translateIntoPigLatin(String input) {

	String output = "";

	StringTokenizer st = new StringTokenizer(input);

	while (st.hasMoreTokens()) {

	output += translateWord(st.nextToken()) + " ";

	}

	return output;

	}

	private static String translateWord(String word) {

	if (isVowel(word.substring(0, 1))) {

	word = word + "-ay";

	} else {

	int vowel_position = 0;

	for (int i = 0; i < word.length(); i++) {

	String letter = word.substring(i, i + 1);

	if (isVowel(letter)) {

	vowel_position = i;

	break;

	}

	}

	if (vowel_position != word.length()) {

	word = word.substring(vowel_position, word.length()) + "-"

	+ word.substring(0, vowel_position) + "ay";

	}

	}

	word = word.replaceAll("[^a-zA-Z0-9]", "");

	return word;

	}

	private static boolean isVowel(String input) {

	String vowels[] = { "a", "e", "i", "o", "u" };

	if (Arrays.asList(vowels).contains(input.toLowerCase())) {

	return true;

	} else {

	return false;

	}

	}

	}