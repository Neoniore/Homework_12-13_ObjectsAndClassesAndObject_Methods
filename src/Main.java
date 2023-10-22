public class Main {
    public static void main(String[] args) {
        Author veniaminKaverin = new Author("Вениамин", "Каверин");
        Book twoCaptains = new Book("Два капитана", veniaminKaverin, 1939);

        Author arthurConanDoyle = new Author("Артур", "Конан Дойль");
        Book theLostWorld = new Book("Затерянный мир", arthurConanDoyle, 1912);

        twoCaptains.setYearOfPublication(1640);
    }
}