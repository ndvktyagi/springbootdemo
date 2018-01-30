package com.springbootdemo.service.test;

import java.io.FileInputStream;

import com.sun.speech.freetts.FreeTTS;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer; 

public class VoiceTest{ 

	void call(String msg){ 
		System.out.println("U r here"); 
		Voice voice; 
		FreeTTS freetts; 
		System.out.println("---------************"); 
		VoiceManager vm=VoiceManager.getInstance(); 
		System.out.println("--------------////"); 
		voice=vm.getVoice("kevin16"); 
		System.setProperty("com.sun.speech.freetts.voice.defaultAudioPlayer", "com.sun.speech.freetts.audio.SingleFileAudioPlayer"); 
		FileInputStream fis ; 
		SingleFileAudioPlayer sfap; 
		if(voice==null) 
			System.out.println("voice is null"); 
		System.out.println("---0---"); 
		if(voice!=null) 
		{ 
			voice.allocate(); 
		} 
		System.out.println("---1---"); 
		freetts=new FreeTTS(voice); 
		String text = new String(msg); 
		byte b[] = text.getBytes(); 
		if(b==null) 
		{ 
			System.out.println("no byte array"); 
			System.exit(1); 
		} 
		try 
		{ 
			sfap = (SingleFileAudioPlayer)voice.getDefaultAudioPlayer(); 
			sfap.write(b); 

		} 
		catch(Exception e) 
		{ 

		} 
		voice.speak("This is great world"); 
		voice.deallocate(); 
		

		System.out.println("---------?????-----------"); 
		try { 
			System.out.println("inside copy try block"); 
			String command="copy \"E:\\Users\\amitk.kmr\\Downloads\\Montana State Fund\\Demo\\freetts.wav\" \"E:\\Users\\amitk.kmr\\Downloads\\Montana State Fund\\Demo\""; 
			System.out.println("copying file from "+command); 
			Runtime.getRuntime().exec("cmd.exe /c"+command); 
			System.out.println("file copied"); 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 

		System.out.println("---2---"); 

		System.out.println("calling wav file"); 
		//AePlayWave aw=new AePlayWave("C:/Program Files/Apache Software Foundation/Apache Tomcat 6.0.18/bin/freetts.wav"); 


		System.out.println("---last---"); 

	} 
	
	public static void main(String[] args)throws Exception { 
		VoiceTest  test = new VoiceTest();
		test.call("test");
	} 

} 