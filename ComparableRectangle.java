public class ComparableRectangle extends Rectangle 
    implements Comparable<GeometricObject>{

        public ComparableRectangle(double width, double height){
            super(width, height);
        }

        @Override
        public int compareTo(GeometricObject o){
          return Double.compare(this.getArea(), o.getArea());
        }

        @Override
        public String toString(){
            return "Width: "+ getWidth() + " Height: " + getHeight() +
            " Area: " + getArea();
        }
    
}
