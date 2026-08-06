package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mq2 {
    public static final mq2 a = new mq2();

    public static tya a(tya tyaVar, String[] strArr, Map map) {
        int i = 0;
        if (tyaVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (tya) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                tya tyaVar2 = new tya();
                int length = strArr.length;
                while (i < length) {
                    tyaVar2.a((tya) map.get(strArr[i]));
                    i++;
                }
                return tyaVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                tyaVar.a((tya) map.get(strArr[0]));
                return tyaVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    tyaVar.a((tya) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return tyaVar;
    }

    public static final long b(long j, long j2) {
        int iD;
        int iF = lja.f(j);
        int iE = lja.e(j);
        if ((lja.f(j2) < lja.e(j)) && (lja.f(j) < lja.e(j2))) {
            if ((lja.f(j2) <= lja.f(j)) && (lja.e(j) <= lja.e(j2))) {
                iF = lja.f(j2);
                iE = iF;
            } else {
                if ((lja.f(j) <= lja.f(j2)) && (lja.e(j2) <= lja.e(j))) {
                    iD = lja.d(j2);
                } else {
                    int iF2 = lja.f(j2);
                    if (iF >= lja.e(j2) || iF2 > iF) {
                        iE = lja.f(j2);
                    } else {
                        iF = lja.f(j2);
                        iD = lja.d(j2);
                    }
                }
                iE -= iD;
            }
        } else if (iE > lja.f(j2)) {
            iF -= lja.d(j2);
            iD = lja.d(j2);
            iE -= iD;
        }
        return ay.c(iF, iE);
    }
}
