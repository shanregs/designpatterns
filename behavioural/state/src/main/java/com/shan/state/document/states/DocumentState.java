package com.shan.state.document.states;

import com.shan.state.document.Document;

public sealed interface DocumentState permits
        DraftState, ReviewState, ApprovedState, RejectedState, PublishedState, ArchivedState {
    void edit(Document doc);
    void submitForReview(Document doc);
    void approve(Document doc);
    void reject(Document doc);
    void publish(Document doc);
    void archive(Document doc);
}
