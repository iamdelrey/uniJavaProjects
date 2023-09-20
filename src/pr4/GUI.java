package pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

    CounterState state;
    JButton milanButton;
    JButton realButton;
    JLabel scoreLabel;
    JLabel resultLabel;
    JLabel lastScorer;

    GUI() {
        state = new CounterState("AC Milan", "Real Madrid");

        mount();
    }

    private void mount() {
        setSize(400, 150);
        setResizable(false);
        milanButton = new JButton(state.getTeamLeftName());
        realButton = new JButton(state.getTeamRightName());
        scoreLabel = new JLabel("", SwingConstants.CENTER);
        resultLabel = new JLabel("", SwingConstants.CENTER);
        lastScorer = new JLabel("", SwingConstants.CENTER);

        milanButton.addActionListener(this::onIncrementMilan);
        realButton.addActionListener(this::onIncrementReal);

        setLayout(new GridBagLayout());
        {
            var constraints = new GridBagConstraints();
            constraints.gridy = 0;
            constraints.fill = GridBagConstraints.HORIZONTAL;
            add(scoreLabel, constraints);
        }
        {
            var constraints = new GridBagConstraints();
            constraints.weightx = 0.5;
            constraints.gridy = 1;
            add(milanButton, constraints);
        }
        {
            var constraints = new GridBagConstraints();
            constraints.weightx = 0.5;
            constraints.gridy = 1;
            add(realButton, constraints);
        }
        {

            var constraints = new GridBagConstraints();
            constraints.weightx = 0.5;
            constraints.gridy = 3;
            add(lastScorer, constraints);
        }
        {
            var constraints = new GridBagConstraints();
            constraints.weightx = 0.5;
            constraints.gridy = 3;
            add(resultLabel, constraints);
        }

        setVisible(true);
        update();
    }

    void onIncrementMilan(ActionEvent e) {
        state.incrementLeft();
        update();
    }

    void onIncrementReal(ActionEvent e) {
        state.incrementRight();
        update();
    }

    void update() {
        scoreLabel.setText(String.format("%d x %d", state.getTeamLeftScore(), state.getTeamRightScore()));
        resultLabel.setText("Winner: " + state.getWinner());
        lastScorer.setText("Last Scorer: " + state.getLastScorer());
    }

    public static void main(String[] args) {
        new GUI();
    }
}