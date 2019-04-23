public class Elefante implements Alimentacion
{
	private String alimento;
	private boolean ithasfed;

	public Elefante()
	{
		alimento="mani";
		ithasfed=false;
	}

	public Elefante(String alimento,boolean ithasfed)
	{
		this.alimento=alimento;
		this.ithasfed=ithasfed;
	}


	public void hasBeenFed(boolean feed)
	{
		if(feed==false)
		{
			System.out.println("el Elefante necesita alimentarse con"+alimento);	
		}
		else
		{
			System.out.println("el Elefante ya a comido");
		}

	}

	public void feed()
	{
		System.out.println("el Elefante ha sido alimentado con "+this.alimento);
		this.ithasfed=true;
	}

	public boolean setIthasfeed()
	{
		return ithasfed;
	}
}