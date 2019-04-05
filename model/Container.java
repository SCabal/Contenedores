package model;
java.lang.Math;
public class Container
{
  private double width;
  private double depth;
  private double height;

  public Container (double width, double height, double depth)
  {
    this.width = width;
    this.depth = depth;
    this.height = height;
  }
  public double getWidth()
  {
    return this.width;
  }
  public double getDepth()
  {
      return this.depth;
  }
  public double getHeight()
  {
      return this.height;
  }
  public double calcVol()
  {
    double vol;
    vol = this.width*this.depth*this.height;
    return vol;
  }
}
