public class Main {
    public static void main(String[] args) {
        Author veniaminKaverin = new Author("Вениамин", "Каверин");
        Book twoCaptains = new Book("Два капитана", veniaminKaverin, 1939);

        Author arthurConanDoyle = new Author("Артур", "Конан Дойль");
        Book theLostWorld = new Book("Затерянный мир", arthurConanDoyle, 1912);

        twoCaptains.setYearOfPublication(1640);

        System.out.println(theLostWorld + "\n");
        System.out.println(twoCaptains);

        //добавил ещё одну книгу А. Конана Дойля для тестов
        Book aStudyInScarlet = new Book("Этюд в багровых тонах", arthurConanDoyle, 1887);
        //Сравнение авторов у книг А. Конана Дойля
        System.out.println("theLostWorld.getAuthor().equals(aStudyInScarlet.getAuthor()) = " + theLostWorld.getAuthor().equals(aStudyInScarlet.getAuthor()));
        //Сравнение книг А. Конана Дойля
        System.out.println("theLostWorld.equals(aStudyInScarlet) = " + theLostWorld.equals(aStudyInScarlet));


    }
}