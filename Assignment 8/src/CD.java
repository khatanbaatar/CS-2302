import java.text.NumberFormat;


public class CD
{

	/**
	 * title of CD
	 */
	private String title;
	
	/**
	 * musician
	 */
	private String artist;
	
	/**
	 * cost of CD
	 */
	private double cost;
	
	/**
	 * number of tracks used
	 */
	private int tracks;

	/**
	 * precondtions: title, artist cannot be null & must have at least 1 character; cost, tracks must be positive
	 * @param title 
	 * @param artist
	 * @param cost
	 * @param tracks
	 */
	public CD(String title, String artist, double cost, int tracks)
	{
		this.title = title;
		this.artist = artist;
		this.cost = cost;
		this.tracks = tracks;
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * precondition: title cannot be null & must have at least 1 character
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * @return the cost
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * precondition: cost must be positive
	 * @param cost the cost to set
	 */
	public void setCost(double cost)
	{
		this.cost = cost;
	}

	/**
	 * @return the artist
	 */
	public String getArtist()
	{
		return artist;
	}

	/**
	 * @return the tracks
	 */
	public int getTracks()
	{
		return tracks;
	}
	
		/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		CD other = (CD)obj;
		return title.equals(other.artist) && artist.equals(other.artist);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return "title: " + title + " artist: " + artist + " cost: " + fmt.format(cost) + " tracks: " + tracks;
	}
	
	
}