package petri;

public class Locatie {
	
	private String tag;
	private int jetoane;
	
	
	public Locatie(String tag, int jetoane) {
		
		this.tag = tag;
		this.jetoane = jetoane;
		
	}
	
	public void adauga(int jetoane)
	{
		this.jetoane=jetoane;
	}
	
	public void scoate(int jetoane)
	{
		this.jetoane-=jetoane;
	}
	public int get_jeton()
	{
		return jetoane;
	}
    public void set_jeton(int jetoane)
	{
		this.jetoane=jetoane;
	}

}
