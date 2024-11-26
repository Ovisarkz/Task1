abstract class Arachnid extends Animal {
    public Arachnid(String name) {
        super(name);
    }

    public abstract void habitat();
}

class Mite extends Arachnid {
    private static int miteCount = 0;

    public Mite(String name) {
        super(name);
        miteCount++;
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м");
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    @Override
    public void habitat() {
        System.out.println(name + " живет в почве и на растениях");
    }

    public static int getMiteCount() {
        return miteCount;
    }
}

class Scorpion extends Arachnid {
    private static int scorpionCount = 0;

    public Scorpion(String name) {
        super(name);
        scorpionCount++;
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м");
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    @Override
    public void habitat() {
        System.out.println(name + " живет в пустынях и тропических лесах");
    }

    public static int getScorpionCount() {
        return scorpionCount;
    }
}

class Tarantula extends Arachnid {
    private static int tarantulaCount = 0;

    public Tarantula(String name) {
        super(name);
        tarantulaCount++;
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м");
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    @Override
    public void habitat() {
        System.out.println(name + " живет в тропических лесах и пустынях");
    }

    public static int getTarantulaCount() {
        return tarantulaCount;
    }
}
