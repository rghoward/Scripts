package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", l = {}, m = "invokeSuspend", v = 1)
public final class e26 extends p6a implements ci4<t69, r02<? super g2b>, Object> {
    public final /* synthetic */ c26 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e26(c26 c26Var, int i, r02 r02Var) {
        super(2, r02Var);
        this.t = c26Var;
        this.u = i;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new e26(this.t, this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t69 t69Var, r02<? super g2b> r02Var) {
        return ((e26) create(t69Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        w06 w06Var;
        dv8.b(obj);
        c26 c26Var = this.t;
        u16 u16Var = c26Var.c;
        bt7 bt7Var = u16Var.c;
        bt7 bt7Var2 = u16Var.e;
        int iK = bt7Var.k();
        int i2 = this.u;
        boolean z = (iK == i2 && bt7Var2.k() == 0) ? false : true;
        if (z) {
            vv5<s16> vv5Var = c26Var.t;
            vv5Var.e();
            vv5Var.b = null;
            vv5Var.c = -1;
        }
        q16 q16Var = (q16) c26Var.d.getValue();
        q16 q16Var2 = r16.a;
        List<s16> list = q16Var.m;
        List<s16> list2 = q16Var.m;
        if (list.isEmpty()) {
            w06Var = null;
        } else {
            int index = ((w06) th1.y(list2)).getIndex();
            if (i2 > ((w06) th1.G(list2)).getIndex() || index > i2) {
                w06Var = null;
            } else {
                int size = list2.size();
                ws0.l(list2.size(), size);
                int i3 = size - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i = -(i4 + 1);
                        break;
                    }
                    i = (i4 + i3) >>> 1;
                    int index2 = list2.get(i).getIndex() - i2;
                    if (index2 >= 0) {
                        if (index2 <= 0) {
                            break;
                        }
                        i3 = i - 1;
                    } else {
                        i4 = i + 1;
                    }
                }
                w06Var = (w06) th1.B(i, list2);
            }
        }
        if (w06Var == null || !z) {
            int[] iArr = (int[]) u16Var.a.invoke(Integer.valueOf(i2), Integer.valueOf(u16Var.b.length));
            int length = iArr.length;
            int[] iArr2 = new int[length];
            for (int i5 = 0; i5 < length; i5++) {
                iArr2[i5] = 0;
            }
            u16Var.b = iArr;
            u16Var.c.j(u16.a(iArr));
            u16Var.d = iArr2;
            bt7Var2.j(u16.b(iArr, iArr2));
            u16Var.h.d(i2);
            u16Var.g = null;
        } else {
            fl7 fl7Var = q16Var.u;
            int[] iArr3 = q16Var.b;
            int iE = (int) (fl7Var == fl7.t ? w06Var.e() & 4294967295L : w06Var.e() >> 32);
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            for (int i6 = 0; i6 < length2; i6++) {
                iArr4[i6] = iArr3[i6] + iE;
            }
            u16Var.d = iArr4;
            bt7Var2.j(u16.b(u16Var.b, iArr4));
        }
        fm8 fm8Var = c26Var.h;
        if (fm8Var != null) {
            fm8Var.i();
        }
        return g2b.a;
    }
}
