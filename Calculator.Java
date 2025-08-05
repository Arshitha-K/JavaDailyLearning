 public class Calculator{
     public static void main(String[] args) {
        // TODO Auto-generated method stub
    
    Demo calc=new Demo();
    calc.add(5,10);
    calc.add(5,10.5);
    System.out.println("Addition of two integers: " + calc.add(5, 10));
}
   
}
 class Demo {
     public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int add(int num1,double num2){
        return num1 + (int)num2;
    }
}
