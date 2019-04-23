public class Elephant implements Alimentacion
{
	private String food;
	private boolean ithasfed;

	public Elefante()
	{
		food="mani";
		ithasfed=false;
	}

	public Elefante(String food,boolean ithasfed)
	{
		this.food=food;
		this.ithasfed=ithasfed;
	}


	public void hasBeenFed(boolean feed)
	{
		if(feed)
		{
			System.out.println("el Elefante ya a comido");
		}
		else
		{
			System.out.println("el Elefante necesita alimentarse con"+food);	
			
		}

	}

	public void feed()
	{
		System.out.println("el Elefante ha sido alimentado con "+this.food);
		this.ithasfed=true;
	}

	public boolean setIthasfeed()
	{
		return ithasfed;
	}
}