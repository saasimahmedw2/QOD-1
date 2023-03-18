import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER LENGHT OF ARRYA: ");
    int size = input.nextInt();
    int nums[] = new int[size];
    System.out.println("ENTER ELEMS OF ARRAY: ");
    for (int i = 0; i < size; i++)
      nums[i] = input.nextInt();
    System.out.println("ELEMS ARE: ");
    for (int x : nums) {
      System.out.println(x);
    }
    System.out.println("ENETR A NUM: ");
    int num = input.nextInt();
    // int x=0;
    // while(nums!=null)
    for (int i = 0; i < size; i++) {
      for (int j = 1; j < i; j++) {
        int temp = nums[i];
        int tempo = nums[j];
        int res = temp + tempo;
        if (res == num) {
          // System.out.println(temp+"--"+tempo+"--"+i+"--"+j);
          // System.out.printf("NUM1 %d -- i %d\nNUM2 %d--j %d\n",temp,i,tempo,j);
          System.out.printf("NUM1: %d\t NUM2: %d = %d\n", temp, tempo, res);
          System.out.printf("\nINDEX OF NUM1: %d\nINDEX OF NUM2: %d\n", i, j);
          // break;
        }
      }
    }
  }
}
// if(num[i] && num[j])
