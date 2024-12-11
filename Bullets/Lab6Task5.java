package Bullets;

public class Lab6Task5 {
    public static void main(String[] args) {

        BulletPool bulletPool = new BulletPool();

        Bullet bullet1 = bulletPool.getBullet();
        bullet1.setPosition(10, 20);
        System.out.println(bullet1.getPosition());

        bulletPool.releaseBullet(bullet1);

        Bullet bullet2 = bulletPool.getBullet();
        System.out.println(bullet2.getPosition());

        bullet2.setPosition(30, 40);
        System.out.println(bullet2.getPosition());

        bulletPool.releaseBullet(bullet2);

        Bullet bullet3 = bulletPool.getBullet();
        System.out.println(bullet3.getPosition());
    }
}
