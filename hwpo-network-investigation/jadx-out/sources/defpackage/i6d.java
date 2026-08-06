package defpackage;

import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i6d {
    public static final WeakHashMap a = new WeakHashMap();
    public static final WeakHashMap b = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable cause;
        zh1 zh1Var;
        i7d i7dVarB;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        WeakHashMap weakHashMap2 = a;
        synchronized (weakHashMap2) {
            Throwable cause2 = th;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (cause2 == null) {
                zh1Var = null;
            } else {
                weakHashMap2.put(th, (k7d) weakHashMap2.get(cause2));
                zh1Var = new zh1();
            }
        }
        if (zh1Var != null || (i7dVarB = m6d.c().b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (i7dVarB = m6d.c().b; i7dVarB != null; i7dVarB = i7dVarB.b()) {
            arrayList.add(i7dVarB);
        }
        UUID uuidC = ((i7d) arrayList.get(0)).c();
        if (uuidC == null) {
            ac4.c("Null rootTraceId");
            return;
        }
        ((i7d) arrayList.get(0)).getClass();
        k95.a aVarO = k95.o(arrayList.size());
        k95.a aVarO2 = k95.o(arrayList.size());
        for (i7d i7dVar : jb6.a(arrayList)) {
            aVarO2.c(i7dVar.e());
            aVarO.c(i7dVar.g());
        }
        WeakHashMap weakHashMap3 = a;
        synchronized (weakHashMap3) {
            try {
                ul8 ul8VarG = aVarO2.g();
                if (ul8VarG == null) {
                    throw new NullPointerException("Null spansNames");
                }
                ul8 ul8VarG2 = aVarO.g();
                if (ul8VarG2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th, new e6d(ul8VarG, ul8VarG2, uuidC));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
