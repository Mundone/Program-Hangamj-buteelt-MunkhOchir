package lab5;

import java.util.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Lab05 {

	private JFrame frame;
	private JTextField textAdd;
	private JTextField textIsExist;
		
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab05 window = new Lab05();
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
	public Lab05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Scanner scn = new Scanner(System.in);
		OurQueue queue = new OurQueue();
		queue.add(12);
		queue.add(15);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 927, 641);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 20));
		textArea.setBounds(111, 424, 744, 125);
		frame.getContentPane().add(textArea);
		
		textAdd = new JTextField();
		textAdd.setBounds(335, 63, 285, 48);
		frame.getContentPane().add(textAdd);
		textAdd.setColumns(10);
		
		JButton btnEmpty = new JButton("isEmpty");
		btnEmpty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(queue.getLength() == 0)
					textArea.setText("Хоосон байна");
				else
					textArea.setText("Хоосон биш байна");
			}
		});
		btnEmpty.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEmpty.setBounds(74, 58, 159, 52);
		frame.getContentPane().add(btnEmpty);
		
		JButton btnLength = new JButton("Length");
		btnLength.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Queue-ын урт: " + queue.getLength());
			}
		});
		btnLength.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLength.setBounds(74, 157, 159, 52);
		frame.getContentPane().add(btnLength);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textAdd.getText().isEmpty()) {
				}
				else {
					queue.add(textAdd.getText());
					textArea.setText(textAdd.getText() + " элементийг дараалалд амжилттай нэмэгдлээ.");
					textAdd.setText("");
				}	
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAdd.setBounds(692, 58, 159, 52);
		frame.getContentPane().add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object tempElement = "";
				if(queue.getLength() > 0)
					tempElement = queue.getRearElement();
				if(queue.remove())
					textArea.setText(tempElement + " элементийг амжилттай устгалаа");
				else
					textArea.setText("Устгаж чадсангүй. Дараалал хоосон байна");
			}
		});
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRemove.setBounds(692, 269, 159, 52);
		frame.getContentPane().add(btnRemove);
		
		textIsExist = new JTextField();
		textIsExist.setColumns(10);
		textIsExist.setBounds(335, 161, 285, 48);
		frame.getContentPane().add(textIsExist);
		
		JButton btnExist = new JButton("isExist");
		btnExist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textIsExist.getText().isEmpty()) {
					
				}
				else {
					if(queue.isExist(textIsExist.getText()))
						textArea.setText(textIsExist.getText() + " элемент энэ queue-д БАЙНА.");
					else
						textArea.setText(textIsExist.getText() + " элемент энэ queue-д БАЙХГҮЙ.");

				}
				textIsExist.setText("");
			}
		});
		btnExist.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExist.setBounds(692, 157, 159, 52);
		frame.getContentPane().add(btnExist);
		
		JButton btnTostring = new JButton("toString");
		btnTostring.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(queue.getLength() > 0)
					textArea.setText(queue.toString());
				else
					textArea.setText("Дараалал хоосон байна.");
			}
		});
		btnTostring.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTostring.setBounds(60, 341, 159, 52);
		if(queue.getLength() > 0)
		frame.getContentPane().add(btnTostring);
		
		JButton btnGetfrontelement = new JButton("getFrontElement");
		btnGetfrontelement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(queue.getLength() > 0)
					textArea.setText("Эхний элемент: " + queue.getFrontElement());
				else
					textArea.setText("Дараалал хоосон байна.");
			}
		});
		btnGetfrontelement.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGetfrontelement.setBounds(60, 257, 181, 52);
		frame.getContentPane().add(btnGetfrontelement);
		
		JButton btnGetrearelement = new JButton("getRearElement");
		btnGetrearelement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(queue.getLength() > 0)
					textArea.setText("Арын элемент: " + queue.getRearElement());
				else
					textArea.setText("Дараалал хоосон байна.");
			}
		});
		btnGetrearelement.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGetrearelement.setBounds(376, 269, 159, 52);
		frame.getContentPane().add(btnGetrearelement);
	}
}
