package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	//private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		if(isNextFrameBonus()){
			
		}
	}
	
	public int score(){
		int gameScore = 0;
		for(int i=0; i<=frames.size(); i++){
			if(frames.get(i).isStrike()){
				gameScore += frames.get(i).score() + frames.get(i+1).score(); 
			} else if (frames.get(i).isSpare()){
				gameScore += frames.get(i).score() + frames.get(i+1).getFirstThrow();
			} else {
				gameScore += frames.get(i).score();
			}
		}
		if
		return gameScore;
	}
	
	public boolean isNextFrameBonus(){
		return frames.get(frames.size()).isStrike();
	}
}
