//***********************************************************
// VoteCounterPanel.java
//
// Panel for the GUI that tallies votes for two candidates,
// Joe and Sam.
//*********************************************************** 
import java.awt.*;
import java.awt.event.*;
import javax.swing. *; 

public class VoteCounterPanel extends JPanel
{ 
        private int votesForJoe;
        private JButton joe;
        private JLabel labelJoe;
        private int votesForSam;
        private JButton sam;
        private JLabel labelSam;
        
    
        //-------------------------------------------------
        // Constructor: Sets up the GUI.
        //-------------------------------------------------
        public VoteCounterPanel()
        {        
            votesForJoe = 0; 
            
            joe = new JButton("Vote for Joe");
            joe.addActionListener(new VoteButtonListener1()); 
            
            labelJoe = new JLabel("Votes for Joe: " + votesForJoe); 
            
            add(joe);
            add(labelJoe); 
                     
            votesForSam = 0; 
            
            sam = new JButton("Vote for sam");
            sam.addActionListener(new VoteButtonListener2()); 
            
            labelSam = new JLabel("Votes for Sam: " + votesForSam); 
            
            add(sam);
            add(labelSam); 
            
            if (votesForJoe > votesForSam){
                System.out.println("Joe is winning");
            }
            else{
                System.out.println("Sam is winning");
            }
           
            setPreferredSize(new Dimension(600, 80));
            setBackground(Color.cyan);
        }
        //**************************************************
        // Represents a listener for button push (action) events
        //**************************************************
        private class VoteButtonListener1 implements ActionListener
        { 
            //----------------------------------------------
            // Updates the appropriate vote counter when a
            // button is pushed for one of the candidates.
            //----------------------------------------------
            public void actionPerformed(ActionEvent event)
            { 
                votesForJoe++;
                labelJoe.setText("Votes for Joe: " + votesForJoe);
              
            }
        }
        private class VoteButtonListener2 implements ActionListener
        { 
            //----------------------------------------------
            // Updates the appropriate vote counter when a
            // button is pushed for one of the candidates.
            //----------------------------------------------
            public void actionPerformed(ActionEvent event)
            { 
                votesForSam++;
                labelSam.setText("Votes for Sam: " + votesForSam);
            }
        }
    }
        