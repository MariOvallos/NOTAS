package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDatosEstudiante extends JPanel {

	private JLabel lblEstudiante;
	private JLabel lblNota;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtNota4;
	private JTextField txtNota5;
	private JTextField txtNota6;
	private JTextField txtNota7;
	private JTextField txtNota8;
	private JTextField txtNota9;
	private JTextField txtNota10;

	public PanelDatosEstudiante() {
		setLayout(null); // Para que los componentes tengan coordenadas específicas
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		lblEstudiante = new JLabel("Estudiante");
		lblEstudiante.setBounds(420, 10, 60, 60);
		add(lblEstudiante);

		lblNota = new JLabel("Nota");
		lblNota.setBounds(640, 10, 60, 60);
		add(lblNota);

		txtNota1 = new JTextField();
		txtNota1.setBounds(630, 60, 55, 25);
		add(txtNota1);

		txtNota2 = new JTextField();
		txtNota2.setBounds(630, 90, 55, 25);
		add(txtNota2);

		txtNota3 = new JTextField();
		txtNota3.setBounds(630, 120, 55, 25);
		add(txtNota3);

		txtNota4 = new JTextField();
		txtNota4.setBounds(630, 150, 55, 25);
		add(txtNota4);

		txtNota5 = new JTextField();
		txtNota5.setBounds(630, 180, 55, 25);
		add(txtNota5);

		txtNota6 = new JTextField();
		txtNota6.setBounds(630, 210, 55, 25);
		add(txtNota6);

		txtNota7 = new JTextField();
		txtNota7.setBounds(630, 240, 55, 25);
		add(txtNota7);

		txtNota8 = new JTextField();
		txtNota8.setBounds(630, 270, 55, 25);
		add(txtNota8);

		txtNota9 = new JTextField();
		txtNota9.setBounds(630, 300, 55, 25);
		add(txtNota9);

		txtNota10 = new JTextField();
		txtNota10.setBounds(630, 330, 55, 25);
		add(txtNota10);

	}

	public JTextField getTxtNota() {
		return txtNota1;
	}

	public void setTxtNota(JTextField txtNota) {
		this.txtNota1 = txtNota;
	}

	public JLabel getLblEstudiante() {
		return lblEstudiante;
	}

	public void setLblEstudiante(JLabel lblEstudiante) {
		this.lblEstudiante = lblEstudiante;
	}

	public JLabel getLblNota() {
		return lblNota;
	}

	public void setLblNota(JLabel lblNota) {
		this.lblNota = lblNota;
	}

	public JTextField getTxtNota1() {
		return txtNota1;
	}

	public void setTxtNota1(JTextField txtNota1) {
		this.txtNota1 = txtNota1;
	}

	public JTextField getTxtNota2() {
		return txtNota2;
	}

	public void setTxtNota2(JTextField txtNota2) {
		this.txtNota2 = txtNota2;
	}

	public JTextField getTxtNota3() {
		return txtNota3;
	}

	public void setTxtNota3(JTextField txtNota3) {
		this.txtNota3 = txtNota3;
	}

	public JTextField getTxtNota4() {
		return txtNota4;
	}

	public void setTxtNota4(JTextField txtNota4) {
		this.txtNota4 = txtNota4;
	}

	public JTextField getTxtNota5() {
		return txtNota5;
	}

	public void setTxtNota5(JTextField txtNota5) {
		this.txtNota5 = txtNota5;
	}

	public JTextField getTxtNota6() {
		return txtNota6;
	}

	public void setTxtNota6(JTextField txtNota6) {
		this.txtNota6 = txtNota6;
	}

	public JTextField getTxtNota7() {
		return txtNota7;
	}

	public void setTxtNota7(JTextField txtNota7) {
		this.txtNota7 = txtNota7;
	}

	public JTextField getTxtNota8() {
		return txtNota8;
	}

	public void setTxtNota8(JTextField txtNota8) {
		this.txtNota8 = txtNota8;
	}

	public JTextField getTxtNota9() {
		return txtNota9;
	}

	public void setTxtNota9(JTextField txtNota9) {
		this.txtNota9 = txtNota9;
	}

	public JTextField getTxtNota10() {
		return txtNota10;
	}

	public void setTxtNota10(JTextField txtNota10) {
		this.txtNota10 = txtNota10;
	}

}
