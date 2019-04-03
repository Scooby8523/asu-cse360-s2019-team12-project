
public class ListItem 
{
	private int priority;
	private int status;
	private String description;
	private String dueDate;
	private String statusDate;
	
	public void ListItem() 
	{
		priority = 0;
		status = 0;
		description = new String();
		dueDate = new String();
		statusDate = new String();
	}
	
	public int getPriority() 
	{
		return priority;
	}
	
	public int getStatus()
	{
		return status;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getDueDate()
	{
		return dueDate;
	}
	
	public String getStatusDate()
	{
		return statusDate;
	}
}
