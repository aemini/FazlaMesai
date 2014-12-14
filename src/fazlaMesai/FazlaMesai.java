package fazlaMesai;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class FazlaMesai {

	private JFrame frmFazlaMesaiHesaplama;
	private JTextField txtSalary;
	private JTextField txtOverTime;
	private JTextField txtWage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FazlaMesai window = new FazlaMesai();
					window.frmFazlaMesaiHesaplama.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FazlaMesai() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFazlaMesaiHesaplama = new JFrame();
		frmFazlaMesaiHesaplama.setIconImage(Toolkit.getDefaultToolkit().getImage("/home/bendeseni/web/suleyman/public/favicon.ico"));
		frmFazlaMesaiHesaplama.setTitle("Fazla Mesai Hesaplama");
		frmFazlaMesaiHesaplama.setResizable(false);
		frmFazlaMesaiHesaplama.setBounds(100, 100, 297, 157);
		frmFazlaMesaiHesaplama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFazlaMesaiHesaplama.getContentPane().setLayout(null);
		
		JLabel lblSalary = new JLabel("Maaş");
		lblSalary.setBounds(12, 12, 70, 15);
		frmFazlaMesaiHesaplama.getContentPane().add(lblSalary);
		
		txtSalary = new JTextField();
		txtSalary.setBounds(100, 12, 177, 19);
		frmFazlaMesaiHesaplama.getContentPane().add(txtSalary);
		txtSalary.setColumns(10);
		
		JLabel lblOverTime = new JLabel("Fazla Mesai");
		lblOverTime.setBounds(12, 39, 114, 15);
		frmFazlaMesaiHesaplama.getContentPane().add(lblOverTime);
		
		txtOverTime = new JTextField();
		txtOverTime.setBounds(100, 39, 177, 19);
		frmFazlaMesaiHesaplama.getContentPane().add(txtOverTime);
		txtOverTime.setColumns(10);
		
		JLabel lblWage = new JLabel("Ücret");
		lblWage.setBounds(12, 66, 70, 15);
		frmFazlaMesaiHesaplama.getContentPane().add(lblWage);
		
		txtWage = new JTextField();
		txtWage.setBounds(100, 66, 177, 19);
		frmFazlaMesaiHesaplama.getContentPane().add(txtWage);
		txtWage.setColumns(10);
		
		JButton btnCalculate = new JButton("Hesapla");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float total;
				float salary = Float.parseFloat(txtSalary.getText());
				float overTime = Float.parseFloat(txtOverTime.getText());
				if(overTime >= 1 && overTime <= 10) {
					total = salary + overTime * 15;
				} else if (overTime >= 11 && overTime <= 20) {
					total = salary + overTime * 20;
				} else {
					total = salary + overTime * 25;
				}
				txtWage.setText(Float.toString(total));
			}
		});
		btnCalculate.setBounds(100, 95, 117, 25);
		frmFazlaMesaiHesaplama.getContentPane().add(btnCalculate);
	}
}
