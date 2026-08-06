package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TranscribedText {
    public static final int $stable = 0;

    @SerializedName(AttributeType.TEXT)
    private final String text;

    public TranscribedText(String str) {
        str.getClass();
        this.text = str;
    }

    public static /* synthetic */ TranscribedText copy$default(TranscribedText transcribedText, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transcribedText.text;
        }
        return transcribedText.copy(str);
    }

    public final String component1() {
        return this.text;
    }

    public final TranscribedText copy(String str) {
        str.getClass();
        return new TranscribedText(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TranscribedText) && xj5.a(this.text, ((TranscribedText) obj).text);
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public String toString() {
        return wu0.a(new StringBuilder("TranscribedText(text="), this.text, ')');
    }
}
