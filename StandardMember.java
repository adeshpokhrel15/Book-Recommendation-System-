public class StandardMember extends LibraryUser {
    public StandardMember(int id, String name, String email, int booksRead, int points, String preferredGenre) {
        super(id, name, email, booksRead, points, preferredGenre);
    }

    @Override
    public void evaluate() {
        System.out.println("\n=== Evaluating Standard Member: " + getName() + " ===");

        if (getBooksRead() <= 0) {
            System.out.println("No books read yet. Start exploring the library!");
            return;
        }

        if (getBooksRead() > 5) {
            addPoints(10);
            System.out.println("Positive feedback: Excellent reading habit! +10 points");
        } else {
            deductPoints(5);
            System.out.println("Negative feedback: Please read more books. -5 points");
        }

        System.out.println("Current points: " + getPoints());
    }

    @Override
    public String getMemberType() {
        return "standard";
    }
}