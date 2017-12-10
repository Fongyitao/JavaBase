package _18_day_Map._03_Map之遍历;

public class _02_MapEntry {
    public static void main(String[] args) {

    }
}

interface Inter{
    interface Iter2{
        public void show();
    }
}

class Demo implements Inter.Iter2{
    @Override
    public void show() {
        System.out.println("say Hello");
    }
}