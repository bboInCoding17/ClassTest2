package package2;

import package1.Aaa;

public class Ccc {
    int c;



    public void ccc(){
    Ddd ddd=new Ddd();
    Aaa aaa = new Aaa();
    aaa.aaa(); // public으로 선언되어 같은 프로젝트 내에서 사용 가능
//    aaa.bbb(); - dfault로 같은 패키지 내에서만 사용 가능
//    aaa.ccc(); - private로 선언된 class내에서만 사용 가능
    }
}


