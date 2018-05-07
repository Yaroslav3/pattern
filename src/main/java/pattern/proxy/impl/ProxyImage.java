package pattern.proxy.impl;

import lombok.Data;
import pattern.proxy.Image;

@Data
public class ProxyImage implements Image {

    private String file;
    private RealImage image;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if(image == null){
            image = new RealImage(file);
        }
        image.display();
    }
}
