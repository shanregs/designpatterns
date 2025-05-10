package com.shan.state.document.states;

import com.shan.state.document.Document;

public final class ArchivedState implements DocumentState {
    public void edit(Document doc) {
        System.out.println("Can't edit. Document is archived.");
    }

    public void submitForReview(Document doc) {
        System.out.println("Can't submit archived document.");
    }

    public void approve(Document doc) {
        System.out.println("Can't approve archived document.");
    }

    public void reject(Document doc) {
        System.out.println("Can't reject archived document.");
    }

    public void publish(Document doc) {
        System.out.println("Can't publish archived document.");
    }

    public void archive(Document doc) {
        System.out.println("Already archived.");
    }
}
