package fr.dave.calculatrice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Calco2 implements ActionListener {
	private JFrame Calculatrice = new JFrame("Calculatrice");
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private double mem1, mem2, mem3;
	private char operator;
	private JButton add= new JButton("+"); private JButton sup= new JButton("-");
	private JButton mul= new JButton("*"); private JButton div= new JButton("/");
	private JButton virgule= new JButton("."); private JButton egal= new JButton("=");
	private JButton neg= new JButton("(-)");
	private JButton clear= new JButton("C"); private JButton clear0= new JButton("");
	private JTextField text = new JTextField("0");
	private JButton zero = new JButton("0"); private JButton un = new JButton("1");
	private JButton deux = new JButton("2"); private JButton trois = new JButton("3");
	private JButton quatre = new JButton("4"); private JButton cinq = new JButton("5");
	private JButton six = new JButton("6"); private JButton sept = new JButton("7");
	private JButton huit = new JButton("8"); private JButton neuf = new JButton("9");
	private Font fond = new Font("Ink Free", Font.BOLD,30);
	
	
	
	
	
	public Calco2() {
		 panel2.add(un); panel2.add(deux); panel2.add(trois); panel2.add(add);
		 panel2.add(quatre); panel2.add(cinq); panel2.add(six); panel2.add(sup);
		 panel2.add(sept); panel2.add(huit); panel2.add(neuf); panel2.add(mul);
		 panel2.add(virgule); panel2.add(zero); panel2.add(egal); panel2.add(div);
		 
		 panel2.add(neg); panel2.add(clear);
		 //panel1.add(text);
		 
		 text.setEditable(false);
		 text.setBounds(50, 25, 300, 50);
		 
		 zero.addActionListener(this); un.addActionListener(this); deux.addActionListener(this);
		 trois.addActionListener(this); quatre.addActionListener(this); cinq.addActionListener(this);
		 six.addActionListener(this); sept.addActionListener(this); huit.addActionListener(this);
		 neuf.addActionListener(this);
			
			
		 add.addActionListener(this); sup.addActionListener(this); mul.addActionListener(this);
		 div.addActionListener(this); virgule.addActionListener(this); egal.addActionListener(this);
		 neg.addActionListener(this); clear.addActionListener(this);
		 
		 Calculatrice.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 Calculatrice.setSize(450, 450);
		 neg.setBounds(50,430,100,30);
		 clear.setBounds(250,430,100,30);
		 panel2.setBounds(50,100,300,300);
		 panel2.setLayout(new GridLayout(5,5,10,10));
		 
		 
		 Calculatrice.add(panel2,BorderLayout.CENTER);
		 Calculatrice.add(text);
		 
		 Calculatrice.add(clear0);
		 Calculatrice.setVisible(true);
		 
		
	}

	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		Calco2 cal = new Calco2();
		
	}

	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == un) {
		text.setText(text.getText().concat(String.valueOf(1)));
		/*int g = (int) Double.parseDouble(String.valueOf(1));
		int f = (int) Double.parseDouble(text.getText());
		int d = g + f;
		text.setText(String.valueOf(d)); */
		
		}
		if (e.getSource() == zero) {
			text.setText(text.getText().concat(String.valueOf(0)));	
			}
		if (e.getSource() == deux) {
			text.setText(text.getText().concat(String.valueOf(2)));
			}
		if (e.getSource() == trois) {
			text.setText(text.getText().concat(String.valueOf(3)));	
			}
		if (e.getSource() == quatre) { 
			text.setText(text.getText().concat(String.valueOf(4)));	
			}
		if (e.getSource() == cinq) {
			text.setText(text.getText().concat(String.valueOf(5)));	
			}
		if (e.getSource() == six) {
			text.setText(text.getText().concat(String.valueOf(6)));	
			}
		if (e.getSource() == sept) {
			text.setText(text.getText().concat(String.valueOf(7)));	
			}
		if (e.getSource() == huit) {
			text.setText(text.getText().concat(String.valueOf(8)));	
			}
		if (e.getSource() == neuf) {
			text.setText(text.getText().concat(String.valueOf(9)));	
			}
		if (e.getSource() == virgule) {
			text.setText(text.getText().concat(String.valueOf(".")));	
			}
		if (e.getSource() == add) {
			mem1 = Double.parseDouble(text.getText());
			text.setText("");
			operator = '+';
			}
		if (e.getSource() == sup) {
			mem1 = Double.parseDouble(text.getText());
			text.setText("");
			operator = '-';
			}
		if (e.getSource() == mul) {
			mem1 = Double.parseDouble(text.getText());
			text.setText("");
			operator = '*';
			}
		if (e.getSource() == div) {
			mem1 = Double.parseDouble(text.getText());
			text.setText("");
			operator = '/';
			}
		if (e.getSource() == egal) {
			switch (operator) {
			case '+':
				mem2 = mem1 + Double.parseDouble(text.getText());
				break;
			case '-':
				mem2 = mem1 - Double.parseDouble(text.getText());
				break;
			case '/':
				mem2 = mem1 / Double.parseDouble(text.getText());
				break;
			case '*':
				mem2 = mem1 * Double.parseDouble(text.getText());
				break;
				
			default:
				break;
			}
			text.setText(String.valueOf(mem2));
		}
		if (e.getSource() == clear) {
			text.setText("");
		}
		if (e.getSource() == neg) {
			mem3= Double.parseDouble(text.getText());
			mem3 = mem3*(-1);
			text.setText(String.valueOf(mem3));
		}
	}

}
