import java.io.File;

public class Editor {
    EventManager events;
    File file;

    public Editor() {
        events = new EventManager();
    }

    public void openFile( String path)
    {
        this.file= new File(path);
        events.notify("open",file.getName());

    }

    public void saveFile()
    {
        file.canWrite();
        events.notify("save",file.getName());
    }
}
