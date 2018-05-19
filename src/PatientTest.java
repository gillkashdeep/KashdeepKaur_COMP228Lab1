import javax.swing.*;

public class PatientTest {
    public static void main(String[] args) {

        String patientID = JOptionPane.showInputDialog("What is patient ID?");
        String firstName = JOptionPane.showInputDialog("Your First Name?");
        String lastName = JOptionPane.showInputDialog("Your Last Name?");
        String address = JOptionPane.showInputDialog("Address Details?");
        String city = JOptionPane.showInputDialog("City Name?");
        String province = JOptionPane.showInputDialog("Province?");
        String postalCode = JOptionPane.showInputDialog("Postal Code?");

        Patient patient1 = new Patient( patientID, firstName, lastName, address, city,
                province, postalCode);

        String message = patient1.getPatientInfo();

        JOptionPane.showMessageDialog(null, message );

    }
}
