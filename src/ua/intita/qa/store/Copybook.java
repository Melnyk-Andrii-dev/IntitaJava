package ua.intita.qa.store;

public abstract class Copybook implements Paper{
    int pages;

    public Copybook(int pages) {
        this.pages = pages;
    }

    @Override
    public void tear() {
        System.out.println("Copybook teared");
    }
}
