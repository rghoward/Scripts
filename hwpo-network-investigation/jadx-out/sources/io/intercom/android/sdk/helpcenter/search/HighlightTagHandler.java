package io.intercom.android.sdk.helpcenter.search;

import android.text.Editable;
import android.text.Html;
import android.text.style.StyleSpan;
import defpackage.qq2;
import org.xml.sax.XMLReader;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HighlightTagHandler implements Html.TagHandler {
    private static final int SPAN_FLAG = 33;
    private int endIndex;
    private int startIndex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private final void applyColorSpan(Editable editable) {
        editable.setSpan(new StyleSpan(1), this.startIndex, this.endIndex, SPAN_FLAG);
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        str.getClass();
        editable.getClass();
        xMLReader.getClass();
        if (str.equalsIgnoreCase("highlight")) {
            if (z) {
                this.startIndex = editable.length();
            } else {
                this.endIndex = editable.length();
                applyColorSpan(editable);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private Companion() {
        }
    }
}
