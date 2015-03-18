package BusinessLayer;


public class Order 
{

public int Add(String number) 
	{
	if (number.length() > 0) 
		{
		return Integer.parseInt(number);
		}
	return 0;
	}
}
