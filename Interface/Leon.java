public class Leon implements Alimentacion{
	private String alimento;
	private boolean ithasfed;

	public boolean setIthasfeed()
	{
		return ithasfed;
	}

	public Leon()
	{
		alimento="carne";
		ithasfed=false;
	}

	public Leon(String alimento,boolean ithasfed)
	{
		this.alimento=alimento;
		this.ithasfed=ithasfed;
	}


	public void hasBeenFed(boolean feed)
	{
		if(feed==false)
		{
			System.out.println("el Leon necesita alimentarse con"+alimento);	
		}
		else
		{
			System.out.println("el leon ya a comido");
		}

	}

	public void feed()
	{
		System.out.println("el leon ha sido alimentado con "+this.alimento);
		this.ithasfed=true;
	}
	
}