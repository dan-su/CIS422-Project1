import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.io.File;

import com.opencsv.CSVReader;

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
	private static boolean import_groups = false;
	private static int array_size;
	private static String[] names;
	//public static final int num_of_groups = 10;
	public static final int num_of_students = 30;
	public static int number_of_groups = 0;
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

	public static void CreateAndShowGroupsPage(){

		JFrame frame2 = new JFrame("Groups");
		frame2.setSize(1000,1000);
		frame2.setLocationRelativeTo(null);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.BLACK);

		frame2.getContentPane().add(panel2);
		frame2.setVisible(true);
		
	switch(number_of_groups){
		case 0:
			System.out.println("group size is zero?");
			break;
		case 1:
			//make class number of text boxes and populate with class
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
	}
		
		
	}
	public static void createAndShowFirstPage() {

	//Create and set up the window.
		final JFrame frame = new JFrame("Automated Grouping");
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
		final JTextField input_data_field = new JTextField(400);
		final JTextField input_class_size_field = new JTextField(400);
		JLabel input_class_size_label = new JLabel("Enter class size below ");
		JLabel user_messages_label = new JLabel("messages to user displayed here"); // user messages
		final JTextField user_messages_field = new JTextField(400);
		JLabel group_size_label = new JLabel("Enter size of groups "); // user messages
		final JTextField group_size_field = new JTextField(400);

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
		  	if(import_groups == true){
		  		user_messages_field.setText("now press get groups");
		   }else{
			user_messages_field.setText("unable to open file, please try again.");
			}
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
			if(input_class_size_field.getText().equals("")){
				user_messages_field.setText("please enter class size");
			}else if(group_size_field.getText().equals("")){
					user_messages_field.setText("please enter a group size");
				}else{
					size_of_groups = Integer.parseInt(group_size_field.getText());
					get_groups_button_pressed(Integer.parseInt(input_class_size_field.getText()), Integer.parseInt(group_size_field.getText()));
					user_messages_field.setText("number of groups will be: " + number_of_groups + " please press the view groups button");
				}
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

	user_messages_label.setBounds(51,330,340,30);

	user_messages_field.setBounds(50,360, 700, 30);

	user_messages_field.setText("Type filename into file text field and press 'import data' button ");

	input_class_size_label.setBounds(50,150,200,30);

	input_class_size_field.setBounds(87,190,50,30);

	group_size_label.setBounds(300,150,200,30);

	group_size_field.setBounds(330,190, 50, 30);
	 

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
		import_groups = true;
		 int num_of_lines = 0;
	for(int i = 0; fileScanner.hasNextLine(); i++){
				num_of_lines++;
				fileScanner.nextLine();
		}
		set_array_size(num_of_lines);
		 String[] names = new String[num_of_lines];

		
	   fileScanner.close();
	   fileScanner = null;
	   fileScanner = new Scanner(file);

		String line;
		
	for(int i = 0; fileScanner.hasNextLine(); i++){
	   line = fileScanner.nextLine();
	   names[i] = line;
	   System.out.println(line);
	}
	set_array(names);
   // String line = fileScanner.nextLine();
	 //   names += line;
	}catch(Exception ex){
		import_groups = false;
		System.out.println("unable to open file!");
		}

	}

	public static void exit_button_pressed(){
		System.exit(0);
	}


	public static void get_groups_button_pressed(int class_size, int group_size){
		// retrieve all data from file
		String[] data = new String[get_array_size()];
		
		data = get_array();

		 number_of_groups = class_size/group_size;

		 if(isEmpty(names))
		 import_groups = false;
		else{
			import_groups = true;
		}

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
		//Person student = new Person();
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowFirstPage();
			}
		});
	}
	
}

