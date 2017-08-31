// import libraries
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Simulation{
    // golbal variables for Program
    private JFrame frame;
    private JPanel speciesPanel;
    private JButton day, night, goldFishes;
    private JButton start, reStart;
    private Random random;
    private Timer whaleTimer, sharkTimer, goldFishesTimer, JellyfishesTimer;
    private int mode, round;
    private JLabel algae1, algae2, algae3, algae4, algae5, algae6, algae7, algae8;
    private ArrayList<Whale> whales;
    private ArrayList<JLabel> whaleslbl;
    private ArrayList<Shark> sharks;
    private ArrayList<JLabel> sharklbl;
    private ArrayList<Goldfish> goldfishes;
    private ArrayList<JLabel> goldfisheslbl;
    private ArrayList<Jellyfish> jellyfishes;
    private ArrayList<JLabel> jellyfisheslbl;
    int x,y;
    
    // Constructor
    public Simulation() {
        // initialization of variables
        random = new Random();
        mode = 1;
        round = 0;
        initiate();
        
        //buliding elements on jpanel
        buildWhales();
        buildSharks();
        buildGoldfishes();
        buildJellyfishes();
        
    }
    
    public void buildWhales()
    {
        // adding whales to panel
        whales = new ArrayList();
        whaleslbl = new ArrayList();
        Whale w1 = new Whale();
        Whale w2 = new Whale();
        Whale w3 = new Whale();
        Whale w4 = new Whale();
        w3.setDirection(-1);
        w4.setDirection(-1);
        whales.add(w1);
        whales.add(w2);
        whales.add(w3);
        whales.add(w4);
        
        for(int i=0;i<whales.size();i++)
        {
             x = random.nextInt(speciesPanel.getWidth()-245);
             y = random.nextInt(speciesPanel.getHeight()-105);
             JLabel temp = new JLabel(whales.get(i).getImg());
             whaleslbl.add(temp);
             temp.setBounds(x, y, 245, 105);
             speciesPanel.add(temp);
             speciesPanel.repaint();
        }
    }

    public void buildSharks()
    {
        // adding sharks to panel
        sharks = new ArrayList();
        sharklbl = new ArrayList();
        Shark s1 = new Shark();
        Shark s2 = new Shark();
        Shark s3 = new Shark();
        Shark s4 = new Shark();
        s1.setDirection(-1);
        s2.setDirection(-1);
        sharks.add(s1);
        sharks.add(s2);
        sharks.add(s3);
        sharks.add(s4);
        
        for(int i=0;i<sharks.size();i++)
        {
             x = random.nextInt(speciesPanel.getWidth()-269);
             y = random.nextInt(speciesPanel.getHeight()-139);
             JLabel temp = new JLabel(sharks.get(i).getImg());
             sharklbl.add(temp);
             temp.setBounds(x, y, 269, 139);
             speciesPanel.add(temp);
             speciesPanel.repaint();
        }
    }
    
    public void buildGoldfishes()
    {
        // adding goldfishes to panel
        goldfishes = new ArrayList();
        goldfisheslbl = new ArrayList();
        Goldfish g1 = new Goldfish();
        Goldfish g2 = new Goldfish();
        Goldfish g3 = new Goldfish();
        Goldfish g4 = new Goldfish();
        g1.setDirection(-1);
        g2.setDirection(-1);
        goldfishes.add(g1);
        goldfishes.add(g2);
        goldfishes.add(g3);
        goldfishes.add(g4);
        
        for(int i=0;i<goldfishes.size();i++)
        {
            x = random.nextInt(algae5.getX())+50;
            y = random.nextInt(algae5.getY())+150;
            int[][] x1 = {{140,120},{120,200}};
            JLabel temp = new JLabel(goldfishes.get(i).getImg());
            goldfisheslbl.add(temp);
            temp.setBounds(x, y, 80, 56);
            speciesPanel.add(temp);
            speciesPanel.repaint();
        }
    }
    
    public void buildJellyfishes()
    {
        jellyfishes = new ArrayList();
        jellyfisheslbl = new ArrayList();
        Jellyfish j1 = new Jellyfish();
        Jellyfish j2 = new Jellyfish();
        jellyfishes.add(j1);
        jellyfishes.add(j2);
        
        for(int i=0;i<jellyfishes.size();i++)
        {
            x = random.nextInt(speciesPanel.getWidth()-109);
            y = random.nextInt(speciesPanel.getHeight()-165);
            JLabel temp = new JLabel(jellyfishes.get(i).getImg());
            jellyfisheslbl.add(temp);
            temp.setBounds(x, y, 109, 165);
            speciesPanel.add(temp);
            speciesPanel.repaint();
        }
    }
    
    // method to initiate GUI componenets
    public void initiate() {
        frame = new JFrame("Aquarium Simulation Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        speciesPanel = new JPanel(null);
        speciesPanel.setBackground(Color.LIGHT_GRAY);
        speciesPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        speciesPanel.setBounds(10, 10, 850, 740);
        frame.add(speciesPanel);
        
        addAlgae();
        
        day = new JButton(new ImageIcon("DayButton.png"));
        day.setBounds(280, 780, 50, 50);
        day.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(mode == 0)
                {
                    mode = 1;
                    goldFishesTimer.start();
                    speciesPanel.setBackground(Color.lightGray);
                    speciesPanel.repaint();
                }
            }
        });
        frame.add(day);

        night = new JButton(new ImageIcon("NightButton.png"));
        night.setBounds(350, 780, 50, 50);
        night.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(mode == 1)
                {
                    mode = 0;
                    goldFishesTimer.stop();
                    speciesPanel.setBackground(Color.DARK_GRAY);
                    speciesPanel.repaint();
                }
            }
        });
        
        frame.add(night);
        
        goldFishes = new JButton(new ImageIcon("GoldFishButton.png"));
        goldFishes.setBounds(420, 780, 50, 50);
        goldFishes.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                goldFishesTimer.stop();
                for(int i=0;i<goldfisheslbl.size();i++)
                {
                    speciesPanel.remove(goldfisheslbl.get(i));
                }
                buildGoldfishes();
                goldFishesTimer.start();
            }
        });
        frame.add(goldFishes);

        
        // timer for movement of whales
        whaleTimer = new Timer(10, new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
               for(int i=0;i<whales.size();i++)
               {
                    JLabel temp = whaleslbl.get(i);
                    x = temp.getX();
                    y = temp.getY();
                    if(whales.get(i).getDirection() == 1)
                    {
                        x++;
                        if(x>= speciesPanel.getWidth())
                        {
                            x= -245;
                        }
                    }
                    else
                    {
                        x--;
                        if(x <= -245)
                        {
                            x= speciesPanel.getWidth();
                        }
                    }
                    temp.setBounds(x,y, 245,105);
                    speciesPanel.add(temp);
                    speciesPanel.repaint();
               }
           }
        });
        
        // timer for movement of sharks
        sharkTimer = new Timer(10, new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
               for(int i=0;i<sharks.size();i++)
               {
                    JLabel temp = sharklbl.get(i);
                    int x = temp.getX();
                    int y = temp.getY();
                    if(sharks.get(i).getDirection() == -1)
                    {
                        x++;
                        if(x>= speciesPanel.getWidth())
                        {
                            x= -269;
                        }
                    }
                    else
                    {
                        x--;
                        if(x <= -269)
                        {
                            x= speciesPanel.getWidth();
                        }
                    }
                    temp.setBounds(x,y, 269,139);
                    speciesPanel.add(temp);
                    speciesPanel.repaint();
               }
           }
        });
        
        // timer for movement of goldfishes
        goldFishesTimer = new Timer(10, new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
               for(int i=0;i<goldfishes.size();i++)
               {
                    JLabel temp = goldfisheslbl.get(i);
                    int x = temp.getX();
                    int y = temp.getY();
                    if(goldfishes.get(i).getDirection() == -1)
                    {
                        x++;
                        if(x>= speciesPanel.getWidth())
                        {
                            x= -80;
                        }
                    }
                    else
                    {
                        x--;
                        if(x <= -80)
                        {
                            x= speciesPanel.getWidth();
                        }
                    }
                    temp.setBounds(x,y, 80,56);
                    speciesPanel.add(temp);
                    speciesPanel.repaint();
               }
           }
        });
        
        // timer for movement of goldfishes
        JellyfishesTimer = new Timer(10, new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
               for(int i=0;i<jellyfishes.size();i++)
               {
                    JLabel temp = jellyfisheslbl.get(i);
                    int x = temp.getX();
                    int y = temp.getY();
                    boolean flag = true;
                    if(y < speciesPanel.getHeight())
                    {
                        y--;
                    }
                    
                    if(y<=0)
                    {
                        y *=-600;
                    }
                    temp.setBounds(x, y, 109, 165);
                    speciesPanel.add(temp);
                    speciesPanel.repaint();
               }
           }
        });
        
        start = new JButton("Start");
        start.setBounds(270, 850, 110, 50);
        start.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(!whaleTimer.isRunning())
                {
                    whaleTimer.start();
                }
                
                if(!sharkTimer.isRunning())
                {
                    sharkTimer.start();
                }
                
                if(!goldFishesTimer.isRunning() && mode == 1)
                {
                    goldFishesTimer.start();
                }
                
                if(!JellyfishesTimer.isRunning())
                {
                    JellyfishesTimer.start();
                }
                
                Thread timer = new Thread(){
                    public void run()
                    {
                        int time = 0;
                        while(true)
                        {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
                            }
                           time++;
                           if(time == 5)
                           {
                               time = 0;
                               if(mode == 1)
                                {
                                    night.doClick();
                                    round++;
                                    speciesPanel.repaint();
                                    for(int i=0;i<whales.size();i++)
                                    {
                                        whales.get(i).setLife(whales.get(i).getLife()+1);
                                        whales.get(i).setSatiety(whales.get(i).getSatiety()-1);
                                        sharks.get(i).setLife(sharks.get(i).getLife()+1);
                                        sharks.get(i).setSatiety(sharks.get(i).getSatiety()-1);
                                        
                                    }
                                    for(int i=0;i<2;i++)
                                    {
                                        jellyfishes.get(i).setLife(jellyfishes.get(i).getLife()+1);
                                        jellyfishes.get(i).setSatiety(jellyfishes.get(i).getSatiety()-1);
                                        
                                    }
                                }
                                else
                                {
                                    day.doClick();
                                    round++;
                                    speciesPanel.repaint();
                                }
                           }
                        }
                        
                    }
                };
                timer.start();
            }
        });
        frame.add(start);
        
        reStart = new JButton("Restart");
        reStart.setBounds(400, 850, 110, 50);
        reStart.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(whaleTimer.isRunning())
                {
                    whaleTimer.stop();
                }
                if(sharkTimer.isRunning())
                {
                    sharkTimer.stop();
                }
                if(goldFishesTimer.isRunning())
                {
                    goldFishesTimer.stop();
                }
                for(int i=0;i<4;i++)
                {
                    speciesPanel.remove(whaleslbl.get(i));
                    speciesPanel.remove(sharklbl.get(i));
                    speciesPanel.remove(goldfisheslbl.get(i));
                    speciesPanel.repaint();
                }
                
                buildSharks();
                buildWhales();
                buildGoldfishes();
                if(!whaleTimer.isRunning())
                {
                    whaleTimer.start();
                }
                
                if(!sharkTimer.isRunning())
                {
                    sharkTimer.start();
                }
                
                if(!goldFishesTimer.isRunning())
                {
                    goldFishesTimer.start();
                }
            }
        });
        frame.add(reStart);
        
        //frame.setLocationRelativeTo(null);
        frame.setSize(900, 980);
        frame.setVisible(true);
    }
    
    // add algaes to panel
    public void addAlgae()
    {
        algae1 = new JLabel(new Algae().getImage());
        algae1.setBounds(20, 200, 93, 165);
        speciesPanel.add(algae1);

        algae2 = new JLabel(new Algae().getImage());
        algae2.setBounds(80, 200, 93, 165);
        speciesPanel.add(algae2);

        algae3 = new JLabel(new Algae().getImage());
        algae3.setBounds(140, 200, 93, 165);
        speciesPanel.add(algae3);

        algae4 = new JLabel(new Algae().getImage());
        algae4.setBounds(650, 30, 93, 165);
        speciesPanel.add(algae4);

        algae5 = new JLabel(new Algae().getImage());
        algae5.setBounds(600, 450, 93, 165);
        speciesPanel.add(algae5);

        algae6 = new JLabel(new Algae().getImage());
        algae6.setBounds(90, 550, 93, 165);
        speciesPanel.add(algae6);

        algae7 = new JLabel(new Algae().getImage());
        algae7.setBounds(170, 560, 93, 165);
        speciesPanel.add(algae7);

        algae8 = new JLabel(new Algae().getImage());
        algae8.setBounds(250, 530, 93, 165);
        speciesPanel.add(algae8);
    }

    public static void main(String[] args) {
        new Simulation();
    }
}