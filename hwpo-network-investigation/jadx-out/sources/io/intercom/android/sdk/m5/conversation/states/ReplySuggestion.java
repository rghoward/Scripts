package io.intercom.android.sdk.m5.conversation.states;

import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ReplySuggestion {
    public static final int $stable = 0;
    private final String id;
    private final String text;

    public ReplySuggestion(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.text = str2;
    }

    public static /* synthetic */ ReplySuggestion copy$default(ReplySuggestion replySuggestion, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replySuggestion.id;
        }
        if ((i & 2) != 0) {
            str2 = replySuggestion.text;
        }
        return replySuggestion.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.text;
    }

    public final ReplySuggestion copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new ReplySuggestion(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplySuggestion)) {
            return false;
        }
        ReplySuggestion replySuggestion = (ReplySuggestion) obj;
        return xj5.a(this.id, replySuggestion.id) && xj5.a(this.text, replySuggestion.text);
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReplySuggestion(id=");
        sb.append(this.id);
        sb.append(", text=");
        return wu0.a(sb, this.text, ')');
    }
}
