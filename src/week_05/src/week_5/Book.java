package week_5;

    class Book {
        private int pages; // number of pages in the book
        Book(int pages) {
            this.pages = pages;
        }
        // this will be over ride on the inherited class that call Dictionary
        public String toString() {
            return ""+pages; // convert pages to String before returning
        }
    }

