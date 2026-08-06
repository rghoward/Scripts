package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bd6 {
    public static final bd6 b = new bd6(new dd6(new LocaleList(new Locale[0])));
    public final dd6 a;

    public bd6(dd6 dd6Var) {
        this.a = dd6Var;
    }

    public static bd6 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new bd6(new dd6(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bd6) {
            return this.a.equals(((bd6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
