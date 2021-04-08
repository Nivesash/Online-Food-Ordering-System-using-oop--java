public class ADD_TO_CART {
  
   ADD_TO_CART(int normRate) {
     String s=(String)RESTAURANT.starterCombo.getSelectedItem();
     String s1=(String)RESTAURANT.soupCombo.getSelectedItem();
     String s2=(String)RESTAURANT.mainCombo.getSelectedItem();
     String s3=(String)RESTAURANT.Combos.getSelectedItem();
     String s4=(String)RESTAURANT.partaCombo.getSelectedItem();
     String s5=(String)RESTAURANT.iceCombo.getSelectedItem();
     String s6=(String)RESTAURANT.sandwichCombo.getSelectedItem();
     String s7=(String)RESTAURANT.burgerCombo.getSelectedItem();
     String s8=(String)RESTAURANT.cakeCombo.getSelectedItem();
     String s9=(String)RESTAURANT.beverageCombo.getSelectedItem();
     
     new FOODLABEL(s,s1,s2,s3,s4,s5,s6,s7,s8,s9);
     
    if(s!=null)    // JUST NOT TO THROW NULLPOINTEREXCEPTION
     if(!(s.equals("STARTER")))
     {
         if(!(RESTAURANT.prevS.equals(s)))
         {
             RESTAURANT.prevS=s;
             RESTAURANT.txtarea.append(RESTAURANT.count+"\t"+s+"\t       "+normRate+"#\n");
             RESTAURANT.count++; 
         }
     }
    if(s1!=null)
      if(!(s1.equals("SOUP")))
      {
         if(!(RESTAURANT.prevS1.equals(s1)))
         {
             RESTAURANT.prevS1=s1;
             RESTAURANT.txtarea.append(RESTAURANT.count+"\t"+s1+"\t       "+normRate+"\n");
             RESTAURANT.count++; 
         }
      }
    if(s2!=null)
       if(!(s2.equals("MAIN COURSE")))
       {
         if(!(RESTAURANT.prevS2.equals(s2)))
         {
             RESTAURANT.prevS2=s2;
             RESTAURANT.txtarea.append(RESTAURANT.count+"\t"+s2+"\t       "+normRate+"\n");
             RESTAURANT.count++; 
         }
       }
    if(s3!=null)
        if(!(s3.equals("COMBOS")))
        {
          if(!(RESTAURANT.prevS3.equals(s3)))
          {
              RESTAURANT.prevS3=s3;
              RESTAURANT.txtarea.append(RESTAURANT.count+"\t"+s3+"\t       "+normRate+"\n");
              RESTAURANT.count++; 
          }
        }
    if(s4!=null)
        if(!(s4.equals("PAROTTA")))
        {
          if(!(RESTAURANT.prevS4.equals(s4)))
         {
              RESTAURANT.prevS4=s4;
              RESTAURANT.txtarea.append(RESTAURANT.count+"\t"+s4+"\t       "+normRate+"\n");
              RESTAURANT.count++; 
         }
        }
    if(s5!=null)
       if(!(s5.equals("ICE CREAM")))
       {
         if(!(RESTAURANT.prevS5.equals(s5)))
         {
              RESTAURANT.prevS5=s5;
              RESTAURANT.txtarea.append(RESTAURANT.count+"\t"+s5+"\t       "+normRate+"\n");
              RESTAURANT.count++; 
         }
       }
    if(s6!=null)
      if(!(s6.equals("SANDWICH")))
      {
         if(!(RESTAURANT.prevS6.equals(s6)))
         {
              RESTAURANT.prevS6=s6;
              RESTAURANT.txtarea.append(RESTAURANT.count+"\t"+s6+"\t       "+normRate+"\n");
              RESTAURANT.count++; 
         }
      }
    if(s7!=null)
       if(!(s7.equals("BURGER")))
       {
         if(!(RESTAURANT.prevS7.equals(s7)))
         {
              RESTAURANT.prevS7=s7;
              RESTAURANT.txtarea.append(RESTAURANT.count+"\t"+s7+"\t       "+normRate+"\n");
              RESTAURANT.count++; 
         }
       }
    if(s8!=null)
       if(!(s8.equals("ICE-CREAM CAKE")))
       {
         if(!(RESTAURANT.prevS8.equals(s8)))
         {
              RESTAURANT.prevS8=s8;
              RESTAURANT.txtarea.append(RESTAURANT.count+"\t"+s8+"\t       "+normRate+"\n");
              RESTAURANT.count++; 
         }
       }
    if(s9!=null)
       if(!(s9.equals("BEVERAGE")))
       {
         if(!(RESTAURANT.prevS9.equals(s9)))
         {
              RESTAURANT.prevS9=s9;
              RESTAURANT.txtarea.append(RESTAURANT.count+"\t"+s9+"\t       "+normRate+"\n");
              RESTAURANT.count++; 
         }
       }
   } 
}