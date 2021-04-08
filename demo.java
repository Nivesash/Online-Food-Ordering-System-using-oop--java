import java.awt.*;

import java.awt.event.*;

//import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.border.TitledBorder;

public class demo implements ActionListener {

JFrame f=new JFrame();

JLabel l0=new JLabel("******STUDENT RESULT PROCESS REPORT******");

JLabel l1=new JLabel(" * Student Name : ");

JLabel l2=new JLabel(" * Registration NO : ");

JLabel l4=new JLabel(" * Branch : ");

JLabel l3=new JLabel(" * Degree : ");

JLabel l5=new JLabel(" * Semester : ");

JLabel l6=new JLabel(" * Academic Year : ");

JLabel l7=new JLabel(" * Mark in HS8151: ");

JLabel l8=new JLabel(" * Mark in GE8151: ");

JLabel l9=new JLabel(" * Mark in GE8153: ");

JLabel l10=new JLabel(" * Mark in CH8151: ");

JLabel l11=new JLabel(" * Mark in PH8151: ");

JLabel l12=new JLabel(" * Mark in MA8151: ");

JLabel l13=new JLabel(" * Total CGPA: ");

JLabel l14=new JLabel(" * Credits :");

JLabel l15=new JLabel(" *Result :");

JLabel l16=new JLabel(" *Overall\nResult :");

JTextField t1=new JTextField(20);

JTextField t2=new JTextField(12);

JTextField t3=new JTextField(5);

JTextField t4=new JTextField(10);

JTextField t5=new JTextField(10);

JTextField t6=new JTextField(10);

JTextField t7=new JTextField(10);

JTextField t8=new JTextField(10);

JTextField t9=new JTextField(10);

JTextField t10=new JTextField(10);

JTextField t11=new JTextField(10);

String[] cs={"CSE","ECE","EEE","MECH","CIVIL"};

String[] ds={"B.E","M.E"};

String[] c={"NONE","1","2","3","4"};

String[] r={"Pass","U","UA"};

JComboBox cs1=new JComboBox(cs);

JComboBox ds1=new JComboBox(ds);

JComboBox c1=new JComboBox(c);

JComboBox c2=new JComboBox(c);

JComboBox c3=new JComboBox(c);

JComboBox c4=new JComboBox(c);

JComboBox c5=new JComboBox(c);

JComboBox c6=new JComboBox(c);

JComboBox r1=new JComboBox(r);

JComboBox r2=new JComboBox(r);

JComboBox r3=new JComboBox(r);

JComboBox r4=new JComboBox(r);

JComboBox r5=new JComboBox(r);

JComboBox r6=new JComboBox(r);

JComboBox r7=new JComboBox(r);
JButton jb=new JButton("SAVE");

JButton jb1=new JButton("CANCEL");

JButton jb2=new JButton("DISCARD");
JPanel p2=new JPanel();


public demo()

{

JFrame.setDefaultLookAndFeelDecorated(true);

l0.setBounds(250,20,500,50);

l1.setBounds(50,100,300,30);

l2.setBounds(50,150,300,30);

l4.setBounds(50,200,300,30);

l3.setBounds(50,250,300,30);

l5.setBounds(50,300,300,30);

l6.setBounds(50,350,300,30);

l7.setBounds(50,400,300,30);

l8.setBounds(50,450,300,30);

l9.setBounds(50,500,300,30);

l10.setBounds(50,550,300,30);

l11.setBounds(50,600,300,30);

l12.setBounds(50,650,300,30);

l13.setBounds(50,700,300,30);

l14.setBounds(600,350,175,30);

l15.setBounds(800,350,175,30);

l16.setBounds(600,700,175,30);

t1.setBounds(400,100,175,30);

t2.setBounds(400,150,175,30);

cs1.setSelectedIndex(0);

cs1.addActionListener(this);

ds1.setSelectedIndex(0);

c1.setSelectedIndex(0);

c2.setSelectedIndex(0);

c3.setSelectedIndex(0);

c4.setSelectedIndex(0);

c5.setSelectedIndex(0);

c6.setSelectedIndex(0);

r1.setSelectedIndex(0);

r2.setSelectedIndex(0);

r3.setSelectedIndex(0);

r4.setSelectedIndex(0);

r5.setSelectedIndex(0);

r6.setSelectedIndex(0);

r7.setSelectedIndex(0);

ds1.addActionListener(this);

c1.addActionListener(this);

c2.addActionListener(this);

c3.addActionListener(this);

c4.addActionListener(this);

c5.addActionListener(this);

c6.addActionListener(this);

r1.addActionListener(this);

r2.addActionListener(this);

r3.addActionListener(this);

r4.addActionListener(this);

r5.addActionListener(this);

r6.addActionListener(this);

r7.addActionListener(this);

cs1.setBounds(400,200,175,30);

ds1.setBounds(400,250,175,30);

c1.setBounds(600,400,175,30);

c2.setBounds(600,450,175,30);

c3.setBounds(600,500,175,30);

c4.setBounds(600,550,175,30);

c5.setBounds(600,600,175,30);

c6.setBounds(600,650,175,30);

r1.setBounds(800,400,175,30);

r2.setBounds(800,450,175,30);

r3.setBounds(800,500,175,30);

r4.setBounds(800,550,175,30);

r5.setBounds(800,600,175,30);

r6.setBounds(800,650,175,30);

r7.setBounds(800,700,175,30);

t3.setBounds(400,300,175,30);

t4.setBounds(400,350,175,30);

t5.setBounds(400,400,175,30);

t6.setBounds(400,450,175,30);

t7.setBounds(400,500,175,30);

t8.setBounds(400,550,175,30);

t9.setBounds(400,600,175,30);

t10.setBounds(400,650,175,30);

t11.setBounds(400,700,175,30);


jb.setBounds(0,0,200,40);
jb.addActionListener(this);
        
    

jb1.setBounds(350,800,200,40);

jb2.setBounds(650,800,200,40);

l0.setFont(new java.awt.Font("ArialBlack",Font.BOLD,19));

l0.setOpaque(true);

l0.setBackground(Color.pink);

l0.setForeground(Color.BLACK);

l1.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l1.setOpaque(true);

l1.setBackground(Color.gray);

l1.setForeground(Color.BLACK);

l2.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l2.setOpaque(true);

l2.setBackground(Color.gray);

l2.setForeground(Color.BLACK);

l4.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l4.setOpaque(true);

l4.setBackground(Color.gray);

l4.setForeground(Color.BLACK);

l3.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l3.setOpaque(true);

l3.setBackground(Color.gray);

l3.setForeground(Color.BLACK);

l5.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l5.setOpaque(true);

l5.setBackground(Color.gray);

l5.setForeground(Color.BLACK);

l6.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l6.setOpaque(true);

l6.setBackground(Color.gray);

l6.setForeground(Color.BLACK);

l7.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l7.setOpaque(true);

l7.setBackground(Color.gray);

l7.setForeground(Color.BLACK);

l8.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l8.setOpaque(true);

l8.setBackground(Color.gray);

l8.setForeground(Color.BLACK);

l9.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l9.setOpaque(true);

l9.setBackground(Color.gray);

l9.setForeground(Color.BLACK);

l10.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l10.setOpaque(true);

l10.setBackground(Color.gray);

l10.setForeground(Color.BLACK);

l11.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l11.setOpaque(true);

l11.setBackground(Color.gray);

l11.setForeground(Color.BLACK);

l12.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l12.setOpaque(true);

l12.setBackground(Color.gray);

l12.setForeground(Color.BLACK);

l13.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l13.setOpaque(true);

l13.setBackground(Color.gray);

l13.setForeground(Color.BLACK);

l14.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l14.setOpaque(true);

l14.setBackground(Color.gray);

l14.setForeground(Color.BLACK);

l15.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l15.setOpaque(true);

l15.setBackground(Color.gray);

l15.setForeground(Color.BLACK);

l16.setFont(new java.awt.Font("Arial",Font.BOLD,19));

l16.setOpaque(true);

l16.setBackground(Color.gray);

l16.setForeground(Color.BLACK);

jb.setFont(new java.awt.Font("Arial",Font.ITALIC,24));

jb.setOpaque(true);

jb.setBackground(Color.CYAN);

jb.setForeground(Color.BLUE);

jb1.setFont(new java.awt.Font("Arial",Font.ITALIC,24));

jb1.setOpaque(true);

jb1.setBackground(Color.CYAN);

jb1.setForeground(Color.BLUE);

jb2.setFont(new java.awt.Font("Arial",Font.ITALIC,24));

jb2.setOpaque(true);

jb2.setBackground(Color.CYAN);

jb2.setForeground(Color.BLUE);

TitledBorder b=new TitledBorder("STUDENT MARK SHEET");

b.setTitleJustification(TitledBorder.CENTER);

b.setTitlePosition(TitledBorder.TOP);


p2.setBackground(Color.pink);

p2.setBorder(b);

f.setTitle("STUDENT RESULT PROCESSING SYSTEM");
p2.setLayout(null);


p2.add(l0);

p2.add(l1);

p2.add(l2);

p2.add(l3);

p2.add(l4);

p2.add(l5);

p2.add(l6);

p2.add(l7);

p2.add(l8);

p2.add(l9);

p2.add(l10);

p2.add(l11);

p2.add(l12);

p2.add(l13);

p2.add(t1);

p2.add(t2);

p2.add(ds1);

p2.add(cs1);

p2.add(t3);

p2.add(t4);

p2.add(t5);

p2.add(t6);

p2.add(t7);

p2.add(t8);

p2.add(t9);

p2.add(t10);

p2.add(t11);

p2.add(jb);

p2.add(jb1);

p2.add(c1);

p2.add(c2);

p2.add(c3);

p2.add(c4);

p2.add(c5);

p2.add(c6);

p2.add(r1);

p2.add(r2);

p2.add(r3);

p2.add(r4);

p2.add(r5);

p2.add(r6);

p2.add(r7);

p2.add(l14);

p2.add(l15);

p2.add(l16);

p2.add(jb2);
f.add(p2);



f.setSize(1000,1000);

f.setVisible(true);

}
public void actionPerformed(ActionEvent ae) {
    JFrame f1=new JFrame();
                
                JTextArea txt=new JTextArea();
                txt.setColumns(20);
                txt.setRows(7);
                txt.setFont(new java.awt.Font("Castellar", 3, 22)); 

                txt.append("MARK STATEMENT OF "+t1.getText());
                txt.append("\n\nMARK IN ENG  :  "+t5.getText()+"\n"+"MARK IN ENG  :  "+t6.getText()+"\n"+"MARK IN ENG  :  "+t7.getText()+"\n"+"MARK IN ENG  :  "+t8.getText()+"\n"+"MARK IN ENG  :  "+t9.getText()+"\n"+"MARK IN ENG  :  "+t10.getText()+"\n");
                int i=Integer.parseInt(t5.getText());
                int j=Integer.parseInt(t5.getText());
                int k=Integer.parseInt(t5.getText());
                int l=Integer.parseInt(t5.getText());
                int m=Integer.parseInt(t5.getText());
                int n=Integer.parseInt(t5.getText());
                
                int total=i+j+k+l+m+n;
                int avg=total/6;
                
                txt.append("\nTOTAL MARK  :  "+total+"\nAVERAGE MARK   :  "+avg);
                f1.add(txt);
                f1.setSize(1000,1000);
                f1.setVisible(true);
                     f1.setLayout(null);

                
}


public static void main(String args[])

{

new demo();

}

    

}