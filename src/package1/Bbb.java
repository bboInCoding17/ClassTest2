package package1;

import package2.Ccc;

public class Bbb {
    int b;

    private Bbb(){

    }



    public void bbb(){
        Aaa aaa=new Aaa();
        Ccc ccc = new Ccc();
        aaa.a1 = 10;
//        aaa.a2 = 10; - private으로 선언되어 선언된 class가 아닌 경우 다른 class에서 사용 안됨
        aaa.a3 = 10;
    }
}
