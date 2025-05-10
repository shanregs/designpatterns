package com.shan.state.document.states;

import com.shan.state.document.Document;

public final class RejectedState implements DocumentState {
    @Override
    public void edit(Document doc) {
        System.out.println("Can't edit in Rejected state");
    }

    @Override
    public void submitForReview(Document doc) {
        System.out.println("Can't review in Rejected state");
    }

    @Override
    public void approve(Document doc) {
        System.out.println("Can't approve in Rejected state");
    }

    @Override
    public void reject(Document doc) {
        System.out.println("Can't reject in Rejected state");
    }

    @Override
    public void publish(Document doc) {
        System.out.println("Can't publish in Rejected state");
    }

    @Override
    public void archive(Document doc) {
        System.out.println("Can't archive in Rejected state");
    }
}
