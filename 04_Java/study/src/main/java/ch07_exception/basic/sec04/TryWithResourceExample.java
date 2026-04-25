package main.java.ch07_exception.basic.sec04;

public class TryWithResourceExample {
    public static void main(String[] args) {
        // 추천: 가능하면 try-with-resources 사용 (예외가 발생해도 close() 자동 호출 + close() 예외는 suppressed로 관리)
        try (MyResource res = new MyResource("A")) {
            String data = res.read1();
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("예외 처리 " + e.getMessage());
        }
        System.out.println();

        // finally로 2번째 구문을 "try-with-resources와 같은 목적(무조건 닫기)"으로 구현
        // 차이 1) 수동으로 null 체크/close() 예외 처리를 직접 작성해야 해서 코드가 길고 실수 여지가 큼
        // 차이 2) try-with-resources는 close()에서 난 예외를 suppressed로 붙여 원인 예외를 보존하지만,
        //        finally를 단순히 쓰면 close() 예외가 기존 예외를 덮어쓸 수 있음(여기서는 close() 예외를 별도 처리)
        MyResource res = null;
        try {
            res = new MyResource("A");
            String data = res.read2();
            int value = Integer.parseInt(data);
        } catch (NumberFormatException e) {
            System.out.println("예외 처리 " + e.getMessage());
        } finally {
            if (res != null) {
                try {
                    res.close();
                } catch (Exception e) {
                    System.out.println("자원 반납 중 예외 " + e.getMessage());
                }
            }
        }
        System.out.println();

        // 실무에서 더 흔한 형태: try(...) 헤더에서 "생성 + 등록"을 같이 하는 형태
        // - 장점: 생성(new ...)에서 예외가 나도 catch로 잡을 수 있음(try/catch 범위 안)
        // - 장점: res1만 생성되고 res2 생성이 실패해도, 생성된 res1을 자동 close() 해줌(부분 생성 누수 방지)
        try (
                MyResource res1 = new MyResource("A");
                MyResource res2 = new MyResource("B")
        ) {
            String data1 = res1.read1();
            String data2 = res2.read1();
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }

        System.out.println();

        // Java 9+ 문법: "이미 만들어진" 리소스를 try-with-resources에 등록만 하는 형태 (변수는 final/effectively final이어야 함)
        // - 장점: 리소스를 미리 만들어야 하는 흐름(조건 분기/팩토리/메서드 호출 결과 등)에서 close() 자동화를 유지 가능
        // - 단점: 생성(new ...)은 try 밖에서 일어나므로, 생성 예외는 아래 catch가 못 잡고,
        //         res1 생성 후 res2 생성이 실패하면 res1이 자동 close()되지 않을 수 있음(그래서 실무에선 첫 형태가 더 흔함)
        MyResource res3 = new MyResource("A");
        MyResource res4 = new MyResource("B");
        try (res3; res4) {
            String data3 = res3.read1();
            String data4 = res4.read1();
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }
}
