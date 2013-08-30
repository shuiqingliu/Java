public class Song{
	String title;
	String artist;

	public void setTitle(String title){
		this.title = title;	
	}


	public void setArtist(String artist){
		this.artist = artist;
	}


	public void play(){
		System.out.println(artist + " is play " + title);
	}


	public static void main(String[] args){
		Song mysong = new Song();
		mysong.setTitle("yesterday once more");
		mysong.setArtist("qingliu");
		mysong.play();
	}
}