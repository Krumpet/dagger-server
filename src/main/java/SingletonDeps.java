public class SingletonDeps {
    private static int pid = 0;
    public int id;

    SingletonDeps() {
        id = pid++;
        System.out.println("singleton deps id " + id);
    }
}
