package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Logic_View_main;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View_main extends JFrame {

	private JPanel contentPane;
	public JComboBox <String> cmb_champion;
	private Logic_View_main lvm;
	public JTextField txt_top;
	public JTextField txt_jungle;
	public JTextField txt_mid;
	public JTextField txt_adc;
	public JTextField txt_supp;
	public JTextField txt_top_e;
	public JTextField txt_jungle_e;
	public JTextField txt_mid_e;
	public JTextField txt_adc_e;
	public JTextField txt_supp_e;
	public JToggleButton btn_adc;
	public JToggleButton btn_supp;
	public JToggleButton btn_mid;
	public JToggleButton btn_jungle;
	public JToggleButton btn_TOP;
	public JToggleButton btn_TOP_e;
	public JToggleButton btn_jungle_e;
	public JToggleButton btn_mid_e;
	public JToggleButton btn_adc_e;
	public JToggleButton btn_supp_e;
	public JButton btn_counter;
	public JButton btn_compo_aux;
	public JButton btn_insert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_main frame = new View_main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View_main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 0, 700, 700);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 684, 661);
		contentPane.add(panel);
		panel.setLayout(null);
		
		cmb_champion = new JComboBox();
		cmb_champion.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		cmb_champion.setBounds(158, 68, 464, 25);
		panel.add(cmb_champion);
		
		JLabel lblNewLabel = new JLabel("Champion:");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		lblNewLabel.setBounds(57, 68, 91, 25);
		panel.add(lblNewLabel);
		
		btn_TOP = new JToggleButton("Top");
		btn_TOP.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		btn_TOP.setBounds(30, 140, 91, 23);
		panel.add(btn_TOP);
		
		JLabel lblTeam = new JLabel("TEAM");
		lblTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeam.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblTeam.setBounds(30, 104, 253, 25);
		panel.add(lblTeam);
		
		JLabel lblEnemyTeam = new JLabel("ENEMY TEAM");
		lblEnemyTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnemyTeam.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblEnemyTeam.setBounds(374, 104, 251, 25);
		panel.add(lblEnemyTeam);
		
		txt_top = new JTextField();
		txt_top.setBounds(131, 140, 152, 23);
		panel.add(txt_top);
		txt_top.setColumns(10);
		
		btn_jungle = new JToggleButton("Jungle");
		btn_jungle.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		btn_jungle.setBounds(30, 185, 91, 23);
		panel.add(btn_jungle);
		
		txt_jungle = new JTextField();
		txt_jungle.setColumns(10);
		txt_jungle.setBounds(131, 185, 152, 23);
		panel.add(txt_jungle);
		
		btn_mid = new JToggleButton("Mid");
		btn_mid.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		btn_mid.setBounds(30, 230, 91, 23);
		panel.add(btn_mid);
		
		txt_mid = new JTextField();
		txt_mid.setColumns(10);
		txt_mid.setBounds(131, 230, 152, 23);
		panel.add(txt_mid);
		
		btn_adc = new JToggleButton("Adc");
		btn_adc.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		btn_adc.setBounds(30, 275, 91, 23);
		panel.add(btn_adc);
		
		txt_adc = new JTextField();
		txt_adc.setColumns(10);
		txt_adc.setBounds(131, 275, 152, 23);
		panel.add(txt_adc);
		
		btn_supp = new JToggleButton("Supp");
		btn_supp.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		btn_supp.setBounds(30, 324, 91, 23);
		panel.add(btn_supp);
		
		txt_supp = new JTextField();
		txt_supp.setColumns(10);
		txt_supp.setBounds(131, 324, 152, 23);
		panel.add(txt_supp);
		
		btn_TOP_e = new JToggleButton("Top");
		btn_TOP_e.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		btn_TOP_e.setBounds(372, 140, 91, 23);
		panel.add(btn_TOP_e);
		
		txt_top_e = new JTextField();
		txt_top_e.setColumns(10);
		txt_top_e.setBounds(473, 140, 152, 23);
		panel.add(txt_top_e);
		
		btn_jungle_e = new JToggleButton("Jungle");
		btn_jungle_e.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		btn_jungle_e.setBounds(372, 185, 91, 23);
		panel.add(btn_jungle_e);
		
		txt_jungle_e = new JTextField();
		txt_jungle_e.setColumns(10);
		txt_jungle_e.setBounds(473, 185, 152, 23);
		panel.add(txt_jungle_e);
		
		btn_mid_e = new JToggleButton("Mid");
		btn_mid_e.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		btn_mid_e.setBounds(372, 230, 91, 23);
		panel.add(btn_mid_e);
		
		txt_mid_e = new JTextField();
		txt_mid_e.setColumns(10);
		txt_mid_e.setBounds(473, 230, 152, 23);
		panel.add(txt_mid_e);
		
		btn_adc_e = new JToggleButton("Adc");
		btn_adc_e.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		btn_adc_e.setBounds(372, 275, 91, 23);
		panel.add(btn_adc_e);
		
		txt_adc_e = new JTextField();
		txt_adc_e.setColumns(10);
		txt_adc_e.setBounds(473, 275, 152, 23);
		panel.add(txt_adc_e);
		
		btn_supp_e = new JToggleButton("Supp");
		btn_supp_e.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		btn_supp_e.setBounds(372, 324, 91, 23);
		panel.add(btn_supp_e);
		
		txt_supp_e = new JTextField();
		txt_supp_e.setColumns(10);
		txt_supp_e.setBounds(473, 324, 152, 23);
		panel.add(txt_supp_e);
		
		btn_counter = new JButton("COUNTER");
		btn_counter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_counter.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		btn_counter.setBounds(57, 19, 127, 23);
		panel.add(btn_counter);
		
		btn_compo_aux = new JButton("COMPOSITION");
		btn_compo_aux.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		btn_compo_aux.setBounds(234, 19, 152, 23);
		panel.add(btn_compo_aux);
		
		btn_insert = new JButton("INSERT CHAMPION");
		btn_insert.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		btn_insert.setBounds(425, 19, 197, 23);
		panel.add(btn_insert);
		lvm = new Logic_View_main(this);
	}
}
