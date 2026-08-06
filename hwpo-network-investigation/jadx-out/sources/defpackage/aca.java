package defpackage;

import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aca {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public aca(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aca)) {
            return false;
        }
        aca acaVar = (aca) obj;
        return xj5.a(this.a, acaVar.a) && lja.b(this.b, acaVar.b) && xj5.a(this.c, acaVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = lja.c;
        return this.c.hashCode() + al.c(this.b, iHashCode, 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) lja.h(this.b)) + ", textClassification=" + this.c + ')';
    }
}
