package rocks.zipcode.io.objectorientation;

public class Television {

    private boolean power = false;
    private TVChannel tvChannel;

    public void turnOn() {
    this.power = true;
    }

    public void setChannel(Integer channel) {
        if(!power){
            throw new IllegalStateException();
        }
        this.tvChannel = TVChannel.getByOrdinal(channel);

    }

    public TVChannel getChannel() {
        return this.tvChannel;
    }
}
