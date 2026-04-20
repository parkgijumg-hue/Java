package main.java.ch03_class.advanced.exam;

public class Database {

    // private이 붙으면 이 변수는 Database 클래스 내부에서만 직접 사용할 수 있습니다.
    private String connection = "MYSQL";
    // static은 "객체마다 따로 생기는 값"이 아니라 "클래스에 하나만 소속되는 값"이라는 뜻입니다.
    // 원래 인스턴스 변수는 new Database()로 객체를 만들 때마다 각각 따로 생깁니다.
    // 하지만 static 변수는 Database 객체를 여러 개 만들더라도 클래스 차원에서 하나만 존재합니다.
    //
    // 여기서는 Database 객체를 딱 하나만 만들어서 여러 곳에서 공유하려고 static을 사용합니다.
    // 이런 방식은 "싱글톤 패턴(Singleton Pattern)"이라고 부릅니다.
    // 싱글톤 패턴은 프로그램 전체에서 특정 클래스의 객체를 하나만 만들어 사용하고 싶을 때 사용합니다.

    // new Database()는 Database 클래스의 객체를 새로 만드는 코드입니다.
    // new는 Java 예약어이며, 클래스를 바탕으로 실제 객체를 생성할 때 사용합니다.
    // Database()는 생성자를 호출하는 부분입니다.
    // 아래에 있는 private Database() 생성자가 실행됩니다.
    private static Database database = new Database();

    // private Database()라고 했기 때문에 이 생성자는 Database 클래스 내부에서만 호출할 수 있습니다.
    // 즉, 다른 클래스에서는 new Database()를 직접 사용할 수 없습니다.
    //
    // 왜 생성자를 private으로 막을까요?
    // 위에서 이미 private static Database database = new Database(); 코드로 객체를 하나 만들어 두었습니다.
    // 그런데 외부에서 계속 new Database()를 할 수 있으면 객체가 여러 개 만들어집니다.
    // 그러면 "객체를 하나만 사용한다"는 싱글톤 패턴의 목적이 깨집니다.
    // 그래서 생성자를 private으로 막고, 아래 getInstance() 메서드를 통해서만 객체를 가져가게 만듭니다.
    //
    // 중괄호 { } 안이 비어 있으므로 객체가 만들어질 때 특별히 실행할 추가 작업은 없습니다.
    // 세미콜론(;)은 여기서 없어도 됩니다. private Database() {} 만 써도 정상입니다.
    private Database(){}

    // static이 붙은 메서드는 객체를 직접 만들지 않아도 클래스 이름으로 호출할 수 있습니다.
    // 예를 들어 Database.getInstance() 처럼 사용할 수 있습니다.
    // 만약 static이 없다면 먼저 new Database()로 객체를 만들어야 메서드를 호출할 수 있는데,
    // 이 클래스는 생성자가 private이라 외부에서 new Database()를 할 수 없습니다.
    // 따라서 외부에서 유일한 Database 객체를 가져갈 수 있도록 getInstance()를 static으로 만듭니다.
    //
    // Database는 이 메서드의 반환 타입입니다.
    // 즉, getInstance()를 호출하면 Database 객체를 돌려준다는 뜻입니다.

    public static Database getInstance(){

        // 그래서 getInstance()를 여러 번 호출해도 매번 새 객체를 만드는 것이 아니라 같은 객체를 돌려줍니다.
        return database;
    }

    // String은 이 메서드의 반환 타입입니다.
    // 즉, connect()를 실행하면 마지막에 문자열 값을 돌려준다는 뜻입니다.
    // 아래 코드에서 return connection;을 하기 때문에 connection 변수의 타입과 같은 String을 반환 타입으로 사용합니다.
    //
    // 실제 데이터베이스 연결 코드가 들어있는 것은 아닙니다.
    // 현재 코드는 "MYSQL에 연결합니다."라는 문장을 출력하고, connection 값을 반환하는 예제 코드입니다.
    public String connect() {

        System.out.println(connection + "에 연결합니다.");

        // connection 변수에 들어있는 값을 메서드 호출 결과로 반환합니다.
        // 현재 connection에는 "MYSQL"이 들어 있으므로 connect()를 호출하면 "MYSQL" 문자열이 반환됩니다.
        // 이 return 문이 있기 때문에 메서드 선언부의 반환 타입이 void가 아니라 String입니다.
        return connection;
    }

    // void는 "반환값이 없다"는 뜻의 Java 예약어입니다.
    // connect()는 String 값을 return 했기 때문에 반환 타입이 String이었지만,
    // close()는 어떤 값을 돌려주지 않고 출력만 하므로 반환 타입을 void로 사용합니다.
    // 실제 데이터베이스 연결을 종료하는 라이브러리 코드가 들어있는 것은 아닙니다.
    // 현재 코드는 "MYSQL을 닫습니다."라는 문장을 출력하는 예제 코드입니다.
    public void close(){

        System.out.println(connection + "을 닫습니다.");
    }

    public String getConnection() {
        return connection;
    }
}
