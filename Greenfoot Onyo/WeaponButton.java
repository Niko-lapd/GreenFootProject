import greenfoot.*; 
public class WeaponButton extends Actor
{
    Counter counter;
    int weaponUpgrade = 1;
    public WeaponButton(Counter counter)
    {
        setImage(new GreenfootImage("Weapon \n upgrade \n (150 cash)", 25, Color.BLACK, new Color(0,0,0,0)));
        this.counter = counter;
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this) && counter.money > 149)
        {
            counter.money-= 150;
            weaponUpgrade++;
        }
    }    
}
