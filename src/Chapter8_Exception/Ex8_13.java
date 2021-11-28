//package Chapter8_Exception;//연결된 예외 예제
//
//public class Ex8_13 {
//    public static void main(String[] args) {
//        try {
//            install();
//        } catch (InstallException e) {
//            e.printStackTrace();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//    static void install() throws InstallException{
//        try {
//            startInstall();
//            copyFiles();
//        } catch (SpaceException2 e) {
//            InstallException ie = new InstantiationException("설치중 예외 발생");
//            ie.initCause(e);
//            throw ie;
//        } finally {
//            deleteTempFiles();
//        }
//    }
//}

//예외 처리 다시 복습해야할 것 같음
