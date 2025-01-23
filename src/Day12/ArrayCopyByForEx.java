package Day12;

public class ArrayCopyByForEx {
    public static void main(String[] args) {
        //길이가 3인 배열 생성 후 초기화 : oldIntArray
        int[] oldIntArray = {1,2,3};
        //길이가 5인 배열 생성 후 길이가 3인 배열의 항목들을 옮겨야 한다.
        int[] newIntArray = new int[5];
        int[] newIntArray2 = new int[5];
        newIntArray[0] = oldIntArray[0];
        newIntArray[1] = oldIntArray[1];
        newIntArray[2] = oldIntArray[2];

        //1. for문 배열의 복사
        for (int index = 0;index<oldIntArray.length;index++){
            newIntArray[index] = oldIntArray[index];
        }

        //2. 자바 API System 클래스에서 제공하는 arraycopy()를 이용한 방법
        //System.arraycopy(기존배열,시작할 인덱스 번호,새로운 배열,시작할 인덱스 번호,몇개를 복사할지?)
        System.arraycopy(oldIntArray,0,newIntArray2,0,3);


        //길이가 5인 배열에 옮긴 항목들이 잘 옮겨졌는지 항목을 확인(출력)
        for (int index = 0;index< newIntArray.length;index++){
            System.out.print(newIntArray[index] + " ");
        }

        for (int number:newIntArray2){
            System.out.print(number + " ");
        }
        // code summary : 배열의 길이가 변경되어, 기존 배열의 데이터값을 newIntArray에 카피한 후 잘 카피가 되었는지 확인하는 코드입니다.
    }
}
