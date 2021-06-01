package cn.entity;

/**
 * @author 玩法标签 实体表
 * 
 */
public class PlayLabel {

	private int play_Id;
	private String play;

	/**
	 * @return 玩法id 主键
	 */
	public int getPlay_Id() {
		return play_Id;
	}

	/**
	 * @param play_Id
	 *            玩法id 主键
	 */
	public void setPlay_Id(int play_Id) {
		this.play_Id = play_Id;
	}

	/**
	 * @return 玩法
	 */
	public String getPlay() {
		return play;
	}

	/**
	 * @param play
	 *            玩法
	 */
	public void setPlay(String play) {
		this.play = play;
	}
}
