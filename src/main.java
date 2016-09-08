import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class main extends JFrame implements ActionListener
{
	
	JButton[][] buttons = new JButton[3][3];
	//abcd
	// S = 1, o = 0
	int nextTurn = 1;
	
	public main()
	{
		this.setSize(280, 308);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("tic-tac-toe by gizem");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		for(int i = 0 ; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				JButton btn = new JButton("-");
				btn.setSize(48, 48);
				btn.setPreferredSize(new Dimension(48,48));
				btn.setLocation((int)(56 + i * btn.getSize().getWidth()), (int)(56+ j* btn.getSize().getHeight()));
				btn.addActionListener(this);
				this.add(btn);
				buttons[i][j] = btn;
			}
		}
	}
	

	public static void main(String[] args) 
	{
		main m = new main();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JButton btn = (JButton) e.getSource();
		
		if(btn.getText() == "-")
		{
			if(nextTurn == 1)
			{
				btn.setText("S");
				nextTurn = 0;
			}
			else
			{
				btn.setText("O");
				nextTurn = 1;
			}
		}
		
		for(int i = 0; i < 3; i++)
		{
			int kackere = 0;
			String birOncekiNokta = buttons[i][0].getText();
			for (int j = 0; j < 3; j++)
			{
				if(buttons[i][j].getText() == birOncekiNokta)
				{
					kackere  = kackere + 1;
					
				}
				
				if(kackere == 3)
				{
				
					if(buttons[i][j].getText() == "S")
					{
						JOptionPane.showMessageDialog(this, "Oyunu S kazandý!!");
					}
					else if (buttons[i][j].getText() == "O")
					{
						JOptionPane.showMessageDialog(this, "Oyunu O kazandý!!");
					}
				}
				
			}
		}
		
		for(int j = 0; j< 3; j++)
		{
			int kackere = 0;
			String birOncekiNokta = buttons[0][j].getText();
			for (int i = 0; i < 3; i++)
			{
				if(buttons[i][j].getText() == birOncekiNokta)
				{
					kackere  = kackere + 1;
					
				}
				
				if(kackere == 3)
				{
				
					if(buttons[i][j].getText() == "S")
					{
						JOptionPane.showMessageDialog(this, "Oyunu S kazandý!!");
					}
					else if (buttons[i][j].getText() == "O")
					{
						JOptionPane.showMessageDialog(this, "Oyunu O kazandý!!");
					}
				}
				
			}
		}
		
		{
			int kackere = 0;
			String birOncekiNokta = buttons[0][0].getText();
			for(int i = 0, j = 0; (i < 3) && (j < 3); i++, j++)
			{
				if(buttons[i][j].getText() == birOncekiNokta)
				{
					kackere  = kackere + 1;
					
				}
				
				if(kackere == 3)
				{
				
					if(buttons[i][j].getText() == "S")
					{
						JOptionPane.showMessageDialog(this, "Oyunu S kazandý!!");
					}
					else if (buttons[i][j].getText() == "O")
					{
						JOptionPane.showMessageDialog(this, "Oyunu O kazandý!!");
					}
				}
				
			}
		}
		
		
		{
			int kackere = 0;
			String birOncekiNokta = buttons[2][0].getText();
			for(int i = 2, j = 0; (i >=0) && (j <3); i--, j++)
			{
				if(buttons[i][j].getText() == birOncekiNokta)
				{
					kackere  = kackere + 1;
					
				}
				
				if(kackere == 3)
				{
				
					if(buttons[i][j].getText() == "S")
					{
						JOptionPane.showMessageDialog(this, "Oyunu S kazandý!!");
					}
					else if (buttons[i][j].getText() == "O")
					{
						JOptionPane.showMessageDialog(this, "Oyunu O kazandý!!");
					}
				}
				
			}
		}

	}

}
