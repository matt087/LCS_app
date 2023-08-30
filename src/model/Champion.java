package model;

import java.util.ArrayList;

public class Champion 
{
	protected String name;
	protected String role;
	protected String damage_type;
	protected String strong_phase1;
	protected String strong_phase2;
	protected ArrayList<Champion> counters;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getRole() 
	{
		return role;
	}
	public void setRole(String role) 
	{
		this.role = role;
	}
	public String getDamage_type() 
	{
		return damage_type;
	}
	public void setDamage_type(String damage_type) 
	{
		this.damage_type = damage_type;
	}
	public String getStrong_phase1() 
	{
		return strong_phase1;
	}
	public void setStrong_phase1(String strong_phase1) 
	{
		this.strong_phase1 = strong_phase1;
	}
	public String getStrong_phase2() {
		return strong_phase2;
	}
	public void setStrong_phase2(String strong_phase2) 
	{
		this.strong_phase2 = strong_phase2;
	}
	public ArrayList<Champion> getCounters() 
	{
		return counters;
	}
	public void setCounters(ArrayList<Champion> counters) 
	{
		this.counters = counters;
	}
	
	
}
