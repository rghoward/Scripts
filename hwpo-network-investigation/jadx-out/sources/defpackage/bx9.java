package defpackage;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bx9 {
    public static final float a(long j, float f, tx2 tx2Var) {
        if (bka.a(j, bka.c)) {
            return f;
        }
        long jB = bka.b(j);
        if (dka.a(jB, 4294967296L)) {
            return tx2Var.C1(j);
        }
        if (dka.a(jB, 8589934592L)) {
            return bka.c(j) * f;
        }
        return Float.NaN;
    }

    public static final float b(long j, float f, tx2 tx2Var) {
        float fC;
        long jB = bka.b(j);
        if (dka.a(jB, 4294967296L)) {
            if (tx2Var.N0() <= 1.05d) {
                return tx2Var.C1(j);
            }
            fC = bka.c(j) / bka.c(tx2Var.A0(f));
        } else {
            if (!dka.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = bka.c(j);
        }
        return fC * f;
    }

    public static final void c(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(u7d.l(j)), i, i2, 33);
        }
    }

    public static final void d(Spannable spannable, long j, tx2 tx2Var, int i, int i2) {
        long jB = bka.b(j);
        if (dka.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(wk6.b(tx2Var.C1(j)), false), i, i2, 33);
        } else if (dka.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(bka.c(j)), i, i2, 33);
        }
    }

    public static final void e(Spannable spannable, ad6 ad6Var, int i, int i2) {
        if (ad6Var != null) {
            ArrayList arrayList = new ArrayList(ph1.n(ad6Var, 10));
            Iterator<yc6> it = ad6Var.t.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }
}
