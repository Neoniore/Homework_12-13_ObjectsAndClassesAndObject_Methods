public class Main {
    public static void main(String[] args) {
        Author veniaminKaverin = new Author("Вениамин", "Каверин");
        Book twoСaptains = new Book("Два капитана", veniaminKaverin, 1940);
        Author arthurConanDoyle = new Author("Артур", "Конан Дойль");
        Book theLostWorld = new Book("Затерянный мир", arthurConanDoyle, 1912);

    }
}