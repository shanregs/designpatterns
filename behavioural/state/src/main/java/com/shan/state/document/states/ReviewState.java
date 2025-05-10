package com.shan.state.document.states;

import com.shan.state.document.Document;

public final class ReviewState implements DocumentState {
    public void edit(Document doc) {
        System.out.println("Can't edit in Review.");
    }

    public void submitForReview(Document doc) {
        System.out.println("Already in Review.");
    }

    @Override
    public void approve(Document doc) {
        System.out.println("Approved. Moving to Approved state.");
        doc.setState(new ApprovedState());
    }

    @Override
    public void reject(Document doc) {
        System.out.println("Rejected. Returning to Draft.");
        doc.setState(new DraftState());
    }

    @Override
    public void publish(Document doc) {
        System.out.println("Can't publish in Review.");
    }

    public void archive(Document doc) {
        System.out.println("Archiving from Review.");
        doc.setState(new ArchivedState());
    }
}
