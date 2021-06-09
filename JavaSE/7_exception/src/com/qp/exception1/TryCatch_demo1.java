package com.qp.exception1;

public class TryCatch_demo1 {
    public static void main(String[] args) {
        Demo d = new Demo();
        int[] arr = {1,2};
        try {
            System.out.println(d.divide(10, 0)); // 第1个异常 （ArithmeticException）
            System.out.println(arr[5]);          //第2 个异常（ArrayIndexOutOfBoundsException）， 不执行(此demo不执行）跳转到对应的catch
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");      //除数不能为0
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");        // 不执行（此demo不执行）
        }catch (Exception e) {   //最大的异常放在最后，如果前面的catch未匹配，进入该catch
            System.out.println("其他异常");        // 不执行(此demo不执行）
        }finally {                                // finally 可省略
            System.out.println("--------finally---------"); // 执行
        }
        System.out.println("--end--");  // 执行
    }
}
class Demo{
    public int divide(int a,int b){
        return a/b;
    }
}

