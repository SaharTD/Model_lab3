package lab_3Model;


interface DocPrototype extends Cloneable {
    DocPrototype clone();
    void adapt(String content, String layout, String styles);
}

class Document implements DocPrototype {
    private String content;
    private String layout;
    private String styles;

    public Document(String content, String layout, String styles) {
        this.content = content;
        this.layout = layout;
        this.styles = styles;
    }

    @Override
    public DocPrototype clone() {
        try {
            return (DocPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void adapt(String content, String layout, String styles) {
        this.content = content;
        this.layout = layout;
        this.styles = styles;
        System.out.println(" Content : " + this.content + ", Layout : " + this.layout + ", Styles : " + this.styles);
    }
}

class Article extends Document {
    public Article(String content, String layout, String styles) {
        super(content, layout, styles);
    }

}

class Report extends Document {
    public Report(String content, String layout, String styles) {
        super(content, layout, styles);
    }

}

class Brochure extends Document {
    public Brochure(String content, String layout, String styles) {
        super(content, layout, styles);
    }

}

public class DocSystem {
    public static void main(String[] args) {
        
        DocPrototype articlePrototype = new Article("Sample article content", "Article layout", "Bold, Italic");
        DocPrototype reportPrototype = new Report("Sample report content", "Report layout", "Header, Footer");
        DocPrototype brochurePrototype = new Brochure("Sample brochure content", "Brochure layout", "Colorful, Attractive");

        DocPrototype adaptedArticle = articlePrototype.clone();
adaptedArticle.adapt("Updated article content", "Article layout v2", "Bold, Italic");

DocPrototype adaptedReport = reportPrototype.clone();
adaptedReport.adapt("Revised report content", "Report layout v2", "Header, Footer");

DocPrototype adaptedBrochure = brochurePrototype.clone();
adaptedBrochure.adapt("Enhanced brochure content", "Brochure layout v2", "Colorful, Attractive");
    }
}
