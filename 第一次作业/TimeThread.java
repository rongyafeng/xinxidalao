/*
 * author:ZhaoYunLong(赵云龙)
 */
public class TimeThread extends Thread { 
	public void run() { 
		while (true) {
   try {
    sleep(5000*2);   } catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
   
   Test time = new Test();
   time.timeprint();
  }
 }
	
public static void main(String[] args) {
  TimeThread tr = new TimeThread();
  tr.start(); }}