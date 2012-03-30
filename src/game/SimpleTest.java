package game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;

public class SimpleTest extends BasicGame {

    public SimpleTest() {
        super("SimpleTest");
    }

    @Override
    public void init(GameContainer container) throws SlickException {
        Music music = new Music("D:\\Music\\Múm\\The Ballad of the Broken Birdie Records.wav");
        music.play(1.0f, 1.0f);
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {
        g.drawString("Hello, Slick world!", 0, 100);
    }

    public static void main(String[] args) {
        try {
            AppGameContainer app = new AppGameContainer(new SimpleTest());
            app.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}