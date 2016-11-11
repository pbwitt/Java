
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class GamePanelSettings extends JPanel implements ActionListener
{
    
    JButton gpsShips, gpsDifficulty, gpsCompIntel;
    String shipsNumber, compIntelType, difficultyLevel;
    String informedShips, informedDifficulty, informedCompIntel;
    IntroJPanel introPanel;

    public GamePanelSettings(IntroJPanel n)
    {
        super();
        setLayout(null);
        
        Border thickBorder = new LineBorder(Color.BLACK, 3); 
        setBorder(thickBorder);
        
        
        JLabel titleLabel = new JLabel();
        titleLabel.setText("<html><u><bold>Game Options</u></bold></html>");
        titleLabel.setBounds(15, 10, 150, 20);
        titleLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        add(titleLabel);
        

        introPanel = n;
        
        gpsShips = new JButton();
        gpsShips.setBounds(10, 60, 100, 30);
        
        JLabel shipsLabel = new JLabel();
        shipsLabel.setText("<html><u><bold># of Ships:</u></bold></html>\"");
        shipsLabel.setBounds(30,45,120,15);
        
        gpsDifficulty = new JButton();
        gpsDifficulty.setBounds(10, 120, 100, 30);
        
        JLabel difficultyLabel = new JLabel();
        difficultyLabel.setText("<html><u><bold>Difficulty:</u></bold></html>");
        difficultyLabel.setBounds(30,105,120,15);
        
        gpsCompIntel = new JButton();
        gpsCompIntel.setBounds(10, 195, 100, 30);
        
        JLabel compIntelLabel = new JLabel();
        compIntelLabel.setText("<html><u><bold>Computer<br>Intelligence</u></bold></html>");
        compIntelLabel.setBounds(25,165,130,30);
        
        
        JLabel shipsNeededLabel = new JLabel();
        shipsNeededLabel.setText("<html><u><bold>Ships To Find:</u></bold></html>\"");
        shipsNeededLabel.setBounds(15, 230, 130, 15);
        
        
        
        add(gpsShips);
        add(gpsDifficulty);
        add(gpsCompIntel);
        
        add(shipsLabel);
        add(difficultyLabel);
        add(compIntelLabel);
        add(shipsNeededLabel);
       
        
        introPanel.ships.addActionListener(this);
        introPanel.compIntel.addActionListener(this);
        introPanel.difficulty.addActionListener(this);
        
        
        
        
    }

    public void actionPerformed (ActionEvent e)
    {
        Object obj = e.getSource();
        
         
        
        if(obj == introPanel.ships)
        {
            //int x = 0, y = 0;
            
            
            JComboBox ships = (JComboBox) e.getSource();
            shipsNumber = introPanel.ships.getSelectedItem().toString();
            gpsShips.setText(shipsNumber);
            System.out.println(introPanel.ships.getSelectedItem());
            System.out.println("this is working");
            
            /*
            JButton shipsChosen[] = new JButton[Integer.parseInt(shipsNumber)*3];
            
            for(int i = 0; i < Integer.parseInt(shipsNumber); i++)
            {
                
               
                //for(int ii = 0; ii < Integer.parseInt(shipsNumber); ii++)
                for(int ii = 0; ii < Integer.parseInt(shipsNumber); ii++)
                {
                    y = (ii*25) + 240;
                    for(int iii = 0; iii < 3; iii++)
                    {
                    shipsChosen[i*iii] = new JButton();
                    x = (iii*25) + 10;
                    shipsChosen[i].setBounds(x, y, 20, 20); 
                    add(shipsChosen[i*iii]);
                    }

                     
                }    
               
                 
              
                
            }
            
             */ 
            
        }
        
        if(obj == introPanel.compIntel)
        {
            JComboBox compIntel = (JComboBox) e.getSource();
            compIntelType = introPanel.compIntel.getSelectedItem().toString();
            gpsCompIntel.setText(compIntelType);
            System.out.println(introPanel.compIntel.getSelectedItem());
            System.out.println("this is working"); 
            
        }
                
        if(obj == introPanel.difficulty)
        {
            JComboBox difficulty = (JComboBox) e.getSource();
            difficultyLevel = introPanel.difficulty.getSelectedItem().toString();
            gpsDifficulty.setText(difficultyLevel);
            System.out.println(introPanel.difficulty.getSelectedItem());
            System.out.println("this is working");

        }
    }    
    
}
