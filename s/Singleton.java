package s;

public class Singleton {
    // 딱 하나뿐인 인스턴스를 저장할 변수를 만듭니다.
    // 'static'은 모든 Singleton 객체가 공유하는 변수라는 뜻이고,
    // 'private'은 외부에서 이 변수에 직접 접근하지 못하게 막는다는 뜻
    // R 9번째
    private static Singleton instance; // 유일한 인스턴스를 저장할 정적 변수

    // 외부에서 'new Singleton()' 이렇게 마음대로 객체를 만들지 못하게 막음
    // private 붙여 생성자를 아무나 외부에서 호출(new 키워드로 인스턴스 생성) 금지
    private Singleton() {
        System.out.println("Singleton 인스턴스 생성됨!");
    }

    // 이 메서드를 통해 오직 하나의 인스턴스만 생성되고 반환됩.
    // if (instance == null) 조건으로 이미 인스턴스가 생성되었는지 확인함
    // static을 붙여 이 메서드를 s.Singleton.getInstance()처럼 바로 호출할 수 있게 함
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("안녕하세요, 저는 싱글톤 인스턴스입니다.");
    }


    // main 메서드는 Singleton 클래스 내부에 정의되어 있습
    // 같은 클래스 내부에서는 private 멤버(생성자 포함)에 접근할 수 있습
    // private 생성자라 하더라도 같은 클래스 내부에서는 접근이 가능하기 때문입
//    public static void main(String[] args) {
//        //Singleton s0 = new Singleton(); // 컴파일 에러: private 생성자
//
//        Singleton s1 = Singleton.getInstance();
//        //System.out.println("s0과 s1는 같은 인스턴스인가? " + (s0 == s1));
//    }
    // 신규 브랜치, 커밋2
}
