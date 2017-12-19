package petri;

import java.util.List;

public class Tranzitie {
	
	private String tag;
    private List<Arc> Arce;
    
	public Tranzitie(String tag, List<Arc> arce) {
		
		this.tag = tag;
		Arce = arce;
	}
    
    public boolean isValid()
    {
    	for (int i = 0; i < Arce.size(); i++){
    		if(!Arce.get(i).isValid())
    		{
    			return false;
    		}
    	}
    		return true;
    }
    
    public void Update()
    {
    	for (int i = 0; i < Arce.size(); i++)
    	{
    		Arce.get(i).update();
    	}
    }
    
    public String get_tag() {
		return tag;
	}

}
