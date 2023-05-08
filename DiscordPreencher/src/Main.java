import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JScrollPane;

public class Main {

	private JFrame frame;
	private JTextField nome;
	private JTextField a1;
	private JTextField a2;
	private JTextField a3;
	private JTextField b1;
	private JTextField b2;
	private JTextField b3;
	private JTextField c1;
	private JTextField c2;
	private JTextField c3;
	private JTextField d1;
	private JTextField d2;
	private JTextField d3;
	private JTextField e1;
	private JTextField e2;
	private JTextField e3;
	private JTextField f1;
	private JTextField f2;
	private JTextField f3;
	private JTextField g1;
	private JTextField g2;
	private JTextField g3;
	private JTextField h1;
	private JTextField h2;
	private JTextField h3;
	private JTextField i1;
	private JTextField i2;
	private JTextField i3;
	private JTextField l1;
	private JTextField k1;
	private JTextField j1;
	private JTextField j2;
	private JTextField k2;
	private JTextField l2;
	private JTextField l3;
	private JTextField k3;
	private JTextField j3;
	private JTextField m1;
	private JTextField m2;
	private JTextField m3;
	private JCheckBox a4;
	private JCheckBox a5;
	private JCheckBox b4;
	private JCheckBox b5;
	private JCheckBox c4;
	private JCheckBox c5;
	private JCheckBox d4;
	private JCheckBox d5;
	private JCheckBox e4;
	private JCheckBox e5;
	private JCheckBox f4;
	private JCheckBox f5;
	private JCheckBox g4;
	private JCheckBox g5;
	private JCheckBox h4;
	private JCheckBox h5;
	private JCheckBox i4;
	private JCheckBox i5;
	private JCheckBox j4;
	private JCheckBox j5;
	private JCheckBox k4;
	private JCheckBox k5;
	private JCheckBox l4;
	private JCheckBox l5;
	private JCheckBox m4;
	private JCheckBox m5;
	private JLabel venda;
	private JLabel custo;
	private JLabel lucro;
	
	private String texto = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1411, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);

		JPanel kkkkk = new JPanel();
		frame.getContentPane().add(kkkkk, BorderLayout.CENTER);
		kkkkk.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cliente");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(32, 47, 135, 31);
		kkkkk.add(lblNewLabel);

		nome = new JTextField();
		nome.setFont(new Font("Arial", Font.BOLD, 12));
		nome.setBounds(177, 47, 281, 31);
		kkkkk.add(nome);
		nome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Skunk");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(33, 127, 95, 31);
		kkkkk.add(lblNewLabel_1);

		a1 = new JTextField();
		a1.setFont(new Font("Arial", Font.BOLD, 12));
		a1.setBounds(132, 126, 121, 31);
		kkkkk.add(a1);
		a1.setColumns(10);

		a2 = new JTextField();
		a2.setFont(new Font("Arial", Font.BOLD, 12));
		a2.setText("150");
		a2.setColumns(10);
		a2.setBounds(263, 126, 121, 31);
		kkkkk.add(a2);

		a3 = new JTextField();
		a3.setFont(new Font("Arial", Font.BOLD, 12));
		a3.setColumns(10);
		a3.setBounds(394, 126, 121, 31);
		kkkkk.add(a3);

		JLabel lblNewLabel_2 = new JLabel("Tipo");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(33, 100, 95, 14);
		kkkkk.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Quantidade");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(132, 101, 105, 14);
		kkkkk.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("Pre\u00E7o");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(263, 101, 105, 14);
		kkkkk.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("Desconto %");
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_1_1.setBounds(394, 101, 105, 14);
		kkkkk.add(lblNewLabel_2_1_1_1);

		a4 = new JCheckBox("Policia");
		a4.setFont(new Font("Arial", Font.BOLD, 12));
		a4.setBounds(528, 126, 105, 31);
		kkkkk.add(a4);

		a5 = new JCheckBox("Bean");
		a5.setFont(new Font("Arial", Font.BOLD, 12));
		a5.setBounds(635, 126, 105, 31);
		kkkkk.add(a5);

		JLabel lblNewLabel_1_1 = new JLabel("Purple Haze");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(33, 165, 95, 31);
		kkkkk.add(lblNewLabel_1_1);

		b1 = new JTextField();
		b1.setFont(new Font("Arial", Font.BOLD, 12));
		b1.setColumns(10);
		b1.setBounds(132, 164, 121, 31);
		kkkkk.add(b1);

		b2 = new JTextField();
		b2.setFont(new Font("Arial", Font.BOLD, 12));
		b2.setText("150");
		b2.setColumns(10);
		b2.setBounds(263, 164, 121, 31);
		kkkkk.add(b2);

		b3 = new JTextField();
		b3.setFont(new Font("Arial", Font.BOLD, 12));
		b3.setColumns(10);
		b3.setBounds(394, 164, 121, 31);
		kkkkk.add(b3);

		b4 = new JCheckBox("Policia");
		b4.setFont(new Font("Arial", Font.BOLD, 12));
		b4.setBounds(528, 164, 105, 31);
		kkkkk.add(b4);

		b5 = new JCheckBox("Bean");
		b5.setFont(new Font("Arial", Font.BOLD, 12));
		b5.setBounds(635, 164, 105, 31);
		kkkkk.add(b5);

		JLabel lblNewLabel_1_2 = new JLabel("Blunt");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(35, 313, 93, 31);
		kkkkk.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Super Lemon Haze");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(34, 200, 94, 31);
		kkkkk.add(lblNewLabel_1_3);

		c1 = new JTextField();
		c1.setFont(new Font("Arial", Font.BOLD, 12));
		c1.setColumns(10);
		c1.setBounds(133, 199, 121, 31);
		kkkkk.add(c1);

		c2 = new JTextField();
		c2.setFont(new Font("Arial", Font.BOLD, 12));
		c2.setText("180");
		c2.setColumns(10);
		c2.setBounds(264, 199, 121, 31);
		kkkkk.add(c2);

		c3 = new JTextField();
		c3.setFont(new Font("Arial", Font.BOLD, 12));
		c3.setColumns(10);
		c3.setBounds(395, 199, 121, 31);
		kkkkk.add(c3);

		c4 = new JCheckBox("Policia");
		c4.setFont(new Font("Arial", Font.BOLD, 12));
		c4.setBounds(529, 199, 105, 31);
		kkkkk.add(c4);

		c5 = new JCheckBox("Bean");
		c5.setFont(new Font("Arial", Font.BOLD, 12));
		c5.setBounds(636, 199, 105, 31);
		kkkkk.add(c5);

		JLabel lblNewLabel_1_4 = new JLabel("Amnezia Haze");
		lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(34, 238, 94, 31);
		kkkkk.add(lblNewLabel_1_4);

		d1 = new JTextField();
		d1.setFont(new Font("Arial", Font.BOLD, 12));
		d1.setColumns(10);
		d1.setBounds(133, 237, 121, 31);
		kkkkk.add(d1);

		d2 = new JTextField();
		d2.setFont(new Font("Arial", Font.BOLD, 12));
		d2.setText("200");
		d2.setColumns(10);
		d2.setBounds(264, 237, 121, 31);
		kkkkk.add(d2);

		d3 = new JTextField();
		d3.setFont(new Font("Arial", Font.BOLD, 12));
		d3.setColumns(10);
		d3.setBounds(395, 237, 121, 31);
		kkkkk.add(d3);

		d4 = new JCheckBox("Policia");
		d4.setFont(new Font("Arial", Font.BOLD, 12));
		d4.setBounds(529, 237, 105, 31);
		kkkkk.add(d4);

		d5 = new JCheckBox("Bean");
		d5.setFont(new Font("Arial", Font.BOLD, 12));
		d5.setBounds(636, 237, 105, 31);
		kkkkk.add(d5);

		JLabel lblNewLabel_1_5 = new JLabel("Blue Dream");
		lblNewLabel_1_5.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_5.setBounds(34, 276, 94, 31);
		kkkkk.add(lblNewLabel_1_5);

		e1 = new JTextField();
		e1.setFont(new Font("Arial", Font.BOLD, 12));
		e1.setColumns(10);
		e1.setBounds(133, 275, 121, 31);
		kkkkk.add(e1);

		e2 = new JTextField();
		e2.setFont(new Font("Arial", Font.BOLD, 12));
		e2.setText("180");
		e2.setToolTipText("");
		e2.setColumns(10);
		e2.setBounds(264, 275, 121, 31);
		kkkkk.add(e2);

		e3 = new JTextField();
		e3.setFont(new Font("Arial", Font.BOLD, 12));
		e3.setColumns(10);
		e3.setBounds(395, 275, 121, 31);
		kkkkk.add(e3);

		e4 = new JCheckBox("Policia");
		e4.setFont(new Font("Arial", Font.BOLD, 12));
		e4.setBounds(529, 275, 105, 31);
		kkkkk.add(e4);

		e5 = new JCheckBox("Bean");
		e5.setFont(new Font("Arial", Font.BOLD, 12));
		e5.setBounds(636, 275, 105, 31);
		kkkkk.add(e5);

		f1 = new JTextField();
		f1.setFont(new Font("Arial", Font.BOLD, 12));
		f1.setColumns(10);
		f1.setBounds(132, 315, 121, 31);
		kkkkk.add(f1);

		f2 = new JTextField();
		f2.setFont(new Font("Arial", Font.BOLD, 12));
		f2.setText("220");
		f2.setColumns(10);
		f2.setBounds(263, 315, 121, 31);
		kkkkk.add(f2);

		f3 = new JTextField();
		f3.setFont(new Font("Arial", Font.BOLD, 12));
		f3.setColumns(10);
		f3.setBounds(394, 315, 121, 31);
		kkkkk.add(f3);

		f4 = new JCheckBox("Policia");
		f4.setFont(new Font("Arial", Font.BOLD, 12));
		f4.setBounds(528, 315, 105, 31);
		kkkkk.add(f4);

		f5 = new JCheckBox("Bean");
		f5.setFont(new Font("Arial", Font.BOLD, 12));
		f5.setBounds(635, 315, 105, 31);
		kkkkk.add(f5);

		g1 = new JTextField();
		g1.setFont(new Font("Arial", Font.BOLD, 12));
		g1.setColumns(10);
		g1.setBounds(132, 380, 121, 31);
		kkkkk.add(g1);

		JLabel lblNewLabel_1_2_1 = new JLabel("CBD");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(35, 378, 93, 31);
		kkkkk.add(lblNewLabel_1_2_1);

		g2 = new JTextField();
		g2.setFont(new Font("Arial", Font.BOLD, 12));
		g2.setText("120");
		g2.setColumns(10);
		g2.setBounds(263, 380, 121, 31);
		kkkkk.add(g2);

		g3 = new JTextField();
		g3.setFont(new Font("Arial", Font.BOLD, 12));
		g3.setColumns(10);
		g3.setBounds(394, 380, 121, 31);
		kkkkk.add(g3);

		g4 = new JCheckBox("Policia");
		g4.setFont(new Font("Arial", Font.BOLD, 12));
		g4.setBounds(528, 380, 105, 31);
		kkkkk.add(g4);

		g5 = new JCheckBox("Bean");
		g5.setFont(new Font("Arial", Font.BOLD, 12));
		g5.setBounds(635, 380, 105, 31);
		kkkkk.add(g5);

		h1 = new JTextField();
		h1.setFont(new Font("Arial", Font.BOLD, 12));
		h1.setColumns(10);
		h1.setBounds(131, 416, 121, 31);
		kkkkk.add(h1);

		JLabel lblNewLabel_1_2_2 = new JLabel("Cigarro");
		lblNewLabel_1_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2_2.setBounds(34, 414, 93, 31);
		kkkkk.add(lblNewLabel_1_2_2);

		h2 = new JTextField();
		h2.setFont(new Font("Arial", Font.BOLD, 12));
		h2.setText("8");
		h2.setColumns(10);
		h2.setBounds(262, 416, 121, 31);
		kkkkk.add(h2);

		h3 = new JTextField();
		h3.setFont(new Font("Arial", Font.BOLD, 12));
		h3.setColumns(10);
		h3.setBounds(393, 416, 121, 31);
		kkkkk.add(h3);

		h4 = new JCheckBox("Policia");
		h4.setFont(new Font("Arial", Font.BOLD, 12));
		h4.setBounds(527, 416, 105, 31);
		kkkkk.add(h4);

		h5 = new JCheckBox("Bean");
		h5.setFont(new Font("Arial", Font.BOLD, 12));
		h5.setBounds(634, 416, 105, 31);
		kkkkk.add(h5);

		i1 = new JTextField();
		i1.setFont(new Font("Arial", Font.BOLD, 12));
		i1.setColumns(10);
		i1.setBounds(132, 451, 121, 31);
		kkkkk.add(i1);

		JLabel lblNewLabel_1_2_3 = new JLabel("Bong");
		lblNewLabel_1_2_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2_3.setBounds(35, 449, 93, 31);
		kkkkk.add(lblNewLabel_1_2_3);

		i2 = new JTextField();
		i2.setFont(new Font("Arial", Font.BOLD, 12));
		i2.setText("200");
		i2.setColumns(10);
		i2.setBounds(263, 451, 121, 31);
		kkkkk.add(i2);

		i3 = new JTextField();
		i3.setFont(new Font("Arial", Font.BOLD, 12));
		i3.setColumns(10);
		i3.setBounds(394, 451, 121, 31);
		kkkkk.add(i3);

		i4 = new JCheckBox("Policia");
		i4.setFont(new Font("Arial", Font.BOLD, 12));
		i4.setBounds(528, 451, 105, 31);
		kkkkk.add(i4);

		i5 = new JCheckBox("Bean");
		i5.setFont(new Font("Arial", Font.BOLD, 12));
		i5.setBounds(635, 451, 105, 31);
		kkkkk.add(i5);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("Kit patrulha P");
		lblNewLabel_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2_1_1.setBounds(35, 510, 93, 31);
		kkkkk.add(lblNewLabel_1_2_1_1);

		JLabel lblNewLabel_1_2_2_1 = new JLabel("Kit Patrulha G");
		lblNewLabel_1_2_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2_2_1.setBounds(34, 546, 93, 31);
		kkkkk.add(lblNewLabel_1_2_2_1);

		JLabel lblNewLabel_1_2_3_1 = new JLabel("Kit degusta\u00E7\u00E3o");
		lblNewLabel_1_2_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2_3_1.setBounds(35, 581, 93, 31);
		kkkkk.add(lblNewLabel_1_2_3_1);

		l1 = new JTextField();
		l1.setFont(new Font("Arial", Font.BOLD, 12));
		l1.setColumns(10);
		l1.setBounds(132, 583, 121, 31);
		kkkkk.add(l1);

		k1 = new JTextField();
		k1.setFont(new Font("Arial", Font.BOLD, 12));
		k1.setColumns(10);
		k1.setBounds(131, 548, 121, 31);
		kkkkk.add(k1);

		j1 = new JTextField();
		j1.setFont(new Font("Arial", Font.BOLD, 12));
		j1.setColumns(10);
		j1.setBounds(132, 512, 121, 31);
		kkkkk.add(j1);

		j2 = new JTextField();
		j2.setFont(new Font("Arial", Font.BOLD, 12));
		j2.setText("600");
		j2.setColumns(10);
		j2.setBounds(263, 512, 121, 31);
		kkkkk.add(j2);

		k2 = new JTextField();
		k2.setFont(new Font("Arial", Font.BOLD, 12));
		k2.setText("1100");
		k2.setColumns(10);
		k2.setBounds(262, 548, 121, 31);
		kkkkk.add(k2);

		l2 = new JTextField();
		l2.setFont(new Font("Arial", Font.BOLD, 12));
		l2.setText("1000");
		l2.setToolTipText("");
		l2.setColumns(10);
		l2.setBounds(263, 583, 121, 31);
		kkkkk.add(l2);

		l3 = new JTextField();
		l3.setFont(new Font("Arial", Font.BOLD, 12));
		l3.setColumns(10);
		l3.setBounds(394, 583, 121, 31);
		kkkkk.add(l3);

		k3 = new JTextField();
		k3.setFont(new Font("Arial", Font.BOLD, 12));
		k3.setColumns(10);
		k3.setBounds(393, 548, 121, 31);
		kkkkk.add(k3);

		j3 = new JTextField();
		j3.setFont(new Font("Arial", Font.BOLD, 12));
		j3.setColumns(10);
		j3.setBounds(394, 512, 121, 31);
		kkkkk.add(j3);

		j4 = new JCheckBox("Policia");
		j4.setFont(new Font("Arial", Font.BOLD, 12));
		j4.setBounds(528, 512, 105, 31);
		kkkkk.add(j4);

		k4 = new JCheckBox("Policia");
		k4.setFont(new Font("Arial", Font.BOLD, 12));
		k4.setBounds(527, 548, 105, 31);
		kkkkk.add(k4);

		l4 = new JCheckBox("Policia");
		l4.setFont(new Font("Arial", Font.BOLD, 12));
		l4.setBounds(528, 583, 105, 31);
		kkkkk.add(l4);

		l5 = new JCheckBox("Bean");
		l5.setFont(new Font("Arial", Font.BOLD, 12));
		l5.setBounds(635, 583, 105, 31);
		kkkkk.add(l5);

		k5 = new JCheckBox("Bean");
		k5.setFont(new Font("Arial", Font.BOLD, 12));
		k5.setBounds(634, 548, 105, 31);
		kkkkk.add(k5);

		j5 = new JCheckBox("Bean");
		j5.setFont(new Font("Arial", Font.BOLD, 12));
		j5.setBounds(635, 512, 105, 31);
		kkkkk.add(j5);

		JLabel lblNewLabel_1_2_3_1_1 = new JLabel("Kit best buds");
		lblNewLabel_1_2_3_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2_3_1_1.setBounds(35, 619, 93, 31);
		kkkkk.add(lblNewLabel_1_2_3_1_1);

		m1 = new JTextField();
		m1.setFont(new Font("Arial", Font.BOLD, 12));
		m1.setColumns(10);
		m1.setBounds(132, 621, 121, 31);
		kkkkk.add(m1);

		m2 = new JTextField();
		m2.setFont(new Font("Arial", Font.BOLD, 12));
		m2.setText("520");
		m2.setColumns(10);
		m2.setBounds(263, 621, 121, 31);
		kkkkk.add(m2);

		m3 = new JTextField();
		m3.setFont(new Font("Arial", Font.BOLD, 12));
		m3.setColumns(10);
		m3.setBounds(394, 621, 121, 31);
		kkkkk.add(m3);

		m4 = new JCheckBox("Policia");
		m4.setFont(new Font("Arial", Font.BOLD, 12));
		m4.setBounds(528, 621, 105, 31);
		kkkkk.add(m4);

		m5 = new JCheckBox("Bean");
		m5.setFont(new Font("Arial", Font.BOLD, 12));
		m5.setBounds(635, 621, 105, 31);
		kkkkk.add(m5);

		JLabel lblNewLabel_3 = new JLabel("Valor venda");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBounds(782, 33, 111, 37);
		kkkkk.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("Custo total");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(782, 75, 111, 37);
		kkkkk.add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_1_1 = new JLabel("Lucro");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3_1_1.setBounds(781, 112, 112, 37);
		kkkkk.add(lblNewLabel_3_1_1);

		venda = new JLabel("");
		venda.setFont(new Font("Arial", Font.BOLD, 12));
		venda.setBounds(899, 33, 111, 37);
		kkkkk.add(venda);

		custo = new JLabel("");
		custo.setFont(new Font("Arial", Font.BOLD, 12));
		custo.setBounds(899, 75, 111, 37);
		kkkkk.add(custo);

		lucro = new JLabel("");
		lucro.setFont(new Font("Arial", Font.BOLD, 12));
		lucro.setBounds(898, 112, 112, 37);
		kkkkk.add(lucro);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(782, 238, 571, 442);
		kkkkk.add(scrollPane);

		JTextPane gerado = new JTextPane();
		scrollPane.setViewportView(gerado);
		gerado.setFont(new Font("Arial", Font.BOLD, 12));

		JButton btnNewButton = new JButton("Gerar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				/*
				 * AQUI CRIA A PARTE ESCRITA FINAL QUE IRÁ SER ENVIADA POR EMAIL
				 */
				texto = gerado.getText();
				if (a1.getText().trim().equals("") == false) {
					texto += "\nItem: Skunk";
					texto += "\nQuantidade: " + a1.getText().trim();
					texto += "\nPreço:" + Integer.parseInt(a1.getText()) * Integer.parseInt(a2.getText());
					texto += "\nNome: " + nome.getText().trim();
				}
				if (b1.getText().trim().equals("") == false) {
					texto += "\nItem: Purple Haze";
					texto += "\nQuantidade: " + b1.getText().trim();
					if (b5.isSelected() == true) {
						texto += "\nPreço: 100";
					}else {
						texto += "\nPreço:" +  + Integer.parseInt(b1.getText()) * Integer.parseInt(b2.getText());
					}
					texto += "\nNome: " + nome.getText().trim();
				}
				if (c1.getText().trim().equals("") == false) {
					texto += "\nItem: Super Lemon Haze";
					texto += "\nQuantidade: " + c1.getText().trim();
					texto += "\nPreço:" + Integer.parseInt(c1.getText()) * Integer.parseInt(c2.getText());
					texto += "\nNome: " + nome.getText().trim();
				}
				if (d1.getText().trim().equals("") == false) {
					texto += "\nItem: Amnezia Haze";
					texto += "\nQuantidade: " + d1.getText().trim();
					texto += "\nPreço:" + Integer.parseInt(d1.getText()) * Integer.parseInt(d2.getText());
					texto += "\nNome: " + nome.getText().trim();
				}
				if (e1.getText().trim().equals("") == false) {
					texto += "\nItem: Blue Dream";
					texto += "\nQuantidade: " + e1.getText().trim();
					texto += "\nPreço:" + Integer.parseInt(e1.getText()) * Integer.parseInt(e2.getText());
					texto += "\nNome: " + nome.getText().trim();
				}
				if (f1.getText().trim().equals("") == false) {
					texto += "\nItem: Blunt";
					texto += "\nQuantidade: " + f1.getText().trim();
					texto += "\nPreço:" + Integer.parseInt(f1.getText()) * Integer.parseInt(f2.getText());
					texto += "\nNome: " + nome.getText().trim();
				}
				if (g1.getText().trim().equals("") == false) {
					texto += "\nItem: CBD";
					texto += "\nQuantidade: " + g1.getText().trim();
					if (g4.isSelected() == true) {
						if (Integer.parseInt(g1.getText()) >= 5) {
							texto += "\nPreço: " +  + Integer.parseInt(g1.getText()) * 100;
						}
					} else {
						if (Integer.parseInt(g1.getText()) >= 50) {
							texto += "\nPreço: " + Integer.parseInt(g1.getText()) * 100;
						}else {
							texto += "\nPreço:" + Integer.parseInt(g1.getText()) * Integer.parseInt(g2.getText());
						}
					}
					texto += "\nNome: " + nome.getText().trim();
				}
				if (h1.getText().trim().equals("") == false) {
					texto += "\nItem: Cigarro";
					texto += "\nQuantidade: " + h1.getText().trim();
					if (h5.isSelected() == true) {
						texto += "\nPreço: " + Integer.parseInt(h1.getText()) * 6;
					}else {
						texto += "\nPreço:" + Integer.parseInt(h1.getText()) * Integer.parseInt(h2.getText());
					}				
					texto += "\nNome: " + nome.getText().trim();
				}
				if (i1.getText().trim().equals("") == false) {
					texto += "\nItem: Bong";
					texto += "\nQuantidade: " + i1.getText().trim();
					texto += "\nPreço:" + i2.getText().trim();
					texto += "\nNome: " + nome.getText().trim();
				}
				if (j1.getText().trim().equals("") == false) {
					texto += "\nItem: Kit Patrulha P";
					texto += "\nQuantidade: " + j1.getText().trim();
					texto += "\nPreço:" +  + Integer.parseInt(j1.getText()) * Integer.parseInt(j2.getText());
					texto += "\nNome: " + nome.getText().trim();
				}
				if (k1.getText().trim().equals("") == false) {
					texto += "\nItem: Kit Patrulha G";
					texto += "\nQuantidade: " + k1.getText().trim();
					texto += "\nPreço:" +  + Integer.parseInt(k1.getText()) * Integer.parseInt(k2.getText());
					texto += "\nNome: " + nome.getText().trim();
				}
				if (l1.getText().trim().equals("") == false) {
					texto += "\nItem: Kit Degustação";
					texto += "\nQuantidade: " + l1.getText().trim();
					texto += "\nPreço:" + Integer.parseInt(l1.getText()) * Integer.parseInt(l2.getText());
					texto += "\nNome: " + nome.getText().trim();
				}
				if (m1.getText().trim().equals("") == false) {
					texto += "\nItem: Kit Best Buds";
					texto += "\nQuantidade: " + m1.getText().trim();
					texto += "\nPreço:" + Integer.parseInt(m1.getText()) * Integer.parseInt(m2.getText());
					texto += "\nNome: " + nome.getText().trim();
				}

				calculaTudo();
				gerado.setText(texto);
			}
		});
		btnNewButton.setBounds(1113, 161, 240, 37);
		kkkkk.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculaTudo();
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1.setBounds(791, 159, 135, 37);
		kkkkk.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Limpar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto = "";
				gerado.setText("");
				venda.setText("");
				custo.setText("");
				lucro.setText("");
			}
		});
		btnNewButton_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(936, 159, 135, 37);
		kkkkk.add(btnNewButton_1_1);
	}
	
	public void calculaTudo() {
		int valorTotal = 0;
		int custoTotal = 0;
		int lucroTotal = 0;

		/*
		 * AQUI VERIFICA E CRIA VALOR TOTAL FINAL, E CUSTO TOTAL FINAL
		 */
		if (a1.getText().trim().equals("") == false) {
			custoTotal += 0;
			if (a5.isSelected() == true) {
				valorTotal += Integer.parseInt(a1.getText()) * 100;
			}else {
				valorTotal += Integer.parseInt(a1.getText()) * Integer.parseInt(a2.getText());
			}
		}
		if (b1.getText().trim().equals("") == false) {
			custoTotal += 0;
			if (b5.isSelected() == true) {
				valorTotal += Integer.parseInt(b1.getText()) * 100;
			}else {
				valorTotal += Integer.parseInt(b1.getText()) * Integer.parseInt(b2.getText());
			}
		}
		if (c1.getText().trim().equals("") == false) {
			valorTotal += Integer.parseInt(c1.getText()) * Integer.parseInt(c2.getText());
			custoTotal += 0;
		}
		if (d1.getText().trim().equals("") == false) {
			valorTotal += Integer.parseInt(d1.getText()) * Integer.parseInt(d2.getText());
			custoTotal += 0;
		}
		if (e1.getText().trim().equals("") == false) {
			valorTotal += Integer.parseInt(e1.getText()) * Integer.parseInt(e2.getText());
			custoTotal += 0;
		}
		if (f1.getText().trim().equals("") == false) {
			valorTotal += Integer.parseInt(f1.getText()) * Integer.parseInt(f2.getText());
			custoTotal += Integer.parseInt(f1.getText()) * 80;
		}
		if (g1.getText().trim().equals("") == false) {
			custoTotal += Integer.parseInt(g1.getText()) * 60;
			if (g4.isSelected() == true) {
				if (Integer.parseInt(g1.getText()) >= 5) {
					valorTotal += Integer.parseInt(g1.getText()) * 100;
				}
			} else {
				if (Integer.parseInt(g1.getText()) >= 50) {
					valorTotal += Integer.parseInt(g1.getText()) * 100;
				}else {
					valorTotal += Integer.parseInt(g1.getText()) * Integer.parseInt(g2.getText());
				}
			}
		}
		if (h1.getText().trim().equals("") == false) {
			custoTotal += Integer.parseInt(h1.getText()) * 4;
			if (h5.isSelected() == true) {
				valorTotal += Integer.parseInt(h1.getText()) * 6;
			}else {
				valorTotal += Integer.parseInt(h1.getText()) * Integer.parseInt(h2.getText());
			}
		}
		if (i1.getText().trim().equals("") == false) {
			valorTotal += Integer.parseInt(i1.getText()) * Integer.parseInt(i2.getText());
			custoTotal += Integer.parseInt(i1.getText()) * 90;
		}
		if (j1.getText().trim().equals("") == false) {
			valorTotal += Integer.parseInt(j1.getText()) * Integer.parseInt(j2.getText());
			custoTotal += Integer.parseInt(j1.getText()) * 380;
		}
		if (k1.getText().trim().equals("") == false) {
			valorTotal += Integer.parseInt(k1.getText()) * Integer.parseInt(k2.getText());
			custoTotal += Integer.parseInt(k1.getText()) * 760;
		}
		if (l1.getText().trim().equals("") == false) {
			valorTotal += Integer.parseInt(l1.getText()) * Integer.parseInt(l2.getText());
			custoTotal += Integer.parseInt(l1.getText()) * 80;
		}
		if (m1.getText().trim().equals("") == false) {
			valorTotal += Integer.parseInt(m1.getText()) * Integer.parseInt(m2.getText());
			custoTotal += Integer.parseInt(m1.getText()) * 160;
		}
		
		venda.setText(valorTotal + "");
		custo.setText(custoTotal + "");
		lucroTotal = valorTotal - custoTotal;
		lucro.setText(lucroTotal + "");
	}
}
