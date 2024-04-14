package week3;

public class Numbers {
    public static void main(String[] args) {

        int [] someArray = {-15, 20, -65, -37, 92, -81, 75, 24, 70};

        for(int i = someArray.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if (someArray[j] > someArray[j + 1]) {
                    int tmp = someArray[j];
                    someArray[j] = someArray[j + 1];
                    someArray[j + 1] = tmp;
                }
            }
        }

        for(int i = 0; i < someArray.length; i++) {
            if (someArray[i] < 0) {
                int negNum = someArray[i];
                System.out.print(negNum+" ");
            }
        }
    }
}
