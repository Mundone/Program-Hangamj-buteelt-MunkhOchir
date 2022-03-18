package lab1;

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

public class Lab2 {

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
					Lab2 window = new Lab2();
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
	public Lab2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Scanner scn = new Scanner(System.in);
		OurQueue queue = new OurQueue();
		queue.remove();
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
				textArea.setText(queue.toString()+"Queue-ын урт: " + queue.getLength());
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
					textArea.setText("Queue-д Амжилттай нэмэгдлээ: "+ queue.toString());
					textArea.setText("");
				}	
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAdd.setBounds(692, 58, 159, 52);
		frame.getContentPane().add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Queue-д байсан элементүүд:\n"+ queue.toString());
				if(queue.remove())
					textArea.setText("Амжилттай устгалаа Одоо байгаа элементүүд:\n"+ queue.toString());
				else
					textArea.setText("Устгаж чадсангүй. Элемент хоосон байна");
			}
		});
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRemove.setBounds(692, 269, 159, 52);
		frame.getContentPane().add(btnRemove);
		
		JButton btnExist = new JButton("isExist");
		btnExist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textAdd.getText().isEmpty()) {
				}
				else {
					if(queue.isExist(textIsExist.getText()))
						textArea.setText("Таны оруулсан элемент энэ queue-д БАЙНА.");
					else
						textArea.setText("Таны оруулсан элемент энэ queue-д БАЙХГҮЙ.");
					textArea.setText("");

				}
			}
		});
		btnExist.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExist.setBounds(692, 157, 159, 52);
		frame.getContentPane().add(btnExist);
		
		JButton btnTostring = new JButton("toString");
		btnTostring.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(queue.toString());
			}
		});
		btnTostring.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTostring.setBounds(60, 341, 159, 52);
		frame.getContentPane().add(btnTostring);
		
		JButton btnGetfrontelement = new JButton("getFrontElement");
		btnGetfrontelement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Эхний элемент: " + queue.getFrontElement());
			}
		});
		btnGetfrontelement.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGetfrontelement.setBounds(60, 257, 181, 52);
		frame.getContentPane().add(btnGetfrontelement);
		
		JButton btnGetrearelement = new JButton("getRearElement");
		btnGetrearelement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Арын элемент: " + queue.getRearElement());
			}
		});
		btnGetrearelement.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGetrearelement.setBounds(376, 269, 159, 52);
		frame.getContentPane().add(btnGetrearelement);
		
		textIsExist = new JTextField();
		textIsExist.setColumns(10);
		textIsExist.setBounds(335, 161, 285, 48);
		frame.getContentPane().add(textIsExist);
		
		
		
		
	}
}
