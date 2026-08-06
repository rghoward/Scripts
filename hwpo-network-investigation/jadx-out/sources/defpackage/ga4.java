package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ga4 implements Comparator {
    public static final ga4 u = new ga4(0);
    public final /* synthetic */ int t;

    public /* synthetic */ ga4(int i) {
        this.t = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                ba4 ba4Var = (ba4) obj;
                ba4 ba4Var2 = (ba4) obj2;
                if (!fa4.d(ba4Var) || !fa4.d(ba4Var2)) {
                    if (fa4.d(ba4Var)) {
                        return -1;
                    }
                    return fa4.d(ba4Var2) ? 1 : 0;
                }
                qr5 qr5VarF = ew2.f(ba4Var);
                qr5 qr5VarF2 = ew2.f(ba4Var2);
                if (xj5.a(qr5VarF, qr5VarF2)) {
                    return 0;
                }
                Object[] objArr = new qr5[16];
                int i = 0;
                while (qr5VarF != null) {
                    int i2 = i + 1;
                    if (objArr.length < i2) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                    }
                    objArr[0] = qr5VarF;
                    i++;
                    qr5VarF = qr5VarF.I();
                }
                Object[] objArr3 = new qr5[16];
                int i3 = 0;
                while (qr5VarF2 != null) {
                    int i4 = i3 + 1;
                    if (objArr3.length < i4) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i3 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                    }
                    objArr3[0] = qr5VarF2;
                    i3++;
                    qr5VarF2 = qr5VarF2.I();
                }
                int iMin = Math.min(i - 1, i3 - 1);
                if (iMin >= 0) {
                    int i5 = 0;
                    while (xj5.a(objArr[i5], objArr3[i5])) {
                        if (i5 != iMin) {
                            i5++;
                        }
                    }
                    return xj5.b(((qr5) objArr[i5]).J(), ((qr5) objArr3[i5]).J());
                }
                aa0.c("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            default:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
        }
    }
}
