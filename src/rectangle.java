public class rectangle {    //mall av ett object
    int x;                  //instansvariabler
    int y;
    int width;
    int height;

    public rectangle () {    //konstruktör
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }
    public rectangle (int width, int height) {
        this.width = width;
        this.height = height;
        this.x = 0;
        this.y = 0;
    }

    public rectangle (int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


}
