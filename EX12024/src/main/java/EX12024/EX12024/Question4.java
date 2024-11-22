package EX12024.EX12024;

public class Question4 {
	public  String comparing(Object a,Object b,String mod) {
		if(!(a instanceof Number)||! (b instanceof Number)) {
			return "error";
		}
		
		double numbera=((Number)a).doubleValue();
		double numberb=((Number)b).doubleValue();
		switch(mod) {
		case "regular":
			if(numbera<numberb)
				return "B";
			else
				return "A";
		case "negative":
			if(-numbera<-numberb)
				return "B";
			else
				return "A";
		case "reciprocal":
			if(numbera==0|| numberb==0)
				return "error";
			if((double)1/numbera<(double)1/numberb)	
				return "B";
			else
				return "A";					
			}
		return "error";
			
		}
	}

