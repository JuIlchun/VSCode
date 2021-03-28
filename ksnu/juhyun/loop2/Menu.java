package ksnu.juhyun.loop2;

import java.util.*;

public class Menu
{
    public static void Stain(String[] args)
    {
        Menu Menu = new Menu();

        while (true)
        {
            Menu.print();
            //Menu.choose();
        }
    }

    // public int choose()
    // {
    //     int num=-1;
    //     switch (num) {
    //         case 1:
                
    //             break;
    //         case 2:
    //             break;
    //         case 3:
    //             break;
    //         case 4:
    //             break;
    //         case 5:
    //             break;
    //         case 6:
    //             break;
    //         case 0:
    //             break;
    //     }
    // }

    public int Scan()
    {
        int num=0;
        Scanner Scan = new Scanner(System.in);
        num=Scan.nextInt();
        Scan.close();
        return num;
    }

    public void print()
    {
        System.out.println("○ 다음의 프로그램들 중에서 수행할 함수를 선택하세요.");
        System.out.println("[구현자이름 : 박주현    학번: 1901114]");
        System.out.println("1) 커피 메뉴를 넣으면 가격을 출력해 주는 프로그램");
        System.out.println("2) 입력된 수의 평균과 갯수 구하기해서 화면에 프린트하기");
        System.out.println("3) 알파벳 A부터 Z까지 프린트하기");
        System.out.println("4) 정수 x와 y를 입력받아, x부터 y까지 더하는 과정과 결과 보이기");
        System.out.println("5) 99단 단순 찍기");
        System.out.println("6) 99단 출력단수와 수의 범위 설정해서 프린트하기");
        System.out.println("0) 종료");
    }
}