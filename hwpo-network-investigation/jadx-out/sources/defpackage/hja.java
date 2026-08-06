package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hja implements fl6 {
    public final mh4<Boolean> a;
    public final mh4<List<sk8>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public hja(mh4<Boolean> mh4Var, mh4<? extends List<sk8>> mh4Var2) {
        this.a = mh4Var;
        this.b = mh4Var2;
    }

    @Override // defpackage.fl6
    public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
        final ArrayList arrayList;
        js7 js7Var;
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cl6 cl6Var = list.get(i);
            if (!(cl6Var.g() instanceof nja)) {
                arrayList2.add(cl6Var);
            }
        }
        List<sk8> listInvoke = this.b.invoke();
        if (listInvoke != null) {
            ArrayList arrayList3 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            int i2 = 0;
            while (i2 < size2) {
                sk8 sk8Var = listInvoke.get(i2);
                if (sk8Var != null) {
                    float f = sk8Var.b;
                    float f2 = sk8Var.a;
                    js7Var = new js7(((cl6) arrayList2.get(i2)).E(zx1.b(0, (int) Math.floor(sk8Var.c - f2), 0, (int) Math.floor(sk8Var.d - f), 5)), new bg5((((long) Math.round(f2)) << 32) | (((long) Math.round(f)) & 4294967295L)));
                } else {
                    js7Var = null;
                }
                ArrayList arrayList4 = arrayList3;
                if (js7Var != null) {
                    arrayList4.add(js7Var);
                }
                i2++;
                arrayList3 = arrayList4;
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            cl6 cl6Var2 = list.get(i3);
            if (cl6Var2.g() instanceof nja) {
                arrayList5.add(cl6Var2);
            }
        }
        final ArrayList arrayListD = um0.d(this.a, arrayList5);
        return hl6Var.y0(xx1.h(j), xx1.g(j), if3.t, new oh4() { // from class: gja
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                jz7.a aVar = (jz7.a) obj;
                List list2 = arrayList;
                if (list2 != null) {
                    int size4 = list2.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        js7 js7Var2 = (js7) list2.get(i4);
                        jz7.a.q(aVar, (jz7) js7Var2.t, ((bg5) js7Var2.u).a);
                    }
                }
                List list3 = arrayListD;
                if (list3 != null) {
                    int size5 = list3.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        js7 js7Var3 = (js7) list3.get(i5);
                        jz7 jz7Var = (jz7) js7Var3.t;
                        mh4 mh4Var = (mh4) js7Var3.u;
                        jz7.a.q(aVar, jz7Var, mh4Var != null ? ((bg5) mh4Var.invoke()).a : 0L);
                    }
                }
                return g2b.a;
            }
        });
    }
}
