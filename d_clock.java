package DIGITAL_CLOCK;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class d_clock extends JFrame{
    Calendar calendar;

    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;

    JLabel timLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    d_clock(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digita Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 220);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("dd MMMMM, yyyy");
        timLabel = new JLabel();
        timLabel.setFont(new Font("SANA_SERIF", Font.PLAIN, 59));
        timLabel.setBackground(Color.decode("#660033"));
        timLabel.setForeground(Color.white);
        timLabel.setOpaque(true);
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("INK Free", Font.BOLD, 34));
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("INK Free", Font.BOLD, 30));

        this.add(timLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTimer();
    }
    public void setTimer(){
        while (true) {

            time = timeFormat.format(Calendar.getInstance().getTime());
            timLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(date);

            try{
                Thread.sleep(10000);
            }catch(Exception e){
                e.getStackTrace();
            }
        }
    }
    public static void main(String[] args){
        new d_clock();
    }


}
