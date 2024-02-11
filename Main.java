package project;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static int sumToN(int n){
        if(n==0){return 0;}
        else {return n+sumToN(n-1);}
    }
    //public DefaultConstruct(){}
    //기본생성자 컴파일러에 의해 자동으로 생성
enum Day {Sunday,Monday,Tusday,WTF,Saturday}//enum 선언
    public static void main(String[] args) {//파일의 집합(그룹핑)은 디렉토리
        //Scanner input =new Scanner(System.in);
        /*for-each예제
        String[] a=new String[2];
        a[0]="해복합1반";
        a[1]="조남웅";
        for(String unit : a){
        System.out.println(unit);
        } 
        */
        
        /* enum 활용
        for(Day date:Day.values()){
            System.out.println(date);
        }
        Day date = Day.valueOf("Monday");
        System.out.println("day="+date);
        */
        
        
        //그..새로운 클래스를 실행하는 법이나 알아보자 -해결
        /*그니까 일단 패키지를 만든다음에 그안에 클래스를 선언하고 
        선택파일 실행
        왜 현재파일 생행은 안되냐
        하고 빌드 다음 실행?
        */
        
       // float val add(3.2f,4.3f);==컴파일 오류
        /*왜? 자바에서 실수타입 기본처리는 double타입임. 
        따라서 입력시 3.2f,4.3f 처럼
        f 붙혀야함*/
        
        //메소드 오버라이딩
        //리턴자료형을 다른자료형으로 바꾸거나 매개변수의 개수를 다르게하면 같은 이름
        //메소드를 여러개 만들수 있음 
        //메소드 인자를 리턴자료형보다 작은 바이트를 넣으면 자동으로 형변환됨
        //작은박스->큰박스로 되기때문
        System.out.println(sumToN(100));//재귀함수 예제 재귀는 꼭 탈출조건이 있어야함
    }
    float add(float a, float b){
        return a+b;
    }
    
}


