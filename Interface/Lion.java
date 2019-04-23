public class Lion implements Alimentacion{
	private String food;
	private boolean ithasfed;

	public boolean setIthasfeed()
	{
		return ithasfed;
	}

	public Leon()
	{
		food="carne";
		ithasfed=false;
	}

	public Leon(String food,boolean ithasfed)
	{
		this.food=food;
		this.ithasfed=ithasfed;
	}


	public void hasBeenFed(boolean feed)
	{
		if(feed)
		{
			System.out.println("el leon ya a comido");
		}
		else
		{
			System.out.println("el Leon necesita alimentarse con"+food);
		}

	}

	public void feed()
	{
		System.out.println("el leon ha sido alimentado con "+this.food);
		this.ithasfed=true;
	}
	
}