class BrowserHistory {
    String history[] = new String[5001];
    int curr = 0;
    int end = 0;

    public BrowserHistory(String homepage) {
        history[0] = homepage;
    }

    public void visit(String url) {
        curr++;
        history[curr] = url;
        end = curr;
    }

    public String back(int steps) {
        curr = Math.max(0, curr - steps);
        return history[curr];
    }

    public String forward(int steps) {
        curr = Math.min(end, curr + steps);
        return history[curr];
    }
}