package controller;

import javax.swing.ImageIcon;

import view.View_main;

public class Thread_info_champions extends Thread 
{
	private String name;
	private View_main vm;
	public Thread_info_champions(String name, View_main vm)
	{
		this.name=name;
		this.vm=vm;
	}
	
	public void run()
	{
		name = name.replace(' ', '_');
		vm.lbl_champ.setIcon(new ImageIcon(View_main.class.getResource("/resources/icons/"+name+".png")));
		vm.panel_1.setVisible(true);
		System.out.println(name);
	}
}
