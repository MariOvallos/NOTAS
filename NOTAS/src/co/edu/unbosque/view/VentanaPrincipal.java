package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	private PanelBtns pBtns;
	private PanelResultados pResultados;
	private PanelDatosProfesor pProfesor;
	private PanelDatosEstudiante pDatos;
	private PanelImagen pImagen;

	public VentanaPrincipal() {
		setTitle("Notas Estudiantes");
		setSize(800, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.white);
		getContentPane().setLayout(null);

		pProfesor = new PanelDatosProfesor();
		pProfesor.setBackground(Color.red);
		pProfesor.setBounds(0, 0, 800, 50);
		add(pProfesor);

		ImageIcon imagen = new ImageIcon("Media/América.jpg");
		pImagen = new PanelImagen(imagen);
		pImagen.setBounds(50, 80, 300, 300);
		add(pImagen);

		pDatos = new PanelDatosEstudiante();
		pDatos.setBackground(Color.white);
		pDatos.setBounds(0, 40, 800, 400);
		add(pDatos);

		pBtns = new PanelBtns();
		pBtns.setBackground(Color.red);
		pBtns.setBounds(0, 420, 800, 100);
		add(pBtns);

		pResultados = new PanelResultados();
		pResultados.setBackground(Color.white);
		pResultados.setBounds(0, 400, 800, 300); // PanelResultados ocupará la parte inferior
		add(pResultados);

		getContentPane().add(pDatos);
		getContentPane().add(pResultados);
	}

	public PanelDatosEstudiante getpDatos() {
		return pDatos;
	}

	public void setpDatos(PanelDatosEstudiante pDatos) {
		this.pDatos = pDatos;
	}

	public PanelResultados getpResultados() {
		return pResultados;
	}

	public void setpResultados(PanelResultados pResultados) {
		this.pResultados = pResultados;
	}

	public PanelBtns getpBtns() {
		return pBtns;
	}

	public void setpBtns(PanelBtns pBtns) {
		this.pBtns = pBtns;
	}

	public PanelDatosProfesor getpProfesor() {
		return pProfesor;
	}

	public void setpProfesor(PanelDatosProfesor pProfesor) {
		this.pProfesor = pProfesor;
	}

	public PanelImagen getpImagen() {
		return pImagen;
	}

	public void setpImagen(PanelImagen pImagen) {
		this.pImagen = pImagen;
	}
	
}
