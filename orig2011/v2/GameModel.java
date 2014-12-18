package orig2011.v2;

import java.awt.Dimension;

/**
 *
 */
public interface GameModel {

	public GameTile getGameboardState(final Position pos);
	
	public GameTile getGameboardState(final int x, final int y);

	public abstract void gameUpdate(int lastKey) throws GameOverException;
}
