package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kha {
    public static final au3 d = new au3(new jha(), new z26(2));
    public final iw a;
    public final long b;
    public final lja c;

    public kha(iw iwVar, long j, lja ljaVar) {
        lja ljaVar2;
        this.a = iwVar;
        this.b = ay.d(iwVar.u.length(), j);
        if (ljaVar != null) {
            ljaVar2 = new lja(ay.d(iwVar.u.length(), ljaVar.a));
        } else {
            ljaVar2 = null;
        }
        this.c = ljaVar2;
    }

    public static kha a(kha khaVar, iw iwVar, long j, int i) {
        if ((i & 1) != 0) {
            iwVar = khaVar.a;
        }
        if ((i & 2) != 0) {
            j = khaVar.b;
        }
        lja ljaVar = (i & 4) != 0 ? khaVar.c : null;
        khaVar.getClass();
        return new kha(iwVar, j, ljaVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kha)) {
            return false;
        }
        kha khaVar = (kha) obj;
        return lja.b(this.b, khaVar.b) && xj5.a(this.c, khaVar.c) && xj5.a(this.a, khaVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = lja.c;
        int iC = al.c(this.b, iHashCode, 31);
        lja ljaVar = this.c;
        return iC + (ljaVar != null ? Long.hashCode(ljaVar.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) lja.h(this.b)) + ", composition=" + this.c + ')';
    }

    public kha(int i, long j, String str) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? lja.b : j, (lja) null);
    }

    public kha(String str, long j, lja ljaVar) {
        this(new iw(str), j, ljaVar);
    }
}
