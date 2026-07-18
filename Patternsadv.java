public class Patternsadv {
//Hollow Rectangle
    // public static void hollowrectangle(int totalcols,int totalrows){
    //     for(int i=1;i<=totalrows;i++){
    //         for(int j=1;j<=totalcols;j++){
    //             if(i==1|i==totalrows|j==1|j==totalcols){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    //Inverted and rotated half pyramid
    // public static void invhalfpyramid(int n){
    //     for(int i=1;i<=n;i++){

    //         //for space
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");

    //         }
    //         //for star 
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
 //Inverted half pyramid with numbers
    //  public static void invertedwithnum(int n){
    //     for(int i=1;i<=n;i++){

    //         //for star
    //         for(int j=1;j<=n-i+1;j++){
    //             System.out.print(j+" ");

    //         }
          
           
    //         System.out.println();
    //     }
    // }
public static void flyodtriangle(int n){
    int counter=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.err.print(counter+" ");
            counter++;
        }
            System.out.println();
    }
}




    public static void main(String[] args) {
    //    hollowrectangle(10, 4); 
        // invhalfpyramid(5);
        // invertedwithnum(5);
        flyodtriangle(6);
}


}