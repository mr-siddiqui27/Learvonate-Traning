package Lecture_14;

interface Camera{
    void takePicture();
}
interface Speaker{
    void playMusic();
}

class Mobile implements Camera, Speaker{
    @Override
    public void takePicture(){
        System.out.println("Picture clicked");
    }
    public void playMusic(){
        System.out.println("Music is playing");
    }
}

public class Interface {
    public static void main(String[] args) {
        Mobile iPhone = new Mobile();
        iPhone.takePicture();
        iPhone.playMusic();
    }
}
