import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class AlignFrame extends JFrame implements ActionListener 
{
   private final JButton[] buttons; // array of buttons
   private static final String[] names = 
   {"7", "8", "9", ")", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
   private boolean toggle = true; // toggle between two layouts
   private final Container container; // frame container
   private final GridLayout gridLayout1; // first gridlayout

   // no-argument constructor
   public AlignFrame()
   {
      super("GridLayout Demo");
      gridLayout1 = new GridLayout(4, 4, 5, 5); // 2 by 3; gaps of 5
      container = getContentPane();
      setLayout(gridLayout1); 
      buttons = new JButton[names.length];

      for (int count = 0; count < names.length; count++)
      {
         buttons[count] = new JButton(names[count]);
         buttons[count].addActionListener(this); // register listener
         add(buttons[count]); // add button to JFrame
      }
   }

   // handle button events by toggling between layouts
   @Override
   public void actionPerformed(ActionEvent event)
   { 
      if (toggle) // set layout based on toggle
         container.setLayout(gridLayout1); 
      else
         container.setLayout(gridLayout1); 

      toggle = !toggle;
      container.validate(); // re-lay out container
   } 
}
