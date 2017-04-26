import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

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
	public static boolean import_groups = false;
	public static final int num_of_students = 30;
	public static int number_of_groups = 0;
	public static int size_of_groups = 0;
	public static int remainder = 0;
	public boolean is_remainder = false;
	
	public static void CreateAndShowGroupsPage(){

		JFrame frame2 = new JFrame("Groups");
		frame2.setSize(1000,1000);
		frame2.setLocationRelativeTo(null);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.ORANGE);

		frame2.getContentPane().add(panel2);
		frame2.setVisible(true);
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

	user_messages_field.setText("Type filepath and name into file text field ex: </Users/<username>/Desktop/test.csv> and press 'import data' button ");

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
		 dataParser.CSV_parser(input);
		import_groups = true;
		}catch(Exception e){
			System.out.println("file parsing problem");
		}
	}
	public static void exit_button_pressed(){
		System.exit(0);
	}
	public static void get_groups_button_pressed(int class_size, int group_size){
		// retrieve all data from file
		int mod_remain = class_size % group_size;
		if(mod_remain > 0){
			remainder = mod_remain;	
		}
		number_of_groups = (class_size/group_size); 
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
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowFirstPage();
			}
		});
	}
}

