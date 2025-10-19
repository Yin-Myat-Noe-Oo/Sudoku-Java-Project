package Sudoku4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.FileNotFoundException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends JFrame implements ActionListener{
	
	Sudoku4 game;
	static Sudoku4Panel panel;
    static JFrame frame;
    static JPanel p;
    static Font buttonFont;
    static JButton btnEasy, btnMedium, btnHard;

    Home() {
        
        getContentPane().setBackground(new Color(221,198,228));

        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Choose Mode");
        titleLabel.setForeground(Color.decode("#800080"));
        titleLabel.setFont(new Font("Serif", Font.BOLD, 50)); 
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); 
        add(titleLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setBackground(new Color(221,198,228));

        buttonFont = new Font("Serif", Font.BOLD, 12);

        btnEasy = new JButton("Easy");
        btnEasy.setBackground(Color.decode("#800080"));
        btnEasy.setForeground(Color.WHITE);
        btnEasy.setFont(buttonFont); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0);
        buttonPanel.add(btnEasy, gbc);

        btnMedium = new JButton("Medium");
        btnMedium.setBackground(Color.decode("#800080"));
        btnMedium.setForeground(Color.WHITE);
        btnMedium.setFont(buttonFont); 
        gbc.gridy = 1;
        buttonPanel.add(btnMedium, gbc);

        btnHard = new JButton("Hard");
        btnHard.setBackground(Color.decode("#800080"));
        btnHard.setForeground(Color.WHITE);
        btnHard.setFont(buttonFont); 
        gbc.gridy = 2;
        buttonPanel.add(btnHard, gbc);

        add(buttonPanel, BorderLayout.CENTER);

        JPanel buttonControlPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonControlPanel.setBackground(new Color(221,198,228));

        JButton btnBack = new JButton("Back");
        btnBack.setBackground(Color.GRAY);
        btnBack.setForeground(Color.WHITE);
        btnBack.setFont(buttonFont); 
        buttonControlPanel.add(btnBack);

        JButton btnNext = new JButton("Next >>");
        btnNext.setBackground(Color.decode("#800080"));
        btnNext.setForeground(Color.WHITE);
        btnNext.setFont(buttonFont); 
        buttonControlPanel.add(btnNext);
        
        add(buttonControlPanel, BorderLayout.SOUTH);
        
        btnEasy.addActionListener(this);
        btnMedium.addActionListener(this);
        btnHard.addActionListener(this);
        
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                int fontSize = Math.min(getWidth(), getHeight())/30; 
                buttonFont = new Font("Serif", Font.BOLD, fontSize);

                btnEasy.setFont(buttonFont);
                btnMedium.setFont(buttonFont);
                btnHard.setFont(buttonFont);
                btnBack.setFont(buttonFont);
                btnNext.setFont(buttonFont);

                Dimension buttonSize = new Dimension(getWidth()/4,getHeight()/15); 
                btnEasy.setPreferredSize(buttonSize);
                btnMedium.setPreferredSize(buttonSize);
                btnHard.setPreferredSize(buttonSize);
                btnBack.setPreferredSize(buttonSize);
                btnNext.setPreferredSize(buttonSize);
            }
        });
        
        btnEasy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Sudoku4.easymode();
            	Sudoku4.newGame();
            	
            }
        });

        btnMedium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Sudoku4.mediummode();
            	Sudoku4.newGame();

            }
        });
        
        btnHard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Sudoku4.hardmode();
            	Sudoku4.newGame();
            }
        });
        
    }
        

    public static void main(String[] args) {
    	
        frame = new JFrame();
        Home frame = new Home();
        frame.setTitle("Sudoku Game");
        frame.setSize(650, 650); 
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}