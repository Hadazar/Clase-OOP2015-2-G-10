
package Graficos;

import javax.swing.*;

public class Tablero extends JFrame{
    
    private JButton NuevaPartida;
    
    public Tablero(){
        super( "Imperio de mesa" );
        setSize( 1500, 750 );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setVisible( true );
        setLayout (new FlowLayout());
        
        NuevaPartida = new JButton( "Nueva Partida" );
        add(Nuevapartida);
        
    }
    
    
}
