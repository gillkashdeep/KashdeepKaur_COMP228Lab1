import javax.swing.*;

public class GameObjectTest {

    public static void main(String[] args) {

        String velocity = JOptionPane.showInputDialog("Velocity of Game Object?");
        String state = JOptionPane.showInputDialog("State of Game Object-alive or dead?");
        String rotation = JOptionPane.showInputDialog("Rotation of Game Object?");
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter value of x-"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter value of y-"));
        int center = (x+y)/2;

        GameObject obj1 = new GameObject(center, velocity, state, rotation);
        String message = obj1.getObjectInfo();

        JOptionPane.showMessageDialog(null, message );





    }
}
