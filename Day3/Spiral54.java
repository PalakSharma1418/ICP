package Day3;

public class Spiral54 {
    public static void main(String[] args) {
         int [][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("sprial");
        spiral_print(arr);
        antispiral_print(arr);
    }
    private static void spiral_print(int[][] arr) {
        int te = arr.length*arr[0].length;
        // int row=0,col=0;
        int minr=0,minc=0;
        int maxr=arr.length-1 , maxc=arr[0].length-1;
        int c=0;
        while(c<te){
            for (int i = minc; i <= maxc && c < te; i++) {
				System.out.print(arr[minr][i] + " ");
				c++;
			}
			minr++;
			for (int i = minr; i <= maxr && c < te; i++) {
				System.out.print(arr[i][maxc] + " ");
				c++;
			}
			maxc--;
			for (int i = maxc; i >= minc && c < te; i--) {
				System.out.print(arr[maxr][i] + " ");
				c++;
			}
			maxr--;
			for (int i = maxr; i >= minr && c < te; i--) {
				System.out.print(arr[i][minc] + " ");
				c++;
			}
			minc++;
        }
    }
    private static void antispiral_print(int[][] arr) {
        int te = arr.length*arr[0].length;
        int minr=0,minc=0;
        int maxr=arr.length-1 , maxc=arr[0].length-1;
        int c=0;
        while(c<te){
            while (c < te) {
            // bottom row (right → left)
            for (int i = maxc; i >= minc && c < te; i--) {
                System.out.print(arr[maxr][i] + " ");
                c++;
            }
            maxr--;

            // left column (bottom → top)
            for (int i = maxr; i >= minr && c < te; i--) {
                System.out.print(arr[i][minc] + " ");
                c++;
            }
            minc++;

            // top row (left → right)
            for (int i = minc; i <= maxc && c < te; i++) {
                System.out.print(arr[minr][i] + " ");
                c++;
            }
            minr++;

            // right column (top → bottom)
            for (int i = minr; i <= maxr && c < te; i++) {
                System.out.print(arr[i][maxc] + " ");
                c++;
            }
            maxc--;
        }
    }
    }
}