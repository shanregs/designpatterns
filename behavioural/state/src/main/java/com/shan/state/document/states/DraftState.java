package com.shan.state.document.states;

import com.shan.state.document.Document;

public final class DraftState implements DocumentState {
    public void edit(Document doc) {
        System.out.println("Editing in Draft mode.");
    }

    public void submitForReview(Document doc) {
        System.out.println("Submitting Draft to Review.");
        doc.setState(new ReviewState());
    }

    public void approve(Document doc) {
        System.out.println("Can't approve in Draft.");
    }

    public void reject(Document doc) {
        System.out.println("Can  reject in Draft.");
        doc.setState(new RejectedState());
    }

    public void publish(Document doc) {
        System.out.println("Can't publish from Draft.");
    }

    public void archive(Document doc) {
        System.out.println("Archiving Draft document.");
        doc.setState(new ArchivedState());
    }
}
