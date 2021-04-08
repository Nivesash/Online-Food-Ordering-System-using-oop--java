import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CUISINES {
    public static JButton b1,b2;
       static JTextArea TA1=new JTextArea();
       static JTextArea TA2=new JTextArea();
       static JScrollPane SP1=new JScrollPane();
       static JScrollPane SP2=new JScrollPane(); 
   public CUISINES(){
        TA2.setColumns(20);
        TA2.setRows(5);
        TA2.setEditable(false);
        SP2.setViewportView(TA2);
        TA1.setColumns(20);
        TA1.setRows(5);
        TA1.setEditable(false);
        SP1.setViewportView(TA1);
    }
  
    public static void chinese(){  
       new CUISINES();
        JFrame f1=new JFrame();  
        f1.setLayout(null);

        b1=new JButton("CHOP STIX");
        b2=new JButton("ABOVE AND BEYOND");
    
        b1.setIcon(new ImageIcon("C:\\Users\\shiva\\OneDrive\\Desktop\\mini pic\\chopstix.jpg"));
        b1.setToolTipText("Rating: 4.9");
        b1.setBounds(180, 90, 190, 190);
        f1.add(b1);
           b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent chopstix) {
               RESTAURANT.forchopstix(chopstix);  
               RESTAURANT.L_hotelLogo.setIcon(b1.getIcon());   }
        });
        
        TA2.setText("13 Minutes  \n\nChinese and Korean continental Mix\nwith Indian touch. \n\nNear By-Pass Road , Madurai-16.");
        SP2.setBounds(130, 370, 290, 160);
        f1.add(SP2);
        
        b2.setIcon(new ImageIcon("C:\\Users\\shiva\\OneDrive\\Desktop\\mini pic\\hotchinese.jpg"));
        b2.setToolTipText("Rating: 3.2");
        b2.setBounds(640, 60, 240, 240);
        f1.add(b2);
        b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent upAbove) {
            RESTAURANT.forUPABOVE(upAbove);
        RESTAURANT.L_hotelLogo.setIcon(b2.getIcon());  }
        });
        
        TA1.setText("47 Minutes  \n\nTraditional Chinese Cuisine.  \n\nNear Ponmeni Main Road , Madurai.");
        f1.add(SP1);        
        SP1.setBounds(630, 370, 270, 160);

        f1.setSize(1000,1000);
        f1.setVisible(true);
    }
    
    public static void veg(){   
       new CUISINES();
       JFrame f2=new JFrame();
       f2.setLayout(null);
     
       b1=new JButton("ANNAPOORNA");
       b2=new JButton("ADAYAR ANANDHA BHAVAN");
    
       b1.setIcon(new ImageIcon("C:\\Users\\shiva\\OneDrive\\Desktop\\mini pic\\annapoorna.jpg")); 
       b1.setToolTipText("Rating: 4.3");
       f2.add(b1);
       b1.setBounds(100, 60, 240, 180);
       b1.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent annaporna) {
           RESTAURANT.forANNAPORNA(annaporna); 
           RESTAURANT.L_hotelLogo.setIcon(b1.getIcon());  }
        });
       b2.setIcon(new ImageIcon("C:\\Users\\shiva\\OneDrive\\Desktop\\mini pic\\a2b.jpg"));
       b2.setToolTipText("Rating: 3.3");
       f2.add(b2);
       b2.setBounds(510, 40, 210, 200);
       b2.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent a2b) {
           RESTAURANT.forA2B(a2b);
           RESTAURANT.L_hotelLogo.setIcon(b2.getIcon());  }
        });
     
       TA1.setText("32 Minutes  \n\nBest South Indian Savour  \n\nNear North Veli Street,Madurai.");
       SP1.setBounds(480, 320, 270, 160);
       f2.add(SP1);
       
       TA2.setText("21 Minutes  \n\nHeritage of Good and \nHealthy Food in South India.  \n\nNear New By-Pass Road,Madurai-16.");
       SP2.setBounds(80, 320, 270, 160);          
       f2.add(SP2);

       f2.setSize(1000,1000);
       f2.setVisible(true);
    }
    
    public static void nonveg(){ 
       new CUISINES();
       JFrame f3=new JFrame();
       f3.setLayout(null);
  
       b1=new JButton("THALAPAKATTU BIRIYANI");
       b2=new JButton("KANNANAM");
    
       b1.setIcon(new ImageIcon("C:\\Users\\shiva\\OneDrive\\Desktop\\mini pic\\thalapa.jpg"));
       b1.setToolTipText("Rating: 3.9");
       b1.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent thalapa) {
           RESTAURANT.forTHALAPA(thalapa); 
       RESTAURANT.L_hotelLogo.setIcon(b1.getIcon());   }
        });
        f3.add(b1);
        b1.setBounds(140, 50, 170, 200);

        b2.setIcon(new ImageIcon("C:\\Users\\shiva\\OneDrive\\Desktop\\mini pic\\nonveg2.jpg")); 
        b2.setToolTipText("Rating: 3.9");
       // b2.setSelected(true);----- IT MAKES THE TEXT SELECTED WHILE ENTERING THE PAGE 
        f3.add(b2);
        b2.setBounds(500, 20, 240, 240);
        b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent kananam) {
             RESTAURANT.forKANNANAM(kananam); 
         RESTAURANT.L_hotelLogo.setIcon(b2.getIcon());  }
        });
        
        TA1.setText("8 Minutes  \n\nExperience Traditional \nSouth Indian Food.  \n\nNear Rainbow Colony, Madurai.");
        SP1.setBounds(490, 300, 270, 160);
        f3.add(SP1);

        TA2.setText("10 Minutes  \n\nSavor of Tamil Nadu.  \n\nNear Bye-Pass Road , Madurai-16.");
        SP2.setBounds(100, 300, 270, 160);
        f3.add(SP2);
                
        f3.setSize(1000,1000);
        f3.setVisible(true);
    }
    
    public static void dessert(){
       new CUISINES();
        JFrame f4=new JFrame();
        f4.setLayout(null);

        b1=new JButton("PUPPY'S");
        b2=new JButton("IBACO");
    
        b1.setIcon(new ImageIcon("C:\\Users\\shiva\\OneDrive\\Desktop\\mini pic\\puppy.jpg")); 
        b1.setToolTipText("Rating: 4.2");
        b1.setBounds(90, 70, 190, 190);
        f4.add(b1);
        b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent pupy) {
            RESTAURANT.forPUPPY(pupy);  
        RESTAURANT.L_hotelLogo.setIcon(b1.getIcon());  }
        });

        b2.setIcon(new ImageIcon("C:\\Users\\shiva\\OneDrive\\Desktop\\mini pic\\ibaco.jpg")); 
        b2.setToolTipText("Rating: 4.6");
        b2.setBounds(500, 40, 240, 240);
        f4.add(b2);
        b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ibco) {
            RESTAURANT.forIBACO(ibco); 
          RESTAURANT.L_hotelLogo.setIcon(b2.getIcon()); }
        });
        
        TA1.setText("29 Minutes  \n\nFresh Breads and Tasty Creams.  \n\nNear By-Pass Road , Madurai-16.");
        SP1.setBounds(50, 310, 270, 160);
        f4.add(SP1);

        TA2.setText("21 Minutes  \n\nFresh and Tasty IceCream Cakes.  \n\nNear K.K.Nagar , Madurai-16.");
        TA2.setBounds(490, 310, 270, 160);
        f4.add(TA2);
                
        f4.setSize(1000,1000);
        f4.setVisible(true);
    }  
}