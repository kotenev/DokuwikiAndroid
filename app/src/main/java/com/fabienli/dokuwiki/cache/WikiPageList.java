package com.fabienli.dokuwiki.cache;

import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class WikiPageList {
    public SortedMap<String, WikiPage> _pages;
    public SortedMap<String, String> _mediaversions;

    public WikiPageList(){
        _pages = new TreeMap<String, WikiPage>();
        _mediaversions = new TreeMap<>();
    }

}
