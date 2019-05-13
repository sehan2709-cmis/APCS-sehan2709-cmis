import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.UserInfo;
import greenfoot.World;

import java.lang.Math;
import java.lang.String;

public class SimpleWorld extends World
{
    Saver mySaver = new Saver();
    int score = 0;
    int newEnemy = 75;
    int maxNewEnemy = 75;
    int minNewEnemy = 45;
    boolean toughEnemy = false;
    boolean godmode = false; //Godmode is for TESTING PURPOSES ONLY!! Not to be tampered with.
    boolean powerful = false;
    int enemyLevel = 0;
    EnemyInfo[] enemyInformation = new EnemyInfo[13];
    
    
    public SimpleWorld()
    {
        super(650, 500, 1);
        GreenfootImage myImage = new GreenfootImage(650, 500);
        myImage.setColor(new Color(0, 0, 0));
        myImage.fill();
        myImage.setColor(new Color(255, 255, 255));
        myImage.drawString("Score: 0", 10, 20);
        setBackground(myImage);
        if(UserInfo.isStorageAvailable()) {
            UserInfo player = UserInfo.getMyInfo();
            if(player.getUserName().equals("shrucis1")) {
                powerful = true;
            }
            else {
                powerful = false;
            }
        }
        else {
            powerful = false;
        }
            
        addObject(new Player(godmode, powerful), 325, 250);
        makeEnemyInformation();
    }
    
    public void makeEnemyInformation()
    {
        enemyInformation[0] = new EnemyInfo(false, 255, 0, 0, 0, 0);
        enemyInformation[1] = new EnemyInfo(false, 220, 50, 100, 1, 0);
        enemyInformation[2] = new EnemyInfo(false, 130, 100, 30, 1, 0);
        enemyInformation[3] = new EnemyInfo(true, 0, 0, 255, 0, 30);
        enemyInformation[4] = new EnemyInfo(true, 0, 255, 100, 1, 50);
        enemyInformation[5] = new EnemyInfo(true, 24, 189, 175, 1, 70);
        enemyInformation[6] = new EnemyInfo(true, 100, 80, 255, 2, 80);
        enemyInformation[7] = new EnemyInfo(true, 50, 240, 75, 3, 90);
        enemyInformation[8] = new EnemyInfo(true, 230, 230, 230, 3, 100);
        enemyInformation[9] = new EnemyInfo(true, 30, 30, 30, 4, 100);
        enemyInformation[10] = new EnemyInfo(true, 25, 25, 25, 4, 100);
        enemyInformation[11] = new EnemyInfo(true, 25, 25, 25, 4, 100);
        enemyInformation[12] = new EnemyInfo(true, 10, 10, 10, 8, 100);
    }
    
    public void act()
    {
        GreenfootImage myImage = new GreenfootImage(650, 500);
        myImage.setColor(new Color(0, 0, 0));
        myImage.fill();
        myImage.setColor(new Color(255, 255, 255));
        myImage.drawString("Score: " + this.score, 10, 20);
        setBackground(myImage);
        this.score += 1;
        if (this.score > 200) {
            this.toughEnemy = true;
        }
        enemyStuff();
    }
    
    public void gameOver()
    {
        this.mySaver.saveHighscore(this.score);
        Greenfoot.setWorld(new ScoreBoardWorld());
    }
    
    public void enemyStuff()
    {
        this.newEnemy -= 1;
        if (this.newEnemy <= 0)
        {
            if(Greenfoot.getRandomNumber(100) < 70) {
                addEnemy(enemyLevel);
            }
            else {
                addEnemy(enemyLevel - 1);
            }
            if (this.maxNewEnemy > this.minNewEnemy) {
                this.maxNewEnemy -= 1;
            }
            this.newEnemy = this.maxNewEnemy;
        }
        if((score%500) == 0) {
            enemyLevel += 1;
            score += 1;
        }
    }

    public void addEnemy(int level)
    {
        int rand = 1 + Greenfoot.getRandomNumber(4);
        EnemyInfo eInfo = enemyInformation[Math.min(Math.max(level, 0), 12)];
        if (rand == 1)
        {
            addObject(new Enemy(eInfo.accel, eInfo.r, eInfo.g, eInfo.b, eInfo.dif, eInfo.chance), 10, 10 + Greenfoot.getRandomNumber(480));
        }
        else if (rand == 2)
        {
            addObject(new Enemy(eInfo.accel, eInfo.r, eInfo.g, eInfo.b, eInfo.dif, eInfo.chance), 10 + Greenfoot.getRandomNumber(630), 10);
        }
        else if (rand == 3)
        {
            addObject(new Enemy(eInfo.accel, eInfo.r, eInfo.g, eInfo.b, eInfo.dif, eInfo.chance), 640, 10 + Greenfoot.getRandomNumber(480));
        }
        else if (rand == 4)
        {
            addObject(new Enemy(eInfo.accel, eInfo.r, eInfo.g, eInfo.b, eInfo.dif, eInfo.chance), 10 + Greenfoot.getRandomNumber(630), 490);
        }
    }
}


