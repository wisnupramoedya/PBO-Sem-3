import java.awt.CardLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class QuizGame extends JFrame {
	private static final long serialVersionUID = 1L;
	JPanel panel = new JPanel();
	CardLayout cards=new CardLayout();
	int numberQuestion;
	int wrongs = 0;
	int total = 0;
	
	String[][] answers={
			{"Portuguese","Spanish","Italian","English"},
			{"24","32","36","64"},
			{"1935","1945","1955","1965"},
			{"Earth","Jupiter","Mars","Uranus"},
			{"Thomas Edison","Louis Pasteur","Alexander Fleming","George Orwell"},
			{"True","False"},
			{"True","False"},
			{"Fire","Darkness","Wind","Spiders"},
			{"Volleyball","Basketball","Hockey","Football"},
			{"Italy","Spain","France","Switzerland"},
			{"True","False"},
			{"Apollo 7","Apollo 9","Apollo 11","Apollo 13"},
			{"Slovakia","Ukraine","Hungary","Russia"},
			{"True","False"},
			{"Britney Spears","Scarlett Johansson","Mila Kunis","Angelina Jolie"},
			{"Steve Rogers","Chris Hemsworth","Tony Stark","Toby Jenkins"},
			{"Labrosse","Orleans","Sandillon","Attray"},
	};
	
	QuizProblem questions[]={
			
			new QuizProblem(
				"Apa bahasa yang dipakai di Brazil?",
				answers[0],
				0,this
			),
			new QuizProblem(
				"Berapa banyak petak hitam di catur?",
				answers[1],
				1,this
			),
			new QuizProblem(
				"Albert Einstein meninggal pada tahun?",
				answers[2],
				2,this
			),
			new QuizProblem(
				"Planet terbesar di solar sistem kita?",
				answers[3],
				1,this
			),
			new QuizProblem(
				"Siapa penemu Penicillin?",
				answers[4],
				2,this
			),
			new QuizProblem(
				"BOS: Voli awalnya diciptakan untuk pebisnis.",
				answers[5],
				0,this
			),
			new QuizProblem(
				"BOS: Hanya AS dan Uni Soviet yang pernah menginjak bulan.",
				answers[6],
				1,this
			),
			new QuizProblem(
				"Anemophobia adalah ketakutan pada?",
				answers[7],
				2,this
			),
			new QuizProblem(
				"Permainan yang dimainkan oleh 5 orang di setiap sisi?",
				answers[8],
				1,this
			),
			new QuizProblem(
				"Negara berikut tidak memiliki laut?",
				answers[9],
				3,this
			),
			new QuizProblem(
				"BOS: Pemenang Oscar dari film A Beautiful Mind (2001) berhadapan dengan schizophrenia.",
				answers[10],
				0,this
			),
			new QuizProblem(
				"Misi Apolo keberapa yang mendaratkan manusia di bulan?",
				answers[11],
				2,this
			),
			new QuizProblem(
				"Bencana reaktor nuklir Chernobyl terjadi di negara?",
				answers[12],
				1,this
			),
			new QuizProblem(
				"BOS: Tari Tango berasal dari Argentina.",
				answers[13],
				0,this
			),
			new QuizProblem(
				"Siapa yang berperan sebagai Lara Croft di seri film Tomb Raider?",
				answers[14],
				3,this
			),
			new QuizProblem(
				"Nama asli Iron Man adalah?",
				answers[15],
				2,this
			)
			,
			new QuizProblem(
				"Joan of Arc dikenal sebagai maid dari?",
				answers[16],
				1,this
			)
	};
	
	
	
	public static void main(String[] args) {
		new QuizGame();
	}
	
	public QuizGame() {
		super("Coveria");
		setResizable(true);
		setSize(650,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel.setLayout(cards);
		numberQuestion = questions.length;
		for(int i=0; i < numberQuestion;i++){
			panel.add(questions[i],"q"+i);
		}
		
		Random random = new Random();
		int i = random.nextInt(numberQuestion);
		cards.show(panel,"q"+i);
		add(panel);
		setVisible(true);
	}
	
	public void next(){
		if ((total-wrongs) == numberQuestion){
			showSummary();
		}else{
			Random random = new Random();
			boolean found = false;
			int i = 0;
			while(!found){
				i = random.nextInt(numberQuestion);
				if(!questions[i].used){
					found=true;
				}
			}
			cards.show(panel,"q"+i);
		}
	}
	
	public void showSummary(){
		JOptionPane.showMessageDialog(null,"Hasil:"+
			"\nKamu menjawab "+ wrongs + " pertanyaan salah." +
			"\nKamu menjawab "+(total-wrongs)+ " benar." +
			"\nNilai kamu: \t\t"+(int)(((float)(total-wrongs)/total)*100)+"%."
		);
		System.exit(0);
	}
}
