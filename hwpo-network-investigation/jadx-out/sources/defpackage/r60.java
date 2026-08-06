package defpackage;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r60 {
    public final xy3 a;

    public r60(xy3 xy3Var) {
        xy3Var.getClass();
        this.a = xy3Var;
    }

    public final void a(l89 l89Var, ArrayList arrayList, oh4 oh4Var, oh4 oh4Var2, ci4 ci4Var, oh4 oh4Var3, ci4 ci4Var2, ci4 ci4Var3) {
        l89Var.getClass();
        String str = l89Var.w;
        int iOrdinal = l89Var.v.ordinal();
        if (iOrdinal == 0) {
            String str2 = l89Var.F;
            if (str2 == null) {
                return;
            }
            oh4Var2.invoke(str2);
            return;
        }
        if (iOrdinal == 1) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i = -1;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                if (((l89) obj).t == l89Var.t) {
                    break;
                } else {
                    i++;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                arrayList2.add(((l89) obj2).x);
            }
            ci4Var2.invoke(numValueOf, arrayList2.toArray(new String[0]));
            return;
        }
        if (iOrdinal == 2) {
            oh4Var.invoke(str);
            return;
        }
        if (iOrdinal != 3) {
            u.b();
            return;
        }
        s60 s60Var = l89Var.D;
        long j = l89Var.B;
        int iOrdinal2 = s60Var.ordinal();
        if (iOrdinal2 == 0) {
            ci4Var.invoke(Long.valueOf(j), str);
            return;
        }
        if (iOrdinal2 == 1) {
            ci4Var3.invoke(new File(this.a.b(), l89Var.H), l89Var.z);
            return;
        }
        if (iOrdinal2 == 2) {
            ci4Var.invoke(Long.valueOf(j), str);
        } else if (iOrdinal2 == 3) {
            oh4Var3.invoke(str);
        } else {
            u.b();
        }
    }
}
