package hu.szamalk.view;
import hu.szamalk.model.LyukasHenger;
import hu.szamalk.model.MertaniHenger;
import hu.szamalk.model.TomorHenger;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List<MertaniHenger> hengerek;
    public HengerProgram(){
        this.hengerek = new ArrayList<>();
    }
    public double atlagTerfogat(){
        double ossz = 0;
        for(MertaniHenger h : hengerek){
            ossz += h.terfogat();
        }
        return ossz / hengerek.size();
    }

    public double csovekSulya(){
        double ossz=0;
        for(var h : hengerek){
            if(h instanceof LyukasHenger){
                ossz += ((LyukasHenger) h).suly();
            }
        }
        return ossz;
    }
    private List<MertaniHenger> lista(){
        return hengerek;
    }
    public void run(){
        hengerek.add(new MertaniHenger(1,2));
        hengerek.add(new MertaniHenger(1,2));
        hengerek.add(new TomorHenger(1,2));
        hengerek.add(new MertaniHenger(1,2));
        hengerek.add(new LyukasHenger(1,2, 3));
        hengerek.add(new MertaniHenger(1,2));
        hengerek.add(new TomorHenger(1, 2, 1));
        hengerek.add(new MertaniHenger(1,2));
        hengerek.add(new MertaniHenger(1,2));
    }
    public static void main(String[] args){
        HengerProgram hengerProgram = new HengerProgram();
        hengerProgram.run();
        List<MertaniHenger> l = hengerProgram.lista();
        for(MertaniHenger m : l){
            System.out.println(m);
        }
        System.out.println(hengerProgram.atlagTerfogat());
        System.out.println(hengerProgram.csovekSulya());
    }
}
