
import java.text.DecimalFormat;

/***************************************************************
 Filename: CD
 Created by: Melat Semereab
 Created on: 12/11/2021
 Comment: A CD catalogue
 ***************************************************************/
public class CD {
    private DecimalFormat df = new DecimalFormat(".00");
    private static int artistID = 1;
    private int numberOfArtist;
    private String nameArtist;
    private String nameAlbum;
    private double costPrice;
    private double salePrice;
    private int yearPublication;
    private boolean isSingle;

    public CD()
    {
        numberOfArtist = artistID;
        artistID = artistID + 1;
    }//default constructor
    public CD(String nameOfArtist, String nameOfAlbum, int yearOfIssue, boolean single)
    {
        nameArtist = nameOfArtist;
        nameAlbum = nameOfAlbum;
        yearPublication = yearOfIssue;
        isSingle = single;
        costPrice = 0;
        salePrice = 0;
        artistID = artistID + 1;
    }//Alternative constructor
    public CD(String nameOfArtist, String nameOfAlbum,double costOfPrice, double saleOfPrice, int yearOfIssue, boolean single)
    {
        nameArtist = nameOfArtist;
        nameAlbum = nameOfAlbum;
        costPrice = costOfPrice;
        salePrice = saleOfPrice;
        yearPublication = yearOfIssue;
        isSingle = single;
        artistID = artistID + 1;
    }//Alternative Constructor

    public static void printArtistNumber()
    {
        System.out.println("Artist number: " + artistID + "\n");
    }//printArtistNumber

    public void setNameAlbum(String album)
    {
        nameAlbum = album;
    }//setNameArtist
    public String getNameAlbum()
    {
        return nameAlbum;
    }//getNameAlbum

    public void printAlllInfor()
    {
        System.out.println("Artist: " + nameArtist);
        System.out.println("Album: " + nameAlbum);
        System.out.println("Cost: " + df.format(costPrice));
        System.out.println("Sold: " + df.format(salePrice));
        System.out.println("Published: " + yearPublication);
        if (isSingle)
        {
            System.out.println("Single CD");
        }//if
        else
        {
            System.out.println("Double CD");
        }//else
    }//printAlllInfo
    public int getYear()
    {
        return yearPublication;
    }//getYear
    public void updateprices(double price)
    {
        costPrice =  price + costPrice;
        salePrice = salePrice + (2 * price);
        System.out.println("Updated Cost: " + df.format(costPrice));
        System.out.println("Updated Sold: " + df.format(salePrice));
    }//updateprice
    public double getProfit()
    {
        return salePrice - costPrice;
    }//getProfit
}
