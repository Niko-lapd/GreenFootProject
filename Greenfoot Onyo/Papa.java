import greenfoot.*;
public class Papa extends Actor
{
    int health = 3;
    Player player;
    Counter counter;
    public Papa(Player mainPlayer, Counter counter)
    {
        this.counter = counter;
        player = mainPlayer;
        setImage("Papa.png");
        getImage().scale(80,80);
    }
    public void act() 
    {
        moveAround();
        hitByProjectile();
    }    
    public void moveAround()
    {
        move(5);
        turnTowards(player.getX(), player.getY());
    }
    public void hitByProjectile()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(projectile != null)
        {
            health--;
            getWorld().removeObject(projectile);
        }
        if(health == 0)
        {
            counter.score++;
            counter.money+=5;
            getWorld().removeObject(this);
        }
    }
}