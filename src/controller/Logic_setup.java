package controller;
import java.util.ArrayList;

import model.Champion;
import patron_generico.archivos;

public class Logic_setup {
	public archivos champions;
	public static ArrayList <String> champion_array = new ArrayList<String>();
	
	public Logic_setup()
	{
		this.champions = new archivos("src/files/champions.txt");
		setup();
	}
	
	public void setup()
	{
		String info = champions.readerFile();
		String aux[]=info.split("\n");
		for(int i=0; i<aux.length; i++)
		{
			Logic_setup.champion_array.add(aux[i]);
		}
	}
	
	
}
