package JAVA12;

import pack6.subpack1.CCircle; //呼叫CCircle函數
import pack6.subpack2.CRectangle; //呼叫CRectangle函數
import pack6.subpack1.subsubpack.CStyle; //呼叫CStyle函數

public class Class08 {

	public static void main(String[] args) {
		CCircle cir=new CCircle();
		CRectangle rect=new CRectangle();
		CStyle sty=new CStyle(1);
		cir.show();
		rect.show();

	}

}
