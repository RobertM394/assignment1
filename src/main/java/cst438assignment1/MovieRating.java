package cst438assignment1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class MovieRating {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@Size(min=3, max=25)
	private String title;
	
	@NotNull
	@Size(min=3, max=25)
	private String reviewerFirstName;
	
	@NotNull
	@Size(min=3, max=25)
	private String reviewerLastName;
	
	@NotNull
	@Size(min=3, max=25)
	private String datePosted;
	
	@NotNull
	@Size(min=0, max=5)
	private int movieRating;
	
	public MovieRating() {
	}
	
	
	public MovieRating(long id, String title, String reviewerFirstName, 
			String reviewerLastName, String datePosted, int movieRating)
	{
		super();
		this.id = id;
		this.title = title;
		this.reviewerFirstName = reviewerFirstName;
		this.reviewerLastName = reviewerLastName;
		this.datePosted = new java.util.Date().toString();
		this.movieRating = movieRating;
	}


	public long getId() { return id; }
	public void setId(long id) { this.id = id; }
	
	
	public String getTitle()
	{
		return title;
	}


	public void setTitle(String title)
	{
		this.title = title;
	}


	public String getReviewerFirstName()
	{
		return reviewerFirstName;
	}


	public void setReviewerFirstName(String posterFirstName)
	{
		this.reviewerFirstName = posterFirstName;
	}


	public String getReviewerLastName()
	{
		return reviewerLastName;
	}


	public void setReviewerLastName(String posterLastName)
	{
		this.reviewerLastName = posterLastName;
	}


	public String getDatePosted()
	{
		return datePosted;
	}


	public void setDatePosted(String datePosted)
	{
		this.datePosted = new java.util.Date().toString();
	}


	public int getMovieRating()
	{
		return movieRating;
	}


	public void setMovieRating(int movieRating)
	{
		this.movieRating = movieRating;
	}
}
