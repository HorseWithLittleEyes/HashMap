public class ComparableInterface
{

    public static void main(String args[])
    {
        Animals dog  = new Animals("Dog",5,20);
        Animals cat = new Animals("Cat",3,5);
        if (dog.compareTo(cat) == 1)
            System.out.println(dog.getName()+" is heavier then "+cat.getName());
        if (dog.compareTo(cat) == 0)
            System.out.println(dog.getName()+" is just as heavy as "+cat.getName());
        if (dog.compareTo(cat) == -1)
            System.out.println(dog.getName()+" is not as heavy as "+cat.getName());
    }
}
