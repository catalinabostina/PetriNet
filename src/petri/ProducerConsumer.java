package petri;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer extends PetriNet{

	public ProducerConsumer()
	{
		Locatie producator=new Locatie ("prod",20);
		Locatie consumator= new Locatie("cons", 0);
		Locatie prodDataReady = new Locatie("prodDR", 0);
		Locatie consDataReady = new Locatie("consDR", 0);
		Locatie pozitiiLibere=new Locatie ("liber",10);
		Locatie pozitiiOcupate= new Locatie("ocupat", 0);
		Locatie mutex = new Locatie("mutex", 1);
		
		List<Arc>arcul1=new ArrayList<>();
		arcul1.add(new Arc(1,producator,true));
		arcul1.add(new Arc(1,prodDataReady,false));
		
		tranzitii.add(new Tranzitie("produce", arcul1));
		
		List<Arc>arcul2=new ArrayList<>();
		arcul2.add(new Arc(1,prodDataReady,true));
		arcul2.add(new Arc(1,pozitiiLibere,true));
		arcul2.add(new Arc(1,mutex,false));
		arcul2.add(new Arc(1,mutex,true));
		arcul2.add(new Arc(1,pozitiiOcupate,false));
		arcul2.add(new Arc(1,producator,false));
		tranzitii.add(new Tranzitie("push",arcul2));
		
		List<Arc>arcul3=new ArrayList<>();
		arcul3.add(new Arc(1,consDataReady,false));
		arcul3.add(new Arc(1,pozitiiLibere,false));
		arcul3.add(new Arc(1,mutex,false));
		arcul3.add(new Arc(1,mutex,true));
		arcul3.add(new Arc(1,pozitiiOcupate,true));
		arcul3.add(new Arc(1,consumator,true));
		tranzitii.add(new Tranzitie("pop",arcul2));
		
		List<Arc>arcul4=new ArrayList<>();
		arcul4.add(new Arc(1,prodDataReady,true));
		arcul4.add(new Arc(1,consumator,false));
		
		tranzitii.add(new Tranzitie("consume", arcul1));
		
		
	}
}
