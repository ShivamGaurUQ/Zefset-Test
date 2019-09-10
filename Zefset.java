import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import java.text.*;
import java.sql.Timestamp;
import java.util.Date;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zefset extends JFrame {
    JButton blogin; JFrame frame;
    Path currentPath = Paths.get(System.getProperty("user.dir"));
    Path fontPathcb = Paths.get(currentPath.toString(), "font", "Cabin-Bold.otf");
    Path fontPathcbi = Paths.get(currentPath.toString(), "font", "Cabin-BoldItalic.otf");
    Path fontPathci = Paths.get(currentPath.toString(), "font", "Cabin-Italic.otf");
    Path imgPathzef = Paths.get(currentPath.toString(), "zefset4.png");
    Path imgPaththnx = Paths.get(currentPath.toString(),"THANX.png");
    Path imgPathdi = Paths.get(currentPath.toString(),"di.png");
    
    Path imgPathres = Paths.get(currentPath.toString(),"result.txt");
    Path imgPathbear = Paths.get(currentPath.toString(),"beares.txt");
    Path imgPathq2 = Paths.get(currentPath.toString(),"q2.png");
    
    public Zefset() {
        
        
        try {
            //Creating the font Cabin-Bold to use and specifying the size!
            
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //Registering the font
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }
        try {
            //Creating the font Cabin-BoldItalic to use and specifying the size!
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //Registering the font
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }
        
        try {
            //Creating the font Cabin-Italic to use and specifying the size!
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //Registering the font
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }
        
        
        
        
        //Setting the JFrame
        
        
        frame = new JFrame("Zefinite Startup Employability Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        JPanel panel = (JPanel)frame.getContentPane();
        frame.setSize(10000,10000);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        blogin = new JButton("START");
        blogin.setFont(new java.awt.Font("customFont", Font.BOLD, 25));
        Color myColor = Color.decode("#ffa700");
        blogin.setBackground(myColor);
        blogin.setForeground(Color.black);
        
        JLabel label = new JLabel();
        //Using ZEFSET logo
        label.setIcon(new ImageIcon(imgPathzef.toString()));
        JLabel text=new JLabel("India's First Startup Employability Test Powered by Zefinite" );
        
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        text.setVerticalAlignment(JLabel.CENTER);
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setLocation(0,0);
        text.setForeground(Color.red);
        text.setBackground(Color.white);
        
        blogin.setSize(200,40);
        blogin.setLocation(600,600);
        blogin.setHorizontalAlignment(JButton.CENTER);
        
        
        panel.add(blogin);
        panel.add(label);
        frame.setLocationRelativeTo(null);
        frame.pack();
        
        frame.setVisible(true);
        
        
        actionlogin();
        
        
    }
    
    
    
    
    
    
    public void actionlogin()
    
    {
        
        blogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                Log2 l =new Log2();
                l.setVisible(true);
                frame.setVisible(true);
                l.setVisible(true);
                dispose();
                
                
                
                
                
                
                
            }
        });
    }
    
    public static void main (String args[])
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Zefset();
            }
        });
    }
}




class Log2 extends JFrame 
{
    
    Path currentPath = Paths.get(System.getProperty("user.dir"));
    Path fontPathcb = Paths.get(currentPath.toString(), "font", "Cabin-Bold.otf");
    Path fontPathcbi = Paths.get(currentPath.toString(), "font", "Cabin-BoldItalic.otf");
    Path fontPathci = Paths.get(currentPath.toString(), "font", "Cabin-Italic.otf");
    Path imgPathzef = Paths.get(currentPath.toString(), "zefset4.png");
    Path imgPaththnx = Paths.get(currentPath.toString(),"THANX.png");
    Path imgPathdi = Paths.get(currentPath.toString(),"di.png");
    
    Path imgPathres = Paths.get(currentPath.toString(),"result.txt");
    Path imgPathbear = Paths.get(currentPath.toString(),"beares.txt");
    Path imgPathq2 = Paths.get(currentPath.toString(),"q2.png");
    
    
    
    
    public static void main(String args[])
    {
        
        Log2 frameTabel = new Log2();
        
    }
    
    JButton blogin = new JButton("LOGIN");
    JPanel panel = new JPanel();
    JLabel labeln = new JLabel("Name :");
    JLabel labelr = new JLabel("Roll No. :");
    
    JTextField txuser = new JTextField(15);
    JPasswordField pass = new JPasswordField(15);
    
    Log2(){
        
        
        
        
        
        super("Login Autentification");
        try {
            //create the font to use. Specify the size!
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }
        try {
            //create the font to use. Specify the size!
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }
        
        try {
            //create the font to use. Specify the size!
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }
        
        
        setSize(300,200);
        setLocation(500,280);
        panel.setLayout (null);
        
        txuser.setBounds(90,30,150,20);
        pass.setBounds(90,70,150,20);
        blogin.setBounds(110,100,80,20);
        blogin.setSize(100,30);
        Color myColor = Color.decode("#ffa700");
        blogin.setBackground(myColor);
        blogin.setForeground(Color.black);
        blogin.setFont(new java.awt.Font("customFont", Font.BOLD, 16));
        labeln.setFont(new Font("customFont", Font.BOLD, 12));
        labelr.setFont(new Font("customFont", Font.BOLD, 12));
        labeln.setBounds(20,30,60,20);
        labelr.setBounds(20,70,60,20);
        
        labeln.setOpaque(true);
        
        labeln.setForeground(Color.black);
        labelr.setOpaque(true);
        
        labelr.setForeground(Color.black);
        
        
        panel.add(blogin);
        panel.add(txuser);
        panel.add(pass);
        panel.add(labeln);
        panel.add(labelr);
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        actionlogin();
        
    }
    
    public void actionlogin(){
        
        newframe f;
        final String name[]=new String[2];
        final String roll[]=new String[2];
        name[0]="Shivam Gaur";
        name[1]="Tushar Garg";
        roll[0]="12345";
        roll[1]="67890";
        blogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String puname = txuser.getText();
                String ppaswd = pass.getText();
                int i,flagname=-1,flagroll=-2;
                try{
                    
                    PrintWriter writer = new PrintWriter(imgPathres.toString(), "UTF-8");
                    
                    writer.println("\n\nStudent Name: "+puname);
                    writer.println("\n");
                    writer.println("\n");
                    
                    
                    writer.println("Student Roll No. : "+ppaswd);
                    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
                    writer.println("\n\nTime of logging in ->  "+timeStamp);
                    
                    writer.println("\n");
                    writer.println("\n");
                    writer.println("\n");
                    
                    writer.close();
                    
                }
                catch(Exception e)
                {
                    System.out.println("Error in writing marks to file");
                }
                
                
                
                
                
                
                
                
                if(puname.length()>0&&ppaswd.length()>0)
                    
                    
                {
                    
                    
                    
                    Log l =new Log();
                    l.setVisible(true);
                    dispose();
                }
                
                else
                {
                    
                    JOptionPane.showMessageDialog(null,"Wrong Password / Username");
                    txuser.setText("");
                    pass.setText("");
                    txuser.requestFocus();
                }
                
            }
        });
    }
}





class Log extends JFrame
{
    
    
    
    
    Path currentPath = Paths.get(System.getProperty("user.dir"));
    Path fontPathcb = Paths.get(currentPath.toString(), "font", "Cabin-Bold.otf");
    Path fontPathcbi = Paths.get(currentPath.toString(), "font", "Cabin-BoldItalic.otf");
    Path fontPathci = Paths.get(currentPath.toString(), "font", "Cabin-Italic.otf");
    Path imgPathzef = Paths.get(currentPath.toString(), "zefset4.png");
    Path imgPaththnx = Paths.get(currentPath.toString(),"THANX.png");
    Path imgPathdi = Paths.get(currentPath.toString(),"di.png");
    
    Path imgPathres = Paths.get(currentPath.toString(),"result.txt");
    Path imgPathbear = Paths.get(currentPath.toString(),"beares.txt");
    Path imgPathq2 = Paths.get(currentPath.toString(),"q2.png");
    public static void main(String[] args)
    {
        Log frameTabel = new Log();
    }
    
    JButton blogin = new JButton("START TEST");
    JPanel panel = new JPanel();
    JLabel labeln = new JLabel("Password :");
    
    JPasswordField pass = new JPasswordField(15);
    
    Log(){
        
        
        
        super("Authentication Password");
        
        try {
            //create the font to use. Specify the size!
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }
        try
        {
            //create the font to use. Specify the size!
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }
        
        try {
            //create the font to use. Specify the size!
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }
        
        setSize(350,200);
        setLocation(500,280);
        panel.setLayout (null);
        
        
        pass.setBounds(90,70,200,20);
        blogin.setBounds(110,100,150,20);
        blogin.setSize(160,30);
        Color myColor = Color.decode("#ffa700");
        blogin.setBackground(myColor);
        
        blogin.setForeground(Color.black);
        blogin.setFont(new java.awt.Font("customFont", Font.BOLD, 16));
        labeln.setFont(new Font("customFont", Font.BOLD, 12));
        labeln.setBounds(20,30,90,20);
        
        
        labeln.setOpaque(true);
        
        labeln.setForeground(Color.black);
        
        
        panel.add(blogin);
        
        panel.add(pass);
        panel.add(labeln);
        
        getContentPane().add(panel);
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        actionlogin();
    }
    
    public void actionlogin()
    
    {
        
        final String password=new String("000111");
        blogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                String ppaswd = pass.getText();
                
                BufferedWriter bw = null;
                
                
                try {
                    // APPEND MODE  SET HERE
                    bw = new BufferedWriter(new FileWriter(imgPathres.toString(), true));
                    
                    bw.write("\n\nOTP entered : "+ppaswd);
                    
                    bw.newLine();
                    bw.newLine();
                    
                    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
                    bw.write("\n\nTime of entering otp ->  "+timeStamp);
                    bw.newLine();
                    bw.newLine();
                    bw.newLine();
                    bw.flush();
                    
                }
                
                
                
                
                
                catch (IOException ioe)
                {
                    ioe.printStackTrace();
                }
                finally
                {// always close the file
                    if (bw != null) try
                    {
                        bw.close();
                    }
                    catch (IOException ioe2)
                    {
                        // just ignore it
                    }
                } // end try/catch/finally
                
                
                
                
                
                
                
                
                
                if(ppaswd.equals(password)==true)
                {
                    
                    
                    OnlineTest o =new OnlineTest();
                    o.start();
                    dispose();
                }
                else
                {
                    
                    JOptionPane.showMessageDialog(null,"Wrong Password");
                    pass.setText("");
                    
                }
                
            }
        });
    }
}





class bear extends JFrame 
{
    Path currentPath = Paths.get(System.getProperty("user.dir"));
    Path fontPathcb = Paths.get(currentPath.toString(), "font", "Cabin-Bold.otf");
    Path fontPathcbi = Paths.get(currentPath.toString(), "font", "Cabin-BoldItalic.otf");
    Path fontPathci = Paths.get(currentPath.toString(), "font", "Cabin-Italic.otf");
    Path imgPathzef = Paths.get(currentPath.toString(), "zefset4.png");
    Path imgPaththnx = Paths.get(currentPath.toString(),"THANX.png");
    Path imgPathdi = Paths.get(currentPath.toString(),"di.png");
    
    Path imgPathres = Paths.get(currentPath.toString(),"result.txt");
    Path imgPathbear = Paths.get(currentPath.toString(),"beares.txt");
    Path imgPathq2 = Paths.get(currentPath.toString(),"q2.png");
    public String puname= new String();
    
    String bearstr=new String();
    
    
    
    JButton blogin = new JButton("Click to save answer");
    JPanel panel = new JPanel();
    JLabel labeln = new JLabel("Write your answer here : ");
    
    
    JTextField txuser = new JTextField(15);
    
    
    
    
    bear(int y)
    {
        this.puname=bearstr;
    }
    bear(bear x)
    {
        x.puname=bearstr;
    }
    
    bear()
    {
        
        super("WRITE ANSWER OF QUESTION 20 HERE ");
        try {
            //create the font to use. Specify the size!
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }
        try {
            //create the font to use. Specify the size!
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }
        
        try {
            //create the font to use. Specify the size!
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(FontFormatException e)
        {
            e.printStackTrace();
        }
        
        
        setSize(300,200);
        setLocation(500,280);
        panel.setLayout (null);
        
        txuser.setBounds(90,30,150,20);
        
        blogin.setSize(200,30);
        blogin.setLocation(50,100);
        Color myColor = Color.decode("#ffa700");
        blogin.setBackground(myColor);
        blogin.setForeground(Color.black);
        blogin.setFont(new java.awt.Font("customFont", Font.BOLD, 16));
        labeln.setFont(new Font("customFont", Font.BOLD, 12));
        
        labeln.setSize(160,30);
        
        labeln.setOpaque(true);
        
        labeln.setForeground(Color.black);
        panel.add(txuser);
        
        panel.add(labeln);
        
        panel.add(blogin);
        getContentPane().add(panel);
        
        setResizable(true);
        setVisible(true);
        
        actionlogin();
        
        
    }
    
    public void actionlogin()
    {
        
        blogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                puname = txuser.getText();
                bearstr=puname;
                
                try{
                    
                    PrintWriter writer = new PrintWriter(imgPathbear.toString(), "UTF-8");
                    
                    writer.println(puname);
                    
                    writer.close();
                }
                catch(Exception e)
                {
                    System.out.println("Error in writing marks to file");
                }
                
                
            }
        });
    }
    
}

















class QuestionSeries{
    static String info ="  \n \nREAD THE FOLLOWING INSTRUCTIONS:\n\n1. There are 40 awesome questions in this test and 90 minutes to answer them all.\n\n2. Maximum Marks for the test are 100.\n\n3. Calculators, cell phones, iPhones and electronic gadgets of any form are not allowed.\n\n4. This paper has 5 sections, Section A (Quantitative Ability), Section B (Logical and Analytical Reasoning), Section C (Data Interpretation), Section D (Communication Skills) and Section E (Startup Skills).\n\n5. Section A has 10 questions | Section B has 10 questions | Section C has 5 questions | Section D has 10 questions | Section E has 5 questions.\n\n 6. For each correct answer you will be awarded 2.5 Marks and for every pair of consecutive wrong answers you will awarded -1 marks.\n\n7. There is no negative marking for unattempted questions but if no. of unattempted questions are more than 15, there will be a penalty of -0.25 for every unattempted question.\n\n8. For answering every question, you are required to check the square corresponding to the correct answer.\n\n9. The finish button is highlighted in green when you reach the end of the test. \n\n10. Clicking the FINISH button will lead to the submission of the test without any prompt.\nSO BE CAREFUL WHILE CLICKING THE FINISH BUTTON.  \n\n11. The time counter  begins when you click on the 'START' button. \n\n\t\t\t\tAll The Best !\n";
    
    static String []question ={"SECTION-A: QUANTITATIVE ABILITY\n\n\nQuestion 1:\n\n\nHoussup.com is an e-commerce site for buying furniture. For a client meeting they need to form a committee. In how many ways, a committee of 5 members can be selected from 6 men and 5 ladies, consisting of 3 men and 2 ladies?",
    "SECTION-A: QUANTITATIVE ABILITY\n\n\nQuestion 2:\n\n\nThe average of 2, 7, 6 and x is 5 and the average of 18, 1, 6, x and y is 10. What is the value of y?",
    "SECTION-A: QUANTITATIVE ABILITY\n\n\nQuestion 3:\n\n\nAwakey, a startup that makes smart Bluetooth controlled door locks was testing meters to build the locks. An Inspector at Awakey rejects 0.08% of the meters as defective. How many will he examine to reject 2?",
    "SECTION-A: QUANTITATIVE ABILITY\n\n\nQuestion 4:\n\n\nSuresh opened a startup with Rs.20,000. Kiran joined him after 4 months with Rs.30,000. After 2 months, Suresh withdrew Rs.5,000 of his capital and 2 more months later, Kiran brought in Rs.20,000 more. What should be the ratio in which they should share their profits at the end of the year?",
    "SECTION-A: QUANTITATIVE ABILITY\n\n\nQuestion 5:\n\n\nThe founders at Freefolk, a startup that allows to you connect and share your travel experiences asked you a question. "+"'"+"If you give the right answer, you will get two movie tickets. An unbiased die is tossed. Find the probability of getting a multiple of 3?"+"'",
    "SECTION-A: QUANTITATIVE ABILITY\n\n\nQuestion 6:\n\n\nAn angel investor invested in your startup with some money. How long will it take that sum of money invested at 5% p.a. SI to increase its value by 40%?",
    "SECTION-A: QUANTITATIVE ABILITY\n\n\nQuestion 7:\n\n\nIf one-third of one-fourth of number is 15 , Then three-tenth of that number is :",
    "SECTION-A: QUANTITATIVE ABILITY\n\n\nQuestion 8:\n\n\nThree interns at PriceDekho (An offspring of Girnar Software Pvt. Ltd) Ankur, Bhavya and Chhavi can complete a piece of work in 24, 6 and 12 days respectively. Working together they can complete the  same work in:",
    "SECTION-A: QUANTITATIVE ABILITY\n\n\nQuestion 9:\n\n\nDelhivery, India's first end-to-end supply chain startup has 3 packages to deliver by the name A, B and C. The average weight of A, B and C is 45 kg. If the average weight of A and B be 40 kg and that of B and C be 43 kg, what is the weight of B?",
    "SECTION-A: QUANTITATIVE ABILITY\n\n\nQuestion 10:\n\n\nRavi and Sumit work in Education Stack, a company which makes Institute & School Management Software. Their salaries are in the ratio of 2:3. If the salary of each is increased by Rs 4000, the new ratio becomes 40:57. What is the salary of Sumit?",
    "SECTION-B: LOGICAL AND ANALYTICAL REASONING\n\n\nQuestion 11:\n\n\nIf ROBUST is coded as QNATRS in a certain language, which word would be coded as ZXCMP?",
    "SECTION-B: LOGICAL AND ANALYTICAL REASONING\n\n\nQuestion 12:\n\n\nWhich of the following figures best depicts the relationship among criminals, thieves and judges?",
    "SECTION-B: LOGICAL AND ANALYTICAL REASONING\n\n\nQuestion 13:\n\n\nKarmyo is a startup that aims to make youth socially responsible through inspirational merchandise and social externships. For going to such an externship, Aman started walking from his house toward south. After walking 6 km, he turned to his left and walked 5km. Then he walked further 3 km after turning left. He then turned to his left and continued his walk for 9 km. How far is he away from his house?",
    "SECTION-B: LOGICAL AND ANALYTICAL REASONING\n\n\nQuestion 14:\n\n\nStatement:  Since its launching in 1981, Vayudoot has so far accumulated losses amounting to Rs 153 crore.\n\n\nCourses of Action:\n\t1.  Vayudoot should be directed to reduce wasteful expenditure and to increase passenger fair.\n\t2.  An amount of about Rs 300 crore should be provided to Vayudoot to make the airliner economically viable.",
    "SECTION-B: LOGICAL AND ANALYTICAL REASONING\n\n\nQuestion 15:\n\n\nMarathon: Race :: Hibernation : ? ",
    "SECTION-B: LOGICAL AND ANALYTICAL REASONING\n\n\nQuestion 16:\n\n\nDesign Ghar is a housing solutions marketplace, where all kinds of constructions & designing materials are available at same place. One of the warmest winters on record has put consumers in the mood to spend money. Spending is likely to be the strongest in thirteen years. During the month of February, sales of existing single-family homes hit an annual record rate of 4.75 million.\nThis paragraph best supports the statement that",
    "SECTION-B: LOGICAL AND ANALYTICAL REASONING\n\n\nQuestion 17:\n\n\nBluecube Network, a digital marketing agency believes that-Satisfaction with co-workers, promotion opportunities, the nature of work, and pay goes with high performance among those with strong growth needs. Among those with weak growth needs, no such relationship is present - and, in fact, satisfaction with promotion opportunities goes with low performance.\nThis passage best supports the statement that:\n\na. Satisfaction is an inevitable organizational variable.\nb. Job satisfaction and performance are directly and closely related.\nc. Relationship between job satisfaction and performance is moderated by growth need.\nd. Every organization has few employees having weak growth need",
    "SECTION-B: LOGICAL AND ANALYTICAL REASONING\n\n\nQuestion 18:\n\n\nLook at this series: F2, ____, D8, C16, B32, ... What number should fill the blank?",
    "SECTION-B: LOGICAL AND ANALYTICAL REASONING\n\n\nQuestion 19:\n\n\nSix friends Ankit, Bhuvan, Chetan, Dhruv, Eshan and Farhan of the startup Web2Attract, a full-service digital marketing agency are sitting in a closed circle facing the center for a counter strike Friday.\nEshan is to the left of Dhruv. \nChetan is between Ankit and Bhuvan.\nFarhan is between Eshan and Ankit.\nWho is to the left of Bhuvan?",
    "SECTION-B: LOGICAL AND ANALYTICAL REASONING\n\n\nQuestion 20:\n\n\nA man built a rectangular house, each side having a southern view. He spotted a bear. What colour was the bear? ",
    "SECTION-C: DATA INTERPRETATION\n\n\nQuestion 21:\n\n\nFor which of the following pairs of years the total exports from the three companies together are equal?",
    "SECTION-C: DATA INTERPRETATION\n\n\nQuestion 22:\n\n\nAverage annual exports during the given period for Company Y is approximately what percent of the average annual exports for Company Z?",
    "SECTION-C: DATA INTERPRETATION\n\n\nQuestion 23:\n\n\nIn which year was the difference between the exports from Companies X and Y the minimum?",
    
    "SECTION-C: DATA INTERPRETATION\n\n\nQuestion 24:\n\n\nWhat was the difference between the average exports of the three Companies in 1993 and the average exports in 1998?",
    "SECTION-C: DATA INTERPRETATION\n\n\nQuestion 25:\n\n\nIn how many of the given years, were the exports from Company Z more than the average annual exports over the given years?",
    "SECTION-D: COMMUNICATION SKILLS\n\n\nQuestion 26:\n\n\n"+"'"+"Even if it rains I shall come"+"'"+" means ",
    "SECTION-D: COMMUNICATION SKILLS\n\n\nQuestion 27:\n\n\nThe employees at 1mg (HealthKart),  the trusted pharmacy network and generic medicine search engine of India  were hell bent at getting what was due to them. They got what they deserved andwere happy.",
    "SECTION-D: COMMUNICATION SKILLS\n\n\nQuestion 28:\n\n\nA person of good understanding knowledge and reasoning power ",
    "SECTION-D: COMMUNICATION SKILLS\n\n\n\nRead the each sentence to find out whether there is any grammatical error in it. The error, if any will be in one part of the sentence. The letter of that part is the answer. If there is no error, the answer is 'D'. (Ignore the errors of punctuation, if any).\n\nQuestion 29:\n (solve as per the direction given above)",
    "SECTION-D: COMMUNICATION SKILLS\n\n\nQuestion 30:\n\n\n(solve as per the direction given above)",
    "SECTION-D: COMMUNICATION SKILLS\n\n\n\nFollowing is the body of an email drafted, but the sentences are grammatically wrong. Which of phrases given below each sentence should replace the phrase underlined to make it grammatically correct? \n\n\nMore and more holidaymakers are choosing to fly to remote islands in search of the perfect beach; seeking sand, sun and palm trees, rather than centers of entertainment. Thus new locations have to be updated and new forms generated. The startup requires that these forms should be submitted before the end of the financial year.\n\nRegards\nOkToBoard\n\n\nQuestion 31:\n\nMore and more holidaymakers are choosing to fly to remote islands in search of the perfect beach; seeking sand, sun and palm trees, rather than centers of entertainment. ",
    "SECTION-D: COMMUNICATION SKILLS\n\n\nQuestion 32:\n\n\nThe startup requires that these forms should be submitted before the end of the financial year",
    "SECTION-D: COMMUNICATION SKILLS\n\n\nQuestion 33:\n\n\nThe sentences given in each question, when properly sequenced, form a coherent paragraph. Each sentence is labelled with a letter. Choose the most logical order of sentences from among the given choices to construct a coherent paragraph.Title- Customers for ready-to-buy gifts | Indibni\n\n\n(i)	So far, Indibni has received orders from over 15 countries.\n\n(ii)	Most of the company’s ready-to-buy products are quirky, and range from Rs. 150 to Rs.1500, and the buyers are youngsters aged between 13 and 35 who live mostly in the Indian metros and larger cities.\n\n(iii)	The products are also sold through some of the outlets of retail chains like Crossword, Paparazzi, and Shoppers Stop\n\n(iv)	Indibni has processed orders from over fifty cities in India through various e-commerce platforms like Amazon, Flipkart, eBay, Snapdeal, Fabfurnish, PayTM, etc.\n\n(v)       These products are much appreciated by the NRIs, who are looking to send gifts to theirloved ones in India.",
    "SECTION-D: COMMUNICATION SKILLS\n\n\n\nIn each of the following questions two statements are given and these statements are followed by two conclusions numbered (1) and (2). You have to take the given two statements to be true even if they seem to be at variance from commonly known facts. Read the conclusions and then decide which of the given conclusions logically follows from the two given statements, disregarding commonly known facts.\n\nQuestion 34:\n\n\nStatements: Some entrepreneurs are enthusiasts. All the enthusiasts are businessmen. \n\nConclusions: \n\n1.	All the businessmen are enthusiasts.\n\n2.	Some entrepreneurs are businessmen.",
    "SECTION-D: COMMUNICATION SKILLS\n\n\nQuestion 35: \n\n\nStatements: Some startups are companies. Some companies are MNCs.\n\nConclusions: \n\n1.	Some startups are MNCs.\n\n2.	All companies are MNCs.",
    "SECTION-E: STARTUP SKILLS\n\n\n\nSeema was a finance manager in an MNC and felt that gender discrimination at the workplace hampered her career growth. Frustrated, she quit the job and started a company. While starting her company, Seema decided that she would have equal proportion of males and females. Over the next six years, Seema emerged as a very successful entrepreneur and expanded her business to eight locations in the country. However, Seema recently started facing an ethical dilemma because she realized that female employees were not willing to travel across cities and work late hours, as the work required them to do. Male employees did not hesitate undertaking such work. Seema started to feel the pressure of reducing the proportion of female employees. On the other hand, she is aware that equal representation was one of the strongest reasons for her to have founded the company.\n\n\nQuestion 36 :\n\n\nWhat should she do as a conscientious female entrepreneur?",
    "SECTION-E: STARTUP SKILLS\n\n\n\nBhola, an avid nature lover, wanted to be an entrepreneur. He dreamt of establishing a chain of huts in Chatpur region to cater to tourists, who came attracted by the beauty and splendor of the Himalayas. However, he was appalled by current degradation of the Himalayan environment. He remembered the early times when everything was so green, clean and peaceful. Now, greenery was replaced by buildings. Peace was shattered by honking of vehicles and flocking of tourists, and cleanliness was replaced by heaps of plastics. Bhola had a strong sense of right and wrong. On speaking to few locals about the issue, he realized that the locals were aware of these issues. However, they pointed out the benefits of development: Pucca houses for locals, higher disposable income and with that, ability to send their children to better schools and colleges, better road connectivity, and access to latest technology in agriculture. Most locals wanted the development to continue. Saddened by the lack of support from the locals, Bhola took up the issue with the government. He met the chief minister of the state to find out if government could regulate the developmental activities to prevent environmental degradation. However, the chief minister told Bhola that such an action would slow down the economic progress. That also meant loss of substantial tax revenues for the government. Bhola needed to resolve the dilemma. Bhola always wanted to be an entrepreneur, who could contribute to the society and earn money as well. However, his business would also be responsible for destroying the environment. If he did not set up his business, he would not be able to earn money and contribute to the society. After mulling over the issues, he went to his mentor "+"'"+"Guruji"+"'"+". Guruji realized that it was really a difficult puzzle: if one saves the environment, there seems to be no development and if the people and the government sought development, the environment and hence future of this planet and human beings was at stake. After careful thought, he felt that dilemma could be resolved. He fixed up a meeting with Bhola to answer Bhola’s queries.\n\n Question 37:\n\nShould Bhola still think of doing business?",
    "SECTION-E: STARTUP SKILLS\n\n\nQuestion 38:\n\n\nBhola wanted to advise the government about the new tourism policy. Bhola had developed a few alternatives as given below. Choose the best alternative.",
    "SECTION-E: STARTUP SKILLS\n\n\nQuestion 39:\n\n\nBhola wished he was heading the government. He had listed down five concrete measures he would take if he were to head the government. Choose the best alternative.",
    "SECTION-E: STARTUP SKILLS\n\n\nQuestion 40:\n\n\nVisualizing he was heading the state government, Bhola thought of a likely problematic situation. Five years have passed. In these five years, Bhola has initiated a lot of pro-environment steps, including making people aware of the fact that it was this pristine environment which brought in tourists in the first place. Now he faced state elections. The opposition accused him of stopping development and causing unemployment under the guise of environment protection. If Bhola were to consider this accusation as a short-term battle, which option would Guruji suggest to Bhola to score a quick win?"
    };
    
    
    static String [][]answers ={{"200\n","150\n","250\n","300\n"},{"5\n"," \n20","15\n"," \n30\n"},{" \n2000\n","2500\n","3000\n","2700\n"},{" \n21:20","3:4\n"," \n3:10\n"," \n4:5\n"},{" \n1/2\n"," \n1/3\n"," \n1/4\n"," \n1/5\n"},{" \n5 Years\n"," \n6 Years\n"," \n7 Years\n","8 Years\n"},{" \n35\n"," \n36\n"," \n45\n"," \n54\n"},{" \n1/24 day`\n"," \n7/24 day\n"," \n24/7 day\n"," \n4 days\n"},{" \n31\n"," \n55\n"," \n40\n"," \n49\n"},{" \nRs. 17,000\n"," \nRs. 20,000\n"," \nRs. 25,000\n"," \nRs. 34,000\n"},{" \nYWBLO\n"," \nAYDNQ\n"," \nMPCXZ\n"," \nQNAPZM\n"},{" \n(a)\n"," \n(b)\n"," \n(c)\n"," \n(d)\n"},{" \n5 km\n"," \n10 km\n"," \n7 km\n"," \n4 km\n"},{"Either 1 follows\n"," \nEither 2 follows\n"," \nBoth 1 and 2 follow\n"," \nNeither 1 or 2 follow\n"},{" \nWinter\n"," \nBear\n"," \nDream\n"," \nSleep\n"},{" \nConsumer spending will be higher thirteen years from now than it is today.\n"," \nMore people buy houses in the month of February than in any other month.\n"," \nWarm winter weather is likely to affect the rate of home sales.\n"," \nDuring the winter months, the prices of single-family homes are the lowest.\n"},{" \nSatisfaction is an inevitable organizational variable.\n"," \nJob satisfaction and performance are directly and closely related.\n"," \nRelationship between job satisfaction and performance is moderated by growth need.\n"," \nEvery organization has few employees having weak growth need.\n"},{" \nA16\n"," \nG4\n"," \nE4\n"," \nE3\n"},{" \nAnkit\n"," \nChetan\n"," \nDhruv\n"," \nEshan\n"},{" \nWrite the answer in text box contained in popup window\n"," \nThe answer is one word only\n"," \n\n"," \n\n"},{" \n1995 and 1998\n"," \n1996 and 1998\n"," \n1997 and 1998\n"," \n1995 and 1996\n"},{"87.12%\n"," \n89.64%\n"," \n91.21%\n"," \n93.33%\n"},{" 1994\n"," 1995\n"," 1996\n"," 1997\n"},{" \nRs. 15.33 crores\n"," \nRs. 18.67 crores\n"," \nRs. 20 crores\n"," \nRs. 22.17 crores\n"},{"2\n","3\n","4\n"," \n5\n"},{" \nif I come it will not rain\n","if it rains I shall not come\n","I will certainly come even if it rains or not.\n","I am less likely to come if it rains.\n"},{"Hell bent on getting\n","Hell bent for getting\n","Hell bent upon getting\n"," \nNo improvement\n"},{"Expert\n","Intellectual\n","Snob\n"," \nLiterate\n"},{"We discussed about the problem so thoroughly\n","on the eve of the examination\n","that I found it very easy to work it out\n"," \nNo error\n"},{"An Indian ship\n","laden with merchandise\n","got drowned in the pacific ocean\n"," \nNo error\n"},{"seeking sand, sun and palm trees, rather than centers of entertainment.\n","seeking sand, sun, palm trees and not entertainment.\n","they seek sand, sun and palm trees, rather than entertainment centers.\n"," \nthey seek sand, sun and palm trees, rather than centers of entertainment.\n"},{"that these forms should be submitted\n","that these forms be submitted\n","these forms submission\n"," \nthese forms should be submitted\n"},{"(iv)(v)(iii)(ii)(i)\n","(ii)(iv)(iii)(v)(i)\n","(i)(ii)(iii)(iv)(v)\n"," \n(iii)(v)(ii)(iv)(i)\n"},{"Only (1) conclusion follows\n","Only (2) conclusion follows\n","Either (1) or (2) follows\n"," \nNeither (1) nor (2) follows\n"},{"Only (1) conclusion follows\n","Only (2) conclusion follows\n","Either (1) or (2) follows\n"," \nNeither (1) nor (2) follows\n"},{"See if unwilling female employees could be given assignments which do not require travel and involve less overtime.\n","Reduce the number of female employees, as it is a business requirement. She should not let anything affect her business.\n","Let the status quo continue.\n"," \nHenceforth hire only male employees.\n"},{"Yes, where there is a will, there is a way\n"," \nNo, saving the Earth for our children is more important than earning money.","Yes, Bhola should do business while ensuring no environmental damage is done.\n"," \nYes, but only if the government puts strict environmental regulations in place.\n"},{"Stop environmental degradation by stopping the developmental activities.\n"," \nForget about the environment; think about the people as they are the vote banks for politicians to come back to power.","Suggest that the government should try to promote eco-tourism, which would be controlled and regulated by the government, as the government could think about welfare of majority of stakeholders.\n"," \nSuggest that the government should promote eco-tourism with public-private partnership with the involvement of NGOs, So that there are checks and balances for inefficiencies and promotion for synergetic efforts between the government and private entrepreneurs.\n"},{"Charge environmental cess from all businesses operating out of Himalayas.\n"," \nCharge cess from anyone who pollutes the environment, it be citizens or industries and reward those who have contributed to afforestation the most.","All profit making organizations have to take responsibility of afforestation proportionate to their profitability.\n"," \nThink about maximizing the revenues and forget about the environment.\n"},{"Accuse the opposition of having vested interests as the opposition leaders were denied licenses for opening new hotels.\n"," \nPoint out the improvement in environment since the implementation of pro-environment policies.","Compare the unemployment levels since the implementation of the pro-environment policies and if they are less, accuse the opposition of making baseless charges.\n"," \nPoint out that this government had initiated a regular cleaning-up drive and the opposition did not consider the data regarding the people who were employed in that drive.\n"}};
    
    static int []n = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
    static String []choice= {"2","2","3","1","1","4","4","3","4","3","4","1","1","3","4","4","2","4","3","2","2","3","3","2","1","4","1","1","3","4","4","2","4","3","2","2","3","3","2","1"};
    static int tally = question.length;
    static String testtitle="ZefSET Online Aptitude Test";
    static int timeLimit =90;
    static int passMark = 33;
}

/* OnlineTest class */

class OnlineTest extends JFrame{
    
    Path currentPath = Paths.get(System.getProperty("user.dir"));
    Path fontPathcb = Paths.get(currentPath.toString(), "font", "Cabin-Bold.otf");
    Path fontPathcbi = Paths.get(currentPath.toString(), "font", "Cabin-BoldItalic.otf");
    Path fontPathci = Paths.get(currentPath.toString(), "font", "Cabin-Italic.otf");
    Path imgPathzef = Paths.get(currentPath.toString(), "zefset4.png");
    Path imgPaththnx = Paths.get(currentPath.toString(),"THANX.png");
    Path imgPathdi = Paths.get(currentPath.toString(),"di.png");
    
    Path imgPathres = Paths.get(currentPath.toString(),"result.txt");
    Path imgPathbear = Paths.get(currentPath.toString(),"beares.txt");
    Path imgPathq2 = Paths.get(currentPath.toString(),"q2.png");
    
    
    static int TOTAL=0;
    
    static {
        try{
            TOTAL = QuestionSeries.tally;
            
        }catch(NullPointerException e){ System.exit(0); }
    }
    
    int seconds, minutes;
    int quesnum, itemCheck;double mark;
    final String TESTTITLE = QuestionSeries.testtitle;
    final int TIMELIMIT = QuestionSeries.timeLimit;
    final int PASS = QuestionSeries.passMark;
    String []answers = new String[TOTAL];
    JButton []choice_button = new JButton[10];
    JTextArea answerboxes[] = new JTextArea[4];
    JCheckBox []boxes = new JCheckBox[4];
    JTextPane pane = new JTextPane();
    JLabel student, choose, message, timecounter, testresult;
    boolean start_test, check_answer, allowRestart, finishtest;
    
    Northwindow panelNorth = new Northwindow();
    Southwindow panelSouth = new Southwindow();
    Centerwindow panelCenter = new Centerwindow();
    
    
    
    /*  OnlineTest Constructor */
    OnlineTest(){
        for (int i=0; i<TOTAL; i++) answers[i] ="";
        getContentPane().setLayout(new BorderLayout() );
        getContentPane().add("North", panelNorth);
        getContentPane().add("South", panelSouth);
        getContentPane().add("Center", panelCenter);
        int width = 0, height=0;
        if(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth()<799){width=		640; 		height=460; }
        else {width=720; height=540; }
        setSize(width,height);
        Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((dim.width-width)/2, (dim.height-height)/2);
    }
    
    /**
     **  Northwindow class
     **/
    
    class Northwindow extends JPanel{
        
        /**
         **  Northwindow constructor
         **/
        public Northwindow(){
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            
            
            Color myColor = Color.decode("#ffa700");
            setBackground(myColor);
            student = new JLabel("\t Welcome to the ZefSET\t\t");
            student.setFont(new Font("customFont",Font.BOLD,30) );
            student.setLocation(100,100);
            student.setVerticalAlignment(JLabel.CENTER);
            message = new JLabel();
            message.setForeground(Color.blue);
            add(student);
            add(message);
            add(new JLabel("               ") );
            add(new JLabel("               ") );
            
            setBorder(BorderFactory.createEtchedBorder() );
        }
    }
    
    /**
     **  Southwindow class
     **/
    class Southwindow extends JPanel{
        public Southwindow(){
            String []key = {""," START "," NEXT "," FINISH "," PREVIOUS "," SEC A-Quantitative Ability "," SEC B-Logical and Analytical Reasoning "," SEC C-Data Interpretation "," SEC D-Communication Skills "," SEC E-Startup Skills "};
            for(int i=0; i<choice_button.length; i++)
            {
                choice_button[i] = new JButton(key[i]);
                choice_button[i].addActionListener(new ActionHandler() );
                if(i !=0)add(choice_button[i]);
            }
            setBorder(BorderFactory.createEtchedBorder() );
        }
    }
    
    /**
     **  Centerwindow class
     **/
    class Centerwindow extends JPanel{
        
        public Centerwindow(){
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            
            
            setLayout(new GridLayout(1,2) );
            JScrollPane west = new JScrollPane(pane);
            pane.setText("ZefSET Online Aptitude Test");
            
            
            
            
            
            
            pane.setForeground(Color.black);
            pane.setFont(new Font ("customFont",Font.BOLD,16) );
            pane.setText(QuestionSeries.info);
            pane.setEditable(false);
            
            
            
            
            
            
            
            
            JPanel east = new JPanel();
            east.setLayout(new BorderLayout() );
            east.setFont(new Font ("customFont",Font.BOLD,16) );
            JPanel northEast = new JPanel();
            northEast.setBackground(new Color(230, 230, 255) );
            
            northEast.setFont(new Font ("customFont",Font.BOLD,16) );
            east.add("North", northEast);
            JPanel westEast = new JPanel();
            westEast.setLayout(new GridLayout(6,1) );
            westEast.setFont(new Font ("customFont",Font.BOLD,16) );
            east.add("West", westEast);
            JPanel centerEast = new JPanel();
            centerEast.setLayout(new GridLayout(6,1) );
            centerEast.setBackground(new Color(255,255,200));
            
            centerEast.setFont(new Font ("customFont",Font.BOLD,16) );
            east.add("Center", centerEast);
            timecounter = new JLabel("     There are "+40+" questions in total");
            timecounter.setFont(new Font ("customFont",Font.BOLD,16) );
            timecounter.setForeground(new Color(0,90,20) );
            northEast.add(timecounter);
            westEast.add(new JLabel(" "));
            String []boxs = {" A ", " B ", " C ", " D "};
            for(int i=0; i<boxes.length; i++) {
                boxes[i] = new JCheckBox(boxs[i]);
                boxes[i].addItemListener(new ItemHandler() );
                westEast.add(boxes[i]);
            }
            westEast.add(new JLabel() );
            choose = new JLabel("    CHOOSE CORRECT ANSWERS");
            choose.setBorder(BorderFactory.createEtchedBorder() );
            centerEast.add(choose);
            JScrollPane panes[] = new JScrollPane[4];
            for(int i=0; i<answerboxes.length; i++){
                answerboxes[i] = new JTextArea();
                answerboxes[i].setBorder(BorderFactory.createEtchedBorder() );
                answerboxes[i].setEditable(false);
                answerboxes[i].setBackground(Color.white);
                answerboxes[i].setForeground(Color.blue);
                answerboxes[i].setFont(new Font("customFont",Font.BOLD,16) );
                answerboxes[i].setLineWrap(true);
                answerboxes[i].setWrapStyleWord(true);
                panes[i] = new JScrollPane(answerboxes[i]);
                centerEast.add(panes[i]);
            }
            if(TIMELIMIT >0)testresult = new JLabel("   You have only : "+90+" minutes to complete.");
            else testresult = new JLabel("     There is no time limit for this test");
            testresult.setBorder(BorderFactory.createEtchedBorder() );
            centerEast.add(testresult);
            add(west);
            add(east);
        }
    }
    
    /**
     **  ActionHandler class to handle all the action events from the buttons.
     **/
    
    class ActionHandler implements ActionListener{
        int res;
        /* actionPerformed method */
        public void actionPerformed(ActionEvent evt){
            String source = evt.getActionCommand();
            if(source.equals(" START ")){
                choice_button[1].setVisible(false);
                start_test=true;
                allowRestart=true;
                if(TIMELIMIT >0)new Timer(); // inner Timer class
                panelSouth.remove(choice_button[1]); //start
                displayquestion();
            }
            if(start_test){
                if(source.equals(" PREVIOUS "))  {
                    recordanswer();
                    quesnum--;
                    if(quesnum ==  -1) quesnum=TOTAL-1;
                    for(int j=0; j<boxes.length; j++)boxes[j].setSelected(false);
                    if(quesnum==20||quesnum==21||quesnum==22||quesnum==23||quesnum==24){
                        datai d =new datai();
                        d.setVisible(true);
                        
                    }
                    
                    
                    if(quesnum==11){
                        questiondi d =new questiondi();
                        d.setVisible(true);
                        
                    }
                    if(quesnum==19){
                        bear d=new bear();
                        
                        d.setVisible(true);
                    }
                    
                    
                    
                    checkteststatus();
                    displayquestion();
                }
                if(source.equals(" NEXT ")) {
                    recordanswer();
                    quesnum++;
                    if(quesnum ==  TOTAL) quesnum=0;
                    for(int j=0; j<boxes.length; j++)boxes[j].setSelected(false);
                    
                    if(quesnum==21||quesnum==22||quesnum==23||quesnum==24||quesnum==20){
                        datai d =new datai();
                        d.setVisible(true);
                        
                    }
                    
                    if(quesnum==11){
                        questiondi d =new questiondi();
                        d.setVisible(true);
                        
                    }
                    
                    if(quesnum==19){
                        bear d=new bear();
                        
                        d.setVisible(true);
                    }
                    
                    
                    
                    
                    checkteststatus();
                    displayquestion();
                }
                if(source.equals(" FINISH ")) {
                    
                    
                    
                    
                    int opcion = JOptionPane.showConfirmDialog(null, "Are you sure you want to submit the test? Once submitted it cannot be undone. ", "Careful !", JOptionPane.YES_NO_OPTION);
                    
                    if (opcion == 0) { //The ISSUE is here
                        System.out.print("yes");
                        finishtest=true;
                    } else {
                        System.out.print("no");
                        finishtest=false;
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    if (finishtest){
                        recordanswer();
                        quesnum = 0;
                        
                        
                        timecounter.setForeground(Color.blue);
                        timecounter.setFont(new Font ("customFont",Font.BOLD,16) );
                        start_test=false;
                        check_answer=true;
                        
                        mark_ques();
                        displayquestion();
                        checkteststatus();
                        calculateResult();
                    }
                    else  JOptionPane.showMessageDialog(null,"Cycle through all questions before pressing finish at least. There is enough time left and there is no escape!",
                                                        "User Message",JOptionPane.INFORMATION_MESSAGE);
                }
                
                if(source.equals(" SEC A-Quantitative Ability ")) {
                    recordanswer();
                    quesnum=0;
                    for(int j=0; j<boxes.length; j++)boxes[j].setSelected(false);
                    
                    if(quesnum==21||quesnum==22||quesnum==23||quesnum==24||quesnum==20){
                        datai d =new datai();
                        d.setVisible(true);
                    }
                    
                    if(quesnum==11){
                        questiondi d =new questiondi();
                        d.setVisible(true);
                    }
                    
                    if(quesnum==19){
                        bear d=new bear();
                        
                        d.setVisible(true);
                    }
                    
                    
                    checkteststatus();
                    displayquestion();
                }
                
                
                if(source.equals(" SEC B-Logical and Analytical Reasoning ")) {
                    recordanswer();
                    quesnum=10;
                    for(int j=0; j<boxes.length; j++)boxes[j].setSelected(false);
                    
                    if(quesnum==21||quesnum==22||quesnum==23||quesnum==24||quesnum==20){
                        datai d =new datai();
                        d.setVisible(true);
                    }
                    
                    if(quesnum==11){
                        questiondi d =new questiondi();
                        d.setVisible(true);
                    }
                    
                    if(quesnum==19){
                        bear d=new bear();
                        
                        d.setVisible(true);
                    }
                    
                    
                    checkteststatus();
                    displayquestion();
                }
                
                
                
                
                
                
                
                
                
                if(source.equals(" SEC C-Data Interpretation ")) {
                    recordanswer();
                    quesnum=20;
                    for(int j=0; j<boxes.length; j++)boxes[j].setSelected(false);
                    
                    if(quesnum==21||quesnum==22||quesnum==23||quesnum==24||quesnum==20){
                        datai d =new datai();
                        d.setVisible(true);
                    }
                    
                    if(quesnum==11){
                        questiondi d =new questiondi();
                        d.setVisible(true);
                    }
                    
                    if(quesnum==19){
                        bear d=new bear();
                        
                        d.setVisible(true);
                    }
                    
                    
                    checkteststatus();
                    displayquestion();
                }
                
                
                
                
                
                
                
                
                
                
                
                
                if(source.equals(" SEC D-Communication Skills ")) {
                    recordanswer();
                    quesnum=25;
                    for(int j=0; j<boxes.length; j++)boxes[j].setSelected(false);
                    
                    if(quesnum==21||quesnum==22||quesnum==23||quesnum==24||quesnum==20){
                        datai d =new datai();
                        d.setVisible(true);
                    }
                    
                    if(quesnum==11){
                        questiondi d =new questiondi();
                        d.setVisible(true);
                    }
                    
                    if(quesnum==19){
                        bear d=new bear();
                        
                        d.setVisible(true);
                        
                    }
                    
                    
                    
                    checkteststatus();
                    displayquestion();
                }
                
                
                
                
                
                
                
                
                
                if(source.equals(" SEC E-Startup Skills ")) {
                    recordanswer();
                    quesnum=35;
                    for(int j=0; j<boxes.length; j++)boxes[j].setSelected(false);
                    
                    if(quesnum==21||quesnum==22||quesnum==23||quesnum==24||quesnum==20){
                        datai d =new datai();
                        d.setVisible(true);
                        
                    }
                    
                    if(quesnum==11){
                        questiondi d =new questiondi();
                        d.setVisible(true);
                    }
                    
                    if(quesnum==19){
                        bear d=new bear();
                        
                        d.setVisible(true);
                        
                    }
                    
                    
                    
                    checkteststatus();
                    displayquestion();
                }
                
                
                
                
                
                
            }
            
            if (check_answer){
                if(source.equals("check next:")) {
                    quesnum++;
                    if(quesnum ==  TOTAL) quesnum=0;
                    mark_ques();
                    displayquestion();
                    checkteststatus();
                }
                if(source.equals("check previous:")) {
                    quesnum--;
                    if(quesnum ==  -1) quesnum=TOTAL-1;
                    mark_ques();
                    displayquestion();
                    checkteststatus();
                }
            }
            validate();
        }
        
        /* Timer class */
        
        class Timer extends Thread implements Runnable{
            public Timer(){
                new Thread(this).start();
            }
            
            public void run() {
                while(start_test){
                    try {
                        Thread.sleep(1000);
                        seconds++;
                        if(seconds % 60 == 0 && seconds != 0){
                            seconds -= 60;
                            minutes++;
                        }
                        timecounter.setText("    Time Counter:  "+minutes+" mins : "+seconds+" secs ");
                        if(minutes==TIMELIMIT){
                            start_test=false;
                            endTest();
                        }
                    }
                    catch(InterruptedException ex)  { System.out.print(ex); }
                }
            }
        }
        
        /* checkteststatus method */
        
        public void checkteststatus(){
            if((quesnum ==  TOTAL-1)&&(start_test))choice_button[3].setBackground(Color.green);
            
            
            
            if(answers[quesnum].length() >0){
                for(int i=0; i<answers[quesnum].length(); i++)
                    boxes[Integer.parseInt(answers[quesnum].substring(i,i+1) )-1].setSelected			(true);
            }
            else for(int i=0; i<boxes.length; i++)boxes[i].setSelected(false);
            
            
            
            
        }
        
        /* displayquestion method */
        
        public void displayquestion(){
            int j = quesnum+1;
            pane.setText(QuestionSeries.question[quesnum]);
            if(start_test)message.setText("Question "+j+" out of "+TOTAL);
            for (int i=0; i<4; i++)answerboxes[i].setText(QuestionSeries.answers[quesnum][i]);
            if(start_test){
                String temp="";
                if(QuestionSeries.n[quesnum]==1) temp="<html>&nbsp;&nbsp;&nbsp;Choose only 		<b>ONE</b>  Option</html>";
                else if(QuestionSeries.n[quesnum]==2) temp="<html>&nbsp;&nbsp;Choose <b>TWO		</b> Options</html>";
                else if(QuestionSeries.n[quesnum]==3) temp="<html>&nbsp;&nbsp;Choose <b>THREE</b> 		Options</html>";
                else temp="<html>&nbsp;&nbsp;<b>ALL are true</b> true</html>";
                choose.setText(temp);
            }
            else {
                timecounter.setText("    ");
                choose.setText("    THANK YOU!!!    ");
            }
        }
        
        /* record answer method */
        
        public void recordanswer(){
            String tmp = "";
            
            for(int i=0; i<boxes.length; i++) if(boxes[i].isSelected()) tmp +=i+1;
            answers[quesnum] = tmp;
            System.out.println(quesnum+" q , tmp "+tmp);
            
        }
        
        /* endTest method */
        
        public void endTest(){
            message.setText(" TIME OVER!!! ");
            JOptionPane.showMessageDialog(null,"TIME OVER!!! You can breathe now.","User Message",JOptionPane.INFORMATION_MESSAGE);
            choice_button[2].setEnabled(false);
            choice_button[3].setEnabled(false);
            choice_button[4].setEnabled(false);
            recordanswer();
            quesnum = 0;
            
            choice_button[4].setBackground(Color.lightGray);
            timecounter.setForeground(Color.blue);
            timecounter.setFont(new Font ("customFont",Font.BOLD,16) );
            start_test=false;
            check_answer=true;
            
            mark_ques();
            displayquestion();
            checkteststatus();
            calculateResult();
            
            
            
        }
        
        /* mark_ques() method to highlight correct answers */
        
        public void mark_ques(){
        }
        
        
        public void calculateResult(){
            mark=0;
            String choice[]=new String[100];
            double temp=0.0;
            
            int j,i;
            BufferedWriter bw = null;int counter=0;int incorrect[]=new int[40];
            java.text.DecimalFormat df = new java.text.DecimalFormat("#0.#");
            for(i=0; i<TOTAL; i++){if(QuestionSeries.choice[i].equals(answers[i])&&i!=19)mark+=2.5;choice[i]=answers[i];}
            for( i=0;i<TOTAL;i++){if(answers[i].equals("1")==false&&answers[i].equals("2")==false&&answers[i].equals("3")==false&&answers[i].equals("4")==false&&i!=19){counter++;answers[i]="nil";}}
            if(counter>15){mark+=(-0.25*counter);}
            for( i=0,j=0;i<19;i++){if(QuestionSeries.choice[i].equals(answers[i])==false&&answers[i].equals("nil")==false){incorrect[j]=i;j++;}}
            
            
            
            String bearans=new String();
            String s=new String();
            
            try{
                
                FileReader fr = new FileReader(imgPathbear.toString());
                BufferedReader br = new BufferedReader(fr);
                
                while((bearans = br.readLine()) != null) {
                    System.out.println(bearans);if(bearans!=null)s=bearans;
                }
                fr.close();
                
                
                
                
            }
            catch(Exception e){System.out.println("Error in beares");}
            
            
            
            
            
            
            
            
            
            
            
            
            if(s.equalsIgnoreCase("brown")==false){incorrect[j]=19;j++;}else if(s.equalsIgnoreCase("brown")==true)mark+=2.5;
            for( i=20;i<TOTAL;i++){if(QuestionSeries.choice[i].equals(answers[i])==false&&answers[i].equals("nil")==false){incorrect[j]=i;j++;}}
            
            
            for(int k=0;k<j-1;k++){if(incorrect[k+1]-incorrect[k]==1)mark+=-1.0;}
            
            temp=(double)mark;
            try{
                
                bw = new BufferedWriter(new FileWriter(imgPathres.toString(), true));
                bw.write("\n\nBEAR QUESTION ANSWER IS : "+s);
                bw.newLine();
                bw.newLine();
                bw.write("\n\nQuestion No.             Candidate Choice                  Answer \n\n");
                bw.newLine();
                bw.newLine();
                for(int x=0;x<40;x++){
                    
                    
                    
                    
                    bw.write((x+1)+" :\t "+choice[x]+"\t "+QuestionSeries.choice[x]);
                    bw.newLine();
                    bw.flush();
                }
                bw.newLine();
                bw.newLine();
                
                bw.write("\n\nMarks : "+temp);
                bw.newLine();
                bw.newLine();
                bw.write("\n\nNo. of unattempted questions : "+counter);
                bw.newLine();
                
                
                
                
                
                bw.newLine();
                bw.newLine();
                String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
                bw.write("\n\nLast recorded time and date ->  "+timeStamp);
                bw.newLine();
                bw.newLine();
                
                
                
                
                
            }
            
            
            
            catch (IOException ioe) {
                ioe.printStackTrace();
            } finally {                       // always close the file
                if (bw != null) try {
                    bw.close();
                } catch (IOException ioe2) {
                    // just ignore it
                }
            }
            
            
            
            
            
            
            
            
            
            testresult.setText("  Your test has been submitted. " );
            student.setText(" End of test. ");
            
            Resultwindow l =new Resultwindow();
            l.setVisible(true);
            
            dispose();
            
        }
    }
    
    /* Resultwindow class */
    
    class Resultwindow extends JFrame{
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path fontPathcb = Paths.get(currentPath.toString(), "font", "Cabin-Bold.otf");
        Path fontPathcbi = Paths.get(currentPath.toString(), "font", "Cabin-BoldItalic.otf");
        Path fontPathci = Paths.get(currentPath.toString(), "font", "Cabin-Italic.otf");
        Path imgPathzef = Paths.get(currentPath.toString(), "zefset4.png");
        Path imgPaththnx = Paths.get(currentPath.toString(),"THANX.png");
        Path imgPathdi = Paths.get(currentPath.toString(),"di.png");
        
        Path imgPathres = Paths.get(currentPath.toString(),"result.txt");
        Path imgPathbear = Paths.get(currentPath.toString(),"beares.txt");
        Path imgPathq2 = Paths.get(currentPath.toString(),"q2.png");
        
        
        
        
        JButton blogin; JFrame frame;
        public Resultwindow() {
            super("Successful test submission");
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            
            
            
            
            
            
            
            
            
            
            frame = new JFrame("Succesful Test Submission");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setUndecorated(true);
            JPanel panel = (JPanel)frame.getContentPane();
            
            
            frame.setSize(10000,10000);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            
            
            Color myColor = Color.decode("#ffa700");
            
            panel.setBackground(Color.white);
            JLabel label = new JLabel();
            label.setIcon(new ImageIcon(imgPaththnx.toString()));// your image here
            
            
            label.setVerticalAlignment(JLabel.CENTER);
            label.setHorizontalAlignment(JLabel.CENTER);
            
            panel.add(label);
            
            frame.setLocationRelativeTo(null);
            
            
            frame.setVisible(true);
            
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    class datai extends JFrame {
        
        
        
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path fontPathcb = Paths.get(currentPath.toString(), "font", "Cabin-Bold.otf");
        Path fontPathcbi = Paths.get(currentPath.toString(), "font", "Cabin-BoldItalic.otf");
        Path fontPathci = Paths.get(currentPath.toString(), "font", "Cabin-Italic.otf");
        Path imgPathzef = Paths.get(currentPath.toString(), "zefset4.png");
        Path imgPaththnx = Paths.get(currentPath.toString(),"THANX.png");
        Path imgPathdi = Paths.get(currentPath.toString(),"di.png");
        
        Path imgPathres = Paths.get(currentPath.toString(),"result.txt");
        Path imgPathbear = Paths.get(currentPath.toString(),"beares.txt");
        Path imgPathq2 = Paths.get(currentPath.toString(),"q2.png");
        
        
        JPanel panel = new JPanel();
        
        datai(){
            
            
            
            
            
            super("IMAGES FOR QUESTION 12 ");
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            
            
            setSize(300,200);
            setLocation(500,280);
            
            JLabel label = new JLabel();
            label.setIcon(new ImageIcon(imgPathdi.toString()));
            label.setVerticalAlignment(JLabel.CENTER);
            label.setHorizontalAlignment(JLabel.CENTER);
            panel.add(label);
            getContentPane().add(panel);
            
            setResizable(true);
            setVisible(true);
            
            
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    class questiondi extends JFrame {
        
        
        
        
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path fontPathcb = Paths.get(currentPath.toString(), "font", "Cabin-Bold.otf");
        Path fontPathcbi = Paths.get(currentPath.toString(), "font", "Cabin-BoldItalic.otf");
        Path fontPathci = Paths.get(currentPath.toString(), "font", "Cabin-Italic.otf");
        Path imgPathzef = Paths.get(currentPath.toString(), "zefset4.png");
        Path imgPaththnx = Paths.get(currentPath.toString(),"THANX.png");
        Path imgPathdi = Paths.get(currentPath.toString(),"di.png");
        
        Path imgPathres = Paths.get(currentPath.toString(),"result.txt");
        Path imgPathbear = Paths.get(currentPath.toString(),"beares.txt");
        Path imgPathq2 = Paths.get(currentPath.toString(),"q2.png");
        
        
        
        JPanel panel = new JPanel();
        
        
        questiondi(){
            
            
            
            
            
            super("GRAPH FOR QUESTIONS ON DATA INTERPRETATION ");
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcb.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathcbi.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            
            try {
                //create the font to use. Specify the size!
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())).deriveFont(12f);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                //register the font
                ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontPathci.toString())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch(FontFormatException e)
            {
                e.printStackTrace();
            }
            
            
            setSize(300,200);
            setLocation(500,280);
            
            JLabel label = new JLabel();
            label.setIcon(new ImageIcon(imgPathq2.toString()));
            label.setVerticalAlignment(JLabel.CENTER);
            label.setHorizontalAlignment(JLabel.CENTER);
            panel.add(label);
            getContentPane().add(panel);
            setResizable(true);
            setVisible(true);
            
            
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /* ItemHandler class */
    
    class ItemHandler implements ItemListener{
        public void itemStateChanged(ItemEvent evt){
            if(start_test){
                for(int i=0; i<boxes.length; i++) if(boxes[i].isSelected() ) itemCheck++;
                if(itemCheck>=2){boxes[0].setSelected(false);boxes[1].setSelected(false);boxes[2].setSelected(false);boxes[3].setSelected(false);}
                if(itemCheck > QuestionSeries.n[quesnum]){
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    if(QuestionSeries.n[quesnum]==1)	JOptionPane.showMessageDialog(null,"<html><font 		size='4' color='00308a'><center>"+
                                                                                      "There is only "+QuestionSeries.n[quesnum]+" possible<br> answer to question "+(quesnum+1)+
                                                                                      "<html>","User Information Message",JOptionPane.INFORMATION_MESSAGE);
                    else JOptionPane.showMessageDialog(null,"<html><font size='4' color='00308a'><center>"+
                                                       "There are only "+QuestionSeries.n[quesnum]+" possible<br> answers to question "+(quesnum+1)+
                                                       "<html>","User Information Message",JOptionPane.INFORMATION_MESSAGE);
                }
                itemCheck=0;
            }
        }
    }
    
    /*  main method */
    
    void start(){
        OnlineTest frame = new OnlineTest();
        frame.setTitle("    "+QuestionSeries.testtitle);
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
    }
}
