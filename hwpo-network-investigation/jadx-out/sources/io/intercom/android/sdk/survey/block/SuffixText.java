package io.intercom.android.sdk.survey.block;

import com.intercom.twig.BuildConfig;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.uh1;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SuffixText {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final SuffixText NO_SUFFIX;
    private final long color;
    private final String text;
    private final String ttsText;

    static {
        int i = uh1.l;
        NO_SUFFIX = new SuffixText(BuildConfig.FLAVOR, BuildConfig.FLAVOR, uh1.b, null);
    }

    private SuffixText(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.text = str;
        this.ttsText = str2;
        this.color = j;
    }

    /* JADX INFO: renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ SuffixText m444copymxwnekA$default(SuffixText suffixText, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suffixText.text;
        }
        if ((i & 2) != 0) {
            str2 = suffixText.ttsText;
        }
        if ((i & 4) != 0) {
            j = suffixText.color;
        }
        return suffixText.m446copymxwnekA(str, str2, j);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.ttsText;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m445component30d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: copy-mxwnekA, reason: not valid java name */
    public final SuffixText m446copymxwnekA(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        return new SuffixText(str, str2, j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuffixText)) {
            return false;
        }
        SuffixText suffixText = (SuffixText) obj;
        return xj5.a(this.text, suffixText.text) && xj5.a(this.ttsText, suffixText.ttsText) && uh1.c(this.color, suffixText.color);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m447getColor0d7_KjU() {
        return this.color;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTtsText() {
        return this.ttsText;
    }

    public int hashCode() {
        int iC = ru3.c(this.text.hashCode() * 31, 31, this.ttsText);
        long j = this.color;
        int i = uh1.l;
        return Long.hashCode(j) + iC;
    }

    public String toString() {
        return "SuffixText(text=" + this.text + ", ttsText=" + this.ttsText + ", color=" + ((Object) uh1.i(this.color)) + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final SuffixText getNO_SUFFIX() {
            return SuffixText.NO_SUFFIX;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SuffixText(String str, String str2, long j, qq2 qq2Var) {
        this(str, str2, j);
    }
}
