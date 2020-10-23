package com.netlight.lab13;

public class Steve {
    int diamonds;
    String name = "Steve";

    public void setDiamonds(int diamonds) throws Exception {
        if (diamonds > 256) {
            throw new OutOfInventoryException();
        }
        if (diamonds < 1) {
            throw new Exception();
        }
        this.diamonds = diamonds;
    }

    //weird flex but ok
    public void setName(String name) {
        throw new FinalNameException();
    }

    @Override
    public String toString() {
        return "Steve{" +
                "diamonds=" + diamonds +
                '}';
    }
}
