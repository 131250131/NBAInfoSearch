public class Team {
	/*这是一个球队的整体信息*/
	
	/*
	 * 更新这个类需要哪些数据；
	 * */
	
	//球队的编号；
		int teamID;
	//球队比赛场数，胜率；
		int compGames;
		int winGames;
		int losGames;
		double winRate;
		
//接下来是球队赛季总数据；	
	//总进攻回合数
		int attackRounds;
	//球队助攻数
		int teamAssists ;
	//球队投篮命中数
		int teamFG ;
	//球队投篮出手次数
		int teamFGTry ;
	//球队三分命中数
		int team3FG ;
	//球队三分出手次数
		int team3FGTry ;
	//球队球队罚球命中数
		int teamFTG;
	//球队罚球出手数
		int teamFTGTry;
	//球队进攻篮板数
		int teamOffenceRebounds;
	//球队防守篮板数
		int teamDeffenceRebounds;
	//球队总篮板数
		int teamTotalRebounds;
	//球队抢断数
		int teamSteals;
	//球队盖帽数
		int teamBlocks;
	//球队失误数
		int teamTurnovers;
	//球队犯规数
		int teamFouls;
	//球队总得分数
		int teamScores;
		
//这是球队的平均信息；
	//球队场均助攻数
		int aver_teamAssists ;
	//球队场均投篮命中数
		int aver_teamFG ;
	//球队场均投篮出手次数
		int aver_teamFGTry ;
	//球队投篮命中率
		double teamFGP;
	//球队场均三分命中数
		int aver_team3FG;
	//球队场均三分出手次数
		int aver_team3FGTry;
	//球队三分命中率
		double team3FGP; 
	//球队场均罚球命中数
		int aver_teamFTG;
	//球队场均罚球出手数
		int aver_teamFTGTry;
	//罚球命中率	
		double teamFTP; 
	//球队场均进攻篮板数
		int aver_teamOffenceRebounds;
	//球队场均防守篮板数
		int aver_teamDeffenceRebounds;
	//球队场均总篮板数
		int aver_teamTotalRebounds;
	//球队场均抢断数
		int aver_teamSteals;
	//球队场均盖帽数
		int aver_teamBlocks;
	//球队场均失误数
		int aver_teamTurnovers;
	//球队场均犯规数
		int aver_teamFouls;
	//球队场均总得分数
		int aver_teamScores;
	//球队进攻效率：
		double teamOffE;
	//球队防守效率
		double teamDefE;
	//球队篮板效率
		double teamRebE;
	//球队抢断效率
		double teamSteE;
	//球队助攻效率
		double teamAssE;
	
}
