package xiey94.com.xybase.bean;

import java.io.Serializable;

public class SampleBean implements Serializable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "SampleBean{" +
                "content='" + content + '\'' +
                '}';
    }
}
