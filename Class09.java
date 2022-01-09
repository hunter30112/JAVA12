package JAVA12;

import pack9.sub1.CSphere; //呼叫CSphere函數
import pack9.sub2.CTrapezoid; //呼叫CTrapezoid函數
public class Class09 {

	public static void main(String[] args) {
		CSphere cp = new CSphere(2);
		CTrapezoid ct = new CTrapezoid(2,3,4);
		cp.show();
		ct.show();

	}

}
