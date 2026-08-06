package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h60 implements lc2, om8 {
    public final Object t;

    public h60(boolean z) {
        this.t = new AtomicBoolean(z);
    }

    @Override // defpackage.lc2
    public long a(long j) {
        ArrayList arrayList = (ArrayList) this.t;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((mc2) arrayList.get(0)).b) {
            return ((mc2) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            mc2 mc2Var = (mc2) arrayList.get(i);
            long j2 = mc2Var.b;
            long j3 = mc2Var.b;
            if (j < j2) {
                long j4 = ((mc2) arrayList.get(i - 1)).d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((mc2) nr1.b(arrayList)).d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.om8
    public void accept(Object obj, Object obj2) {
        xpc xpcVar = (xpc) ((zpc) obj).x();
        koc kocVar = new koc((kpc) this.t, (t9a) obj2);
        Parcel parcelG = xpcVar.g();
        iac.c(parcelG, kocVar);
        xpcVar.i(parcelG, 27);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    @Override // defpackage.lc2
    public boolean b(mc2 mc2Var, long j) {
        boolean z;
        ArrayList arrayList = (ArrayList) this.t;
        long j2 = mc2Var.b;
        xl7.g(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = mc2Var.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((mc2) arrayList.get(size)).b) {
                arrayList.add(size + 1, mc2Var);
                return z;
            }
            if (((mc2) arrayList.get(size)).b <= j) {
                z = false;
            }
        }
        arrayList.add(0, mc2Var);
        return z;
    }

    @Override // defpackage.lc2
    public k95 c(long j) {
        int iF = f(j);
        if (iF == 0) {
            k95.b bVar = k95.u;
            return ul8.x;
        }
        mc2 mc2Var = (mc2) ((ArrayList) this.t).get(iF - 1);
        long j2 = mc2Var.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return mc2Var.a;
        }
        k95.b bVar2 = k95.u;
        return ul8.x;
    }

    @Override // defpackage.lc2
    public void clear() {
        ((ArrayList) this.t).clear();
    }

    @Override // defpackage.lc2
    public long d(long j) {
        ArrayList arrayList = (ArrayList) this.t;
        if (arrayList.isEmpty() || j < ((mc2) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((mc2) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                mc2 mc2Var = (mc2) arrayList.get(i - 1);
                long j3 = mc2Var.d;
                return (j3 == -9223372036854775807L || j3 > j) ? mc2Var.b : j3;
            }
        }
        mc2 mc2Var2 = (mc2) nr1.b(arrayList);
        long j4 = mc2Var2.d;
        return (j4 == -9223372036854775807L || j < j4) ? mc2Var2.b : j4;
    }

    @Override // defpackage.lc2
    public void e(long j) {
        ArrayList arrayList = (ArrayList) this.t;
        int iF = f(j);
        if (iF == 0) {
            return;
        }
        long j2 = ((mc2) arrayList.get(iF - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iF--;
        }
        arrayList.subList(0, iF).clear();
    }

    public int f(long j) {
        ArrayList arrayList = (ArrayList) this.t;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((mc2) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    public h60() {
        this.t = new ArrayList();
    }
}
