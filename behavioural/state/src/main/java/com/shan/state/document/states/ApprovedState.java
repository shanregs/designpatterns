package com.shan.state.document.states;

import com.shan.state.document.Document;

public final class ApprovedState implements DocumentState {
    public void edit(Document doc) {
        System.out.println("Can't edit in Approved.");
    }

    public void submitForReview(Document doc) {
        System.out.println("Already approved.");
    }

    public void approve(Document doc) {
        System.out.println("Already approved.");
    }

    public void reject(Document doc) {
        System.out.println("Can't reject after approval.");
    }

    public void publish(Document doc) {
        System.out.println("Publishing document.");
        doc.setState(new PublishedState());
    }

    public void archive(Document doc) {
        System.out.println("Archiving approved document.");
        doc.setState(new ArchivedState());
    }
}
