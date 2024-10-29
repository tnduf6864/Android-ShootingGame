package tnj.Game.Enemy;

import tnj.Framework.AppManager;
import tnj.Framework.R;
import tnj.Framework.Vector2;

public class Enemy_6 extends Enemy{
    public Enemy_6() {
        super(AppManager.getInstance().getBitmap(R.drawable.dragon2));
        this.setPosition(740,0);
        this.initSpriteData(288, 192, 1, 3);
        hp = 2;
        speed = 7f;
        m_enemdir = new Vector2(1f,0);
    }

    @Override
    public void Update(long GameTime) {
        super.Update(GameTime);
        Move();
        m_BoundBox.set( (int)m_x, (int)m_y, (int)(m_x + 288f), (int)(m_y + 192f));
    }

    @Override
    public void attack() {

    }
}