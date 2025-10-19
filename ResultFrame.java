package Sudoku4;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

//import javax.swing.JRadioButton;
//import javax.swing.ButtonGroup;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
public class ResultFrame extends JFrame{
	
	private static JPanel Panel1, Panel2, Panel3, mainPanel;
	private static JLabel Lbl1, Lbl2, time, DIF, WBT;
	private static JTextField JTF1, JTF2, JTF3;
	private static JButton Jbt;

    public ResultFrame() {
    	/*myProject frame = new myProject();
        frame.setSize(650, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);*/
        
        Color bck = new Color(221,198,228);
        mainPanel = new JPanel(new BorderLayout(10,80));
        mainPanel.setBackground(bck); 
        getContentPane().setBackground(bck);
    
        Panel1 = new JPanel(new GridLayout(2,1,10,30));
        Panel1.setBackground(bck); 
        Lbl1 = new JLabel("CONGRATULATIONS!",JLabel.CENTER);
        Lbl2 = new JLabel("YOU WIN", JLabel.CENTER);
        Lbl1.setForeground(Color.black);
        Lbl1.setFont(new Font("Impact", Font.BOLD+Font.ITALIC, 50));
        Lbl2.setForeground(Color.black);
        Lbl2.setFont(new Font("Impact", Font.BOLD+Font.ITALIC, 50));
        Panel1.add(Lbl1);
        Panel1.add(Lbl2);

    
        Panel2 = new JPanel(new GridLayout(5, 2, 20, 20));
        Panel2.setBackground(bck); 
        time = new JLabel("Time :");
        time.setForeground(Color.black); 
        time.setFont(new Font("Impact", Font.PLAIN, 28));
        JTF1 = new JTextField(10);
        JTF1.setPreferredSize(new Dimension(20, 5));
        JTF1.setFont(new Font("DIALOG", Font.BOLD, 20));
        DIF = new JLabel("Difficulty :");
        DIF.setForeground(Color.black);
        DIF.setFont(new Font("Impact", Font.PLAIN, 28));
        JTF2 = new JTextField(10);
        JTF2.setPreferredSize(new Dimension(20, 5));
        WBT = new JLabel("Score :");
        WBT.setForeground(Color.black); 
        WBT.setFont(new Font("Impact", Font.PLAIN, 28));
        JTF3 = new JTextField(10);
        JTF3.setPreferredSize(new Dimension(100, 5));
        Panel2.add(time);
        Panel2.add(JTF1);
        Panel2.add(DIF);
        Panel2.add(JTF2);
        Panel2.add(WBT);
        Panel2.add(JTF3);
        Panel3 = new JPanel();
        Panel3.setBackground(bck);
        Jbt = new JButton("New Game");
        Jbt.setPreferredSize(new Dimension(150, 50));
        Panel3.add(Jbt);
        mainPanel.add(Panel1, BorderLayout.NORTH);
        mainPanel.add(Panel2, BorderLayout.CENTER);
        mainPanel.add(Panel3, BorderLayout.SOUTH);
        setLayout(new FlowLayout());
        add(mainPanel);
       
        setVisible(true);
        setSize(650, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("</Suduko Game >");
        setLocation(320, 40);

    }
    static void setText(String str, String str2) {
    	Lbl1.setText(str);
    	Lbl2.setText(str2);
    }
    static void setTimer(String str) {
    	JTF1.setText("     "+str);
    }
    /*static void Difficulty(String d) {
    	JTF2.setText(d);
    }*/
    //static void Score(int num) {
    	//JTF3.setText(num);
    //}
    public static void main(String args[]){
    	SwingUtilities.invokeLater(new Runnable() {
    		public void run() {
    			ResultFrame frame = new ResultFrame();
    	        
    	        frame.setSize(650, 650);
    	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	        frame.setResizable(false);
    	        frame.setTitle("</Suduko Game >");
    	        frame.setLocation(320, 40);
    	        frame.setVisible(true);
    	        
    	       
    		}
    	});
    }
}
