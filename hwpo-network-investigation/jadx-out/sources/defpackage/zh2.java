package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zh2 implements yh2 {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // defpackage.yh2
    public final String a(Long l, Locale locale, boolean z) {
        if (l == null) {
            return null;
        }
        return k21.a(l.longValue(), z ? "yMMMMEEEEd" : "yMMMd", locale, this.a);
    }

    @Override // defpackage.yh2
    public final String b(Long l, Locale locale) {
        return k21.a(l.longValue(), "yMMMM", locale, this.a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof zh2;
    }

    public final int hashCode() {
        return 436998964;
    }
}
