                                                   // LOG IN FORM
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LOG_IN_FORM extends JFrame implements ActionListener {
    Label L_name,L_phone,L_id,L_pwd,L_adrs;
    static JTextField TF_name,TF_phone,TF_id,TF_adrs;
    TextField TF_pwd;
    Panel p1,p2,p3,p4,p5,p6;
    Button B_submit;
    JPasswordField Tpwd;
  
    public LOG_IN_FORM(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        setVisible(true);     
        setSize(2000,1000) ; 
        setLayout(new GridLayout(6,1));
        L_name=new Label("NAME");
        L_phone=new Label("PHONE NO.");
        L_id=new Label("MAIL ID");
        L_pwd=new Label("PASSWORD");
        L_adrs=new Label("ADDRESS");
        
        TF_name=new JTextField(20);     
        TF_phone=new JTextField(20); 
        TF_id=new JTextField(20);
       // TF_pwd=new JPasswordField(15);  
        TF_pwd=new TextField(20);   TF_pwd.setEchoChar('*');
        TF_adrs=new JTextField(30);     
       
        TF_name.setToolTipText("Enter your name");                //setToolTipText() is available in JTextfield
        TF_phone.setToolTipText("Enter your phone Number");
        TF_id.setToolTipText("Enter your mail address");
      //  TF_pwd.setToolTipText("Enter your Mail id Password");
        TF_adrs.setToolTipText("Enter Your Address"); 
  
        B_submit=new Button("SUBMIT");
 
        p1=new Panel(new FlowLayout()); p2=new Panel(new FlowLayout()); p3=new Panel(new FlowLayout());
        p4=new Panel(new FlowLayout()); p5=new Panel(new FlowLayout()); p6=new Panel(new FlowLayout());
       
        p1.add(L_name);    p1.add(TF_name);       
        p2. add(L_phone);  p2.add(TF_phone);
        p3.add(L_id);      p3.add(TF_id);
        p4.add(L_pwd);     p4.add(TF_pwd);
        p5.add(L_adrs);    p5.add(TF_adrs);
        p6.add(B_submit);
       
        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.CYAN);
        p3.setBackground(Color.CYAN);
        p4.setBackground(Color.CYAN);
        p5.setBackground(Color.CYAN);
        p6.setBackground(Color.CYAN);
        
        add(p1); add(p2); add(p3); add(p4); add(p5); add(p6);
      
        B_submit.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae){         //SUBMIT Button
        String str=TF_adrs.getText(); //address textField
          if(str.equals(""))
               JOptionPane.showMessageDialog(this,"KINDLY FILL-IN ADDRESS FIELD");
          else
          { 
             MAIN_PAGE.Buser_details.setFont(new Font("Castellar", 1, 11)); 
             MAIN_PAGE.Buser_details.setText("USER DETAILS");
             MAIN_PAGE.Panel.add(MAIN_PAGE.Buser_details);
             MAIN_PAGE.Buser_details.setBounds(1230, 110, 150, 40);
             MAIN_PAGE.Buser_details.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent userDetails) {
             JTextArea TA_user=new JTextArea();
             JLabel label=new JLabel();
             JScrollPane SP_user=new JScrollPane();
             JFrame f=new JFrame();
             f.setLayout(null);
             
             label.setFont(new java.awt.Font("Curlz MT", 1, 50)); 
             label.setText("MY ACCOUNT");
             f.add(label);
             label.setBounds(310, 20, 640, 60);
             
             TA_user.setColumns(20);
             TA_user.setRows(5);
             Font font=new Font("Algerian", 3, 15);
             TA_user.setFont(font);
             TA_user.setText("\nUSER NAME  :  "+TF_name.getText()+"\n\nPHONE NUMBER  :  "+TF_phone.getText()+"\n\nLOGGED IN AS  :  "+TF_id.getText()+"\n\nLOCATION  :  "+TF_adrs.getText());
             TA_user.setEditable(false);
             SP_user.setViewportView(TA_user);
             SP_user.setBounds(280, 130, 450, 320);
             f.add(SP_user);
             f.setSize(1000,1000);
             f.setVisible(true);
          }
        });
        MAIN_PAGE.Blogin.setText("USER: "+TF_name.getText());     //setText(str) is available only for JButton not for Button
        dispose();                                                                  //so we can use setLabel() in awt Button
      }      
   }
}