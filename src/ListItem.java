/**
 * @author Thomas Harris
 * @version 1.0.0
 */
public class ListItem 
{
	private int priority;
	// Status must be one of three values:
	//0 = Not Started
	//1 = Started (must have a start date for statusDate
	//2 = Finished (must have the finished date for statusDate
	private int status;
	private String description;
	private String dueDate;
	private String statusDate;
	
	/**
	 * 
	 */
	public void ListItem() 
	{
		priority = 0;
		status = 0;
		description = new String();
		dueDate = new String();
		statusDate = new String();
	}
	
	/**
	 * @return
	 */
	public int getPriority() 
	{
		return priority;
	}
	
	/**
	 * @return
	 */
	public int getStatus()
	{
		return status;
	}
	
	/**
	 * @return
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * @return
	 */
	public String getDueDate()
	{
		return dueDate;
	}
	
	/**
	 * @return
	 */
	public String getStatusDate()
	{
		return statusDate;
	}
}
