package io.intercom.android.sdk.m5.conversation.reducers;

import defpackage.ph1;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.models.ComposerSuggestions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposerSuggestionsReducerKt {
    private static final List<ReplySuggestion> getReplySuggestions(ComposerSuggestions composerSuggestions) {
        List<ComposerSuggestions.Suggestion> suggestions = composerSuggestions.getSuggestions();
        ArrayList arrayList = new ArrayList(ph1.n(suggestions, 10));
        for (ComposerSuggestions.Suggestion suggestion : suggestions) {
            arrayList.add(new ReplySuggestion(suggestion.getUuid(), suggestion.getText()));
        }
        return arrayList;
    }

    public static final ContentRow reduceComposerSuggestions(ComposerSuggestions composerSuggestions) {
        composerSuggestions.getClass();
        if (composerSuggestions.getSuggestions().isEmpty()) {
            return null;
        }
        return new ContentRow.ComposerSuggestionRow(getReplySuggestions(composerSuggestions));
    }
}
