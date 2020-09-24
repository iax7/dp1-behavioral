package com.iax.visitor;

public class HighlighOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("highlight-heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("highlight-anchor");
    }
}
