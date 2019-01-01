/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author jiach
 */
public class Movement {
    //player movement image walking up, down ,left,right
    private final int IMAGE_VIEWPORT_HEIGHT=64;
    private final int IMAGE_VIEWPORT_WIDTH=64;
    private final int MOVEMENT_IMAGE_NUM=16; // number of movement image
    private final int MOVEMENT_IMAGE_NUM_PER_ROW=4;
    private int cViewport;  // current viewpoet
    private Image moveImage;
    private ImageView moveImageView;
    private Rectangle2D viewportRect[];
    
    public Movement(){
        moveImage=new Image("Image/movement.png");
        
        viewportRect=new Rectangle2D[MOVEMENT_IMAGE_NUM]; // total 16 of character movement image
        int minX,minY,count;
        count=0;
        for(int y=0;y<MOVEMENT_IMAGE_NUM_PER_ROW;y++){ //loop image, set all viewport
            minY=y*IMAGE_VIEWPORT_HEIGHT;
            for(int x=0;x<MOVEMENT_IMAGE_NUM_PER_ROW;x++){
                minX=x*IMAGE_VIEWPORT_WIDTH;
                viewportRect[count]=new Rectangle2D(minX,minY,IMAGE_VIEWPORT_WIDTH,IMAGE_VIEWPORT_HEIGHT);
                count++;
            }
        }
        
        cViewport=0;
        moveImageView=new ImageView(moveImage);
        moveImageView.setViewport(viewportRect[cViewport]);
    }
    
    
    public ImageView moveImageView(int direction,Point position){
        cViewport++;
        if((double)cViewport-((direction-1)*MOVEMENT_IMAGE_NUM_PER_ROW)>=4 || (double)cViewport-((direction-1)*MOVEMENT_IMAGE_NUM_PER_ROW)<0)
           cViewport=(direction-1)*MOVEMENT_IMAGE_NUM_PER_ROW;
        moveImageView.setViewport(viewportRect[cViewport]);
        moveImageView.setX(position.getX());
        moveImageView.setY(position.getY());
        System.out.println(moveImageView.getX());
        return moveImageView;
    }
    
    public Image getMoveImage(){
        return moveImage;
    }
    public ImageView getMoveImageView(){
        return moveImageView;
    }
    
}
