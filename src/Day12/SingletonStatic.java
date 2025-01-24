//package Day12;
//
//public class SingletonStatic {
//    private static SingletonStatic instance;
//
//    private SingletonStatic(){}
//
//    static { //static 블럭을 이용해 예외 처리
//
//        try {
//
//            instance = new SingletonStatic()
//        } catch (Exception e) {
//            throw new RuntimeException("싱글톤 객체 생성 오류");
//        }
//
//        public static SingletonStatic getInstance(){
//
//            if(instance == null) instance = new SingletonStatic();
//
//            return instance;
//        }
//
//    }
//}
