package ss21_design_pattern.thuc_hanh.template_demo;

public class HTMLPage extends Page{
    @Override
    protected void printHeader() {
        System.out.println("HTML Header");
    }

    @Override
    protected void printBody() {
        System.out.println("HTML Body");
    }

    @Override
    protected void printFooter() {
        System.out.println("HTML Footer");
    }
}
