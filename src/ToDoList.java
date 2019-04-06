import java.util.ArrayList;
/**
 * @author Thomas Harris
 * @version 1.0.0
 */
public class ToDoList 
{
	private ArrayList<ListItem> currentList;
	
	/**
	 * 
	 */
	public ToDoList() 
	{
		
	}
	
	/**
	 * @param listFile	string read from the user's selected .list file
	 */
	public ToDoList(String listFile) 
	{
		
	}
	
	/**
	 * @return currentList	Pointer to currentList;
	 */
	public ArrayList<ListItem> getList()
	{
		return currentList;
	}
	
	/**
	 * @param priority
	 * @param status
	 * @param description
	 * @param dueDate
	 * @param statusDate
	 */
	public void addItem(int priority, int status, String description, String dueDate, String statusDate)
	{
		
	}
	
	/**
	 * @param priority
	 */
	public void removeItem(int priority)
	{
		
	}
	
	/**
	 * @param priority
	 * @param status
	 * @param description
	 * @param dueDate
	 * @param statusDate
	 */
	public void editItem(int priority, int status, String description, String dueDate, String statusDate)
	{
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "";
	}
	
	/**
	 * 
	 */
	public void save()
	{
		
	}
	
	/**
	 * 
	 */
	public void load()
	{
		
	}
	
	/**
	 * 
	 */
	private void repairList()
	{
		
	}
	
}
