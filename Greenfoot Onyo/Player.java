import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Player extends Actor
{
     int speed = 5;
     int time = 0; 
     WeaponButton weaponButton;
     SuperPower superPower;
     int SuperTimer;
public Player()
{
        setImage(new GreenfootImage(70,50));
        getImage().setColor(Color.RED);
        getImage().fillOval(0,0,50,50);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(50, 20, 70, 10);
}
public Player(WeaponButton weaponButton,SuperPower superPower)
{
        setImage(new GreenfootImage(70,50));
        getImage().setColor(Color.RED);
        getImage().fillOval(0,0,50,50);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(50, 20, 70, 10);
        this.weaponButton = weaponButton;
        this.superPower = superPower;
}
public void act() 
{
        time++;
        turnAround();
        moveAround();
        fireProjectile();
        gotHit();
        superPowerUsed();
}
public void turnAround()
{
        if(Greenfoot.getMouseInfo() !=null)
        turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
}
public void moveAround()
{
       if(Greenfoot.isKeyDown("w"))
        setLocation(getX(),getY() - speed);
       if(Greenfoot.isKeyDown("a"))
       setLocation(getX() - speed, getY());
       if(Greenfoot.isKeyDown("s"))
       setLocation(getX(),getY() + speed);
       if(Greenfoot.isKeyDown("d"))
       setLocation(getX() + speed, getY()); 
}
public void fireProjectile()
{
    if(Greenfoot.mousePressed(null) && weaponButton.weaponUpgrade == 1){
    Projectile projectile = new Projectile();
    getWorld().addObject(projectile, getX(), getY());
    projectile.setRotation(getRotation()-5);
    projectile.move(25);
    }
    if(Greenfoot.mousePressed(null) && weaponButton.weaponUpgrade == 2){
    Projectile projectile = new Projectile();
    getWorld().addObject(projectile, getX(), getY());
    projectile.setRotation(getRotation()-5);
    projectile.move(25);
    
    Projectile projectile2 = new Projectile();
    getWorld().addObject(projectile2, getX(), getY());
    projectile2.setRotation(getRotation()+5);
    projectile2.move(25);
    }
      if(Greenfoot.mousePressed(null) && weaponButton.weaponUpgrade == 3){
    Projectile projectile = new Projectile();
    getWorld().addObject(projectile, getX(), getY());
    projectile.setRotation(getRotation()-10);
    projectile.move(25);
    
    Projectile projectile2 = new Projectile();
    getWorld().addObject(projectile2, getX(), getY());
    projectile2.setRotation(getRotation()+10);
    projectile2.move(25);
        Projectile projectile3 = new Projectile();
    getWorld().addObject(projectile3, getX(), getY());
    projectile3.setRotation(getRotation());
    projectile3.move(25);
    }
}
public void superPowerUsed()
{
    if(superPower.superCount > 99 && SuperTimer < 30)
    {
    Projectile projectile = new Projectile();
    getWorld().addObject(projectile, getX(), getY());
    projectile.setRotation(getRotation()-60);
    projectile.move(25);
    
    Projectile projectile2 = new Projectile();
    getWorld().addObject(projectile2, getX(), getY());
    projectile2.setRotation(getRotation()+60);
    projectile2.move(25);
    
    Projectile projectile3 = new Projectile();
    getWorld().addObject(projectile3, getX(), getY());
    projectile3.setRotation(getRotation());
    projectile3.move(25);
    
    Projectile projectile1 = new Projectile();
    getWorld().addObject(projectile1, getX(), getY());
    projectile1.setRotation(getRotation()-180);
    projectile1.move(25);
    
    Projectile projectile21 = new Projectile();
    getWorld().addObject(projectile21, getX(), getY());
    projectile21.setRotation(getRotation()+120);
    projectile21.move(25);
    
    Projectile projectile31 = new Projectile();
    getWorld().addObject(projectile31, getX(), getY());
    projectile31.setRotation(getRotation() - 120);
    projectile31.move(25);
    SuperTimer++;
    }
    if(SuperTimer>29)
    {
        superPower.superCount = 0;
        SuperTimer = 0;
    }
}
public boolean gotHit()
{
    Actor Catta = getOneObjectAtOffset(0,0, Catta.class);
    Actor Onyo = getOneObjectAtOffset(0,0, Onyo.class);
    Actor Mark = getOneObjectAtOffset(0,0, Mark.class);
    Actor Papa = getOneObjectAtOffset(0,0, Papa.class);
    Actor Shek = getOneObjectAtOffset(0,0, Shek.class);
    Actor Thanos = getOneObjectAtOffset(0,0, Thanos.class);
    Actor Squid = getOneObjectAtOffset(0,0, Squid.class);
    Actor Mike = getOneObjectAtOffset(0,0, Mike.class);
    if(Catta!=null)
    {
        return true;
    } 
    else
    if(Onyo!=null)
    {
        return true;
    }
    else
    if(Mark!=null)
    {
        return true;
    }
    else
    if(Papa!=null)
    {
        return true;
    }
    else
    if(Shek!=null)
    {
        return true;
    }
    else
    if(Thanos!=null)
    {
        return true;
    }
    else
    if(Squid!=null)
    {
        return true;
    }
    else
    if(Mike!=null)
    {
        return true;
    }
    else
    return false;   
}
}