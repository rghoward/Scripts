package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h4c {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;

    public static final void a(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static void b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static /* bridge */ g4c c(Object obj) {
        u1c u1cVar = (u1c) obj;
        g4c g4cVar = u1cVar.zzc;
        if (g4cVar != g4c.f) {
            return g4cVar;
        }
        g4c g4cVarA = g4c.a();
        u1cVar.zzc = g4cVarA;
        return g4cVarA;
    }

    public static boolean d(int i, Object obj, t0c t0cVar) throws k2c {
        s0c s0cVar = t0cVar.a;
        int i2 = t0cVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            t0cVar.q(0);
            ((g4c) obj).d(i3 << 3, Long.valueOf(s0cVar.r()));
            return true;
        }
        if (i4 == 1) {
            t0cVar.q(1);
            ((g4c) obj).d((i3 << 3) | 1, Long.valueOf(s0cVar.t()));
            return true;
        }
        if (i4 == 2) {
            ((g4c) obj).d((i3 << 3) | 2, t0cVar.y());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                ao2.b("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                ny1.a();
                return false;
            }
            t0cVar.q(5);
            ((g4c) obj).d(5 | (i3 << 3), Integer.valueOf(s0cVar.u()));
            return true;
        }
        g4c g4cVarA = g4c.a();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            ao2.b("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (t0cVar.x() != Integer.MAX_VALUE && d(i6, g4cVarA, t0cVar)) {
        }
        if ((i5 | 4) != t0cVar.b) {
            ao2.b("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (g4cVarA.e) {
            g4cVarA.e = false;
        }
        ((g4c) obj).d(i5 | 3, g4cVarA);
        return true;
    }
}
