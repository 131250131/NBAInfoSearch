
public class PlayerE {
	//在此我们可以定义一下队员文件保存的数据格式， 用一个void PlayerWriter()方法进行文件记录
	 /*
	  * 
	  */
	
	//首先我们可以从球员文件中获得以下内容
	//第一次读取这些文件 为每一球员创建单独的文件以便后期保存数据
	
		//1.球员名称 （球员名称作为查找唯一标识）
			//格式类似：Anthony Tolliver
			String playerName;
			
		//2.球员号码
			int playerNumber;
			
		//3.球员位置
			//先发中锋C 先发前锋F 先发后卫G 
			String position;
			
		//4.球员高度
			//格式类似：6-0 (6尺0寸)
			String height;
			
		//5.球员体重
			//格式类似：161
			double weight;
		
		//6.球员生日
			//格式类似： JAN 14， 1985
			String playerBirth;
		
		//7.球员年龄
			int playerAge;
		
		//8.球员进入联盟时间
			int exp;
			
		//9.球员学校或国家
			String School;
			
	//接下来进行比赛文件读取
	//比赛文件将依次可以得到以下球员信息 从第四行开始是球员
	//注意!!!以下读出的数据我们做成一个数组进行存储,定义为String[] MatchReader;	
		//1.球员名称 这是分辨球员唯一方式（ String playerName;）
			//MatchReader[0]
		//2.位置
			//注意这里只有先发会有位置显示（先发中锋C 先发前锋F 先发后卫G ）其余为空
			//MatchReader[1]
		//3.在场时间
			//MatchReader[2] 其格式类似 30:24 通过时间转换函数 int playTimeTransform(String time) 返回;
		//4.投篮命中数
			//Integer.parseInt(MatchReader[3]); 
		//5.投篮出手数
			//Integer.parseInt(MatchReader[4]); 
		//6.三分命中数
			//Integer.parseInt(MatchReader[5]); 
		//7.三分出手数
			//Integer.parseInt(MatchReader[6]); 
		//8.罚球命中数
			//Integer.parseInt(MatchReader[7]); 
		//9.罚球出手数
			//Integer.parseInt(MatchReader[8]); 
		//10.进攻篮板数
			//Integer.parseInt(MatchReader[9]); 
		//11.防守篮板数
			//Integer.parseInt(MatchReader[10]); 
		//12.总篮板数
			//Integer.parseInt(MatchReader[11]); 
		//13.助攻数
			//Integer.parseInt(MatchReader[12]); 
		//14.抢断数
			//Integer.parseInt(MatchReader[13]); 
		//15.盖帽数
			//Integer.parseInt(MatchReader[14]); 
		//16.失误数
			//Integer.parseInt(MatchReader[15]); 
		//17.犯规数
			//Integer.parseInt(MatchReader[16]); 
		//18.个人得分
			//Integer.parseInt(MatchReader[17]); 
			
	//接下来可以通过计算来记录所有关于此球员的数据
		
			
}
