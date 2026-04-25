public class PremiumMember extends LibraryUser {
    public PremiumMember(int id, String name, String email, int booksRead, int points, String preferredGenre) {
        super(id, name, email, booksRead, points, preferredGenre);
    }

    @Override
    public void evaluate() {
        System.out.println("\n=== Evaluating Premium Member: " + getName() + " ===");
        if (getBooksRead() > 5) {
            addPoints(20);
            System.out.println("Premium reward: Outstanding reader! +20 points and special badge");
        } else {
            deductPoints(10);
            System.out.println("Premium penalty: Keep up with reading. -10 points");
        }
        System.out.println("Current points: " + getPoints());
    }

    @Override
    public String getMemberType() {
        return "premium";
    }
}
