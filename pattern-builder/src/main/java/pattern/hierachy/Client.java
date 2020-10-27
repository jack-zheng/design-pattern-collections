package pattern.hierachy;

public class Client {
    public static void main(String[] args) {
        NYPizza nyPizza = new NYPizza.Builder(NYPizza.Size.LARGE).addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.HAM).build();
        System.out.println(nyPizza);

        Calzone calzone = new Calzone.CalzoneBuilder().addSauce().addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.HAM).build();
        System.out.println(calzone);
    }
}
