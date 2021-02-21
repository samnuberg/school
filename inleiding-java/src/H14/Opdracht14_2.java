package H14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;
import java.net.URL;

public class Opdracht14_2 extends Applet {
    boolean firstTime = true;
    Button deelKaart = new Button("Deel kaart");
    String[] deck;
    String[][] spelers;
    int numPlayers = 4;
    int yAs = 50;
    int xAs = 50;



    public void init(){
        setSize(700, 1500);
        add(deelKaart);
        deelKaart.addActionListener( new DeelKaartListener() );
    }

    public void paint(Graphics g){
        initalizeScreenSettings();
        if (firstTime == true) return;
        getPlayerNamesAndDisplayThemOnTheScreen(g);
        initializeCardDeck();
        distributeCardsAmongAllPlayers();
        displayDeckOnTheScreen(g);
        makeSoundWhenFinished();
    }
    private void initalizeScreenSettings(){
        yAs = 50;
    }

    private void getPlayerNamesAndDisplayThemOnTheScreen(Graphics g){
        for (int teller = 1; teller < numPlayers+1; teller++) {
            g.drawString("Speler "+teller, xAs, yAs);
            xAs += 125;
            if (teller == 4){
                yAs += 25;
                xAs = 50;
            }
        }
    }

    private void initializeCardDeck(){
        deck = getStandardCardDeck();
    }

    private void distributeCardsAmongAllPlayers(){
        givePlayerCards();
    }

    private void givePlayerCards(){
        int cardsPerPlayer = deck.length / numPlayers;
        spelers = new String[numPlayers][cardsPerPlayer];

        for (int tellerSpelers = 0; tellerSpelers < numPlayers; tellerSpelers++) {
            for (int teller = 0; teller < cardsPerPlayer; teller++) {
                spelers[tellerSpelers][teller] = deelKaart();
            }
        }
    }

    private void displayDeckOnTheScreen(Graphics g){

        for (int tellertje = 0; tellertje < numPlayers;tellertje++){
            yAs = 100;
            for (int cardNumber = 0; cardNumber < spelers[tellertje].length; cardNumber++){
                g.drawString(spelers[tellertje][cardNumber], xAs,  yAs);
                yAs += 25;
            }
            xAs += 125;
        }
        xAs = 50; yAs = 50;
    }

    private void makeSoundWhenFinished(){
        URL pad;
        AudioClip sound;
        pad = Opdracht14_2.class.getResource("./resources/");
        sound = getAudioClip(pad, "scream.wav");
        sound.play();
    }

    private String[] getStandardCardDeck(){
        return new String[]{"ruiten aas","ruiten twee","ruiten drie","ruiten vier","ruiten vijf","ruiten zes","ruiten zeven","ruiten acht","ruiten negen","ruiten tien",
                "ruiten boer","ruiten vrouw","ruiten heer","harten aas","harten twee","harten drie","harten vier","harten vijf","harten zes","harten zeven","harten acht","harten negen", "harten tien","harten boer","harten vrouw","harten heer",
                "klaver aas","klaver twee","klaver drie","klaver vier","klaver vijf","klaver zes","klaver zeven","klaver acht","klaver negen","klaver tien",
                "klaver boer","klaver vrouw","klaver heer","schoppen aas","schoppen twee","schoppen drie","schoppen vier","schoppen vijf","schoppen zes","schoppen zeven","schoppen acht","schoppen negen", "schoppen tien","schoppen boer","schoppen vrouw","schoppen heer"};
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];
        //vervang de inhoud van deck met een nieuwe lijst
        //het nieuwe deck is 1 kaart kleiner dan het oude deck
        String[] hulpLijst = new String[deck.length - 1];
        //om het nieuwe deck te vullen hebben we een index nodig
        int hulpindex = 0;
        //kopieer alle kaarten naar hulplijst behalve de kaart die net gedeeld is
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        //vervang nu deck met de nieuwe lijst
        deck = hulpLijst;
        //de methode geeft de random kaart terug
        return kaart;
    }

    class DeelKaartListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            firstTime = false;
            repaint();
        }
    }
}
