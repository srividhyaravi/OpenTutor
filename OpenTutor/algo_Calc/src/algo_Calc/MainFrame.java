package algo_Calc;
//import java.awt.BorderLayout;

import visuals.SortingVisualizer;

import java.awt.Color;
import java.awt.EventQueue;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
	 			try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
		 		} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Sortings obj = new Sortings();
		frame = new JFrame();
	//	frame.setBounds(100, 100, 456, 324);
		 frame.getContentPane().setBackground(Color.BLACK);
	      frame.pack();
	      frame.setVisible(true);
	 	frame.setBounds(1000, 1000, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	;
	  
 
		JLabel title = new JLabel("OpenTutor : Study portal for sorting algorithms!\r\n");
 
		title.setFont(new Font("Arial Black", Font.BOLD, 42));
	     title.setForeground(Color.ORANGE);
	 	   //	title.setBounds(8,10, 208, 41 );
		   
	 	//title.setBounds(20,20, 200, 20 );
		//title.setBounds(800,90, 500, 50 );
	    title.setBounds(160, 90, 1500, 50);
		frame.getContentPane().add(title);
		
		
		JButton btnNewButton = new JButton("BUBBLE SORT");
	  	btnNewButton.setFont(new Font("Arial", Font.BOLD, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(1,"BUBBLE SORT");
				frame.setVisible(false);	
			}
		});
		//btnNewButton.setBounds(43, 48, 128, 25);
		//btnNewButton.setBounds(86, 96, 256, 50);
		btnNewButton.setBounds(172, 192, 512, 100);
	 	frame.getContentPane().add(btnNewButton);
	 	
		JButton btnNewButton_1 = new JButton("INSERTION SORT");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 24));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(4,"INSERTION SORT");
				frame.setVisible(false);
			}
		});
		//btnNewButton_1.setBounds(253, 48, 128, 25);
	//	btnNewButton_1.setBounds(506, 96, 256, 50);
		btnNewButton_1.setBounds(1012, 192, 512, 100);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SELECTION SORT");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 24));
	 	btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(2,"SELECTION SORT");
				frame.setVisible(false);
			}
		});
		//btnNewButton_2.setBounds(43, 116, 128, 25);
		btnNewButton_2.setBounds(172, 464, 512, 100);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("MERGE SORT");
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 24));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
 	 			obj.vis(5,"MERGE SORT");
	 			frame.setVisible(false);
			}
		});
		//btnNewButton_3.setBounds(253, 116, 128, 25);
		btnNewButton_3.setBounds(1012, 464, 512, 100);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("QUICK SORT");
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 24));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(3,"QUICK SORT");
			frame.setVisible(false);
			}
		});
		//btnNewButton_4.setBounds(43, 178, 128, 25);
		btnNewButton_4.setBounds(172, 712, 512, 100);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("MAX HEAP SORT");
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 24));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(6,"HEAP SORT");
				frame.setVisible(false);
			}
		});
	//	btnNewButton_5.setBounds(253, 178, 128, 25);
		btnNewButton_5.setBounds(1012, 712, 512, 100);

		frame.getContentPane().add(btnNewButton_5);
		
		 JButton visualizations = new JButton("VISUALIZATIONS!");
			visualizations.setFont(new Font("Arial", Font.BOLD, 24));
			visualizations.setBackground(Color.cyan);
			visualizations.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					
//					frame1.setVisible(true);
	 				SortingVisualizer frame1=new SortingVisualizer();
	 				frame1.idk();
	 			
	 			    
				}
			});
			visualizations.setBounds(698,850,312,100);
			frame.getContentPane().add(visualizations);
			
		
	}

	
}
