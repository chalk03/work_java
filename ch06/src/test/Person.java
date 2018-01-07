package test;

import java.util.Arrays;
import java.util.Scanner;


public class Person {
	public static void main(String[] args) {
        // 10개의 입력값을 받기 위한 변수
        int input=0;
        Scanner scanner = new Scanner(System.in);
        int[] Userdata= new int[10];
        int sum =0;
        double avg = 0;
                        
        // 입력받기
        for ( int i=0 ;  i <Userdata.length ; i++){
            System.out.print("자료를 입력해 주세요[정수]      "+ i + "/ "   + Userdata.length);
            input = scanner.nextInt();
            Userdata[i]= input;            
        }
        
        // 합과 평균 구하기
        for ( int i =0 ; i < Userdata.length ; i++){
            sum= sum + Userdata[i];
        }
            avg = sum / Userdata.length;
            
        // 결과 출력
        System.out.println("————————————————-");
        System.out.println(Arrays.toString(Userdata));
        System.out.println("합계 = "+sum+"        "+"평균 = " +  avg);
        System.out.println("————————————————-");
        
    }
}