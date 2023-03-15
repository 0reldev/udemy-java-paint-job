public class Main {

    public static void main(String[] args) {

        // Tests
        double width, height, areaPerBucket, area;
        int extraBucket, expectedResult;

        width = -3.4;
        height = 2.1;
        areaPerBucket = 1.5;
        extraBucket = 2;
        expectedResult = -1;
        System.out.println("getBucketCount(" + width + ", " + height + ", " + areaPerBucket + ", " + extraBucket
                + ") = " + PaintJob.getBucketCount(width, height, areaPerBucket, extraBucket) + " (expected: "
                + expectedResult + ")");

        width = 3.4;
        height = 2.1;
        areaPerBucket = 1.5;
        extraBucket = 2;
        expectedResult = 3;
        System.out.println("getBucketCount(" + width + ", " + height + ", " + areaPerBucket + ", " + extraBucket
                + ") = " + PaintJob.getBucketCount(width, height, areaPerBucket, extraBucket) + " (expected: "
                + expectedResult + ")");

        width = 2.75;
        height = 3.25;
        areaPerBucket = 2.5;
        extraBucket = 1;
        expectedResult = 3;
        System.out.println("getBucketCount(" + width + ", " + height + ", " + areaPerBucket + ", " + extraBucket
                + ") = " + PaintJob.getBucketCount(width, height, areaPerBucket, extraBucket) + " (expected: "
                + expectedResult + ")");

        width = 1.4;
        height = 2.1;
        areaPerBucket = -1.5;
        extraBucket = 2;
        expectedResult = -1;
        System.out.println("getBucketCount(" + width + ", " + height + ", " + areaPerBucket + ", " + extraBucket
                + ") = " + PaintJob.getBucketCount(width, height, areaPerBucket, extraBucket) + " (expected: "
                + expectedResult + ")");

        width = -3.4;
        height = 2.1;
        areaPerBucket = 1.5;
        expectedResult = -1;
        System.out.println("getBucketCount(" + width + ", " + height + ", " + areaPerBucket
                + ") = " + PaintJob.getBucketCount(width, height, areaPerBucket) + " (expected: "
                + expectedResult + ")");

        width = 3.4;
        height = 2.1;
        areaPerBucket = 1.5;
        expectedResult = 5;
        System.out.println("getBucketCount(" + width + ", " + height + ", " + areaPerBucket
                + ") = " + PaintJob.getBucketCount(width, height, areaPerBucket) + " (expected: "
                + expectedResult + ")");

        width = 7.25;
        height = 4.3;
        areaPerBucket = 2.35;
        expectedResult = 14;
        System.out.println("getBucketCount(" + width + ", " + height + ", " + areaPerBucket
                + ") = " + PaintJob.getBucketCount(width, height, areaPerBucket) + " (expected: "
                + expectedResult + ")");

        area = 3.4;
        areaPerBucket = 1.5;
        expectedResult = 3;
        System.out.println("getBucketCount(" + area + ", " + areaPerBucket
                + ") = " + PaintJob.getBucketCount(area, areaPerBucket) + " (expected: "
                + expectedResult + ")");

        area = 6.26;
        areaPerBucket = 2.2;
        expectedResult = 3;
        System.out.println("getBucketCount(" + area + ", " + areaPerBucket
                + ") = " + PaintJob.getBucketCount(area, areaPerBucket) + " (expected: "
                + expectedResult + ")");

        area = 3.26;
        areaPerBucket = 0.75;
        expectedResult = 5;
        System.out.println("getBucketCount(" + area + ", " + areaPerBucket
                + ") = " + PaintJob.getBucketCount(area, areaPerBucket) + " (expected: "
                + expectedResult + ")");
    }
}
