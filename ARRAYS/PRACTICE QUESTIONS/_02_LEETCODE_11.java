

public class _02_LEETCODE_11 {
    public static void main(String[] args) {
        int height[]= {1,8,6,2,5,4,8,3,7};


// =========================================== BRUTE FORCE APPROACH O(N^2)==============================
    int maxArea = Integer.MIN_VALUE;
    for(int i=0;i<=height.length-1;i++){
        for(int j=0;j<=height.length-1;j++){
            if(i==j){

            }else if (height[i]<=height[j]){
                 int length=height[i];
                 int breadth=i>j?(i-j):(j-i);
                 int area=length* breadth;

                 if(area> maxArea){
                    maxArea=area;
                 }
            }else{
                 int length=height[j];
                 int breadth=i>j?(i-j):(j-i);
                 int area=length* breadth;

                 if(maxArea<area){
                    maxArea=area;
                }

            }
        }
    }

   System.out.println(maxArea);


// ============================================= TWO POINTER METHOD APPROACH ==========================
    
        
    }
    
    
    
    
}
