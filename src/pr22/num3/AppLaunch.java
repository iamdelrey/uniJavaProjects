package pr22.num3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppLaunch {
    private ICreateDocument documentFactory;
    private IDocument currentDocument;

    public AppLaunch(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
        this.currentDocument = null;

        JFrame frame = new JFrame("Редактор");
        JMenu fileMenu = new JMenu("Файл");
        JMenuItem newMenuItem = new JMenuItem("Создать");
        JMenuItem openMenuItem = new JMenuItem("Открыть");
        JMenuItem saveMenuItem = new JMenuItem("Сохранить");
        JMenuItem exitMenuItem = new JMenuItem("Выход");

        newMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] documentTypes = {"Текстовый", "Музыкальный", "Графический"};
                int choice = JOptionPane.showOptionDialog(
                        frame,
                        "Выберите тип документа:",
                        "Создание документа",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        documentTypes,
                        documentTypes[0]
                );

                switch (choice) {
                    case 0:
                        currentDocument = documentFactory.createNew();
                        break;
                    case 1:
                        currentDocument = new CreateMusicDocument().createNew();
                        break;
                    case 2:
                        currentDocument = new CreateImageDocument().createNew();
                        break;
                    default:
                        currentDocument = null;
                        break;
                }
            }
        });

        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentDocument != null) {
                    currentDocument.open();
                }
            }
        });

        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentDocument != null) {
                    currentDocument.save();
                }
            }
        });


        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        AppLaunch editorFrame = new AppLaunch(textDocumentFactory);
    }
}