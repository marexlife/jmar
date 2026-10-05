import mar.App;

void main() {
    try {
        var app = new App();

        app.run();
    } catch (Exception e) {
        IO.println("Encountered and error: " + e);
    }
}
