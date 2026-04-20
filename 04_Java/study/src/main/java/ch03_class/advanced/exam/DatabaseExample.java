package main.java.ch03_class.advanced.exam;

public class DatabaseExample {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.connect();
        System.out.println("데이터 베이스 : " + database.getConnection());
        database.close();

    }
}
