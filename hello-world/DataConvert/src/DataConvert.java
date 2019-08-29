
public class DataConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1,j;			
		float f1=0.1;		//0.1 is double  f1=0.1f/ f1=(float)0.1 
		float f2=123;
		long l1= 12345678, l2=8888888888;  //8888888888 out of int type range.  l2=8888888888L
		double d1 = 2e20, d2=124;
		byte b1=1, b2=2, b3=129;   //out of byte type range -128-- 127
		j= j+10;   // j is undefined
		i=i/10;
		i=i*0.1;	//0.1 is double ,i is int.   i = (int)i*0.1;
		char c1='a', c2=125; 
		byte b=b1-b2;  // byte fist convert int.  byte b = (byte)b1-b2; 
		char c=c1+c2-1;   //char fist convert int. char c=(char)c1+c2-1;
		float f4=f1+f2*0.1; 	//0.1 is double.  float f4=(float)f1+f2*0.1; 
		double d=d1*i+j;
		float f=(float)(d1*5+d2);
	}

}
