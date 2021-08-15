package com.test;

public class FortuneServiceImpl implements FortuneService {

	int winPerc;
	int lossPerc;
	
	@Override
	public String predictFortune() {
		return "Your fortune says => Winning chance ="+winPerc+"%,  Losing chance ="+lossPerc;
	}

	public int getWinPerc() {
		return winPerc;
	}

	public void setWinPerc(int winPerc) {
		this.winPerc = winPerc;
	}

	public int getLossPerc() {
		return lossPerc;
	}

	public void setLossPerc(int lossPerc) {
		this.lossPerc = lossPerc;
	}
	
	

}
