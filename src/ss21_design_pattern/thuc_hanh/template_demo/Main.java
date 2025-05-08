package ss21_design_pattern.thuc_hanh.template_demo;

public class Main {
    public static void main(String[] args) {
        Page htmlPage = new HTMLPage();
        Page pdfPage = new HTMLPage();

        htmlPage.print();
        pdfPage.print();
    }
}
