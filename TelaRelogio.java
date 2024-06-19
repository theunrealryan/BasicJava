import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class ClockSwing {

    private JFrame frame;
    private JLabel lblTime;
    private Timer timer;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {