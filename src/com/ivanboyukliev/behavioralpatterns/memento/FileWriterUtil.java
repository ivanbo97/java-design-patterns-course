package com.ivanboyukliev.behavioralpatterns.memento;

// Originator
public class FileWriterUtil {
    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        content = new StringBuilder();
    }

    @Override
    public String toString() {
        return content.toString();
    }

    public void write(String str) {
        content.append(str);
    }

    public Memento save() {
        return new Memento(fileName, content);
    }

    public void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        content = memento.content;
        fileName = memento.fileName;
    }

    private class Memento {
        private String fileName;
        private StringBuilder content;

        public Memento(String fileName, StringBuilder content) {
            this.fileName = fileName;
            // A deep copy : Memento content and Originator content should not refer to the same object
            this.content = new StringBuilder(content);
        }
    }


}
