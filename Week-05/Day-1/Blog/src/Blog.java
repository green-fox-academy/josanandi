import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blog;

    public Blog() {
        this.blog = new ArrayList<>();
    }
    public void add(BlogPost post){
        this.blog.add(post);
    }

    public void delete(int i){
        this.blog.remove(i);

    }
    public List update (int i, BlogPost post){
        this.blog.set(i, post);
        return blog;
    }

    public int lenght(){
        return this.blog.size();
    }
    public BlogPost get(int i){
        return this.blog.get(i);
    }

    public static void main(String[] args) {
        Blog andiblogja = new Blog();
        BlogPost post1 = new BlogPost("Andi", "First post", "This is the first post.", "2018.01.18.");
        andiblogja.add(post1);
        BlogPost post2 = new BlogPost( "Aladdin", "The magic lamp", "I found a magic lamp.", "2018.03.15");
        andiblogja.add(post2);
        BlogPost post3 = new BlogPost( "Snow White", "The seven dwarfs are my best friends", "I live in the forest with my friends, the dwarfs", "2018.03.23");
        andiblogja.add(post3);
        BlogPost post4 = new BlogPost( "Rapunzel", "My hair", "I was born with long long blond hair.", "2018.03.24");
        andiblogja.add(post4);
        andiblogja.update(2,post4);
        andiblogja.delete(3);

        for (int i = 0; i <andiblogja.lenght() ; i++) {
            System.out.println(andiblogja.get(i).title);
        }

    }
}
