package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.View_main;

public class Logic_View_main implements ActionListener{

	private View_main vm;
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
		vm.cmb_champion.setEnabled(false);
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
		vm.cmb_champion.setEnabled(false);
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
		vm.btn_adc.setSelected(false);
		vm.btn_adc_e.setSelected(false);
		vm.btn_jungle.setSelected(false);
		vm.btn_jungle_e.setSelected(false);
		vm.btn_mid.setSelected(false);
		vm.btn_mid_e.setSelected(false);
		vm.btn_supp.setSelected(false);
		vm.btn_supp_e.setSelected(false);
		vm.btn_TOP.setSelected(false);
		vm.btn_TOP_e.setSelected(false);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == vm.cmb_champion)
		{
//			System.out.println(vm.cmb_champion.getSelectedItem().toString());
		}
		else if(e.getSource() == vm.btn_counter)
		{
			reset();
		}
	}

}
