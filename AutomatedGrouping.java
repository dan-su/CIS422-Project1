import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.io.File;
import Person

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
    private static int array_size;
    private static String[] names;
    public static final int num_of_groups = 10;
    public static final int num_of_students = 30;


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
    
    public static void createAndShowGUI() {
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
        JTextField input_data_field = new JTextField(400);
        //JLabel
        JLabel input_data_label = new JLabel("Type the name of the textfile below: ");
        JLabel group1_label = new JLabel(" ");
        JLabel group2_label = new JLabel(" ");
        JLabel group3_label = new JLabel(" ");
        JLabel group4_label = new JLabel(" ");
        JLabel group5_label = new JLabel(" ");
        JLabel group6_label = new JLabel(" ");
        JLabel group7_label = new JLabel(" ");
        JLabel group8_label = new JLabel(" ");
        JLabel group9_label = new JLabel(" ");
        JLabel group10_label = new JLabel(" ");
        JLabel group11_label = new JLabel(" ");
        JLabel group12_label = new JLabel(" ");
        JLabel group13_label = new JLabel(" ");
        JLabel group14_label = new JLabel(" ");
        JLabel group15_label = new JLabel(" ");
        JLabel group16_label = new JLabel(" ");
        JLabel group17_label = new JLabel(" ");
        JLabel group18_label = new JLabel(" ");

       // Font font = new Font("Courier", Font.BOLD,14);
        //input_data_label.setFont(font);
        //group1_label.setFont(font);
        group1_label.setPreferredSize(new Dimension(200, 200));
        group2_label.setPreferredSize(new Dimension(200, 200));
        group3_label.setPreferredSize(new Dimension(200, 200));
        group4_label.setPreferredSize(new Dimension(200, 200));
        group5_label.setPreferredSize(new Dimension(200, 200));
        group6_label.setPreferredSize(new Dimension(200, 200));
        group7_label.setPreferredSize(new Dimension(200, 200));
        group8_label.setPreferredSize(new Dimension(200, 200));
        group9_label.setPreferredSize(new Dimension(200, 200));
        group10_label.setPreferredSize(new Dimension(200, 200));
        group11_label.setPreferredSize(new Dimension(200, 200));
        group12_label.setPreferredSize(new Dimension(200, 200));
        group13_label.setPreferredSize(new Dimension(200, 200));
        group14_label.setPreferredSize(new Dimension(200, 200));
        group15_label.setPreferredSize(new Dimension(200, 200));
        group16_label.setPreferredSize(new Dimension(200, 200));
        group17_label.setPreferredSize(new Dimension(200, 200));
        group18_label.setPreferredSize(new Dimension(200, 200));

      
        
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

        get_groups_button.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) { 
             
             group1_label.setText("GROUP 1");
             group2_label.setOpaque(true);
             group2_label.setBackground(Color.white);
             group3_label.setOpaque(true);
             group3_label.setBackground(Color.white);
             group4_label.setOpaque(true);
             group4_label.setBackground(Color.white);
             group5_label.setOpaque(true);
             group5_label.setBackground(Color.white);
             group6_label.setOpaque(true);
             group6_label.setBackground(Color.white);
             group7_label.setText("GROUP 2");
             group8_label.setOpaque(true);
             group8_label.setBackground(Color.white);
             group9_label.setOpaque(true);
             group9_label.setBackground(Color.white);
             group10_label.setBackground(Color.white);
             group10_label.setOpaque(true);
             group11_label.setBackground(Color.white);
             group11_label.setOpaque(true);
             group12_label.setOpaque(true);
             group12_label.setBackground(Color.white);
             group13_label.setText("GROUP 3");
             group14_label.setBackground(Color.white);
             group14_label.setOpaque(true);
             group15_label.setBackground(Color.white);
             group15_label.setOpaque(true);
             group16_label.setBackground(Color.white);
             group16_label.setOpaque(true);
             group17_label.setBackground(Color.white);
             group17_label.setOpaque(true);
             group18_label.setBackground(Color.white);
             group18_label.setOpaque(true);

          get_groups_button_pressed();

         } 
        } );
    //set panel layout to null
        panel.setLayout(null);
// setting items coordinates on GUI
          exit_button.setBounds(350,700,85,30);
     get_groups_button.setBounds(500,115,140,30);
         import_button.setBounds(500,85,140,30);
      input_data_field.setBounds(50,85,400,30);
      input_data_label.setBounds(51,55,400,30);
      group1_label.setBounds(30,200,150,30);
      group2_label.setBounds(30,240,150,30);
      group3_label.setBounds(30,280,150,30);
      group4_label.setBounds(30,320,150,30);
      group5_label.setBounds(30,360,150,30);
      group6_label.setBounds(30,400,150,30);
      group7_label.setBounds(190,200,150,30);
      group8_label.setBounds(190,240,150,30);
      group9_label.setBounds(190,280,150,30);
      group10_label.setBounds(190,320,150,30);
      group11_label.setBounds(190,360,150,30);
      group12_label.setBounds(190,400,150,30);
      group13_label.setBounds(350,200,150,30);
      group14_label.setBounds(350,240,150,30);
      group15_label.setBounds(350,280,150,30);
      group16_label.setBounds(350,320,150,30);
      group17_label.setBounds(350,360,150,30);
      group18_label.setBounds(350,400,150,30);

  // Add button to JPanel
        panel.add(exit_button);
        panel.add(get_groups_button);
        panel.add(import_button);  
        panel.add(input_data_field);    
        panel.add(input_data_label); 
        panel.add(group1_label);
        panel.add(group2_label);
        panel.add(group3_label);
        panel.add(group4_label);
        panel.add(group5_label);
        panel.add(group6_label);
        panel.add(group7_label);
        panel.add(group8_label);
        panel.add(group9_label);
        panel.add(group10_label);
        panel.add(group11_label);
        panel.add(group12_label);
        panel.add(group13_label);
        panel.add(group14_label);
        panel.add(group15_label);
        panel.add(group16_label);
        panel.add(group17_label);
        panel.add(group18_label);

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
        int size_of_groups = get_array_size()/num_of_groups;
        String[] group1 = new String[size_of_groups];
        String[] group2 = new String[size_of_groups];
        String[] group3 = new String[size_of_groups];
        String[] group4 = new String[size_of_groups];
        String[] group5 = new String[size_of_groups];
        String[] group6 = new String[size_of_groups];
        String[] group7 = new String[size_of_groups];
        String[] group8 = new String[size_of_groups];
        String[] group9 = new String[size_of_groups];
        String[] group10= new String[size_of_groups];
        String[] group11= new String[size_of_groups];
        String[] group12= new String[size_of_groups];
        String[] group13= new String[size_of_groups];
        String[] group14= new String[size_of_groups];
        String[] group15= new String[size_of_groups];
        
        /*for(int i = 0; i< get_array_size(); i++){
            if(i < (size_of_groups)){
                group1[i] = names[i];
            }
            else if(i < (size_of_groups*2)){
                group2[i] = names[i];
            }    
            }*/
       }
    public static void main(String[] args) {
        Person student = new Person();
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}

