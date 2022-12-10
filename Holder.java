class Holder{
	private Object values[];
	private int capacity,length=-1;

	Holder(){
		capacity=5;
		values=initialize();
	}

	Holder(int cap){
		capacity=cap;
		values=initialize();
		}

	private void increaseSize(){
		capacity+=5;
		Object ob[]=initialize();
		values=copyValues(ob,values);
	}	

	Holder(Object []ob)
	{
		this(ob.length);
		values=copyValues(values,ob);
		for(Object v:values)
		{
			add(v);
		}
	}

 Object[] copyValues(Object[] val1,Object[] val2)
	{
		for(int i=0;i<val2.length;i++)
		{
			if(val2[i]!=null)
				val1[i]=val2[i];
		}
	return val1;
}

private Object[] initialize(){
	return new Object[capacity];
}

public String toString(){
	String s="";

	for(int i=0;i<=length;i++)
	{
		s=s+","+values[i];
	}

	return "["+s.substring(1)+"]";
}

public void add(Object ob)
{
	if(length==capacity-1)
	{
		increaseSize();
	}

	values[++length]=ob;
}
		
		public Object get(int index)
		{
			if(index>=0&&index<=length)
				return values[index];
			else
				return null;
		}
	}

	class test{
		public static void main(String[] args) {
	      
	       Holder s= new Holder();
	       s.add(10);
	       System.out.println(s);		
		}
	}

