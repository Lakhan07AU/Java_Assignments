import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomNumberGuessingGameGUI {
    private JFrame frame;
    private JTextField guessField;
    private JTextArea resultArea;
    private JButton guessButton;
    private JButton playAgainButton;
    private int targetNumber;
    private int attempts;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                RandomNumberGuessingGameGUI window = new RandomNumberGuessingGameGUI();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public RandomNumberGuessingGameGUI() {
        initialize();
    }

    private void initialize() {
        // Frame settings
        frame = new JFrame("Random Number Guessing Game");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Label
        JLabel lblTitle = new JLabel("Guess a number between 1 and 100");
        lblTitle.setFont(new Font("Arial", Font.PLAIN, 14));
        lblTitle.setBounds(130, 20, 250, 20);
        frame.getContentPane().add(lblTitle);

        // Input field
        guessField = new JTextField();
        guessField.setBounds(170, 80, 100, 30);
        frame.getContentPane().add(guessField);
        guessField.setColumns(10);

        // Guess button
        guessButton = new JButton("Guess");
        guessButton.setBounds(170, 120, 100, 30);
        frame.getContentPane().add(guessButton);

        // Result area (textarea for feedback)
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setBounds(100, 160, 250, 50);
        frame.getContentPane().add(resultArea);

        // Play again button
        playAgainButton = new JButton("Play Again");
        playAgainButton.setBounds(170, 220, 100, 30);
        frame.getContentPane().add(playAgainButton);
        playAgainButton.setEnabled(false);

        // Initialize the game
        resetGame();

        // Guess button action listener
        guessButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = guessField.getText();
                try {
                    int guess = Integer.parseInt(input);
                    attempts++;

                    if (guess < targetNumber) {
                        resultArea.setText("Too low! Try again.");
                    } else if (guess > targetNumber) {
                        resultArea.setText("Too high! Try again.");
                    } else {
                        resultArea.setText("Correct! You guessed it in " + attempts + " attempts.");
                        guessButton.setEnabled(false);
                        playAgainButton.setEnabled(true);
                    }
                } catch (NumberFormatException ex) {
                    resultArea.setText("Please enter a valid number.");
                }
            }
        });

        // Play again button action listener
        playAgainButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetGame();
                guessButton.setEnabled(true);
                playAgainButton.setEnabled(false);
                resultArea.setText("");
                guessField.setText("");
            }
        });
    }

    // Method to reset the game
    private void resetGame() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        attempts = 0;
    }
}

