/**
 * Created by cameronoakley on 10/15/15.
 */
public class Post {
    int replyId;
    String Author;
    String text;

    public Post(int replyId, String author, String text) {
        this.replyId = replyId;
        this.Author = author;
        this.text = text;
    }
}
