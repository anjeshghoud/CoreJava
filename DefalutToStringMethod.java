package core.java;

public class DefalutToStringMethod {
	
	int id;
	String name;
	
	
	
	
	 DefalutToStringMethod(int id,String name)
	 {
		 this.id=id;
		 this.name=name;
	 }
	 

	 @Override
		public String toString() {
			// TODO Auto-generated method stub
			return id +"      "+name;
		}
	 
	 //To Get manual  Default  toSting method execute result set result
	 
	 String manualToString()
	 {
		 //return getClass().getName() + "@" + Integer.toHexString(hashCode());
		 return  getClass().getName()+"@" + Integer.toHexString(hashCode());
	 }
	
	public static void main(String args[])
	{
		DefalutToStringMethod d1=new DefalutToStringMethod(6,"anjesh");
	System.out.println(d1);
	
	System.out.println(d1.manualToString());
	
	}

}

