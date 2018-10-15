import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class CustomTask extends Task
{
	public void execute()
	{
	  try{
	   System.out.println("This is a custom task");
	  }
	  catch (BuildException be){
	   System.out.println("This is an exception"+be);
          }
	}
}
