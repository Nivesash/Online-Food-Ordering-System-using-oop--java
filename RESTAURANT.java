import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class RESTAURANT {
   static JLabel L_hotelLogo,L_title,L_rupees,L_food_logo,L_quantity;
   static JComboBox starterCombo,soupCombo,mainCombo,Combos,partaCombo,iceCombo,sandwichCombo,burgerCombo,cakeCombo,beverageCombo;
   static    JButton B_cart,B_order,B_del;
   static  JTextArea txtarea;
   JScrollPane SP;
   JSpinner spinner;
   static int amount,total=0,count=1;
   static String prevS="STARTER",prevS1="SOUP",prevS2="MAIN COURSE",prevS3="COMBOS",prevS4="PAROTTA";
   static String prevS5="ICE CREAM",prevS6="SANDWICH",prevS7="BURGER",prevS8="ICE-CREAM CAKE",prevS9="BEVERAGE";
   
   public RESTAURANT(ActionEvent obj,JFrame f){  //frame f is passed so that new frame is created everytime(to avoid overlapping)
       L_title=new JLabel();
       L_rupees=new JLabel();
       L_hotelLogo=new JLabel();
       L_food_logo=new JLabel();
       L_quantity=new JLabel();
       
       starterCombo=new JComboBox();
       soupCombo=new JComboBox();
       mainCombo=new JComboBox();
       Combos=new JComboBox();
       partaCombo=new JComboBox();
       iceCombo=new JComboBox();
       sandwichCombo=new JComboBox();
       burgerCombo=new JComboBox();
       cakeCombo=new JComboBox();
       beverageCombo=new JComboBox();

       B_cart=new JButton();
       B_order=new JButton();
       B_del=new JButton();
       txtarea=new JTextArea();
       SP=new JScrollPane();
       spinner=new JSpinner();       
          
       f.setLayout(null);
       f.setSize(2000,2000);
       f.setVisible(true);
       //   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//---- IF INCLUDED,IT WILL CLOSE ALL THE PROGRAM     
       f.add(L_hotelLogo);
       L_hotelLogo.setBounds(1010, 60, 250, 200);
        
       L_title.setFont(new Font("Curlz MT",1,36));     
       L_title.setText("WELCOME TO HOTEL "+obj.getActionCommand());
       f.add(L_title);
       L_title.setBounds(310, 20, 800, 60);
       
       spinner.setBounds(350, 580, 50, 30);
       f.add(spinner);

       B_cart.setText("add to cart");
       f.add(B_cart);
       B_cart.setBounds(580, 570, 100, 40);
       B_cart.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent addToCart) {
           Random rand=new Random();
           int normRate=rand.nextInt((150-60)+1)+60;
        
           L_rupees.setText(String.valueOf(normRate));
           int i=(Integer)spinner.getValue();
           if(i!=0){
              normRate=i*normRate;
          }
          total=total+normRate;               
           new ADD_TO_CART(normRate);        }
        });
       

       L_rupees.setText("AMOUNT");
       L_rupees.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
       f.add(L_rupees);
       L_rupees.setBounds(160, 570, 80, 40);
       
       txtarea.setColumns(20);
       txtarea.setRows(5);
       txtarea.setText("ITEM\tNAME\t\t    AMOUNT\n");
       txtarea.setEditable(false);
       SP.setViewportView(txtarea);
       f.add(SP);
       SP.setBounds(920, 270, 360, 340);

       L_food_logo.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
       f.add(L_food_logo);
       L_food_logo.setBounds(300, 290, 260, 210);

       B_order.setText("ORDER");
       B_order.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent evt) {
           if(total!=0)
           {
              int choice=JOptionPane.showConfirmDialog(f,"TOTAL AMOUNT : "+total+" \nPROCEED TO ORDER ONLINE?"); 
              try {
                if(choice==0)   //if pressed "yes"
                   JOptionPane.showMessageDialog(f,"YOUR ORDER WILL ARRIVE SOON TO LOCATION  \""+LOG_IN_FORM.TF_adrs.getText()+" \"");
                   f.dispose();
              }
              catch(NullPointerException ae){
                   JOptionPane.showMessageDialog(f,"PLEASE LOG-IN TO ORDER FOOD ONLINE");
                   f.dispose();
              }
           }  
         }
       });
       f.add(B_order);
       B_order.setBounds(1040, 620, 140, 50);

       B_del.setText("DELETE");
       f.add(B_del);
       B_del.setBounds(440, 570, 110, 40);
        B_del.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent evt) {
               txtarea.replaceRange(null, 0, '\n');
             
         }
       });
    
       L_quantity.setText("QUANTITY");
       f.add(L_quantity);
       L_quantity.setBounds(290, 580, 60, 20);        
   }

   public static void forchopstix(ActionEvent obj) {
        JFrame f=new JFrame();
        new RESTAURANT(obj,f);

        starterCombo.setModel(new DefaultComboBoxModel<>(new String[] { "STARTER", " ", "Paneer Chettinad", "Chicken Lollipop", "Nandu Lollipop\t", "French Fries\t", "Chicken Boneless" }));
        f.add(starterCombo);
        starterCombo.setBounds(30, 120, 140, 30);

        soupCombo.addItem("SOUP");
        soupCombo.addItem(" ");
        soupCombo.addItem("Sweet Corn Soup");
        soupCombo.addItem("Spicy Chicken Soup");
        f.add(soupCombo);
        soupCombo.setBounds(260, 120, 130, 30);

        mainCombo.setModel(new DefaultComboBoxModel<>(new String[] { "MAIN COURSE", " ", "Veg Biryani\t", "Chicken Biriyani", "Veg Noodles\t", "Chicken Noodles", "Schezwan Chicken Fried Rice" }));
        f.add(mainCombo);
        mainCombo.setBounds(480, 120, 140, 30);

        Combos.setModel(new DefaultComboBoxModel<>(new String[] { "COMBOS", " ", "combo1\t", "combo2\t", "combo3\t" }));
        f.add(Combos);
        Combos.setBounds(720, 120, 130, 30);    
   } 

   public static void forUPABOVE(ActionEvent obj) {
        JFrame f=new JFrame();
        new RESTAURANT(obj,f);
         
        starterCombo.setModel(new DefaultComboBoxModel<>(new String[] { "STARTER", " ", "Fish Fingers\t", "Chicken Wings\t", "Chicken Sizzler\t", "Dragon Chicken", "Majura Chicken\t" }));
        f.add(starterCombo);
        starterCombo.setBounds(30, 120, 140, 30);

        soupCombo.setModel(new DefaultComboBoxModel<>(new String[] { "SOUP", " ", "Sweet Corn Soup", "Vegetable Soup" }));
        f.add(soupCombo);
        soupCombo.setBounds(260, 120, 130, 30);

        mainCombo.setModel(new DefaultComboBoxModel<>(new String[] { "MAIN COURSE", " ", "Chicken Noodles", "Mutton Yancho Fried Rice", "Schezwan Chicken Fried Rice", "Chicken Burned Garlic Fried Rice", "Chicken American Chow Mein" }));
        f.add(mainCombo);
        mainCombo.setBounds(480, 120, 140, 30);

        Combos.setModel(new DefaultComboBoxModel<>(new String[] { "COMBOS" ," ","combo\t","combo4\t" }));
        f.add(Combos);
        Combos.setBounds(720, 120, 130, 30); 
   } 

   public static void forKANNANAM(ActionEvent obj) {
        JFrame f=new JFrame();
        new RESTAURANT(obj,f);
      
        partaCombo.setModel(new DefaultComboBoxModel<>(new String[] { "PAROTTA", " ", "Plain Parotta\t", "Ennai Parotta\t" }));
        f.add(partaCombo);
        partaCombo.setBounds(90, 130, 140, 30);

        mainCombo.setModel(new DefaultComboBoxModel<>(new String[] { "MAIN COURSE", " ", "Full Meals (Unlimited)", "Nattu Kozhi Biryani", "Mutton Biriyani\t" }));
        f.add(mainCombo);
        mainCombo.setBounds(390, 130, 140, 30); 
   }  

   public static void forA2B(ActionEvent obj) {
        JFrame f=new JFrame();
        new RESTAURANT(obj,f);
  
        starterCombo.setModel(new DefaultComboBoxModel<>(new String[] { "STARTER", " ", "Paneer 65\t", "Parotta\t", "Veg Hot Dog\t", "Gobi Manchurian" }));
        f.add(starterCombo);
        starterCombo.setBounds(90, 130, 140, 30);

        mainCombo.setModel(new DefaultComboBoxModel<>(new String[] { "MAIN COURSE", " ", "Veg Noodles\t", "Mushroom Fried Rice", "Full Meals(Unlimited)" }));
        f.add(mainCombo);
        mainCombo.setBounds(390, 130, 140, 30);

        iceCombo.setModel(new DefaultComboBoxModel<>(new String[] { "ICE CREAM", " ", "Cola Juice Pop", "Orange Juice Pop", "Strawberry Juice Pop" }));
        f.add(iceCombo);
        iceCombo.setBounds(700, 130, 130, 30);
   }

   public static void forIBACO(ActionEvent obj) {
        JFrame f=new JFrame();
        new RESTAURANT(obj,f);
         
        starterCombo.setModel(new DefaultComboBoxModel<>(new String[] { "STARTER", " ", "Paneer 65\t", "Paneer Chettinad", "Fish Fingers\t", "Nandu Lollipop\t", "French Fries\t", "Chicken Boneless" }));
        f.add(starterCombo);
        starterCombo.setBounds(30, 120, 140, 30);

        soupCombo.setModel(new DefaultComboBoxModel<>(new String[] { "SOUP", " ", "Sweet Corn Soup", "Vegetable Soup" }));
        f.add(soupCombo);
        soupCombo.setBounds(260, 120, 130, 30);

        beverageCombo.setModel(new DefaultComboBoxModel<>(new String[] { "BEVERAGE", " ", "Vanilla Milkshake", "Mango Milkshake", "Chocolate Milkshake", "Strawberry Milkshake" }));
        f.add(beverageCombo);
        beverageCombo.setBounds(480, 120, 140, 30);

        cakeCombo.setModel(new DefaultComboBoxModel<>(new String[] { "ICE-CREAM CAKE" , " " ,"Swiss Choco Symphony","Butterscotch Almond Amore","Blueberry Cheese" }));
        f.add(cakeCombo);
        cakeCombo.setBounds(720, 120, 130, 30);
   } 

   public static void forTHALAPA(ActionEvent obj) {
         JFrame f=new JFrame();
         new RESTAURANT(obj,f);
         
        starterCombo.setModel(new DefaultComboBoxModel<>(new String[] { "STARTER", " ", "Ennai Parotta\t", "Chicken Boneless", "Chicken Chettinad", "Mutton Chukka\t", "Pepper Chicken Dry", "Tandoori Chicken" }));
        f.add(starterCombo);
        starterCombo.setBounds(90, 130, 140, 30);
   
        mainCombo.setModel(new DefaultComboBoxModel<>(new String[] { "MAIN COURSE", " ", "Veg Biryani\t", "Egg Biriyani\t", "Chicken Biriyani", "Chicken 65 Biriyani", "Mutton Biriyani\t", "Nattu Kozhi Biryani", "Full Meals(Unlimited)" }));
        f.add(mainCombo);
        mainCombo.setBounds(390, 130, 140, 30);
        
        Combos.setModel(new DefaultComboBoxModel<>(new String[] { "COMBOS" ," ","combo5\t","combo6\t"}));
        f.add(Combos);
        Combos.setBounds(700, 130, 130, 30); 
   } 

   public static void forANNAPORNA(ActionEvent obj){
        JFrame f=new JFrame();
        new RESTAURANT(obj,f);
      
        starterCombo.setModel(new DefaultComboBoxModel<>(new String[] { "STARTER", " ", "Paneer 65\t", "Paneer Chettinad", "Gobi Manchurian","Chappathi\t" }));
        f.add(starterCombo);
        starterCombo.setBounds(90, 130, 140, 30);
       
        mainCombo.setModel(new DefaultComboBoxModel<>(new String[] { "MAIN COURSE", " ", "Curd Rice\t", "Lemon Rice\t", "Tomato Rice\t", "Veg Biryani\t", "Veg Noodles\t", "Full Meals(Unlimited)" }));
        f.add(mainCombo);
        mainCombo.setBounds(390, 130, 140, 30);
        
        Combos.setModel(new DefaultComboBoxModel<>(new String[] { "COMBOS" ," ","combo7\t","combo8\t"}));
        f.add(Combos);
        Combos.setBounds(700, 130, 130, 30); 
   }

   public static void forPUPPY(ActionEvent obj) {
        JFrame f=new JFrame();
        new RESTAURANT(obj,f);
      
        starterCombo.setModel(new DefaultComboBoxModel<>(new String[] { "STARTER", " ", "French Fries\t", "Chicken Nuggets", "Chicken Cheese Ball", "Chicken Chilli Club" }));
        f.add(starterCombo);
        starterCombo.setBounds(30, 120, 140, 30);

        sandwichCombo.setModel(new DefaultComboBoxModel<>(new String[] { "SANDWICH", " ", "Veg Sandwich\t", "Egg Sandwich\t", "Chicken Tikka Sandwich" }));
        f.add(sandwichCombo);
        sandwichCombo.setBounds(260, 120, 130, 30);

        burgerCombo.setModel(new DefaultComboBoxModel<>(new String[] { "BURGER", " ", "Veg Burger\t", "Cheese Burger\t", "Chicken Burger\t" }));
        f.add(burgerCombo);
        burgerCombo.setBounds(480, 120, 140, 30);

        cakeCombo.setModel(new DefaultComboBoxModel<>(new String[] { "ICE-CREAM CAKE", " ", "Fruit 'N' Blackcurrant Drizzle" , "Mango Italian Fiesta"}));
        f.add(cakeCombo);
        cakeCombo.setBounds(720, 120, 130, 30);
   } 
}