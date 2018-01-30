package com.springbootdemo.service.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;

public class TranscriberDemo {       

	public static void main(String[] args) throws Exception {

		Configuration configuration = new Configuration();

		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");

		StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(configuration);
		InputStream stream = new FileInputStream(new File("E:\\Users\\amitk.kmr\\Downloads\\littleredridinghood.wav"));

		recognizer.startRecognition(stream);
		try{
			PrintWriter writer = new PrintWriter("E:\\Users\\amitk.kmr\\Downloads\\littleredridinghood.txt", "UTF-8");
			SpeechResult result;
			while ((result = recognizer.getResult()) != null) {
				writer.print(" "+result.getHypothesis());
			}
			recognizer.stopRecognition();

			writer.close();
		} catch (IOException e) {
			// do something
		}

	}
}