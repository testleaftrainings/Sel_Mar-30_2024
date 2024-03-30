package week1.day1;

public class LearnOperator {

	public static void main(String[] args) {
		int a=2;
		int b=5;
		
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a+=6); //a=a+6 a=2+6=>8
		System.out.println(a>b);//8>5
		System.out.println((a<b)&&(b<a));//8<5 && 5<8
		System.out.println((b<a)||(a<b));
		System.out.println("before :"+ b++);//5++=>6=>5 //post increment
		System.out.println("before :"+ a--);//8--=>7
		System.out.println("after :"+a);//print 7
		System.out.println("after :" +b);//print 6
		System.out.println(++b); //pre increment

	}

}
