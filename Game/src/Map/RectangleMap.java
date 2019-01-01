/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author jiach
 */
public class RectangleMap extends Map{
    private static final int MAP_HEIGHT=1000;
    private static final int MAP_WEIGHT=1000;
    private static final int RECTANGLE_START_POSITION_X=250;
    private static final int RECTANGLE_START_POSITION_Y=250;
    private static final int RECTANGLE_HEIGHT=500;
    private static final int RECTANGLE_WEIGHT=500;
    private static final String MAP_NAME="Rectangle Map";
    private Rectangle r;

    public RectangleMap(int numPlayer) {
        super(MAP_HEIGHT, MAP_WEIGHT, MAP_NAME, numPlayer);
        r=new Rectangle(RECTANGLE_START_POSITION_X,RECTANGLE_START_POSITION_Y,RECTANGLE_HEIGHT,RECTANGLE_WEIGHT);
        r.setFill(Color.WHITE);
        initialize();
        //r.setStroke(Color.BLACK);
        super.getScene().setOnKeyPressed((e) -> {
            if(isInBound()){
            if(e.getCode() == KeyCode.DOWN)
                super.getPlyaer(0).move(super.getPane(), 1, 1);
            else if(e.getCode() == KeyCode.LEFT)
                 super.getPlyaer(0).move(super.getPane(), 1, 2);
            else if(e.getCode() == KeyCode.RIGHT)
                 super.getPlyaer(0).move(super.getPane(), 1, 3);
            else if(e.getCode() == KeyCode.UP)
                 super.getPlyaer(0).move(super.getPane(), 1, 4);
            }
        });
    }

    @Override
    public boolean isInBound() {
        double x,y;
        x=super.getPlyaer(0).getPoistion().getX();
        y=super.getPlyaer(0).getPoistion().getY();
        if(x <0 || x>MAP_WEIGHT || y<0 || y>MAP_HEIGHT)
            return false;
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void initialize() {
        super.getPane().getChildren().add(r);
        super.getPane().getChildren().add(super.getPlyaer(0).getAction().getMovement().getMoveImageView());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
