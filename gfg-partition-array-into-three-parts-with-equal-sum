class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        // logics is based on subArraySum has to be totalSum/3
        int totalSum = 0;
        int part = 0;
        int individualSum = 0;
        int currentSum = 0;
         for(int arrItem: arr) {
            totalSum += arrItem;
        }
        if(totalSum % 3 != 0) {
            return false;
        }
        individualSum = totalSum / 3;
        //arr.length - 1 becz we ensuring only  2 parts
        for(int i = 0; i < arr.length - 1; i++) {
            currentSum += arr[i];
            //slight optimisation i dont need to find till part 3,if part 2 is done ,since we made %3 check, it means that rest will add up to the same
            if(currentSum == individualSum) {
                currentSum = 0;
                part++;
                if(part == 2) {
                    return true;
                }
            }
        }
        return false;
    }
    /* 
    old algo
    public boolean canThreePartsEqualSum(int[] arr) {
        int fullSum = 0;
        int secondPartCopy;
        int firstPart = 0, secondPart = 0, thirdPart = 0;
        for(int arrItem: arr) {
            fullSum += arrItem;
        }
        secondPart = fullSum;
        for(int i = 0 ; i < arr.length - 2; i++) {
            firstPart += arr[i];
            secondPart -= arr[i];
            System.out.println("in debug "+firstPart + "  "+secondPart);
            if(2 * firstPart == secondPart) {
                System.out.println("in debug i -- "+i);
                secondPartCopy = secondPart;
                thirdPart = 0;
                for(int j = arr.length - 1; j > i + 1; j--) {
                    thirdPart += arr[j];
                    secondPartCopy -= arr[j];
                    System.out.println("in debug j  "+j);
                    System.out.println("in debug thirdPart  "+thirdPart + " secondPart "+secondPartCopy);
                    if(secondPartCopy == thirdPart && secondPartCopy == firstPart) {
                        return true;
                    }
                }
            }
        }
        return false;
    } */
}