package week13;

class Phone {
    Phone() {

    }
}

class CameraOhone extends Phone {
    int imageSize;
    int memorySize;

    public CameraOhone(int imageSize) {
        super();
    }

    public CameraOhone(int imageSize, int memorySize) {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures() {
        return memorySize * 1000 / imageSize;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 3;

        b = (a + b) - (a = b);

        System.out.println(a + ", " + b);
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >= 0; j--) {
                if (i == j)
                    continue;
                System.out.print(i + " " + j);
                if (j != 0) System.out.print(" ");
            }
            if (i != 2) System.out.print(" ");
        }

    }
}
/*
Assume the existence of a Phone class that is a super class for CameraPhone class.
Define a subclass, CameraPhone that contains two instance variables: an integer named imageSize,
representing the size in megapixels (for simplicity assume a pixel takes up one byte--
thus megapixels equals megabytes) of each picture (i.e., 2 means each image is composed of 2 megapixels),
and an integer named memorySize, representing the number of gigabytes in the camera's memory (i.e., 4 means 4 Gigabytes of memory).
There is a constructor that accepts two integer parameters corresponding to the above two instance variables and which are used to initialize the respective instance variables.
There is also a method named numPictures that returns (as an integer) the number of pictures the camera's memory can hold. Don't forget that a gigabyte is 1,000 megabytes.
 */
