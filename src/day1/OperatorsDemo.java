package day1;

public class OperatorsDemo {

	public static void main(String[] args) {
		//ARITHMETIC OPERATORS(+,-,*,/,%)
		//this operators works on numbers or numeric type of data.
		System.out.println("-------Arithmetic operators---------");
		int a=30;
		int b=20;
		System.out.println(a+b);
		System.out.println("sum of a and b is:"+(a+b));
		System.out.println("subtraction of a and b is:"+(a-b));
		System.out.println("mul of a and b is:"+(a*b));
		System.out.println("div of a and b is:"+(a/b));//return quotient value
		System.out.println("modular division of a and b is:"+(a%b));//return remainder value
		/*RELATIONAL/COMPARISION OPERATORS (>,>=,<,<=,!=,==)
		 * -->these operators are used to compare the values and most importantly
		 * when you're working with the conditional and looping statements we 
		 * frequently use this relational operators.
		 * -->These will return boolean values either TRUE/FALSE
		 * -->These operators we use between 2 variables.
		 */
		System.out.println("-----------Relational operators-------");
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		/*LOGICAL OPERATORS(&&,||,!)
		 * -->it is also returns boolean value(t or f)
		 * -->we have to verify certain condition,relation between more expressions,then we go for 
		 * logical operators.
		 */
		System.out.println("--------Logical operators--------");
		boolean x=true;
		boolean y=false;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		/*Increment and decrement operators
		 * -->"++"  is called increment operator 
		 * -->"--" is called decrement operator
		 */
		System.out.println("-------Increment and decrement operatators------");
		int c=10;
		System.out.println(c);
		c=c+1;//c++(increment)
		System.out.println(c);
		c=c-1;//c--(decrement)
		System.out.println(c);
		/*Assignment operators(=,+=,-=,*=,/=,%=)
		 * -->sometimes we want to increase more than 1 value ,that time we use
		 * assignment operators also called shorthand operators.
		 * 
		 */
		System.out.println("------Assignment operator-------");
		c=c+5;//c+=5
		System.out.println(c);
		c=c-5;//c-=5
		System.out.println(c);

	}

}
