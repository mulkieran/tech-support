import javax.swing.*;

public class SupportSystemGUI
{

    private JFrame frame;
    
    public SupportSystemGUI()
    {
        this.frame = new JFrame("SupportSystem");
    }
    
    public void start()
    {
       this.frame.setSize(400, 200);
       this.frame.setVisible(true);
    }

}
