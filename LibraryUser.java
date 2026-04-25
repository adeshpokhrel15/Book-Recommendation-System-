public abstract class LibraryUser {
    private int id;
    private String name;
    private String email;
    private int booksRead;
    private int points;
    private String preferredGenre;

    public LibraryUser(int id, String name, String email, int booksRead, int points, String preferredGenre) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.booksRead = booksRead;
        this.points = points;
        this.preferredGenre = preferredGenre;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getBooksRead() { return booksRead; }
    public int getPoints() { return points; }
    public String getPreferredGenre() { return preferredGenre; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setBooksRead(int booksRead) { this.booksRead = booksRead; }
    public void setPoints(int points) { this.points = points; }
    public void setPreferredGenre(String preferredGenre) { this.preferredGenre = preferredGenre; }

    public void addPoints(int amount) { this.points += amount; }
    public void deductPoints(int amount) { this.points -= amount; }

    public abstract void evaluate();
    public abstract String getMemberType();

    @Override
    public String toString() {
        return "ID: " + id +
                " | Name: " + name +
                " | Email: " + email +
                " | Type: " + getMemberType() +
                " | Books Read: " + booksRead +
                " | Points: " + points +
                " | Preferred Genre: " + preferredGenre;
    }
}
