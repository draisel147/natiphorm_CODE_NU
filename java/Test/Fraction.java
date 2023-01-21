public class Fraction {
   private int top;
   private int bottom;	
   public Fraction(int top, int bottom){
   	this.top = top;
	this.bottom = bottom;
   }
   public String toString(){
     return top + "/" + bottom;
   } 
   public int getTop(){
   	return top;
   }
   public int getBottom(){
   	return bottom;
   }
   public void simplify( ) {
      int gcd   = gcd(top, bottom);
      top = top/gcd;
      bottom = bottom/gcd;
   }
   private static int gcd(int a, int b) {
      if( b == 0) return Math.abs(a);
      else return gcd(b, a % b);
   }
   public double toDouble(){
     return (double) top / bottom;
   } 
   public static Fraction parse(String s) {
      String[] tmp = s.split("/");
      int a = Integer.parseInt(tmp[0]);
      int b = Integer.parseInt(tmp[1]);

      Fraction f = new Fraction(a, b);
      return f;
   }
   public Fraction multiply(int n){
      int a = n * top;
      Fraction tmp = new Fraction(a, bottom);
      tmp.simplify();
      return tmp;
   }
   public Fraction multiply(Fraction a){
      int x = top*a.top; 
      //top*a.getTop();
      int y = bottom*a.bottom; 
      //bottom*a.getBottom();
      Fraction tmp = new Fraction(x, y);
      tmp.simplify();
      return tmp;
   }
   public Fraction add(Fraction f){
      int a = top*f.bottom;
      int b = bottom*f.top;
      int c = bottom*f.bottom;
      Fraction z = new Fraction(a+b, c);
      z.simplify();
      return z;
   }
   public Fraction subtract(Fraction f){
      int a = top*f.bottom;
      int b = bottom*f.top;
      int c = bottom*f.bottom;
      Fraction z = new Fraction(a-b, c);
      z.simplify();
      return z;
   }
   public Fraction divide(Fraction f){
      int a = top*f.bottom;
      int b = bottom*f.top;
      Fraction z = new Fraction(a, b);
      z.simplify();
      return z;
   }
   public boolean equals(Fraction f){
      return top==f.top && bottom==f.bottom;
   }
   public static Fraction min(Fraction f1, Fraction f2){
      if(f1.toDouble() < f2.toDouble()) 
         return f1;
      else
         return f2;
   }   
} // class


