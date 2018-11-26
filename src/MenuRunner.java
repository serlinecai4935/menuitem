public class MenuRunner {
    public static void main(String[]args){
        Sandwich reuben = new Sandwich ()
        Sandwich bec= new Sandwich()
        Salad waldorf= new Salad()
        Salad caesar = new Salad()
        Drink icedTea= new Drink()
        Drink smoothie = new Drink()

        Trio trio1= new Trio(reuben, waldorf, icedTea);
        Trio trio2= new Trio (bec, caesar, smoothie);
        Trio trio3= new Trio(bec, caesar, icedTea);

        System.out.println(trio1. getName()+ "Price:" + trio1.getPrice() );
        System.out.println(trio2.getName()+ "Price:" + trio2.getPrice());
        System.out.println(trio3.getName()+ "Price:" + trio3.getPrice());
    }
}
