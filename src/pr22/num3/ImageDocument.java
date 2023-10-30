package pr22.num3;

public class ImageDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Открыт графический документ");
    }

    @Override
    public void save() {
        System.out.println("Сохранен графический документ");
    }
}