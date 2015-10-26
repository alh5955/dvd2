package de.thi.filme.web.model;

import de.thi.filme.web.domain.Movie;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alexander on 26.10.2015.
 */
@Named
@SessionScoped
public class Search implements Serializable {

    private String searchString;
    private List<Movie> result;

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public List<Movie> getResult() {
        return result;
    }



    public String doSearch() {

        System.out.println("doSearch");

        // Simulate search result
        result = Arrays.asList(
                new Movie("Fight Club"),
                new Movie("Drive"),
                new Movie("Mad Max")
        );
        return "listResults";
    }
}
