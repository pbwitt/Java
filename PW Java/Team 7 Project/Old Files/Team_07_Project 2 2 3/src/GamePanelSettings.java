
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;


public class GamePanelSettings extends JPanel
{
    
    JButton gpsShips, gpsDifficulty, gpsCompIntel;
    IntroJPanel inp;
   
    
    public GamePanelSettings(IntroJPanel n)
    {
        super();
        setLayout(null);
        inp = n;
        
        gpsShips = new JButton();
        gpsShips.setText(inp.shipsNumber);
        gpsShips.setBounds(10, 20, 50, 15);
        
        gpsDifficulty = new JButton();
        gpsDifficulty .setText(inp.compIntelType);
        gpsDifficulty.setBounds(10, 40, 50, 15);
        
        gpsCompIntel = new JButton();
        gpsCompIntel.setText(inp.difficultyLevel);
        gpsCompIntel.setBounds(10, 60, 50, 15);
        
        add(gpsShips);
        add(gpsDifficulty);
        add(gpsCompIntel);
        
        
        
        
        
    }

    GamePanelSettings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
