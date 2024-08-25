package co.edu.unbosque.view;

import javax.swing.*;

public class PanelBtns extends JPanel {

	private JButton btnGetPromedio;
	private JButton btnGetNotaMasAlta;
	private JButton btnGetNotaMasBaja;
	private JButton btnAprobados;

	public PanelBtns() {
		setLayout(null); // Para que los componentes tengan coordenadas específicas
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		btnGetPromedio = new JButton("Promedio");
		btnGetPromedio.setActionCommand("PROMEDIO");
		btnGetPromedio.setBounds(30, 400, 150, 50);
		add(btnGetPromedio);

		btnGetNotaMasAlta = new JButton("Nota Más Alta");
		btnGetNotaMasAlta.setActionCommand("MAXNOTE");
		btnGetNotaMasAlta.setBounds(225, 400, 150, 50);
		add(btnGetNotaMasAlta);

		btnGetNotaMasBaja = new JButton("Nota Más Baja");
		btnGetNotaMasBaja.setActionCommand("MINNOTE");
		btnGetNotaMasBaja.setBounds(420, 400, 150, 50);
		add(btnGetNotaMasBaja);

		btnAprobados = new JButton("Aprobados");
		btnAprobados.setActionCommand("APROBADOS");
		btnAprobados.setBounds(610, 400, 150, 50);
		add(btnAprobados);

	}

	public JButton getBtnGetPromedio() {
		return btnGetPromedio;
	}

	public void setBtnGetPromedio(JButton btnGetPromedio) {
		this.btnGetPromedio = btnGetPromedio;
	}

	public JButton getBtnGetNotaMasAlta() {
		return btnGetNotaMasAlta;
	}

	public void setBtnGetNotaMasAlta(JButton btnGetNotaMasAlta) {
		this.btnGetNotaMasAlta = btnGetNotaMasAlta;
	}

	public JButton getBtnGetNotaMasBaja() {
		return btnGetNotaMasBaja;
	}

	public void setBtnGetNotaMasBaja(JButton btnGetNotaMasBaja) {
		this.btnGetNotaMasBaja = btnGetNotaMasBaja;
	}

	public JButton getBtnAprobados() {
		return btnAprobados;
	}

	public void setBtnAprobados(JButton btnAprobados) {
		this.btnAprobados = btnAprobados;
	}
}
