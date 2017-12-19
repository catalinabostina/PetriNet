package petri;

public class Arc {
	
	private int capacitate;
	private Locatie locatie;
	boolean directie; 
	public Arc(int capacitate, Locatie locatie, boolean directie) {
		
		this.capacitate = capacitate;
		this.locatie = locatie;
		this.directie = directie;
		
	}
	
	public boolean isValid()
	{
        if(this.directie ==true)
        {
        	if(capacitate < locatie.get_jeton()){
        	return true;}
        }
        
	    else {
	    	return true;
	    }
        	return false;
	}

	public void update() 
	{
		 if(this.directie == true)
			 locatie.adauga(capacitate);
		 else {
			 locatie.scoate(capacitate);
			 }
		 }	 
}
