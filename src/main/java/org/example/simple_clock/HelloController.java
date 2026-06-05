package org.example.simple_clock;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloController extends JFrame {
//    @FXML
//    private Label timeLabel;
    private JLabel timeLabel;

    public HelloController() {
        setTitle("Hello!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setResizable(false);


        JPanel centerPanel = new JPanel(new GridBagLayout()) {
            // color
        };
        add(centerPanel);
        centerPanel.add(timeLabel);
    }


    private void startClock(){
//        AnimationTimer timer = new AnimationTimer() {
//            @Override
//            public void handle(long now) {
//
//            }
//        };
//        TemporalAccessor temporalAccessor = DateTimeFormatter.ISO_LOCAL_TIME.parse(time.toString());
//        Timer timer = new Timer(1000, e->updateClock());
//        timer.start();
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 56));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();

        updateClock();
    }

    private void updateClock(){
//        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss a");
//        LocalTime time  = LocalTime.now();
//        timeText = time.format(timeFormatter);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String currentTime = formatter.format(new Date());
        timeLabel.setText(currentTime);
    }
}
