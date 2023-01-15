
package methodoverloading;


public class Methodoverloading {

  void calaculatearea(double a,double b){
  double  area= a*b; 
  System.out.println(area);
  }   
  void calculatearea(int a,int b ){
   double area=a*b;   
     System.out.println(area);  
  }   
   void calculatearea(double a,int b ){
   double area=a*b;   
   System.out.println(area);    
  }   
 void calculatearea(int a){
   double area=a*a;   
    System.out.println(area);   
  }   
  void calculatearea(int a,double b ){
   double area=a*b;   
  System.out.println(area);   
  }      
 
    
    public static void main(String[] args) {
    Methodoverloading wabi=new Methodoverloading ();
      wabi.calculatearea(5);
         wabi.calculatearea(5,6);
         wabi.calculatearea(5.5,7);
         wabi.calaculatearea(5.4,6.7);
        wabi.calaculatearea(5,6.7);
    }
    
}
