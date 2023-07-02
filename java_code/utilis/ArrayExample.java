package java_code.utilis;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        // String 배열 초기화
        String[] carBrands = { "Volvo", "BMW", "Ford", "Mazda" };

        // int 배열 초기화
        int[] scores = { 70, 90, 80 };

        // 2차원 int 배열 초기화
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

        // 2차원 배열의 특정 요소 출력
        System.out.println(matrix[0][2]);

        // 객체 배열 초기화
        Object[] objects = { new Object(), new Object() };

        // forEach loop를 사용하여 배열 요소 출력
        for (int score : scores) {
            System.out.println(score);
        }

        // 배열 복사
        int[] copiedScores = new int[3];
        System.arraycopy(scores, 0, copiedScores, 0, copiedScores.length);
        int[] copiedScores2 = Arrays.copyOf(scores, scores.length);
        int[] copiedScores3 = scores.clone();

        // 배열 정렬
        Arrays.sort(scores);

        // 정렬된 배열 출력
        for (int score : scores) {
            System.out.println(score);
        }

        // 배열을 문자열로 변환하여 출력
        System.out.println(Arrays.toString(scores));

        // 배열에서 특정 값의 인덱스 찾기
        System.out.println(Arrays.binarySearch(scores, 90));

        // 배열 범위 복사
        int[] rangeCopy = Arrays.copyOfRange(scores, 1, 3);

        // 배열 채우기
        Arrays.fill(scores, 1);

        // 배열 비교
        System.out.println(Arrays.equals(scores, copiedScores));
    }
}
