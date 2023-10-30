package pr22.num3;

public class MusicDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Открыт музыкальный документ");
    }

    @Override
    public void save() {
        System.out.println("Сохранен музыкальный документ");
    }
}