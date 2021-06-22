package java_programming_classes.day55_abstraction.webdriver;

public interface WebDriver {
    public abstract void get(String url); //public abstract is redundant - it will be added anyway
    public abstract void findElement(String locator);
    void quit();
}

class ChromeDriver implements WebDriver{

    @Override
    public void get(String url) {
        System.out.println("ChromeDriver, navigate to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver, locate element by locator - " + locator);
    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver, close session");
    }
}
class FireFoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FireFoxDriver, navigate to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FireFoxDriver, locate element by locator - " + locator);
    }

    @Override
    public void quit() {
        System.out.println("FireFoxDriver, close session");
    }
}
