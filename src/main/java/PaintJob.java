public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int numberOfBucketsThatBobNeedsToBuyBeforeGoingToWork = -1;
        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {
            double area = width * height;
            double areaThatBobCanCover = extraBuckets * areaPerBucket;
            if (areaThatBobCanCover >= area) {
                numberOfBucketsThatBobNeedsToBuyBeforeGoingToWork = 0;
            } else {
                double remainingArea = area - areaThatBobCanCover;
                numberOfBucketsThatBobNeedsToBuyBeforeGoingToWork = (int) Math.ceil(remainingArea / areaPerBucket);
            }
        }
        return numberOfBucketsThatBobNeedsToBuyBeforeGoingToWork;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int numberOfBucketsThatBobNeedsToBuyBeforeGoingToWork = -1;
        if (width > 0 && height > 0 && areaPerBucket > 0) {
            double area = width * height;
            if (area == 0) {
                numberOfBucketsThatBobNeedsToBuyBeforeGoingToWork = 0;
            } else {
                numberOfBucketsThatBobNeedsToBuyBeforeGoingToWork = (int) Math.ceil(area / areaPerBucket);
            }
        }
        return numberOfBucketsThatBobNeedsToBuyBeforeGoingToWork;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int numberOfBucketsThatBobNeedsToBuyBeforeGoingToWork = -1;
        if (area > 0 && areaPerBucket > 0) {
            numberOfBucketsThatBobNeedsToBuyBeforeGoingToWork = (int) Math.ceil(area / areaPerBucket);
        }
        return numberOfBucketsThatBobNeedsToBuyBeforeGoingToWork;
    }
}
