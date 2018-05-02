public class Main {
    public static void main(String[] args) {
        String text1= "Lorem ipsum dolor sit amet.";
        BlogPost post1 = new BlogPost("John Doe", "Lorem Ipsum", text1, "2000.05.04.");

        String text2 = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        BlogPost post2 = new BlogPost("Tim Urban", "Wait but why", text1, "2010.10.10.");

        String text3 =  "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention." +
                " When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        BlogPost post3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", text1, "2017.03.28.");

    }
}
