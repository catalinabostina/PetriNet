package petri;

import java.util.ArrayList;
import java.util.List;

public class ReaderWriter extends PetriNet {

	public ReaderWriter()
	{
		Locatie outset = new Locatie("worker", 5);
		Locatie reading = new Locatie("reading", 0);
		Locatie writing = new Locatie("writing", 0);
		
		List<Arc>arcul1=new ArrayList<>();
		arcul1.add(new Arc(1,reading,true));
		arcul1.add(new Arc(1,outset,false));
		
		tranzitii.add(new Tranzitie("startReading", arcul1));
		
		List<Arc>arcul2=new ArrayList<>();
		arcul2.add(new Arc(1,outset,true));
		arcul2.add(new Arc(1,reading,false));
		
		tranzitii.add(new Tranzitie("endReading",arcul2));
		
		List<Arc>arcul3=new ArrayList<>();
		arcul3.add(new Arc(1,writing,true));
		arcul3.add(new Arc(5,outset,false));
		
		tranzitii.add(new Tranzitie("startWriting",arcul3));
		
		List<Arc>arcul4=new ArrayList<>();
		arcul4.add(new Arc(1,outset,true));
		arcul4.add(new Arc(1,writing,false));
		
		tranzitii.add(new Tranzitie("endWriting",arcul4));
		
	}
}
