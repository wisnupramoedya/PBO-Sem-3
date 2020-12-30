import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class QuizProblem extends JPanel implements ActionListener {
	private static final long serialVersionUID = 2L;
	QuizGame quiz;
	int correctAnswer;
	int selected;
	boolean used;
	
	JPanel questionPanel = new JPanel();
	JPanel answerPanel = new JPanel();
	JRadioButton[] responses;
	ButtonGroup group = new ButtonGroup();
	
	JPanel bottomPanel=new JPanel();
	JButton next = new JButton("Next");
	JButton finish = new JButton("Finish");
	
	public QuizProblem(String question, String[] options, int correctAnswer, QuizGame quiz) {
		this.quiz = quiz;
		this.correctAnswer = correctAnswer;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		// Question
		questionPanel.add(new JLabel(question));
		add(questionPanel);
		
		// Answer
		responses = new JRadioButton[options.length];
		for (int i = 0; i < options.length; i++) {
			responses[i] = new JRadioButton(options[i]);
			responses[i].addActionListener(this);
			group.add(responses[i]);
			answerPanel.add(responses[i]);
		}
		add(answerPanel);
		
		// Bottom Panel
		next.addActionListener(this);
		finish.addActionListener(this);
		bottomPanel.add(next);
		bottomPanel.add(finish);
		add(bottomPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source.equals(next)) {
			showResult();
			if(selected == correctAnswer) {
				used = true;
				quiz.next();
			}
		}
		
		if(source.equals(finish))
			quiz.showSummary();
		
		for (int i = 0; i < responses.length; i++) {
			if(source == responses[i])
				selected = i;
		}
		
	}
	
	public void showResult() {
		String text = responses[selected].getText();
		quiz.total++;
		if(selected == correctAnswer){
			JOptionPane.showMessageDialog(null, text+" benar!\nMantap!");
		}else{
			quiz.wrongs++;
			JOptionPane.showMessageDialog(null, text+" salah.\nCoba ulang!");
		}
	}
	
}
