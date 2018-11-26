
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

class Lab extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton mButton = new JButton("AC Milan");
	JButton rButton = new JButton("Real Madrid");
	int m = 0;
	int a = 0;
	JLabel result = new JLabel("Result" + m + "X" + a);
	JLabel last = new JLabel("Last Scorer: N/A");
	JLabel win = new JLabel("Winner: DRAW");
	

	
	Lab(){
		super("Lab");
		setSize(300, 300);
		setLayout(null);
		
		add(mButton);
		mButton.setBounds(30, 20, 100, 50);
		add(rButton);
		rButton.setBounds(170, 20, 100, 50);
		add(result);
		result.setBounds(100, 100, 100, 50);
		add(last);
		last.setBounds(100, 150, 100, 50);
		add(win);
		win.setBounds(100, 200, 100, 50);
		
		
	
		mButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				m++;
				result.setText("Result" + m + "X" + a);
				last.setText("Last Scorer: AC Milan");
				if(m>a) {
					win.setText("Winner: AC Milan");
				}else if(m == a) {
					win.setText("Winner: DRAW");
				}
			}
		});
		
		rButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				a++;
				result.setText("Result" + m + "X" + a);
				last.setText("Last Scorer: Read Madrid");
				if(a>m) {
					win.setText("Winner: Real Madrid");
				}else if(m == a) {
					win.setText("Winner: DRAW");
				}
			}
		});
		setVisible(true);
		//setResizable(false);
	}


	
	
	
}
