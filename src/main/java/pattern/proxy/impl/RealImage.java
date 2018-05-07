package pattern.proxy.impl;

import lombok.*;
import pattern.proxy.Image;

@Data
public class RealImage implements Image {

   private String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    void load(){
       System.out.println("loading...." + file);
   }
    @Override
    public void display() {
        System.out.println("view file  " + file);
    }
}
