package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.JTextArea;

public class PanelResultados extends JPanel {
	
	private JTextArea txtCampoResultados;
	

    public PanelResultados() {
        setLayout(null);
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        txtCampoResultados = new JTextArea();
        txtCampoResultados.setBounds(10, 10, 780, 280); // Por ejemplo
        add(txtCampoResultados);
    }

	public JTextArea getTxtCampoResultados() {
		return txtCampoResultados;
	}

	public void setTxtCampoResultados(JTextArea txtCampoResultados) {
		this.txtCampoResultados = txtCampoResultados;
	}
    

}
