class Solution {
    public int candy(int[] ratings) {
        int numberOfKids = ratings.length;
        int[] candies = new int[numberOfKids];

        //intialize all kids with 1 candy;
        for(int i = 0; i<numberOfKids; i++){
            candies[i] = 1;
        }
        //left to right pass
        //check if the  current child has a higher rating than the child on the left
        for(int i = 1; i<numberOfKids; i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]= candies[i-1]+1;
            }
        }
        //right to left pass
        //check if the current child has higher ratting than child to the right of them change only if they dont already have one extra
        for(int i=numberOfKids-2; i>=0; i--){
            if(ratings[i]>ratings[i+1]){
                candies[i]=Math.max(candies[i], candies[i+1]+1);
            }
        }
        int totalCandies = 0;
        for(int i : candies){
            totalCandies+=i;
        }
        return totalCandies;
    }
}