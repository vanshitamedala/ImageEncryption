import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ImageOperation {
    public static void operate(int key)
 {
//Choosing an image to encrypt or decrypt
        JFileChooser fileChooser=new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file=fileChooser.getSelectedFile();
//file FileInputStream
        try
        {
            FileInputStream fis=new FileInputStream(file);
//Reading the Image
            byte []data=new byte[fis.available()];
            fis.read(data);
            int i=0;
            for(byte b:data)
            {
//Coverting the data (byte) that we read in the previous
//step to an encrypted form by using XOR
//Here we XOR the "b" data with a key
//Key is the input taken from the user
            System.out.println(b);
            data[i]=(byte)(b^key);
            i++;
   }
 //After the XOR function, All the bytes are encrypted and
// the user will be granted a dialogue box saying it's "Done"
            FileOutputStream fos=new FileOutputStream(file);
            fos.write(data);
            fos.close();
            fis.close();
            JOptionPane.showMessageDialog(null, "Done");
 //The same XOR function will also work for decrypting as the
//values of the image(data) when encrypted with XOR is stored
//So when you XOR the encrypted values you'll get the
// initial values of the bytes(data)
            }catch(Exception e)
            {  
            e.printStackTrace();
         }
    }
public static void main(String[] args) {
 //Verification of the code
    System.out.println("this is testing");
 
//creating a GUI
    JFrame f=new JFrame();
    f.setTitle("Image Operation");
    f.setSize(400,400);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Font font=new Font("Roboto",Font.BOLD,25);
//creating button
    JButton button=new JButton();
    button.setText("Open Image");
    button.setFont(font);
//creating text field
    JTextField textField=new JTextField(10);
    textField.setFont(font);

    button.addActionListener(e->{
        System.out.println("button clicked");
        String text=textField.getText();
        int temp=Integer.parseInt(text);
        operate(temp);
    });
    f.setLayout(new FlowLayout());
    f.add(button);
    f.add(textField);
    f.setVisible(true);
 }
}