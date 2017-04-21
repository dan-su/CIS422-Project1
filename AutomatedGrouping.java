import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.io.File;
<<<<<<< HEAD

=======
import com.opencsv.CSVReader;
>>>>>>> b41aac571d8f2cfdd491a37d4d271fde8170511d
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Talaba Pogrebinsky
 * Daniel Su
 */

public class AutomatedGrouping {
	/**
	 * Create the GUI and show it.  For thread safety,
	 * this method should be invoked from the
	 * event-dispatching thread.
	 */
	private static int array_size;
	private static String[] names;
	public static final int num_of_groups = 10;
	public static final int num_of_students = 30;
	public static int size_of_groups = 0;
	public static String[] group1 = new String[size_of_groups];
	public String[] group2 = new String[size_of_groups];
	public String[] group3 = new String[size_of_groups];
	public String[] group4 = new String[size_of_groups];
	public String[] group5 = new String[size_of_groups];
	public String[] group6 = new String[size_of_groups];
	public String[] group7 = new String[size_of_groups];
	public String[] group8 = new String[size_of_groups];
	public String[] group9 = new String[size_of_groups];
	public String[] group10= new String[size_of_groups];
	public String[] group11= new String[size_of_groups];
	public String[] group12= new String[size_of_groups];
	public String[] group13= new String[size_of_groups];
	public String[] group14= new String[size_of_groups];
	public String[] group15= new String[size_of_groups];


	private static void set_array_size(int size){
		array_size = size;
	}
	private static void set_array(String new_names[]){
		 names = new String[array_size];
		 names = new_names;
	}
	private static String[] get_array(){
		return names;
	}
	private static int get_array_size(){
		return array_size;
	}
<<<<<<< HEAD
	
	public static void createAndShowGUI() {
=======
	public static void CSV_parser(String filePath) throws FileNotFoundException{
		CSVReader reader = new CSVReader(new FileReader(filePath));
		String [] nextLine;
		try {
			while ((nextLine = reader.readNext()) != null) {
				// nextLine[] is an array of values from the line
				System.out.println(nextLine[0] + nextLine[1] + "etc...");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void CreateAndShowGroupsPage(){
		JFrame frame2 = new JFrame("Groups");
		frame2.setSize(1000,1000);
		frame2.setLocationRelativeTo(null);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.BLACK);

		frame2.getContentPane().add(panel2);
		frame2.setVisible(true);
		if(isEmpty(group1)){
			System.out.println("group 1 is null!");
		}
		
		
	}
	public static void createAndShowFirstPage() {
>>>>>>> b41aac571d8f2cfdd491a37d4d271fde8170511d
	//Create and set up the window.
		JFrame frame = new JFrame("Automated Grouping");
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);

		
	// And JPanel needs to be added to the JFrame itself!
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	// JFrame properties
	//Buttons
	// Create JButton and JPanel
		JButton get_groups_button = new JButton("get groups");
		JButton exit_button = new JButton("done");
		JButton import_button = new JButton("import text file");
		JButton view_button = new JButton("View Groups");// enter the class size and team sizes
		JTextField input_data_field = new JTextField(400);
		JTextField input_class_size_field = new JTextField(400);
		JLabel input_class_size_label = new JLabel("Enter class size below ");
		JLabel user_messages_label = new JLabel("messages to user displayed here"); // user messages
		JTextField user_messages_field = new JTextField(400);
		JLabel group_size_label = new JLabel("Enter size of groups "); // user messages
		JTextField group_size_field = new JTextField(400);

		//JLabel
		JLabel input_data_label = new JLabel("Type the name of the textfile below: ");
		


	
	//action listeners
		exit_button.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent e) { 
			exit_button_pressed();
		 } 
		} );

		import_button.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent e) { 
			String input_data = input_data_field.getText();
		  import_button_pressed(input_data);
		 } 
		} );

		view_button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				view_button_pressed(frame);
				//will open a new activity
			}
		});

		get_groups_button.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent e) { 
			get_groups_button_pressed();
			}

		});

		  
	//set panel layout to null
		panel.setLayout(null);
// setting items coordinates on GUI
	
	import_button.setBounds(500,85,140,30);

    get_groups_button.setBounds(500,115,140,30);

	view_button.setBounds(500,145,140,30);

	exit_button.setBounds(500,175,140,30);

	input_data_field.setBounds(50,85,400,30);

	input_data_label.setBounds(51,55,400,30);

	user_messages_label.setBounds(50,130,340,30);

	user_messages_field.setBounds(50,150, 400, 400);

	input_class_size_label.setBounds(50,600,200,30);

	input_class_size_field.setBounds(87,640,50,30);

	group_size_label.setBounds(300,600,200,30);

	group_size_field.setBounds(330,640, 50, 30);
	 

  // Add button to JPanel
		panel.add(exit_button);
		panel.add(get_groups_button);
		panel.add(import_button);  
		panel.add(view_button);
		panel.add(input_data_field);    
		panel.add(input_data_label); 
		panel.add(input_class_size_field);
		panel.add(user_messages_label);
		panel.add(input_class_size_label);
		panel.add(user_messages_field);
		panel.add(group_size_field);
		panel.add(group_size_label);
		
	}
	// event handler methods
	public static void import_button_pressed(String input){
		 
		try{
		 File file = new File(input);
		Scanner fileScanner = new Scanner(file);

		 int num_of_lines = 0;
	for(int i = 0; fileScanner.hasNextLine(); i++){
				num_of_lines++;
				fileScanner.nextLine();
		}
		set_array_size(num_of_lines);
		 String[] names = new String[num_of_lines];
		 //giving terminal output to confirm import 
		 if(fileScanner != null){
			System.out.println("import succesfull!");
		}
	   fileScanner.close();
	   fileScanner = null;
	   fileScanner = new Scanner(file);
		String line;
		
	for(int i = 0; fileScanner.hasNextLine(); i++){
	   line = fileScanner.nextLine();
	   names[i] = line;
	}
	set_array(names);
   // String line = fileScanner.nextLine();
	 //   names += line;
	}catch(Exception ex){
		System.out.println("unable to open file!");
		}

	}

	public static void exit_button_pressed(){
		System.exit(0);
	}


	public static void get_groups_button_pressed(){

		String[] names;
		names = get_array();
		 size_of_groups = get_array_size()/num_of_groups;


		System.out.println("got groups successfully"); 
		// may need to add some sort of check to insure groups initialized but i figured if the program makes it here then it was successful
		
	   }
	   public static void view_button_pressed(Frame frame){
	    frame.setVisible(false);
	   	CreateAndShowGroupsPage();
	   }
	   public static boolean isEmpty(String[] string){
	   	if(string[0] == " " || string[0] == null || string[0] == "0"){
	   		return true;
	   	}
	   	return false;
	   }
	   public static void main(String[] args) {
		Person student = new Person();
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowFirstPage();
			}
		});
		System.out.println("pressed view button!"); // should open a new activity
		System.out.println("group 1[0]: " + group1[0]);
	}
	
}

