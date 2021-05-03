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
	private String posterFirstName;
	
	@NotNull
	@Size(min=3, max=25)
	private String posterLastName;
	
	@NotNull
	@Size(min=3, max=25)
	private String datePosted;
	
	@NotNull
	@Size(min=0, max=5)
	private int movieRating;
	
	public MovieRating() {
	}
	
	
	public MovieRating(long id, String title, String posterFirstName, String posterLastName, String datePosted, int movieRating)
	{
		super();
		this.id = id;
		this.title = title;
		this.posterFirstName = posterFirstName;
		this.posterLastName = posterLastName;
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


	public String getPosterFirstName()
	{
		return posterFirstName;
	}


	public void setPosterFirstName(String posterFirstName)
	{
		this.posterFirstName = posterFirstName;
	}


	public String getPosterLastName()
	{
		return posterLastName;
	}


	public void setPosterLastName(String posterLastName)
	{
		this.posterLastName = posterLastName;
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
