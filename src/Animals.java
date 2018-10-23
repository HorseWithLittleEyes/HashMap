public class Animals implements Comparable<Animals>
{

    private String name;
    private int    age;
    private int    weight;

    public Animals(String name, int age, int weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int compareTo(Animals otherAnimal)
    {
        return Integer.compare(weight, otherAnimal.getWeight());
    }

    public int getWeight()
    {
        return weight;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}
