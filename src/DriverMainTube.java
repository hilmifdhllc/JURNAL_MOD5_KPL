/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hilmi Fadhillah C
 */
public class DriverMainTube {
     public static void main(String[] args) {
        SayaTubeVideo vid1 = new SayaTubeVideo("Review Fast Furious oleh Hilmi FC");
        SayaTubeVideo vid2 = new SayaTubeVideo("Review MOANA oleh Hilmi FC");
        SayaTubeVideo vid3 = new SayaTubeVideo("Review BOBOIBOY Episode 6 oleh Hilmi FC");
        SayaTubeVideo vid4 = new SayaTubeVideo("Review My Name oleh Hilmi FC");
        SayaTubeVideo vid5 = new SayaTubeVideo("Review Upin Ipin eps 2 oleh Hilmi FC");
        SayaTubeVideo vid6 = new SayaTubeVideo("Review Kembara kembar nakal oleh Hilmi FC");
        SayaTubeVideo vid7 = new SayaTubeVideo("Review MERAH PUTIH oleh HILMI FC");
        SayaTubeVideo vid8 = new SayaTubeVideo("Review Ada apa dengan cinta oleh HILMI FC");
        SayaTubeVideo vid9 = new SayaTubeVideo("Review Boku no Taiyouo JKT48 oleh Hilmi FC");
        SayaTubeVideo vid10 = new SayaTubeVideo("Review Alice Wonderland ole HILMI FC");
        vid1.increasePlayCount(25000000);
        vid2.increasePlayCount(25000000);
        vid3.increasePlayCount(25000000);
        vid4.increasePlayCount(25000000);
        vid5.increasePlayCount(25000000);
        vid6.increasePlayCount(25000000);
        vid7.increasePlayCount(25000000);
        vid8.increasePlayCount(25000000);
        vid9.increasePlayCount(25000000);
        vid10.increasePlayCount(25000000);


        SayaTubeUser user1 = new SayaTubeUser("Rovino");
        user1.addVideo(vid1);
        user1.addVideo(vid2);
        user1.addVideo(vid3);
        user1.addVideo(vid4);
        user1.addVideo(vid5);
        user1.addVideo(vid6);
        user1.addVideo(vid7);
        user1.addVideo(vid8);
        user1.addVideo(vid9);
        user1.addVideo(vid10);

        user1.printAllVideoPlaycount();
        System.out.println("Total playcount : "+user1.getTotalVideoPlayCount());
    }
}
