package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sm3 implements jac {
    public static final /* synthetic */ int v = 0;
    public static final k7a t = new k7a("REMOVED_TASK");
    public static final k7a u = new k7a("CLOSED_EMPTY");
    public static final /* synthetic */ sm3 w = new sm3();

    public static final int b(int i, List list) {
        int i2;
        byte b;
        int i3 = ((ns7) th1.G(list)).c;
        if (i > ((ns7) th1.G(list)).c) {
            vc5.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            ns7 ns7Var = (ns7) list.get(i2);
            if (ns7Var.b > i) {
                b = 1;
            } else {
                b = ns7Var.c <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder sbB = t43.b(i2, "Found paragraph index ", " should be in range [0, ");
        sbB.append(list.size());
        sbB.append(").\nDebug info: index=");
        sbB.append(i);
        sbB.append(", paragraphs=[");
        sbB.append(ab6.a(list, null, new af5(1), 31));
        sbB.append(']');
        vc5.a(sbB.toString());
        return i2;
    }

    public static final int c(int i, List list) {
        byte b;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ns7 ns7Var = (ns7) list.get(i3);
            if (ns7Var.d > i) {
                b = 1;
            } else {
                b = ns7Var.e <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int d(ArrayList arrayList, float f) {
        byte b;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((ns7) th1.G(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            ns7 ns7Var = (ns7) arrayList.get(i2);
            if (ns7Var.f > f) {
                b = 1;
            } else {
                b = ns7Var.g <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void e(ArrayList arrayList, long j, oh4 oh4Var) {
        int size = arrayList.size();
        for (int iB = b(lja.f(j), arrayList); iB < size; iB++) {
            ns7 ns7Var = (ns7) arrayList.get(iB);
            if (ns7Var.b >= lja.e(j)) {
                return;
            }
            if (ns7Var.b != ns7Var.c) {
                oh4Var.invoke(ns7Var);
            }
        }
    }

    public static final sy2 f(l2 l2Var, rt1 rt1Var, String str) {
        l2Var.getClass();
        sy2 sy2VarA = l2Var.a(rt1Var, str);
        if (sy2VarA != null) {
            return sy2VarA;
        }
        jl8.a(l2Var.c(), str);
        throw null;
    }

    public static final ud9 g(l2 l2Var, Encoder encoder, Object obj) {
        l2Var.getClass();
        obj.getClass();
        ud9 ud9VarB = l2Var.b(encoder, obj);
        if (ud9VarB != null) {
            return ud9VarB;
        }
        sd1 sd1VarA = ll8.a(obj.getClass());
        wn5 wn5VarC = l2Var.c();
        wn5VarC.getClass();
        String strC = sd1VarA.c();
        if (strC == null) {
            strC = String.valueOf(sd1VarA);
        }
        jl8.a(wn5VarC, strC);
        throw null;
    }

    public static final void h(cs9 cs9Var, p20 p20Var, int i) {
        while (true) {
            int i2 = cs9Var.v;
            if (i > i2 && i < cs9Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            cs9Var.O();
            if (cs9Var.y(cs9Var.v)) {
                p20Var.h();
            }
            cs9Var.j();
        }
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().v());
    }
}
