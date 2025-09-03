package structural.proxy.to_be;

import structural.proxy.as_is.RealImage;

// 프록시 객체
class ProxyImage implements Image {
    private final String filename;
    private RealImage realImage; // 실제 객체는 필요할 때만 생성

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) { // 실제 필요할 때 로딩
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}