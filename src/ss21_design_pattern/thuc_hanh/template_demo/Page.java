package ss21_design_pattern.thuc_hanh.template_demo;

public abstract class Page {
    void print(){
        System.out.println("===========================");
        printHeader();
        printBody();
        printFooter();
        System.out.println("===========================");
    }

    protected abstract void printHeader();
    protected abstract void printBody();
    protected abstract void printFooter();
}
