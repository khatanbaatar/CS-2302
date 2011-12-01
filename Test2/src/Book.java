import tester.Validation;

public class Book implements Comparable<Book>
{

	private String title;

	private String author;

	/**
	 * precondition: both title and author cannot be null & they must have at
	 * least 1 character
	 * 
	 * @param title
	 * @param author
	 */
	public Book(String title, String author)
	{
		if (title == null || author == null || title.length() == 0
				|| author.length() == 0)
			Validation.reportError("invalid title or author");
		else
		{
			this.title = title;
			this.author = author;
		}
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor()
	{
		return author;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * Compares by Author and if the authors are the same then it compares by book title
	 */
	@Override
	public int compareTo(Book c) {
		int result = 0;
		if(author.compareTo(c.getAuthor()) == 0){
			result = title.compareTo(c.getTitle());
		}else{
			result = author.compareTo(c.getAuthor());
		}
		return result;
	}

}
