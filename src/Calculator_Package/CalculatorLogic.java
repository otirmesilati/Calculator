/*  &&&&&&&&&&&&&&&&&&&&&&&&&&&&&   Project : Java Calculator  &&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    &&&&&&&&&&&&&&&&&&&&&&&&&&&&&   LANGUAGE: Java             &&&&&&&&&&&&&&&&&&&&&&&&&&&&&  
    &&&&&&&&&&&&&&&&&&&&&&&&&&&&&   Date: 08/05/2024           &&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    &&&&&&&&&&&&&&&&&&&&&&&&&&&&&   Author: Otir Mesilati      &&&&&&&&&&&&&&&&&&&&&&&&&&&&&

-> Functions: 0

Function Specifications:

1. ?: ?
   IN:   ?
   OUT:  ?

2. ? : ?
   IN: ?
   OUT: ?

3. ? : ?
   IN: ?
   OUT: ?

4. ? : ?
  IN : ?
  OUT : ?


->> Classes: ?

*/

package Calculator_Package;

public class CalculatorLogic {


  // TODO: very basic design, how about floats? error handling? //

  public static int addTwoNumbers(int augend, int summand) {return augend + summand;}
  
  public static int subtractTwoNumbers(int minuend, int subtrahend) {return minuend - subtrahend;}

  public static int multiplyTwoNumbers(int multiplicand, int multiplier) {return multiplicand * multiplier;}

  public static int divideTwoNumbers(int dividend, int divisor) {return dividend / divisor;}

  public static void main(String [] args) 
  {
    // Testing //
    System.out.println("Hello :-) ");
    System.out.println(addTwoNumbers(1,3));
    System.out.println(subtractTwoNumbers(4,2));
    System.out.println(multiplyTwoNumbers(3,4));
    System.out.println(divideTwoNumbers(8,4));
  }

}
