package com.shan.state.document.states;

import com.shan.state.document.Document;

public final class PublishedState implements DocumentState {
    public void edit(Document doc) {
        System.out.println("Can't edit a published document.");
    }

    public void submitForReview(Document doc) {
        System.out.println("Already published.");
    }

    public void approve(Document doc) {
        System.out.println("Already published.");
    }

    public void reject(Document doc) {
        System.out.println("Can't reject published document.");
    }

    public void publish(Document doc) {
        System.out.println("Already published.");
    }

    public void archive(Document doc) {
        System.out.println("Archiving published document.");
        doc.setState(new ArchivedState());
    }
}
