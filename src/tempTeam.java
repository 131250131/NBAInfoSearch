import java.util.ArrayList;

//这个类用于存储比赛txt里的球队数据

public class TempTeam {
	//本场总进攻回合数（*****用于更新*****）
		int attackRound=0;
	//本场球队助攻数（*****用于更新*****）
		int teamAssists=0;
	//本场球队投篮命中数（*****用于更新*****）
		int teamFG =0;
	//本场球队投篮出手次数（*****用于更新*****）
		int teamFGTry=0 ;
	//本场球队三分命中数（*****用于更新*****）
		int team3FG=0 ;
	//本场球队三分出手次数（*****用于更新*****）
		int team3FGTry =0;
	//本场球队球队罚球命中数（*****用于更新*****）
		int teamFTG=0;
	//本场球队罚球出手数（*****用于更新*****）
		int teamFTGTry=0;
	//本场球队进攻篮板数（*****用于更新*****）
		int teamOffenceRebounds=0;
	//本场球队防守篮板数（*****用于更新*****）
		int teamDeffenceRebounds=0;
	//本场球队总篮板数（*****用于更新*****）
		int teamTotalRebounds=0;
	//本场球队抢断数（*****用于更新*****）
		int teamSteals=0;
	//本场球队盖帽数（*****需要更新*****）
		int teamBlocks=0;
	//本场球队失误数（*****需要更新*****）
		int teamTurnovers=0;
	//本场球队犯规数（*****需要更新*****）
		int teamFouls=0;
	//本场球队总得分数（*****需要更新*****）
		int teamScores=0;
		
	//球队的本场球员列表
	ArrayList<TempPlayer> playlist = new ArrayList<TempPlayer>();
	
	//计算本场球队的总数居
	void sumOfData(){
		for(TempPlayer tempPlayer : playlist){
			//attackRound += tempPlayer;
			//这里缺一个数据
		}
	}
	
}
