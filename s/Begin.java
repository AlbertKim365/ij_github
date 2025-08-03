package s;

public class Begin {
    public static void main(String[] args) {
        //오류 java: Singleton() has private access in Singleton는 Singleton 클래스의 private 생성자를 외부 클래스에서 호출하려고 했기 때문에 발생합
        // 외부에서 'new Singleton()' 이렇게 마음대로 객체를 만들지 못하게 막음
        // private 붙여 생성자를 아무나 외부에서 호출(new 키워드로 인스턴스 생성) 금지
        //Singleton s0 = new Singleton(); // 컴파일 에러: private 생성자

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        //System.out.println("s0과 s1는 같은 인스턴스인가? " + (s0 == s1));

        s1.showMessage();
        s2.showMessage();

        // 두 인스턴스가 같은지 확인
        System.out.println("s1과 s2는 같은 인스턴스인가? " + (s1 == s2));
    }
}
