package ch.bbw.al;

import  javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Zork_GUI extends JFrame
{
    public Zork_GUI(String title)
    {
        super("Zork mini-game ʕ•́ᴥ•̀ʔ");
        this.setSize(1000,250);
        this.setLocation(700,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JButton b1 = new JButton("yes");
        final JButton b2 = new JButton("no");
        final JButton b3 = new JButton("Under the bed");
        final JButton b4 = new JButton("In the closet");
        final JButton b5 = new JButton("In your bag");
        final JButton b6 = new JButton("Under the carpet");
        final JButton b7 = new JButton("Behind a painting");
        final JButton b8 = new JButton("Door 1");
        final JButton b9 = new JButton("Door 2");
        final JButton b10 = new JButton("Door 3");
        final JButton b11 = new JButton("yes");
        final JButton b12 = new JButton("no");
        final JButton b13 = new JButton("yes");
        final JButton b14 = new JButton("no");
        final JButton bath = new JButton("Bathroom");
        final JButton kitchen = new JButton("Kitchen");
        final JButton Li = new JButton("Living room");
        final JButton child = new JButton("Child room");
        final JButton leave = new JButton("Leave");
        final JButton police = new JButton("Police station");
        final JButton hospital = new JButton("Hospital");
        final JButton restaurant = new JButton("Favourite restaurant");
        final JButton house = new JButton("Break into a house");
        final JButton supermarket = new JButton("Supermarket");
        final JButton beach = new JButton("Beach");
        final JButton cinema = new JButton("Cinema");
        final JButton stay = new JButton("Stay");
        final JButton go = new JButton("Go away");
        final JButton f1 = new JButton("yes");
        final JButton f2 = new JButton("no");
        final JButton f = new JButton("Fight");
        final JButton r = new JButton("Run");
        final JButton r1 = new JButton("yes");
        final JButton r2 = new JButton("no");
        final JButton hs1 = new JButton("yes");
        final JButton hs2 = new JButton("no");
        final JButton s1 = new JButton("yes");
        final JButton s2 = new JButton("no");
        final JButton j1 = new JButton("yes");
        final JButton j2 = new JButton("no");
        final JButton k1 = new JButton("yes");
        final JButton k2 = new JButton("no");
        final JButton fi1 = new JButton("yes");
        final JButton fi2 = new JButton("no");
        final JLabel l1 = new JLabel("");
        final JLabel l2 = new JLabel("Do you want to start?");
        final JLabel l3 = new JLabel("yes || no");
        final JLabel l4 = new JLabel("");
        final ArrayList<String> gun = new ArrayList();
        final ArrayList<String> bone = new ArrayList();
        final ArrayList<String> deo = new ArrayList();
        final ArrayList<String> knife = new ArrayList();
        final ArrayList<String> nintendo = new ArrayList();
        final ArrayList<String> lighter = new ArrayList();
        final ArrayList<String> medicine = new ArrayList();
        l1.setFont(new Font("L1", Font.PLAIN, 20));
        l2.setFont(new Font("L2", Font.PLAIN, 20));
        l3.setFont(new Font("L3", Font.PLAIN, 20));
        l4.setFont(new Font("L4", Font.PLAIN, 20));
        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.WHITE);

        b3.setVisible(false);
        b4.setVisible(false);
        b5.setVisible(false);
        b6.setVisible(false);
        b7.setVisible(false);
        b8.setVisible(false);
        b9.setVisible(false);
        b10.setVisible(false);
        b11.setVisible(false);
        b12.setVisible(false);
        b13.setVisible(false);
        b14.setVisible(false);
        bath.setVisible(false);
        kitchen.setVisible(false);
        Li.setVisible(false);
        child.setVisible(false);
        leave.setVisible(false);
        police.setVisible(false);
        hospital.setVisible(false);
        restaurant.setVisible(false);
        house.setVisible(false);
        supermarket.setVisible(false);
        f.setVisible(false);
        r.setVisible(false);
        r1.setVisible(false);
        r2.setVisible(false);
        f1.setVisible(false);
        f2.setVisible(false);
        beach.setVisible(false);
        cinema.setVisible(false);
        stay.setVisible(false);
        go.setVisible(false);
        hs1.setVisible(false);
        hs2.setVisible(false);
        s1.setVisible(false);
        s2.setVisible(false);
        j1.setVisible(false);
        j2.setVisible(false);
        k1.setVisible(false);
        k2.setVisible(false);
        fi1.setVisible(false);
        fi2.setVisible(false);


        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(8,6));
        mainContainer.setBackground(Color.BLACK);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4, Color.BLACK));



        JPanel topPanel = new JPanel();
        topPanel.setBorder(new LineBorder(Color.BLACK, 5));
        topPanel.setBackground(Color.BLACK);
        topPanel.setLayout(new FlowLayout(5));

        JPanel midPanel = new JPanel();
        midPanel.setBorder(new LineBorder(Color.black, 3));
        midPanel.setBackground(Color.black);
        midPanel.setLayout(new BoxLayout(midPanel,1));
        midPanel.setSize(new Dimension(10, 15));


        midPanel.add(l1);
        midPanel.add(l2);
        midPanel.add(l3);
        midPanel.add(l4);


        topPanel.add(b1);
        topPanel.add(b2);
        topPanel.add(b3);
        topPanel.add(b4);
        topPanel.add(b5);
        topPanel.add(b6);
        topPanel.add(b7);
        topPanel.add(b8);
        topPanel.add(b9);
        topPanel.add(b10);
        topPanel.add(b11);
        topPanel.add(b12);
        topPanel.add(b13);
        topPanel.add(b14);
        topPanel.add(bath);
        topPanel.add(kitchen);
        topPanel.add(Li);
        topPanel.add(child);
        topPanel.add(leave);
        topPanel.add(police);
        topPanel.add(hospital);
        topPanel.add(restaurant);
        topPanel.add(house);
        topPanel.add(supermarket);
        topPanel.add(f);
        topPanel.add(r);
        topPanel.add(r1);
        topPanel.add(r2);
        topPanel.add(f1);
        topPanel.add(f2);
        topPanel.add(beach);
        topPanel.add(cinema);
        topPanel.add(stay);
        topPanel.add(go);
        topPanel.add(hs1);
        topPanel.add(hs2);
        topPanel.add(s1);
        topPanel.add(s2);
        topPanel.add(j1);
        topPanel.add(j2);
        topPanel.add(k1);
        topPanel.add(k2);
        topPanel.add(fi1);
        topPanel.add(fi2);

        mainContainer.add(topPanel, BorderLayout.SOUTH);
        mainContainer.add(midPanel);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You are in a room with three doors but they are all locked!!!!!");
                l2.setText("Where do you want to search for the key?");
                l3.setText("");
                b1.setVisible(false);
                b2.setVisible(false);
                b3.setVisible(true);
                b4.setVisible(true);
                b5.setVisible(true);
                b6.setVisible(true);
                b7.setVisible(true);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("WHYYYYYYYYYYY did you quit? ʕ•̀ᴥ•́ʔ");
                l2.setText("");
                l3.setText("");
                b1.setVisible(false);
                b2.setVisible(false);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("No keys here just a sock.");
                b3.setVisible(false);
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("No key here buddy");
                b4.setVisible(false);
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You found a revolver with 4 shots in your bag but no key");
                gun.add("");
                b5.setVisible(false);
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You found a bone but no key");
                bone.add("");
                b6.setVisible(false);
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("Congratulation!!! you found the key ฅʕ´•ᴥ•`ʔฅ");
                l2.setText("Which door do you want to open with the key?");

                b3.setVisible(false);
                b4.setVisible(false);
                b5.setVisible(false);
                b6.setVisible(false);
                b7.setVisible(false);
                b8.setVisible(true);
                b9.setVisible(true);
                b10.setVisible(true);
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("Not here buddy");
                b8.setVisible(false);
                if (bone.size() == 1){
                    l1.setText("A dog enters the room trough the dog door in door 1");
                    l2.setText("Do you want to give him a bone?");
                    l3.setText("yes || no");
                    b11.setVisible(true);
                    b12.setVisible(true);
                    b9.setVisible(false);
                    b10.setVisible(false);
                }
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("The key works!!!!");
                l2.setText("As you open the door you see that you are in a big house with a lot of rooms.");
                l3.setText("Where do you want to go?");
                b8.setVisible(false);
                b9.setVisible(false);
                b10.setVisible(false);
                bath.setVisible(true);
                kitchen.setVisible(true);
                Li.setVisible(true);
                child.setVisible(true);
                leave.setVisible(true);
            }
        });

        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("FRAU MÜLLER: HALLO ANDY BIST DU DAS ANDYYYY");
                b10.setVisible(false);
                if (gun.size() == 1){
                    l2.setText("Do you want to shoot through the door?");
                    l3.setText("yes || no");
                    b13.setVisible(true);
                    b14.setVisible(true);
                    b8.setVisible(false);
                    b9.setVisible(false);
                    b10.setVisible(false);
                } else;
            }
        });

        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("The dog jumps around and is happy.");
                l2.setText("Which door do you want to open now?");
                l3.setText("");
                b8.setVisible(false);
                b9.setVisible(true);
                b10.setVisible(true);
                b11.setVisible(false);
                b12.setVisible(false);
            }
        });

        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("The dog looks sad and goes back trough his dog door.");
                l2.setText("Wich door do you want to open now?");
                l3.setText("");
                b8.setVisible(false);
                b9.setVisible(true);
                b10.setVisible(true);
                b11.setVisible(false);
                b12.setVisible(false);
            }
        });

        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You miss 3 shots but hit the last one.");
                l2.setText("Wich door do you want to open now?");
                l3.setText("");
                b8.setVisible(true);
                b9.setVisible(true);
                b10.setVisible(false);
                b13.setVisible(false);
                b14.setVisible(false);
            }
        });

        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You are a good guy continue with the doors.");
                l2.setText("Wich door do you want to open now?");
                l3.setText("");
                b8.setVisible(true);
                b9.setVisible(true);
                b10.setVisible(false);
                b13.setVisible(false);
                b14.setVisible(false);
            }
        });

        bath.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You enter the bathroom and take a deodorant with you.");
                l2.setText("");
                deo.add("");
                bath.setVisible(false);
            }
        });

        kitchen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You enter the kitchen and find a big butcher knife.");
                knife.add("");
                kitchen.setVisible(false);
            }
        });

        Li.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You enter the living room and find a lighter.");
                lighter.add("");
                Li.setVisible(false);
            }
        });

        child.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You enter the child room and find a Nintendo.");
                nintendo.add("");
                child.setVisible(false);
            }
        });

        leave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("As you go out you realize that you are in a familiar city.");
                l2.setText("Where do you want to go?");
                l3.setText("");
                leave.setVisible(false);
                bath.setVisible(false);
                kitchen.setVisible(false);
                child.setVisible(false);
                Li.setVisible(false);
                police.setVisible(true);
                hospital.setVisible(true);
                house.setVisible(true);
                supermarket.setVisible(true);
                restaurant.setVisible(true);
            }
        });
        police.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("As you enter the police station a zombie attacks you.");
                l2.setText("Do you want to fight or run?");
                f.setVisible(true);
                r.setVisible(true);
                police.setVisible(false);
                hospital.setVisible(false);
                supermarket.setVisible(false);
                house.setVisible(false);
                restaurant.setVisible(false);
                if (gun.size() == 1||knife.size() == 1) {
                    l2.setText("Do you want to use your weapons?");
                    l3.setText("yes || no");
                    f1.setVisible(true);
                    f2.setVisible(true);
                    f.setVisible(false);
                    r.setVisible(false);
                }
            }
        });

        f.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("YOU DIED");
                l2.setText("");
                l3.setText("");
                f1.setVisible(false);
                f2.setVisible(false);
                f.setVisible(false);
                r.setVisible(false);
            }
        });

        f1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You attacked the zombie and smash his head with your foot while he is on the ground. You survived.");
                l2.setText("You search the whole building and store some guns in your bag. You are wearing armor for protection");
                l3.setText("You transform the police station into a safe hideout. Over the next years more and more people come to your hideout. HAPPPPPPPPY END");
                police.setVisible(false);
                f1.setVisible(false);
                f2.setVisible(false);
                hospital.setVisible(false);
                house.setVisible(false);
                supermarket.setVisible(false);
                restaurant.setVisible(false);
            }
        });

        f2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("The zombie killed you.");
                l2.setText("YOU DIED");
                l3.setText("");
                f1.setVisible(false);
                f2.setVisible(false);
            }
        });

        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("While you are running home you see a garage with a car in it.");
                l2.setText("Do you want to break into the house and search for the keys?");
                l3.setText("YES || NO");
                f.setVisible(false);
                r.setVisible(false);
                r1.setVisible(true);
                r2.setVisible(true);
            }
        });

        r1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You found the keys for the car.");
                l2.setText("Where do you want to drive?");
                l3.setText("BEACH||CINEMA");
                beach.setVisible(true);
                cinema.setVisible(true);
                r1.setVisible(false);
                r2.setVisible(false);
            }
        });

        r2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You decided to go back home");
                l2.setText("As you enter your home you see that a lot of zombies broke into your house.");
                l3.setText("YOU DIED");
                beach.setVisible(false);
                cinema.setVisible(false);
            }
        });

        beach.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You arrive at the beach and see from a far someone who is in the water having fun.");
                l2.setText("You walk up to him and try to talk to him. As he turns around you see that it is a zombie.");
                l3.setText("Finding that out you are so dumbstruck that you can't run away properly. He catches you and kills you.");
                l4.setText("YOU DIED");
                beach.setVisible(false);
                cinema.setVisible(false);
            }
        });

        cinema.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("As you enter you see a big dog who is playing around with the arm of a human.");
                l2.setText("The dog seems very happy do you want to stay in the cinema with the dog?");
                l3.setText("STAY||GO AWAY");
                cinema.setVisible(false);
                beach.setVisible(false);
                stay.setVisible(true);
                go.setVisible(true);
            }
        });

        stay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("The dog turns out to be a zombie but it's to late to run.");
                l2.setText("The zombie dog kills you.");
                l3.setText("YOU DIED");
                stay.setText("Stay");
                stay.setVisible(false);
                go.setVisible(false);
            }
        });

        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("As you go down the stairs the dog attacks you from behind and you fall down the stairs.");
                l2.setText("YOU DIED");
                l3.setText("");
                stay.setVisible(false);
                go.setVisible(false);
            }
        });

        hospital.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You search for people in the Hospital but can't find anyone. You take a lot of medicine with you for future injuries.");
                l2.setText("As you go home to store the medicine you see an injured person dying on the ground.");
                l3.setText("Do you want save his life with your medicine?");
                l4.setText("yes || no");
                hs1.setVisible(true);
                hs2.setVisible(true);
                police.setVisible(false);
                hospital.setVisible(false);
                supermarket.setVisible(false);
                house.setVisible(false);
                restaurant.setVisible(false);
                medicine.add("");
            }
        });

        hs1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("He survived thanks to you.");
                l2.setText("Do you want to take him with you?");
                l3.setText("yes || no");
                l4.setText("");
                s1.setVisible(true);
                s2.setVisible(true);
                hs1.setVisible(false);
                hs2.setVisible(false);
            }
        });

        hs2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("The person mutates into a zombie and kills you.");
                l2.setText("YOU DIED");
                l3.setText("");
                l4.setText("");
                hs1.setVisible(false);
                hs2.setVisible(false);
            }
        });

        s1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("As you two enter your home you see that zombies broke into your home.");
                l2.setText("Together you overwhelm the zombies.");
                l3.setText("As time passes you recognize that you are happy that you are not alone in such a world full of zombies.");
                s1.setVisible(false);
                s2.setVisible(false);
            }
        });

        s2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("As you enter your home you see that zombies broke into your home.");
                l2.setText("Because you're alone the zombies overwhelm you.");
                l3.setText("YOU DIED");
                s1.setVisible(false);
                s2.setVisible(false);
            }
        });

        restaurant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("As you enter you see someone. You run up to him and ask him about the current economical and political state of the world.");
                l2.setText("JEFF: What is wrong with you? We are in the middle of a Zombie apocalypse how did you miss that?");
                l3.setText("You talk with him for a long time and he tells you everything about the current state of the world.");
                l4.setText("JEFF: I'm going to the hideout do you want to come with me?");
                j1.setVisible(true);
                j2.setVisible(true);
                police.setVisible(false);
                hospital.setVisible(false);
                supermarket.setVisible(false);
                house.setVisible(false);
                restaurant.setVisible(false);
            }
        });

        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("JEFF: Then come with me.");
                l2.setText("You start following him into the hideout.");
                l3.setText("Everyone is happy to see another human.");
                l4.setText("You live the rest of your life in the hideout.");
                j1.setVisible(false);
                j2.setVisible(false);

            }
        });

        j2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("Jeff disappears into the shadows of the kitchen. As you go out you get attacked by a zombie. You decided to fight the zombie.");
                l2.setText("Luckily you've won this fight but you endured a lot of injuries. As you try to stand up you black out.");
                l3.setText("You wake up in a room where humans are standing around you. The people tell you that they found you blacked out with a lot if injuries.");
                l4.setText("You live the rest of your life in the hideout. XD");
                j1.setVisible(false);
                j2.setVisible(false);
            }
        });

        house.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You search the whole house but the only thing that you find is a sad kid.");
                l2.setText("Do you want to take care of the kid?");
                l3.setText("yes || no");
                k1.setVisible(true);
                k2.setVisible(true);
                police.setVisible(false);
                hospital.setVisible(false);
                supermarket.setVisible(false);
                house.setVisible(false);
                restaurant.setVisible(false);
            }
        });

        k1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("The kid is infected and kills you while you are not looking.");
                l2.setText("");
                l3.setText("");
                k1.setVisible(false);
                k2.setVisible(false);
            }
        });

        k2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You go back home and regret your decision for the rest of your life.");
                l2.setText("You die alone.");
                l3.setText("");
                k1.setVisible(false);
                k2.setVisible(false);
            }
        });

        supermarket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("While you take the food and water from the shelves of the supermarket.");
                l2.setText("You see that a very strong looking zombie is coming to you.");
                police.setVisible(false);
                hospital.setVisible(false);
                supermarket.setVisible(false);
                house.setVisible(false);
                restaurant.setVisible(false);
                if (lighter.size() == 1 && deo.size() == 1){
                    l1.setText("Do you want to use your lighter and deo to light the zombie on fire?");
                    l2.setText("yes || no");
                    l3.setText("");
                    fi1.setVisible(true);
                    fi2.setVisible(true);
                } else{
                    l1.setText("The strong zombie overwhelms you.");
                    l2.setText("YOU DIED");
                    l3.setText("");
                }
            }
        });

        fi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You've won. But the fire from the the burning zombie is spreading.");
                l2.setText("As you run out you turn around and see that the whole supermarket is burning down.");
                l3.setText("Because of the fire people know that you are at the supermarket. A group of people come and rescue you.");
                fi1.setVisible(false);
                fi2.setVisible(false);
            }
        });

        fi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("The zombie is faster and stronger than you that is why you don't have any chance.");
                l2.setText("YOU DIED");
                fi1.setVisible(false);
                fi2.setVisible(false);
            }
        });
    }

    public static void main(String [] args){
        Zork_GUI Mylayout = new Zork_GUI("My Costume Layout");
        Mylayout.setVisible(true);
    }
}