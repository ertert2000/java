package Sascha;

public class Main {
    
    public static void main(String[] args)
    {
    Man man1 = new Man();
    man1.name = "Alex";
    man1.gender = "Man";

    Women woman1 = new Women();
    woman1.name = "Alis";
    woman1.gender = "Woman";


    Queuee queue = new Queuee();

    queue.add(8, woman1);
    queue.add(2, man1);

    for(int i = 0; i<10;i++)
    {
        if (queue.get(i) != null)
            System.out.println(i+1 + ")" + queue.get(i).name);
    }
    
    }
}
