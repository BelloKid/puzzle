import java.util.Scanner;

public class puzzle {
public static void main(String [] args) { 
         Scanner sc = new Scanner(System.in); 
         System.out.println("����������λ����"); 
         int numlen = sc.nextInt(); 
//         System.out.println("����λ����"+numlen); 
         int sum,x,y,p;
         double q = Math.pow(10, numlen-1);
         int z = (int) q; 

         for(int i= z;i < (z*10);i++)
         {
             sum=0;
        	 x=i*9;
        	 p=x;
        	 if(x>=(z*10))
        	 {
        		 System.out.println("���ҽ���");
        		 break;}
        	 else
        	 {
        		 for(int j=0;j<numlen;j++)
        		 {
        			 y = p % 10;
        			 p = p/10;
        			 sum= sum*10+y;
        		 }
            	 if(sum == i) 
            	 {
            		 System.out.println("С��Ϊ��" + i + ";����Ϊ��" +x); 
            	 }
        	  }        	 
         }
         sc.close();
	}
}