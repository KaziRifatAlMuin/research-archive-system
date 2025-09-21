
public class FullResearchPaper implements ResearchPaper {

    private final String paperTitle;

    public FullResearchPaper(String paperTitle) {
        System.out.println("Viewing full research paper.");
        this.paperTitle = paperTitle;
    }

    public void load() {
        System.out.println("Loading full research paper: " + paperTitle);
    }

    @Override
    public void view() {
        System.out.println("Displaying full research paper: " + paperTitle);
    }
}
