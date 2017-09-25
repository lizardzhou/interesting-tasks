
import java.util.*;

/*
 * 2015盏灯，一开始全部熄灭，序号分别是1-2015，先把1的倍数序号的灯的开关全部按一次，然后把2的倍数的灯的开关全部按一次，
 * 然后把3的倍数的开关按一次，以此类推，最后把2015的倍数灯的开关按一次。问最后亮着的灯有多少盏？
 */

public class littleTests {

	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<String>();
		int i;
		
		for(i = 0; i < 2015; i++) {
			test.add("on");		//把所有灯打开
			
			int time;
			for(time = 2; time <= 2015; time++) { //对2-2015倍数的灯进行操作
				if((i + 1) % time == 0) {
					if(test.get(i).equals("off")) {	//关着的灯打开
						test.set(i, "on");
					} else {	//开着的灯关掉
						test.set(i, "off");
					}				
				}
			}
		}
		
//		for(i = 0;i < 2015;i++)
//			test.add("off");
//		
//		for(i = 1;i<=2015;i++) {
//			for(int j=0;j<2015;j++) {
//				if((j+1) % i == 0) {
//					if(test.get(j) == "off")
//						test.set(j, "on");
//					else
//						test.set(j, "off");
//				}
//			}
//				
//		}
				
		int count = 0;
		for (int j = 0; j < 2015; j++) {
			if(test.get(j).equals("on")) {
				count++;
			}
		}

		System.out.print(count);

	}

}
