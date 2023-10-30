package pr22.num3;

public class CreateImageDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        System.out.println("Создан графический документ");
        return new ImageDocument();
    }

    @Override
    public IDocument createOpen() {
        return new ImageDocument();
    }
}