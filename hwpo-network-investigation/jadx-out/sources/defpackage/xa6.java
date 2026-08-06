package defpackage;

import android.view.inputmethod.ExtractedText;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xa6 {
    public static final ExtractedText a(kha khaVar) {
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

    public static final au3 b(final ci4 ci4Var, oh4 oh4Var) {
        ci4 ci4Var2 = new ci4() { // from class: wa6
            @Override // defpackage.ci4
            public final Object invoke(Object obj, Object obj2) {
                k19 k19Var = (k19) obj;
                List list = (List) ci4Var.invoke(k19Var, obj2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (obj3 != null && !k19Var.a(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            }
        };
        fza.b(1, oh4Var);
        return new au3(ci4Var2, oh4Var);
    }
}
