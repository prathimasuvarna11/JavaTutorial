
class VariableDemo
{
   static int count=0;
   public static void increment()
   {
       count=count+1;
   }
   public static void main(String args[])
   {
       //VariableDemo obj1=new VariableDemo();
       //VariableDemo obj2=new VariableDemo();
      // obj1.increment();
      // obj2.increment();
	   VariableDemo.increment();
	   
       System.out.println("Obj1: count is="+VariableDemo.count);
       VariableDemo.increment();
       System.out.println("Obj2: count is="+VariableDemo.count);
   }
}