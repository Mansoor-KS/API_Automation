package com.mansoor.api.ex_02_RA_Concepts;

public class APITesting_Lab03_NP {
    public void step1(){
        System.out.println("step1");
    }
    public void step2(){
        System.out.println("step2");
    }
    public void step3(String param){
        System.out.println("step3");
    }
    public static void main(String[] args){
       APITesting_Lab03_NP np = new APITesting_Lab03_NP();
       np.step1();
       np.step2();
       np.step3("mansoor");
    }
}
