public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Бобик"),
                new Cat("Мурзик"),
                new Tiger("Тигр"),
                new Mite("Клещ"),
                new Scorpion("Скорпион"),
                new Tarantula("Тарантул")
        };

        for (Animal animal : animals) {
            animal.run(100);
            animal.swim(5);

            if (animal instanceof Arachnid) {
                ((Arachnid) animal).habitat();
            }
        }

        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
        System.out.println("Количество тигров: " + Tiger.getTigerCount());
        System.out.println("Количество клещей: " + Mite.getMiteCount());
        System.out.println("Количество скорпионов: " + Scorpion.getScorpionCount());
        System.out.println("Количество тарантулов: " + Tarantula.getTarantulaCount());
    }
}
