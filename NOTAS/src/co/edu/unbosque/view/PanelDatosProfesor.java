package co.edu.unbosque.view;

import javax.swing.*;

public class PanelDatosProfesor extends JPanel {

	private JLabel lblProfesor;
	private JLabel lblMateria;

	public PanelDatosProfesor() {
		setLayout(null); // Para que los componentes tengan coordenadas específicas
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		lblProfesor = new JLabel("Profesor: ");
		lblProfesor.setBounds(30, 5, 150, 50);
		add(lblProfesor);

		lblMateria = new JLabel("Materia: ");
		lblMateria.setBounds(400, 5, 150, 50);
		add(lblMateria);
	}

	public JLabel getLblProfesor() {
		return lblProfesor;
	}

	public void setLblProfesor(JLabel lblProfesor) {
		this.lblProfesor = lblProfesor;
	}

	public JLabel getLblMateria() {
		return lblMateria;
	}

	public void setLblMateria(JLabel lblMateria) {
		this.lblMateria = lblMateria;
	}

}
