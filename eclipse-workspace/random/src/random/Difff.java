package random;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Difff 
{
	private int lines = 0;
	private ArrayList<String> words = new ArrayList<>();
	private ArrayList<String> commonWords = new ArrayList<>();
	private ArrayList<String> fin = new ArrayList<>();
	private String common = "";
	private String word1 = "";
	private String word2 = "";
	private String word3 = "";
	private String word4 = "";
	private String c = "";

	public static void main(String[] args) 
	{
		Difff d = new Difff();
		d.diff();
	}

	public void diff()
	{
		Scanner scan = new Scanner(System.in);
		
		while(lines < 5)
		{
			word1 = scan.next();
			word2 = scan.next();
			words.add(word1);
			words.add(word2);
			lines++;
		}			
		
		scan.close();
		
		for(int i = 0; i < words.size(); i+=2)
		{
			common = "";
			word1 = words.get(i);
			word2 = words.get(i+1);
			
			String w1 = word1;
			String w2 = word2;
			while(w1.length() > 0)
			{
				c = w1.charAt(0)+"";
				if(w2.contains(c))
				{
					common += c;
					w2 = w2.substring(w2.indexOf(c), w2.length());
				}
				w1 = w1.substring(1, w1.length());
			}
			char[] sort = common.toCharArray();
			Arrays.sort(sort);
			common = new String(sort);
			commonWords.add(common);
			
			common = "";
			w1 = word1;
			w2 = word2;
			while(w2.length() > 0)
			{
				c = w2.charAt(0)+"";
				if(w1.contains(c))
				{
					common += c;
					w1 = w1.substring(w1.indexOf(c), w1.length());
				}
				w2 = w2.substring(1, w2.length());
			}
			sort = common.toCharArray();
			Arrays.sort(sort);
			common = new String(sort);
			commonWords.add(common);
			
			common = "";
			w1 = word1;
			w2 = word2;
			while(w1.length() > 0)
			{
				c = w1.charAt(w1.length()-1)+"";
				if(w2.contains(c))
				{
					common += c;
					w2 = w2.substring(0, w2.lastIndexOf(c));
				}
				w1 = w1.substring(0, w1.lastIndexOf(c));
			}
			sort = common.toCharArray();
			Arrays.sort(sort);
			common = new String(sort);
			commonWords.add(common);
			
			common = "";
			w1 = word1;
			w2 = word2;
			while(w2.length() > 0)
			{
				c = w2.charAt(w2.length()-1)+"";
				if(w1.contains(c))
				{
					common += c;
					w1 = w1.substring(0, w1.lastIndexOf(c));
				}
				w2 = w2.substring(0, w2.lastIndexOf(c));
			}
			sort = common.toCharArray();
			Arrays.sort(sort);
			common = new String(sort);
			commonWords.add(common);	
		}
		System.out.println(commonWords);
		
		for(int i = 0; i < commonWords.size(); i+=4)
		{
			common = "";
			word1 = commonWords.get(i);
			word2 = commonWords.get(i+1);
			word3 = commonWords.get(i+2);
			word4 = commonWords.get(i+3);
			while(word1.length() > 0)
			{
				if(word2.contains(word1.charAt(0)+"") && word3.contains(word1.charAt(0)+"") && word3.contains(word1.charAt(0)+""))
				{
					common += word1.charAt(0);
				}
				word1 = word1.substring(1, word1.length());
				word2 = word2.substring(1, word2.length());
				word3 = word3.substring(1, word3.length());
				word4 = word4.substring(1, word4.length());
			}
			fin.add(common);
		}
		
		int x = 1;
		while(x < 6)
		{
			System.out.println(x + "." + fin.get(x));
			x++;
		}
	}
		
}

