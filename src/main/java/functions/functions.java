package functions;
import javax.swing.*;




public  final class functions {
    private JFrame window;
    private JTextArea textArea;


    public functions(JFrame window, JTextArea textArea) {
        this.window = window;
        this.textArea = textArea;
    }

    public  void createMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchieve = new JMenu("\uD83D\uDCA9");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        newItem.addActionListener(e -> textArea.setText(""));

        menuArchieve.add(newItem);
        menuArchieve.add(openItem);
        menuArchieve.add(saveItem);
        menuArchieve.add(exitItem);

        menuBar.add(menuArchieve);
        window.setJMenuBar(menuBar);

        //define a ação de fechar o programa pelo exit
        exitItem.addActionListener(e -> System.exit(0));

    }

}
