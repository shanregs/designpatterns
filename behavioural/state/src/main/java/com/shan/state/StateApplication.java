package com.shan.state;

import com.shan.state.document.Document;
import com.shan.state.document.states.DraftState;

public class StateApplication {
    public static void main(String[] args) {
        var doc = new Document(new DraftState());

        doc.edit();
        doc.submitForReview();
        doc.approve();
        doc.publish();
        doc.archive();
        doc.edit();  // This will now fail because it's archived
    }
}
