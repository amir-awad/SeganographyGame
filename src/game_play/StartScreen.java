package game_play;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class StartScreen extends javax.swing.JFrame {
     public StartScreen() {
          setContentPane(new JLabel(new ImageIcon("Background1.jpg")));
          initComponents();
          //setExtendedState(MAXIMIZED_BOTH);
          setBounds(400, 180, 505, 440);
     }
     private boolean checkEmpty(String name, String pass){
          if(name.isEmpty()||pass.isEmpty())
          {
               JOptionPane.showMessageDialog(null,"Please fill all the fields","Error",JOptionPane.ERROR_MESSAGE);
               return false;
          }
          return true;
     }
     private boolean checkUser(String name, String pass, File f,boolean b) throws FileNotFoundException{
          Scanner scan = new Scanner(f);
          if(b){
               while (scan.hasNextLine()) {               
                    String [] s = scan.nextLine().split(" ");
                    if(s[0].equals(name) &&s[1].matches(pass))
                         return true;
               }
               return false;
          }
          else{
               while(scan.hasNextLine()){
                    String [] s = scan.nextLine().split(" ");
                    if(s[0].matches(name))
                    {
                         JOptionPane.showMessageDialog(null,"User already exists!!","Error",JOptionPane.ERROR_MESSAGE);
                         return false;
                    }
               }
               
               return true;
          }
     }
     private void writeToFile (File f,String name, String pass) throws IOException{
          try (FileWriter fileWriter = new FileWriter(f,true)) {
               fileWriter.write(name+ " "+pass+" 0\n");
          }
     }
     /**
      * This method is called from within the constructor to initialize the
      * form. WARNING: Do NOT modify this code. The content of this method is
      * always regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
     private void initComponents() {

          jTextField1 = new javax.swing.JTextField();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jPasswordField1 = new javax.swing.JPasswordField();
          jLabel3 = new javax.swing.JLabel();
          jButton1 = new javax.swing.JButton();
          jTextField2 = new javax.swing.JTextField();
          jLabel4 = new javax.swing.JLabel();
          jLabel5 = new javax.swing.JLabel();
          jPasswordField2 = new javax.swing.JPasswordField();
          jButton2 = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

          jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
               @Override
               public void keyTyped(java.awt.event.KeyEvent evt) {
                    jTextField1KeyTyped(evt);
               }
          });

          jLabel1.setText("Name");

          jLabel2.setText("Password");

          jLabel3.setText("-----------------OR-----------------");

          jButton1.setText("Sign in");
          jButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
               jButton1ActionPerformed(evt);
          });

          jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
               @Override
               public void keyTyped(java.awt.event.KeyEvent evt) {
                    jTextField2KeyTyped(evt);
               }
          });

          jLabel4.setText("Name");

          jLabel5.setText("Password");

          jButton2.setText("Sign Up");
          jButton2.addActionListener((java.awt.event.ActionEvent evt) -> {
               jButton2ActionPerformed(evt);
          });

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addGap(145, 145, 145)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jLabel3)
                                   .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jLabel1)
                                             .addComponent(jLabel2))
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                   .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jLabel4)
                                             .addComponent(jLabel5))
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                         .addGroup(layout.createSequentialGroup()
                              .addGap(203, 203, 203)
                              .addComponent(jButton1))
                         .addGroup(layout.createSequentialGroup()
                              .addGap(202, 202, 202)
                              .addComponent(jButton2)))
                    .addContainerGap(165, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel1))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel2)
                         .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jButton1)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel5)
                         .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton2)
                    .addContainerGap(91, Short.MAX_VALUE))
          );

          pack();
     }// </editor-fold>                        

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
          String name,pass;
          name = jTextField1.getText();
          pass = String.valueOf(jPasswordField1.getPassword());
          if(!checkEmpty(name, pass)) return;
          try {
               File playersFile = new File("players.txt");
               if(playersFile.createNewFile())
                    JOptionPane.showMessageDialog(null, "Name and Password are incorrect","No players",JOptionPane.WARNING_MESSAGE);
               else
               {
                    if(checkUser(name, pass, playersFile,true))
                    {
                         this.dispose();
                         WelcomeScreen.userName = name;
                         WelcomeScreen.main(null);
                         return;
                    }
                    JOptionPane.showMessageDialog(null, "Incorrect username or password","",JOptionPane.WARNING_MESSAGE);
                    
               }
          } catch (IOException e) {
               JOptionPane.showMessageDialog(null, e);
          }
          
          //if(checkMap(name,pass))
          //        new PlayerScreen().setvisible(true);
          //else /*Show error mesage*/
     }                                        

     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
          String name,pass;
          name = jTextField2.getText();
          pass = String.valueOf(jPasswordField2.getPassword());
          if(!checkEmpty(name, pass)) return;
          try {
               File f = new File("players.txt");
               if(f.createNewFile())
               {
                    writeToFile(f, name, pass);
                    this.dispose();
                    WelcomeScreen.main(null);
               }
               else{
                    if(!checkUser(name, pass, f, false))return;
                    writeToFile(f, name, pass);
                    this.dispose();
                    WelcomeScreen.main(null);
                   
               }
          } catch (IOException e) {
          }
          
     }                                        

     private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {                                     
          try {
               if(evt.getKeyChar()==' ')
                    throw new Exception();
          } catch (Exception e) {
               jTextField1.setText("");
          }
               
     }                                    

     private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {                                     
          try {
               if(evt.getKeyChar()==' ')
                    throw new Exception();
          } catch (Exception e) {
               jTextField2.setText("");
          }
     }                                    

     /**
      * @param args the command line arguments
      */
     public static void main(String args[]) {
          /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
           * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
           */
          try {
               for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                         javax.swing.UIManager.setLookAndFeel(info.getClassName());
                         break;
                    }
               }
          } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>
          
        //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(() -> {
               new StartScreen().setVisible(true);
          });
     }

     // Variables declaration - do not modify                     
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton2;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JPasswordField jPasswordField1;
     private javax.swing.JPasswordField jPasswordField2;
     private javax.swing.JTextField jTextField1;
     private javax.swing.JTextField jTextField2;
     // End of variables declaration
}