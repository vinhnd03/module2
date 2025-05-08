package ss21_design_pattern.thuc_hanh.template_demo;

public class PDFPage extends Page{
    @Override
    protected void printHeader() {
        System.out.println("PDF Header");
    }

    @Override
    protected void printBody() {
        System.out.println("PDF Body");
    }

    @Override
    protected void printFooter() {
        System.out.println("PDF Footer");
    }
}
