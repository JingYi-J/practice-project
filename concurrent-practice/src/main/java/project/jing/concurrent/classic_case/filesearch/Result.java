package project.jing.concurrent.classic_case.filesearch;

public class Result {

    private boolean found;

    private String path;

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
