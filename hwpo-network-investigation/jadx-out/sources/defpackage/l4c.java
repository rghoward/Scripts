package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l4c {
    public Object a;

    public l4c(int i) {
        switch (i) {
            case 2:
                e27 e27Var = ag5.a;
                this.a = new e27();
                break;
            case 5:
                this.a = bl7.i(Boolean.FALSE);
                break;
            case 7:
                this.a = new ConcurrentHashMap();
                break;
            default:
                this.a = new ArrayDeque(20);
                break;
        }
    }

    public abstract uw5 a(int i, int i2, int i3, long j);

    public abstract Object b();

    public List c(tw5 tw5Var, int i, long j) {
        e27 e27Var = (e27) this.a;
        List list = (List) e27Var.b(i);
        if (list != null) {
            return list;
        }
        List<cl6> listE = tw5Var.e(i);
        int size = listE.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(listE.get(i2).E(j));
        }
        e27Var.i(i, arrayList);
        return arrayList;
    }

    public abstract Object d();

    public void e(t58 t58Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(t58Var);
        }
    }

    public abstract void f(Object obj);

    public abstract void g(tva tvaVar);

    public abstract void h();

    public abstract Object i();

    public abstract void j(Object obj, long j, byte b);

    public Object k(y8d y8dVar, ln4 ln4Var) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        Object obj = concurrentHashMap.get(y8dVar);
        if (obj != null) {
            return obj;
        }
        Object objI = i();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(y8dVar, objI);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iB1 = ln4Var.b1();
        z8d z8dVar = null;
        for (int i = 0; i < iB1; i++) {
            if (n8d.f.equals(ln4Var.d1(i))) {
                Object objE1 = ln4Var.e1(i);
                if (objE1 instanceof c9d) {
                    if (z8dVar == null) {
                        z8dVar = new z8d(this, y8dVar);
                    }
                    ((c9d) objE1).a();
                }
            }
        }
        return objI;
    }

    public abstract boolean l(long j, Object obj);

    public abstract boolean m(Level level);

    public abstract void n(Object obj, long j, boolean z);

    public abstract void o(p8d p8dVar);

    public abstract float p(long j, Object obj);

    public void q(RuntimeException runtimeException, p8d p8dVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public abstract void r(Object obj, long j, float f);

    public abstract double s(long j, Object obj);

    public abstract void t(Object obj, long j, double d);

    public l4c(String str) {
        this((short) 0);
        this.a = str;
    }

    public /* synthetic */ l4c(short s) {
    }

    public /* synthetic */ l4c(Object obj) {
        this.a = obj;
    }
}
