package defpackage;

import android.view.inputmethod.ExtractedText;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class p48 implements jac {
    public static final KSerializer[] t = new KSerializer[0];
    public static final /* synthetic */ p48 u = new p48();

    public static final ExtractedText b(kha khaVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = khaVar.a.u;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = khaVar.b;
        extractedText.selectionStart = lja.f(j);
        extractedText.selectionEnd = lja.e(j);
        extractedText.flags = !z2a.p(khaVar.a.u, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().o());
    }
}
