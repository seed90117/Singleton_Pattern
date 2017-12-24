package Singleton;

public class singleton {
	private static singleton Instance;
	private singleton (){};//使用Private建構子,確保類別Singleton的物件化只能透過API:getInstance()  
	/*public static singleton getInstance()
	{
		if(Instance == null)
		{
			Instance = new singleton();
		}
		return Instance;
	}*/
	
	//使用 synchronized 關鍵字避免同時兩支Thread進入函數
	public static synchronized singleton getInstance() 
	{
		if(Instance == null)
		{
			Instance = new singleton();
		}
		return Instance;
	}
}
