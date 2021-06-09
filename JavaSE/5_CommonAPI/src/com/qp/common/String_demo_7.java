package com.qp.common;

public class String_demo_7 {
    public static void main(String[] args) {
        /*		String s = "woshiqq";
		String s1 = "wo";
		System.out.println(s.contains(s1));
		System.out.println(s.contains("hi"));
		System.out.println(s.indexOf("a"));
		//char c = 'c';
		char c = 65535; //c
		System.out.println(c);*/

/*		String s1 = "abc";   //常量池
		String s2 = "abc";  //常量池
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2));//true
*/
/*		String s1 = new String("abc"); //常量池 --"abc" ,s1:堆 ---"abc"
		String s2 = "abc"; //常量池 --"abc"
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2));//true
*/


/*		String s1 = "a"+"b"+"c"; //常量池 --"a"、"b"、"c"、"abc",s1:常量池 ---"abc"
		String s2 = "abc"; //常量池 ---"abc"
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2));//true
*/
		String s1 = "ab";   //常量池 "ab"
		String s2 = "abc";  //常量池 "abc" --s2   常量池 "ab"--s1
		String s3 = s1+"c"; //常量池 "abc" --s2   常量池 "ab"--s1   StringBuffer转换来 --s3
		System.out.println(s3==s2); //false
		System.out.println(s3.equals(s2));//true

    }
}
