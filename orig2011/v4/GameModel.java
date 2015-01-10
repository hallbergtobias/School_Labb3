package orig2011.v4;

import java.awt.Dimension;

/**
 *
 */
public interface GameModel extends IObservable{

	public GameTile getGameboardState(final Position pos);
	
	public GameTile getGameboardState(final int x, final int y);

	public abstract void gameUpdate(int lastKey) throws GameOverException;
}
