import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DictionarySystem implements ActionListener,KeyListener{
	private static JFrame frame;
	private static JLabel label;
	private static JTextField field;
	private static JButton button;
	private static JTextField showAnswer;
	private static JButton reset;
	public static void main(String[] args) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(400,100);
		frame.setTitle("Calculator");
		frame.setBackground(Color.red);
		frame.getContentPane().setBackground(Color.cyan);
		
		label = new JLabel("Enter words");
		label.setBounds(10,20,100,25);
		label.setFont(new Font(null,Font.BOLD,12));
		label.setForeground(Color.blue);
		frame.add(label);
		
		field = new JTextField(20);
		field.setBounds(100,20,80,25);
		field.addKeyListener(new DictionarySystem());
		frame.add(field);
		
		button = new JButton("-->");
		button.setBounds(175,21,60,25);
		button.setFont(new Font(null,Font.BOLD,12));
		button.setForeground(Color.blue);
		button.addActionListener(new DictionarySystem());
		frame.add(button);
		
		showAnswer = new JTextField(20);
		showAnswer.setBounds(230,20,80,25);
		frame.add(showAnswer);
		
		reset = new JButton("reset");
		reset.setBounds(305,21,70,25);
		reset.setFont(new Font(null,Font.BOLD,12));
		reset.setForeground(Color.blue);
		reset.addActionListener(new DictionarySystem());
		frame.add(reset);
		
		
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	    if(e.getSource()==reset) {
	    	showAnswer.setText("");
	    	field.setText("");
	    }
		
		HashMap<String,String> di = new HashMap<>();
		String input = field.getText();
		 di.put("apple","äpfel");       
         di.put("äpfel","apple");
         di.put("apricots","aprilkosen");
         di.put("aprilkosen","apricots");
         di.put("banana","banane");
         di.put("banane","banana");
         di.put("boysenberries","boysenbeeren");
         di.put("boysenbeeren","boysenberries");
         di.put("blueberries","blaubeeren");
         di.put("blaubeeren","blueberries");
         di.put("bing cherry","bing cherry");
         di.put("cherries", "kirschen");
         di.put("kirschen","cherries");
         di.put("cantaloupe","cantaloupe");
         di.put("crab apple","holzäpfel");
         di.put("holzädfel","crab apple");
         di.put("clementine","clementine");
         di.put("cucumber","gurke");
         di.put("gurke","cucumber");
         di.put("damson plum","zwetschgenpflaume");
         di.put("zwetschgenpflaume","damson plum");
         di.put("dinosaur egg","dinosauier eier");
         di.put("dinosauier eier","dinosaur egg");
         di.put("dates","datteln");
         di.put("datteln","dates");
         di.put("dewberry","browmbeere");
         di.put("browmbeere","dewberry");
         di.put("dragon fruit","drachenfrucht");
         di.put("drachenfrucht","dragon fruit");
         di.put("elderberry","holunder");
         di.put("holunder","elderberry");
         di.put("eggfruit","eierfrucht");
         di.put("eierfrucht","eggfruit");
         di.put("evergreen","immergrüne");
         di.put("immergrüne","evergreen");
         di.put("huckleberry","heidelbeere");
         di.put("heidelbeere","huckleberry");
         di.put("entawak","entawak");
         di.put("fig","feige");
         di.put("feige","fig");
         di.put("farkleberry","farkleberry");
         di.put("finger lime","finger lime");
         di.put("grapefruit","grapefruit");
         di.put("grape","traube");
         di.put("traube","grape");
         di.put("gooseberry","stachelbeere");
         di.put("stachelbeere","gooseberry");
         di.put("guava","guava");
         di.put("honeydew melon","honigmelone");
         di.put("honigmelone","honeydew melon");
         di.put("hackberry","hackberry");
         di.put("honeycrisp apple","honeycrisp äpfel");
         di.put("honeycrisp äpfel","honeycrisp");
         di.put("india prune","indische pflaume");
         di.put("indische pflaume","india prune");
         di.put("indonesian lime","indonesische limette");
         di.put("indonesische limette","indonesian lime");
         di.put("imbe","imbe");
         di.put("india fig","indische feige");
         di.put("indische feige","india fig");
         di.put("jackfruit","jackfrucht");
         di.put("jackfrucht","jackfruit");
         di.put("java","java");
         di.put("jambolan","jambolan");
         di.put("kiwi","kiwi");
         di.put("kaffir lime","kaffir limette");
         di.put("kaffir limette","kaffir limr");
         di.put("kumquat","kumquat");
         di.put("lemon","zitrone");
         di.put("zitrone","lemon");
         di.put("longan","longan");
         di.put("lychee","litschi");
         di.put("litschi","lychee");
         di.put("loquat","wollmispel");
         di.put("wollmispel","loquat");
         di.put("mango","mango");
         di.put("mandarin","mandarin");
         di.put("mulberry","maulbeere");
         di.put("maulbeere","mulberry");
         di.put("melon","melone");
         di.put("melone","melon");
         di.put("nectarine","nektarine");
         di.put("nektarine","nectarine");
         di.put("navel orange","nabelorange");
         di.put("nabelorange","navel orange");
         di.put("olive","olive");
         di.put("orange","orange");
         di.put("ogeechee lime","ogeechee limette");
         di.put("ogeechee limette","ogeechee lime");
         di.put("oval kumquat","oval kumquat");
         di.put("papaya","papaya");
         di.put("persimmon","persimone");
         di.put("persimone","persimmon");
         di.put("paw paw","pfote pfote");
         di.put("pfote pfote","paw paw");
         di.put("prickly pear","feigenkaktus");
         di.put("feigenkaktus","prickly pear");
         di.put("peach","pfirsich");
         di.put("pfirsich","peach");
         di.put("pomegranate","granatapfel");
         di.put("granatapfel","pomegranate");
         di.put("pineapple","ananas");
         di.put("ananas","pineapple");
         di.put("quince","quitte");
         di.put("quitte","quince");
         di.put("queen anne cherry","königin anne cherry");
         di.put("königin anne cherry","queen anne cherry");
         di.put("quararibea","quararibea");
         di.put("raumbutan","raumbutan");
         di.put("raspberry","himbeere");
         di.put("himbeere","raspberry");
         di.put("rose hip","hagebutte");
         di.put("hagebutte","rose hip");
         di.put("star fruit","sternfrucht");
         di.put("sternfrucht","star fruit");
         di.put("strawberry","erdbeere");
         di.put("erdbeere","strawberry");
         di.put("sugar baby watermelon","zucker baby wassermelone");
         di.put("zucker baby wassermelone","sugar baby watermelon");
         di.put("tomato","tomaten");
         di.put("tomaten","tomato");
         di.put("tangerine","mandarinen");
         di.put("mandarinen","tangerine");
         di.put("tamarind","tamarinden");
         di.put("tamarinden","tamarind");
         di.put("tart cherry","schafe kirschen");
         di.put("schafe kirschen","tart cherry");
         di.put("ugli fruit","ugli-frucht");
         di.put("ugli-frucht","ugli fruit");
         di.put("uniq fruit","uniq-frucht");
         di.put("uniq-frucht","uniq fruit");
         di.put("ugni","ugni");
         di.put("vanilla bean","vinilleschote");
         di.put("vinilleschote","vanilla bean");
         di.put("velvet pink banana","samtrosa banane");
         di.put("samtrosa banane","velvet pink banana");
         di.put("voavanga","voavanga");
         di.put("watermelon","wassermelone");
         di.put("wassermelone","watermelon");
         di.put("wolfberry","wolfsbeere");
         di.put("wolfsbeere","wolfberry");
         di.put("white mulberry","weiße maulbeere");
         di.put("weiße maulbeere","white mulbeery");
         showAnswer.setText(di.get(input));
         
         
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			HashMap<String,String> di = new HashMap<>();
			String input = field.getText();
			 di.put("apple","äpfel");       
	         di.put("äpfel","apple");
	         di.put("apricots","aprilkosen");
	         di.put("aprilkosen","apricots");
	         di.put("banana","banane");
	         di.put("banane","banana");
	         di.put("boysenberries","boysenbeeren");
	         di.put("boysenbeeren","boysenberries");
	         di.put("blueberries","blaubeeren");
	         di.put("blaubeeren","blueberries");
	         di.put("bing cherry","bing cherry");
	         di.put("cherries", "kirschen");
	         di.put("kirschen","cherries");
	         di.put("cantaloupe","cantaloupe");
	         di.put("crab apple","holzäpfel");
	         di.put("holzädfel","crab apple");
	         di.put("clementine","clementine");
	         di.put("cucumber","gurke");
	         di.put("gurke","cucumber");
	         di.put("damson plum","zwetschgenpflaume");
	         di.put("zwetschgenpflaume","damson plum");
	         di.put("dinosaur egg","dinosauier eier");
	         di.put("dinosauier eier","dinosaur egg");
	         di.put("dates","datteln");
	         di.put("datteln","dates");
	         di.put("dewberry","browmbeere");
	         di.put("browmbeere","dewberry");
	         di.put("dragon fruit","drachenfrucht");
	         di.put("drachenfrucht","dragon fruit");
	         di.put("elderberry","holunder");
	         di.put("holunder","elderberry");
	         di.put("eggfruit","eierfrucht");
	         di.put("eierfrucht","eggfruit");
	         di.put("evergreen","immergrüne");
	         di.put("immergrüne","evergreen");
	         di.put("huckleberry","heidelbeere");
	         di.put("heidelbeere","huckleberry");
	         di.put("entawak","entawak");
	         di.put("fig","feige");
	         di.put("feige","fig");
	         di.put("farkleberry","farkleberry");
	         di.put("finger lime","finger lime");
	         di.put("grapefruit","grapefruit");
	         di.put("grape","traube");
	         di.put("traube","grape");
	         di.put("gooseberry","stachelbeere");
	         di.put("stachelbeere","gooseberry");
	         di.put("guava","guava");
	         di.put("honeydew melon","honigmelone");
	         di.put("honigmelone","honeydew melon");
	         di.put("hackberry","hackberry");
	         di.put("honeycrisp apple","honeycrisp äpfel");
	         di.put("honeycrisp äpfel","honeycrisp");
	         di.put("india prune","indische pflaume");
	         di.put("indische pflaume","india prune");
	         di.put("indonesian lime","indonesische limette");
	         di.put("indonesische limette","indonesian lime");
	         di.put("imbe","imbe");
	         di.put("india fig","indische feige");
	         di.put("indische feige","india fig");
	         di.put("jackfruit","jackfrucht");
	         di.put("jackfrucht","jackfruit");
	         di.put("java","java");
	         di.put("jambolan","jambolan");
	         di.put("kiwi","kiwi");
	         di.put("kaffir lime","kaffir limette");
	         di.put("kaffir limette","kaffir limr");
	         di.put("kumquat","kumquat");
	         di.put("lemon","zitrone");
	         di.put("zitrone","lemon");
	         di.put("longan","longan");
	         di.put("lychee","litschi");
	         di.put("litschi","lychee");
	         di.put("loquat","wollmispel");
	         di.put("wollmispel","loquat");
	         di.put("mango","mango");
	         di.put("mandarin","mandarin");
	         di.put("mulberry","maulbeere");
	         di.put("maulbeere","mulberry");
	         di.put("melon","melone");
	         di.put("melone","melon");
	         di.put("nectarine","nektarine");
	         di.put("nektarine","nectarine");
	         di.put("navel orange","nabelorange");
	         di.put("nabelorange","navel orange");
	         di.put("olive","olive");
	         di.put("orange","orange");
	         di.put("ogeechee lime","ogeechee limette");
	         di.put("ogeechee limette","ogeechee lime");
	         di.put("oval kumquat","oval kumquat");
	         di.put("papaya","papaya");
	         di.put("persimmon","persimone");
	         di.put("persimone","persimmon");
	         di.put("paw paw","pfote pfote");
	         di.put("pfote pfote","paw paw");
	         di.put("prickly pear","feigenkaktus");
	         di.put("feigenkaktus","prickly pear");
	         di.put("peach","pfirsich");
	         di.put("pfirsich","peach");
	         di.put("pomegranate","granatapfel");
	         di.put("granatapfel","pomegranate");
	         di.put("pineapple","ananas");
	         di.put("ananas","pineapple");
	         di.put("quince","quitte");
	         di.put("quitte","quince");
	         di.put("queen anne cherry","königin anne cherry");
	         di.put("königin anne cherry","queen anne cherry");
	         di.put("quararibea","quararibea");
	         di.put("raumbutan","raumbutan");
	         di.put("raspberry","himbeere");
	         di.put("himbeere","raspberry");
	         di.put("rose hip","hagebutte");
	         di.put("hagebutte","rose hip");
	         di.put("star fruit","sternfrucht");
	         di.put("sternfrucht","star fruit");
	         di.put("strawberry","erdbeere");
	         di.put("erdbeere","strawberry");
	         di.put("sugar baby watermelon","zucker baby wassermelone");
	         di.put("zucker baby wassermelone","sugar baby watermelon");
	         di.put("tomato","tomaten");
	         di.put("tomaten","tomato");
	         di.put("tangerine","mandarinen");
	         di.put("mandarinen","tangerine");
	         di.put("tamarind","tamarinden");
	         di.put("tamarinden","tamarind");
	         di.put("tart cherry","schafe kirschen");
	         di.put("schafe kirschen","tart cherry");
	         di.put("ugli fruit","ugli-frucht");
	         di.put("ugli-frucht","ugli fruit");
	         di.put("uniq fruit","uniq-frucht");
	         di.put("uniq-frucht","uniq fruit");
	         di.put("ugni","ugni");
	         di.put("vanilla bean","vinilleschote");
	         di.put("vinilleschote","vanilla bean");
	         di.put("velvet pink banana","samtrosa banane");
	         di.put("samtrosa banane","velvet pink banana");
	         di.put("voavanga","voavanga");
	         di.put("watermelon","wassermelone");
	         di.put("wassermelone","watermelon");
	         di.put("wolfberry","wolfsbeere");
	         di.put("wolfsbeere","wolfberry");
	         di.put("white mulberry","weiße maulbeere");
	         di.put("weiße maulbeere","white mulbeery");
	         showAnswer.setText(di.get(input));
	         
			
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}