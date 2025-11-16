public class resizeablecircle extends circle implements resizeable{
public resizeablecircle(double radius){
super(radius);}

public void resize(int percent){
radius = radius *percent/100;}


}
