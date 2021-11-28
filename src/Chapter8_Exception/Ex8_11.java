package Chapter8_Exception;//사용자 정의 예외만들기


public class Ex8_11 {
    public static void main(String[] args) {
        try {
            startInstall();//프로 그램 설치에 필요한 준비를 한다.
            copyFiles();
        }catch (SpaceException e){
            System.out.println("에러메시지:"+e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 이후에 다시 설치하시길 바랍니다.");
        }catch (MemoryException me){
            System.out.println("에러메시지:"+me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도하세요");
        }
        finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace())//공간이 부족할때
            System.out.println("설치할 공간이 부족합니다.");
        if(!enoughMemory())
            System.out.println("메모리가 부족합니다.");
    }

    static void copyFiles(){/*파일들을 복사하는 코드를 적는다*/}
    static void deleteTempFiles(){/*임시파일을 삭제하는 코드를 적는다*/}

    static boolean enoughMemory(){
        return true;
    }
    static boolean enoughSpace(){
        return false;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg){
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
