package defpackage;

import android.os.LocaleList;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ap {
    public LocaleList a;
    public ad6 b;
    public final rd7 c = new rd7();

    public final ad6 a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.c) {
            ad6 ad6Var = this.b;
            if (ad6Var != null && localeList == this.a) {
                return ad6Var;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new yc6(localeList.get(i)));
            }
            ad6 ad6Var2 = new ad6(arrayList);
            this.a = localeList;
            this.b = ad6Var2;
            return ad6Var2;
        }
    }
}
