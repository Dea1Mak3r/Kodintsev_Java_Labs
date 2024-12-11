package Bullets;

import java.util.ArrayList;
import java.util.List;


class Bullet {
    private int x;
    private int y;

    public Bullet() {
        this.x = 0;
        this.y = 0;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void reset() {
        this.x = 0;
        this.y = 0;
    }

    public String getPosition() {
        return "Bullet position: (" + x + ", " + y + ")";
    }
}

class BulletPool {
    private final List<Bullet> available = new ArrayList<>();

    public Bullet getBullet() {
        if (available.isEmpty()) {
            return new Bullet();
        } else {
            return available.remove(available.size() - 1);
        }
    }

    public void releaseBullet(Bullet bullet) {
        bullet.reset();
        available.add(bullet);
    }
}
