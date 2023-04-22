package adapter;

import java.util.Date;
import java.util.ArrayList;

/**
 * Class responsible for converting littleMedia to type Media. Works as an adapter.
 * @author Shahraiz Aziz
 */
public class MediaAdapter implements Media{
    
    private LittleMedia littleMedia;

    /**
     * Default constructor that initializes the private data member
     * @param littleMedia Instance of the littleMedia to be used by the adapter
     */
    public MediaAdapter(LittleMedia littleMedia){
        this.littleMedia = littleMedia;
    }

    /**
     * Getter for the media title
     * @return String representation of the media title
     */
    public String getTitle(){
        return littleMedia.getTitle();
    }
    
    /**
     * Getter for author's name
     * @return The author for the media
     */
    public Author getAuthor(){
        String authorStr = littleMedia.getAuthor();
        String[] tempArr = authorStr.split(" ", 0);
        Author newAuthor = new Author(tempArr[0], tempArr[1]);
        return newAuthor;
    }

    /**
     * Getter for description
     * @return String representation of the description of the media
     */
    public String getDescription(){
        return littleMedia.getDescription();
    }

    /**
     * Method responsible for adding each review to a list, given the review properties
     * @param firstName The users first name
     * @param lastName The users last name
     * @param date The date of the review
     * @param rating The rating user gave to the media
     * @param comment The body of the review
     */
    public void addReview(String firstName, String lastName, Date date, double rating, String comment){
        String uN = firstName + ' ' + lastName;
        int ratingInt = (int)rating;
        littleMedia.addReview(uN, date, ratingInt, comment);
    }

    /**
     * Method that converts the reviews from type String to type Review
     * @return ArrayList<Review> An arraylist containing all reviews for the media
     */
    public ArrayList<Review> getReviews(){
        ArrayList<Review> newList = new ArrayList<Review>();
        ArrayList<String> oldList = littleMedia.getReviews();
        
        for(int i=0; i<oldList.size(); i++){
            String currentReview = oldList.get(i);

            double rating = (double)(currentReview.charAt(0) - '0');
            String[] firstSplit = currentReview.split(" - ");
            Date date = Library.parseDate(arrangeDate(firstSplit[2]));

            String[] secondSplit = firstSplit[1].split(" by ");
            String comment = secondSplit[0];

            String[] firstLastName = secondSplit[1].split(" ");
            String firstName = firstLastName[0];
            String lastName = firstLastName[1];

            Review newRev = new Review(firstName, lastName, date, rating, comment);
            newList.add(newRev);
        }
        
        return newList;
    }

    /**
     * Arranges a date in a string format such that it can be parsed by the Library class 
     * @param date The string to be rearranged 
     * @return The rearranged string
     */
    private String arrangeDate(String date){
        String[] dateArr = date.split("/");
        String month = dateArr[0];
        String day = dateArr[1];
        String year = dateArr[2];

        String arrangedDate = year + '-' + month + '-' + day;
        return arrangedDate;
    }
}
