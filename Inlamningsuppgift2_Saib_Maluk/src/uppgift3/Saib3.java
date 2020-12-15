package uppgift3;

public class Saib3 {

	

	public static void main(String[] args) {

		        int rows = 8;

int j;

		        for (int i = 0; i < rows; i++) {
		            int count = 1;
		            for ( j = 0; j <= i; j++) {
		                System.out.print(count + " ");
		                count = count * 3;
		            }
		            count = count / 3;
		            for ( j = 0; j < i; j++) {
		                count = count / 3;
		                System.out.print(count + " ");
		            }
		            System.out.println();
		        }
		
		
	}

}
