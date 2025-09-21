
public class ProxyResearchPaper implements ResearchPaper {

    private FullResearchPaper fullResearchPaper;
    private final String paperTitle;

    public ProxyResearchPaper(String paperTitle) {
        this.paperTitle = paperTitle;
    }

    public void load() {
        if (fullResearchPaper == null) {
            fullResearchPaper = new FullResearchPaper(paperTitle);
        }
        fullResearchPaper.load();
    }

    @Override
    public void view() {
        System.out.println("Viewing research paper summary: " + paperTitle);
    }
}
