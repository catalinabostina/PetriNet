package petri;

import java.util.List;

public class PetriNet {

	public List<Tranzitie> tranzitii;
	public Tranzitie tranzitie;
	
	public void Exec(String actiune)
	{
		for (int i = 0; i < tranzitii.size(); i++) 
		{
			tranzitie=tranzitii.get(i);
			if (tranzitie.get_tag()==actiune)
				{
				if (tranzitie.isValid())
				    {
					tranzitie.Update();
				    }
				}
		}
	}
}
