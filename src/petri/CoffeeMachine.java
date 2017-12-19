package petri;
import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine extends PetriNet {

	public CoffeeMachine()
	{
		Locatie locatie0=new Locatie ("0",1);
		Locatie locatie5= new Locatie("5", 0);
		Locatie locatie10 = new Locatie("10", 0);
		Locatie locatie15 = new Locatie("15", 0);
		
		List<Arc>arcul1=new ArrayList<>();
		arcul1.add(new Arc(1,locatie0,true));
		arcul1.add(new Arc(1,locatie5,false));
		
		tranzitii.add(new Tranzitie("5", arcul1));
		
		List<Arc>arcul2=new ArrayList<>();
		arcul2.add(new Arc(1,locatie0,true));
		arcul2.add(new Arc(1,locatie10,false));
		
		tranzitii.add(new Tranzitie("10",arcul2));
		
		List<Arc>arcul3=new ArrayList<>();
		arcul3.add(new Arc(1,locatie5,true));
		arcul3.add(new Arc(1,locatie10,false));
		
		tranzitii.add(new Tranzitie("5",arcul3));
		
		List<Arc>arcul4=new ArrayList<>();
		arcul4.add(new Arc(1,locatie5,true));
		arcul4.add(new Arc(1,locatie15,false));
		
		tranzitii.add(new Tranzitie("10",arcul4));
		
		List<Arc>arcul5=new ArrayList<>();
		arcul5.add(new Arc(1,locatie10,true));
		arcul5.add(new Arc(1,locatie15,false));
		
		tranzitii.add(new Tranzitie("5",arcul5));
	}
}
