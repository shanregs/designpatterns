package com.shan.state.document;

import com.shan.state.document.states.DocumentState;

public class Document {
    private DocumentState state;

    public Document(DocumentState documentState) {
        this.state = documentState;
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void edit()              { state.edit(this); }
    public void submitForReview()  { state.submitForReview(this); }
    public void approve()          { state.approve(this); }
    public void reject()           { state.reject(this); }
    public void publish()          { state.publish(this); }
    public void archive()          { state.archive(this); }

}
