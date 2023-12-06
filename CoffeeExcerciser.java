public class CoffeeExcerciser {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        try {
            coffee.setTemperature(121);
        } catch (TooHotException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Coffee is set to " + coffee.getTemperature());
        }
    }
}
