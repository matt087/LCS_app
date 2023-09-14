package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.View_main;

public class Logic_View_main implements ActionListener{

	private View_main vm;
	private String selected_champ = new String("");
	private String option = new String("");
	public Logic_View_main(View_main vm)
	{
		this.vm = vm;
		this.vm.cmb_champion.addActionListener(this);
		this.vm.btn_adc.addActionListener(this);
		this.vm.btn_adc_e.addActionListener(this);
		this.vm.btn_compo_aux.addActionListener(this);
		this.vm.btn_counter.addActionListener(this);
		this.vm.btn_insert.addActionListener(this);
		this.vm.btn_jungle.addActionListener(this);
		this.vm.btn_jungle_e.addActionListener(this);
		this.vm.btn_mid.addActionListener(this);
		this.vm.btn_mid_e.addActionListener(this);
		this.vm.btn_supp.addActionListener(this);
		this.vm.btn_supp_e.addActionListener(this);
		this.vm.btn_TOP.addActionListener(this);
		this.vm.btn_TOP_e.addActionListener(this);
		setComboBox();
		setButtonsF();
		setButtonsF_e();
		vm.cmb_champion.setEnabled(false);
	}

	private void setButtonsF()
	{
		vm.btn_adc.setEnabled(false);
		vm.btn_jungle.setEnabled(false);
		vm.btn_mid.setEnabled(false);
		vm.btn_supp.setEnabled(false);
		vm.btn_TOP.setEnabled(false);
	}
	
	private void setButtonsF_e()
	{
		vm.btn_adc_e.setEnabled(false);
		vm.btn_jungle_e.setEnabled(false);
		vm.btn_mid_e.setEnabled(false);
		vm.btn_supp_e.setEnabled(false);
		vm.btn_TOP_e.setEnabled(false);
	}

	private void setButtonsT()
	{
		vm.btn_adc.setEnabled(true);
		vm.btn_jungle.setEnabled(true);
		vm.btn_mid.setEnabled(true);
		vm.btn_supp.setEnabled(true);
		vm.btn_TOP.setEnabled(true);
	}
	
	private void setButtonsT_e()
	{
		vm.btn_adc_e.setEnabled(true);
		vm.btn_jungle_e.setEnabled(true);
		vm.btn_mid_e.setEnabled(true);
		vm.btn_supp_e.setEnabled(true);
		vm.btn_TOP_e.setEnabled(true);
	}

	private void setComboBox()
	{
		Logic_setup a = new Logic_setup();
		this.vm.cmb_champion.addItem("Select a champion: ");
		for(String s:Logic_setup.champion_array)
		{
			this.vm.cmb_champion.addItem(s);
		}
	}

	private void reset()
	{
		vm.cmb_champion.setEnabled(true);
		vm.cmb_champion.setSelectedIndex(0);
		vm.txt_adc.setText("");
		vm.txt_adc_e.setText("");
		vm.txt_jungle.setText("");
		vm.txt_jungle_e.setText("");
		vm.txt_mid.setText("");
		vm.txt_mid_e.setText("");
		vm.txt_supp.setText("");
		vm.txt_supp_e.setText("");
		vm.txt_top.setText("");
		vm.txt_top_e.setText("");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == vm.cmb_champion)
		{
			selected_champ = vm.cmb_champion.getSelectedItem().toString();
			if(!selected_champ.equals("Select a champion: "))
			{
				if(option.equals("Counter"))
				{
					setButtonsT();
				}
				else if(option.equals("Comps"))
				{
					setButtonsT();
					setButtonsT_e();	
				}
			}
				
		}
		else if(e.getSource() == vm.btn_counter)
		{
			setButtonsF();
			setButtonsF_e();
			reset();
			option = "Counter";
		}
		else if(e.getSource()== vm.btn_adc)
		{
			vm.txt_adc.setText(selected_champ);
			if(option.equals("Counter"))
			{
				setButtonsF();
			}
			vm.cmb_champion.setSelectedIndex(0);
		}
		else if(e.getSource() == vm.btn_compo_aux)
		{
			setButtonsF();
			setButtonsF_e();
			reset();
			option = "Comps";
		}
		else if(e.getSource()== vm.btn_adc_e)
		{
			vm.txt_adc_e.setText(selected_champ);
			vm.cmb_champion.setSelectedIndex(0);
		}
		else if(e.getSource()== vm.btn_jungle)
		{
			vm.txt_jungle.setText(selected_champ);
			if(option.equals("Counter"))
			{
				setButtonsF();
			}
			vm.cmb_champion.setSelectedIndex(0);
		}
		else if(e.getSource()== vm.btn_jungle_e)
		{
			vm.txt_jungle_e.setText(selected_champ);
			vm.cmb_champion.setSelectedIndex(0);
		}
		else if(e.getSource()== vm.btn_mid)
		{
			vm.txt_mid.setText(selected_champ);
			if(option.equals("Counter"))
			{
				setButtonsF();
			}
			vm.cmb_champion.setSelectedIndex(0);
		}
		else if(e.getSource()== vm.btn_mid_e)
		{
			vm.txt_mid_e.setText(selected_champ);
			vm.cmb_champion.setSelectedIndex(0);
		}
		else if(e.getSource()== vm.btn_TOP)
		{
			vm.txt_top.setText(selected_champ);
			if(option.equals("Counter"))
			{
				setButtonsF();
			}
			vm.cmb_champion.setSelectedIndex(0);
		}
		else if(e.getSource()== vm.btn_TOP_e)
		{
			vm.txt_top_e.setText(selected_champ);
			vm.cmb_champion.setSelectedIndex(0);
		}
		else if(e.getSource()== vm.btn_supp)
		{
			vm.txt_supp.setText(selected_champ);
			if(option.equals("Counter"))
			{
				setButtonsF();
			}
			vm.cmb_champion.setSelectedIndex(0);
		}
		else if(e.getSource()== vm.btn_supp_e)
		{
			vm.txt_supp_e.setText(selected_champ);
			vm.cmb_champion.setSelectedIndex(0);
		}
	}

}
