package g07;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//cau1
		float a,b,c;
		System.out.println("Nhap a: ");
		a = in.nextFloat();
		System.out.println("Nhap b: ");
		b = in.nextFloat();
		System.out.println("Nhap c: ");
		c = in.nextFloat();
		n03.ptbac2(a, b, c);
		//cau2
		System.out.println("\nNhap gt: ");
		int gt = in.nextInt();
		System.out.printf("\nGiai thua cua %d: %d", gt, n03.giaithua(gt));
		//cau3
		System.out.println("\n nhap so fibo:	");
		int n=in.nextInt();
		System.out.printf("\n so fibo %d:	%d",n,n03.fibo(n));
		//cau4
		System.out.println("\nnhap a1: ");
		int a1=in.nextInt();
		System.out.println("\nnhap b1: ");
		int b1=in.nextInt();
		System.out.printf("\nUCLN %d %d:%d",a1,b1,n03.ucln(a1, b1));
		System.out.printf("\nUCLN %d %d:%d",a1,b1,n03.bcnn( a1, b1));
		//cau5
		System.out.println("\nnhap n: ");
		 n =in.nextInt();
		System.out.printf("\nso nguyen to nho hon %d :	",n);
		n03.lksnt(n);
		//cau6
		System.out.println("\nnhap n: ");
		 n =in.nextInt();
		System.out.printf("\nso nguyen to dau tien %d :	",n);
		n03.snt1(n);
		//cau7
		System.out.println("\nnhap n: ");
		n =in.nextInt();
		System.out.print("\nso co 5 chu so :	");
		n03.snt2(n);
		//cau8
		System.out.println("\nnhap n");
		n=in.nextInt();
		System.out.printf("\n tong cac chu so %d :%d ",n,n03.tongchuso(n));
		//cau9
		//cau10
		System.out.println("\n nhap n:");
		n=in.nextInt();
		
		n03.lkfibo(n);
		
	}
	
}
