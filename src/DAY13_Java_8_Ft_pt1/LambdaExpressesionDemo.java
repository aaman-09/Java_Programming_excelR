package DAY13_Java_8_Ft_pt1;
import java.util.*;
public class LambdaExpressesionDemo {
	public static void main(String[] args) {
		
		//Interface 1
		Printing p1 = ()-> {
			System.out.println("Printing in Magzine");
		};
		p1.print();
		
		//Interface 2
		Greeting g1 = (name) ->{
			System.out.println("Welcome to FSD "+name);
		};
		
		g1.greet("Virat");
		
		//Interface 3
		Shape s1 = (r) -> {
			return Math.PI*r*r;
		};
		double areaOfCircle = s1.area(5);
		System.out.println(areaOfCircle);
	}
}
	
//	//noraml Function
//	public void greet() {
//		System.out.println("Welcome to FSD");
//	};
//	
//	//Lambda Function
//	//plus
//	//.Add -> Operator
//	//minus
//	//1. Access Specifier (public private)
//	//2.return type, Function name
////	()->
//	{
//		System.out.println("Welcome in LAmbda Fsd");
//	};
//	
//	//shoes + socks
//	//bike + fuel
//	// Lambda Expression + Functional InterFace
//	// --> Single Abstract mthd
//}
