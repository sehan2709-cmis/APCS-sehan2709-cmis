import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class mama extends Robot
{
    public mama(){
        super(Color.RED);
    }

    public void init(){

    }

    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearLeft() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     * oa ob oc od
     * oa xb oc od
       oa xb xc od
       oa xb xc xd
       oa xb oc xd 
       oa ob xc xd
       oa ob xc od
       oa ob oc xd
       xa ob oc od
       xa ob xc od
       xa ob xc xd
       xa ob oc xd
       xa xb oc od
       xa xb oc xd
       xa xb xc od
     */
    public void behave(){
        if(isClearRight())
        {
            if(isClearUp())
            {
                if(isClearDown())
                {
                    right();
                }
                else
                {
                    up();
                }
            }
            else if(isClearDown())
            {
                if(!isClearLeft())
                {
                    down();
                }
                else
                {
                    left();
                }
            }
            else
            {
                left();
            }
        }
        else if(isClearUp())
        {
            if(isClearDown())
            {
                if(isClearLeft())
                {
                    left();
                }
                else
                {
                    up();
                }
            }
            else if (isClearDown())
            {
                if(isClearLeft())
                {
                    left();
                }
                else
                {
                    down();
                }
            }
            else
            {
            }
        }
        else
        {
            left();
        }
    }
}
