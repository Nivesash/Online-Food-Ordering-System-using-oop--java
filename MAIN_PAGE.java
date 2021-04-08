import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MAIN_PAGE {
    JLabel Ltitle,Lpic;
    static JPanel Panel;
    public static  JButton Bcart,Blogout,Blogin,Buser_details,Bnonveg,Bindian,Bdessert,Bchinese;
    static JFrame f=new JFrame();
    
    MAIN_PAGE(){    
        Bcart=new JButton();
        Blogout=new JButton();
        Blogin=new JButton();
        Bnonveg=new JButton();
        Bindian=new JButton();
        Bdessert=new JButton();
        Bchinese=new JButton();
        Buser_details=new JButton();

         Panel=new JPanel(null);
         Ltitle=new JLabel();
         Lpic=new JLabel();
           
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        
        Bcart.setFont(new Font("Castellar",1, 11)); 
        Bcart.setText("CART");
        Panel.add(Bcart);
        Bcart.setBounds(1100, 110, 100, 40);
        Bcart.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent cart) {
             JFrame f1=new JFrame();
             try  {
                JScrollPane jScrollPane2=new JScrollPane();
                f1.setLayout(null);
                f1.setSize(1000,1000);
                f1.setVisible(true);
              
                RESTAURANT.txtarea.setColumns(20);
                RESTAURANT.txtarea.setRows(5);
                RESTAURANT.txtarea.setEditable(false);
                jScrollPane2.setViewportView(RESTAURANT.txtarea);
                f1.add(jScrollPane2);
                jScrollPane2.setBounds(280, 130, 420, 320);   
              }
              catch(Exception ae){
                  JOptionPane.showMessageDialog(f,"SORRY! NOTHING TO SHOW IN CART!.");
                  f1.dispose();
             }
            }
        });

        Blogout.setFont(new Font("Castellar", 1, 11)); 
        Blogout.setText("LOG OUT");
        Blogout.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
           int choice=JOptionPane.showConfirmDialog(f,"ARE YOU SURE YOU WANT TO LOGOUT?");   
           if(choice==0)   //if pressed "yes"
           {      Blogin.setText("LOGIN"); 
                  Panel.remove(Buser_details);   }
            }
        });
        Panel.add(Blogout);
        Blogout.setBounds(970, 110, 100, 40);

        Blogin.setFont(new Font("Castellar", 1, 11)); 
        Blogin.setText("LOGIN");
        Blogin.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent login) {
              new LOG_IN_FORM();         }
        });
        Panel.add(Blogin);
        Blogin.setBounds(750, 110,180, 40);

        Ltitle.setFont(new java.awt.Font("Curlz MT", 3, 50)); 
        Ltitle.setForeground(Color.white);
        Ltitle.setHorizontalAlignment(SwingConstants.CENTER);
        Ltitle.setText("ONLINE FOOD ORDERING SYSTEM");
        Panel.add(Ltitle);
        Ltitle.setBounds(200, 10, 880, 70);

       Bnonveg.setFont(new Font("Castellar", 1, 14)); 
        Bnonveg.setIcon(new ImageIcon("C:\\Users\\shiva\\OneDrive\\Desktop\\mini pic\\nonveg.jpg")); 
         Bnonveg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent nonveg) {
               //NON-VEG
               CUISINES.nonveg();
            }
        });
        Panel.add(Bnonveg);
        Bnonveg.setBounds(760, 220, 210, 180);

        Bindian.setFont(new Font("Castellar", 1, 14)); 
        Bindian.setIcon(new javax.swing.ImageIcon("C:\\Users\\shiva\\OneDrive\\Desktop\\mini pic\\indian-cuisine-traditional-spices-and-dishes-text-vector-22709563.jpg")); // NOI18N
        Bindian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent veg) {
               // VEG
               CUISINES.veg();
            }
        });
        Panel.add(Bindian);
        Bindian.setBounds(320, 220, 230, 180);

        Bdessert.setFont(new Font("Castellar", 1, 14)); 
        Bdessert.setIcon(new ImageIcon("C:\\Users\\shiva\\OneDrive\\Desktop\\mini pic\\patisserie-dessert-emblem-muffin-sketch-icon-vector-11212389.jpg")); // NOI18N
         Bdessert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent desrt) {
               // DESSERT
               CUISINES.dessert();
            }
        });
        Panel.add(Bdessert);
        Bdessert.setBounds(770, 450, 180, 200);

        Bchinese.setFont(new java.awt.Font("Castellar", 1, 14)); 
        Bchinese.setIcon(new ImageIcon("C:\\Users\\shiva\\OneDrive\\Desktop\\mini pic\\chinese-cuisine-logo-design-authentic-traditional-vector-21183775.jpg")); // NOI18N
         Bchinese.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent chinse) {
               // CHINESE
               CUISINES.chinese();
            }
        });
        Panel.add(Bchinese);
        Bchinese.setBounds(330, 460, 230, 180);

        Lpic.setIcon(new ImageIcon("C:\\Users\\shiva\\OneDrive\\Desktop\\dream-3840x2160-anime-girl-breeze-magic-evening-girly-4k-18058.jpg"));  //BACKGROUND IMAGE
        Panel.add(Lpic);
        Lpic.setBounds(0, 0, 1890, 990);

        f.add(Panel);
        Panel.setBounds(0, 0, 2000, 1000);    
}
    
 public static void main(String[] args) {
      new MAIN_PAGE();
      f.setSize(2000,1000);
      f.setVisible(true);
      f.setLayout(null);
    }   
}