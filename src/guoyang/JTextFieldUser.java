package guoyang;

import java.awt.Graphics;  
import java.awt.Insets;  
import javax.swing.ImageIcon;  
import javax.swing.JTextField;  
  
/** 
 * 
 * @author WZH 
 */  
public class JTextFieldUser extends JTextField {  
    private ImageIcon icon;  
  
    public JTextFieldUser(String str) {  
        //��ȡ��ǰ·���µ�ͼƬ  
        icon = new ImageIcon(str);  
        Insets insets = new Insets(0, 20, 0, 0);  
        //�����ı���������20  
        this.setMargin(insets);  
    }  
      
    @Override  
    public void paintComponent(Graphics g) {  
        Insets insets = getInsets();  
        super.paintComponent(g);  
        int iconWidth = icon.getIconWidth();  
        int iconHeight = icon.getIconHeight();  
        int Height = this.getHeight();  
        //���ı����л���֮ǰͼƬ  
        icon.paintIcon(this, g,  this.getWidth()- iconWidth, (Height - iconHeight) / 2);  
    }  
}  