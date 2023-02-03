package package1;

import package2.Ccc;

public class Aaa {
    int a1;
    private int a2;
    public int a3;




    public void aaa(){
        Ccc ccc = new Ccc(); // public 접근 제한자로 선언되어 Aaa클래스에서도 객체 선언 가능
//        Ddd ddd = new Ddd(); - default로 선언된 Ddd 클래스는 객체 선언이 불가능해
    }


    void bbb(){
    //    Bbb bbb = new Bbb(); - private로 선언된 생성자로 다른 클래스에서 객체 선언 불가
    }//default 접근제한자
    private void ccc(){

    }// 클래스 Aaa에 선언된 ccc메소드로, 클래스 Aaa내에서만 사용 가능
}
