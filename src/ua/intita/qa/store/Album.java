package ua.intita.qa.store;

public class Album extends Copybook {
    String type;

    public Album(int pages, String type) {
        super(pages);
        this.type = type;
    }

    @Override
    public void tear() {
        System.out.println("Album teared");
    }
}
