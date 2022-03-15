import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class main {
    public static void main(String[] args) {

        GitHub github = null;

        try {
            String pathAlFich = "C:\\Users\\alex0\\IdeaProjects\\GitHubLibreria";
            // If you don't specify the GitHub user id then the sdk will retrieve it via /user endpoint
            github = new GitHubBuilder()
                    //.withOAuthToken("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")
                    .fromPropertyFile(pathAlFich)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
        }


        GHRepository repo = null;
        try {
            //GHRepository repo2 = github.createRepository("miRepo").create();

            repo = github
                    .createRepository(
                            "new-codewithme")
                    .create();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }


/*

        GitHub github = null;

        try {
            String pathAlFich = "/home/damian/IdeaProjects/githubAccess/ficheroToken.propierties";
            // If you don't specify the GitHub user id then the sdk will retrieve it via /user endpoint
            github = new GitHubBuilder()
                    //.withOAuthToken("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")
                    .fromPropertyFile(pathAlFich)
                    .build();

        } catch (IOException e) {
            e.printStackTrace();
        }


        GHRepository repo = null;
        try {
            //GHRepository repo2 = github.createRepository("miRepo").create();

            repo = github
                    .createRepository(
                            "new-codewithme")
                    .create();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/