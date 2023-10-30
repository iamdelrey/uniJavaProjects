package pr22.num3;

public class CreateMusicDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        System.out.println("Создан музыкальный документ");
        return new MusicDocument();
    }

    @Override
    public IDocument createOpen() {
        return new MusicDocument();
    }
}