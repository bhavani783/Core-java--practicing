package day12;
//INTERFACE INHERITANCE

//interface I1
interface I1{
	//abstract method(by default public abstract)
	void f1();
}
//interface I2
interface I2 extends I1{
	//abstract method(by default public abstract)
	void f2();
}
//interface I3
interface I3 extends I2{
	//abstract method(by default public abstract)
	void f3();
}
//interface I4
public interface I4 extends I3 {
	//abstract method(by default public abstract)
	void f4();

}
