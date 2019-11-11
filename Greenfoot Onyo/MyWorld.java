import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    int count = 0;
    int spawnSpeed = 35;
    int randomSpawn = Greenfoot.getRandomNumber(8);
    public Player mainPlayer = new Player();
    Counter counter = new Counter();
    Healthbar healthbar = new Healthbar();
    WeaponButton weaponButton = new WeaponButton(counter);
    SuperPower superPower = new SuperPower();
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        mainPlayer = new Player(weaponButton, superPower);
        addObject(mainPlayer, getWidth()/2, getHeight()/2);
        addObject(counter, 130, 100);
        addObject(healthbar, mainPlayer.getX() - 5, mainPlayer.getY() - 50);
        addObject(weaponButton,900,100);
        addObject(superPower, mainPlayer.getX() + 10, mainPlayer.getY()-90);
    }
    public Player getPlayer()
    {
        return mainPlayer; 
    }
    public void act()
    {
        count++;
        spawntings();
    }
    public void spawntings()
    {
        if ( count % spawnSpeed == 0)
        {
            randomSpawn = Greenfoot.getRandomNumber(8);
            switch(randomSpawn){
            case 0 : addObject(new Onyo(mainPlayer,counter),0,35); break;
            case 1 : addObject(new Catta(mainPlayer,counter), getWidth()/2,2); break;
            case 2 : addObject(new Mark(mainPlayer,counter), getWidth(),0); break;
            case 3 : addObject(new Mike(mainPlayer,counter), 0, getHeight()/2); break;
            case 4 : addObject(new Papa(mainPlayer,counter),getWidth(), getHeight()/2); break;
            case 5 : addObject(new Shek(mainPlayer,counter),0, getHeight()); break;
            case 6 : addObject(new Squid(mainPlayer,counter),getWidth()/2,getHeight()); break;
            case 7 : addObject(new Thanos(mainPlayer,counter),getWidth(), getHeight()); break;
            }
        }
    }
}