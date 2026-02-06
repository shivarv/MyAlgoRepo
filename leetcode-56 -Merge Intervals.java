class Solution {
        class IntervalComparator implements Comparator<int[]> {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        }
        public int[][] merge(int[][] intervals) {
            List<int[]> output = new ArrayList<>();
            Stack<int[]> mStack = new Stack<>();
            int xI = 0;
            int[][] sortedIntervals = customSort(intervals);
            System.out.println(Arrays.deepToString(sortedIntervals));

            for (int i = 0; i < sortedIntervals.length; i++) {
                System.out.println("execution loop "+(i + 1));
                if (mStack.isEmpty()) {
                      System.out.println("in mStack isEmpty true");
                    mStack.push(new int[]{
                        sortedIntervals[i][0], sortedIntervals[i][1]});
                } else {
                    System.out.println("in mStack isEmpty false");
                    int[] pair = mStack.pop();
                    System.out.println("pair "+pair[0] + "   pair  "+pair[1]);
                    System.out.println("interval "+sortedIntervals[i][0] + "   interval  "+sortedIntervals[i][1]);
                    if (pair[1] < sortedIntervals[i][0]) {
                        System.out.println(" pair < sortedIntervals true");
                        output.add(new int[]{pair[0], pair[1]});
                        mStack.push(new int[]{sortedIntervals[i][0], sortedIntervals[i][1]});

                    } else {
                        System.out.println(" pair < sortedIntervals false");
                        pair[1] = Math.max(pair[1],sortedIntervals[i][1]);
                        mStack.push(new int[]{pair[0], pair[1]});
                    }
                }
            }
            if(!mStack.isEmpty()) {
                int[] finalPair = mStack.pop();
                output.add(new int[]{finalPair[0], finalPair[1]});

            }


        return output.toArray(new int[output.size()][2]);
     }

    public int[][] customSort(int[][] intervals) {
        Arrays.sort(intervals, new IntervalComparator());
        // rest of your code
        return intervals;
    }
}