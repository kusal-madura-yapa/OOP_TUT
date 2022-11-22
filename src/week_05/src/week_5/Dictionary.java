package week_5;

class Dictionary extends Book {
    private int words; // number of words in the dictionary
    Dictionary(int words, int pages) {
    super(pages);
// missing line 1 goes here - should call the parent constructor here
        this.words = words;
    }
    @Override
    public String toString() {
        return super.toString()+"  count of pages pages , " + words + " words";
    }

   final int NUM =0;

}

