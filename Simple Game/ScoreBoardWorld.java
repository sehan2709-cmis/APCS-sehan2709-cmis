/*  1:   */ import greenfoot.GreenfootImage;
/*  2:   */ import greenfoot.World;
/*  3:   */ 
/*  4:   */ 
/*  5:   */ public class ScoreBoardWorld
/*  6:   */   extends World
/*  7:   */ {
/*  8:   */   public ScoreBoardWorld()
/*  9:   */   {
/* 10: 8 */     super(650, 500, 1);
/* 11: 9 */     addObject(new ScoreBoard(), getWidth() / 2, getHeight() / 2);
/* 12:10 */     GreenfootImage myImage = new GreenfootImage(650, 500);
/* 13:11 */     myImage.setColor(new Color(0, 0, 0));
/* 14:12 */     myImage.fill();
/* 15:13 */     setBackground(myImage);
/* 16:   */   }
/* 17:   */ }

