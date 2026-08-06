package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d26 extends pi4 implements ci4<Integer, Integer, int[]> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ci4
    public final int[] invoke(Integer num, Integer num2) {
        int iMin;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        c26 c26Var = (c26) this.receiver;
        h16 h16Var = c26Var.e;
        int[] iArr = new int[iIntValue2];
        ((q16) c26Var.d.getValue()).j.a(iIntValue);
        h16Var.c(iIntValue + iIntValue2);
        int iF = h16Var.f(iIntValue);
        if (iF == -2 || iF == -1) {
            iMin = 0;
        } else {
            if (iF < 0) {
                xc5.a("Expected positive lane number, got " + iF + " instead.");
            }
            iMin = Math.min(iF, iIntValue2);
        }
        int iD = iIntValue;
        for (int i = iMin - 1; -1 < i; i--) {
            iD = h16Var.d(iD, i);
            iArr[i] = iD;
            if (iD == -1) {
                gz3.n(iArr, -1, i, 2);
                break;
            }
        }
        iArr[iMin] = iIntValue;
        while (true) {
            iMin++;
            if (iMin >= iIntValue2) {
                return iArr;
            }
            iIntValue++;
            int length = h16Var.a + h16Var.b.length;
            while (true) {
                if (iIntValue >= length) {
                    iIntValue = h16Var.a + h16Var.b.length;
                    break;
                }
                if (h16Var.a(iIntValue, iMin)) {
                    break;
                }
                iIntValue++;
            }
            iArr[iMin] = iIntValue;
        }
    }
}
