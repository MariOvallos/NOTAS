package co.edu.unbosque.view;

import javax.swing.*;

public class PanelImagen extends JPanel {
    
    private JLabel labelImagen;

    public PanelImagen(ImageIcon imagen) {
        labelImagen = new JLabel(imagen);
        add(labelImagen);
    }
}
