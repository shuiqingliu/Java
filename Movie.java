class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie");
    }
}

public class MovieTestDrive {
    public static void main(String[] args) {
        
        // 在这里我们创建三个Movie对象，分别给这三个对象
        // 的属性title，genre和rating赋值，并调用第二个
        // 对象的playIt()方法。
        Movie m1 = new Movie();
        m1.title = "人体蜈蚣";
        m1.genre = "Tragic";
        m1.rating = 3;
        
        
        Movie m2 = new Movie();
        m2.title = "钢铁侠3";
        m2.genre = "Comedy";
        m2.rating = 100000;
        m2.playIt();
        
        
        Movie m3 = new Movie();
        m3.title = "环太平洋";
        m3.genre = "Tragic but ultimately uplifting";
        m3.rating = 188;
    }
}
        