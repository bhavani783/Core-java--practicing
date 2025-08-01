package day10;
/*Method overriding:
 * --->by using method overriding we can achieve runtime polymorphism.
 * definition:
 * -->When a method in sub class has the same name with same signature as the
 * method in it's super class with different implementation is known as method
 * overriding.
 * --->Method overriding always can be done in parent and child classes.
 */
public class Basetest {
int x,y;
public void operation(int x,int y) {
	this.x=x;
	this.y=y;
	int z=this.x+this.y;
	System.out.println("sum is:"+z);
}
}
