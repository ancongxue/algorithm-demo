package demo;


/*
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第3个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * 
 * 解析：兔子每个月的数量是1，1，2，3，5，8 
 * 当月数量是前两个月数量之和
 */
public class demo1 {
	
	public static void main(String args[]){

		for(int i=1;i<=20;i++){
			System.out.println(count(i));
		}
		
	}
	
	
	public static int count(int i){
		if (i==1||i==2){
			return 1;
			
		}else{
			return count(i-1)+count(i-2);
		}
		
	}

}
