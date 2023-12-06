public class Coffee {

    public Coffee(){}
    public Coffee(int temperature) throws TooHotException {
        super();
        this.setTemperature(temperature);
    }
    int temperature;

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) throws TooHotException {

        if (temperature > 120){
            throw new TooHotException("Coffee is too hot");
        }else {
            this.temperature = temperature;
        }
    }
}
