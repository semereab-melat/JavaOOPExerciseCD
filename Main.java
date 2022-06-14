import java.text.DecimalFormat;
/***************************************************************
 Filename: TestCD
 Created by: Melat Semereab
 Created on: 12/11/2021
 Comment: Main method for CD.java
 ***************************************************************/
class Main {
  public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        CD myCD = new CD("Bob Marley", "Legend",1980,true);
        CD yourCD = new CD("Bonnie Raitt", "Nick of Time", 6.25, 11.99, 1989,true);
        myCD.printAlllInfor();
        System.out.println("********");
        yourCD.printAlllInfor();
        System.out.println("********");
        System.out.println("Released Date for album " + myCD.getNameAlbum() + ": " + myCD.getYear());
        System.out.println("********");
        yourCD.updateprices(2.5);
        System.out.println("********");
        yourCD.printAlllInfor();
        System.out.println("********");
        System.out.println("The profit for " + myCD.getNameAlbum() + " is " + df.format(myCD.getProfit()));
        System.out.println("The profit for " + yourCD.getNameAlbum() + " is " + df.format(yourCD.getProfit()));

  }
}